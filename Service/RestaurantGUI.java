/**
 * Commentaires de Maxime:
 * 
 * Normalement, RestaurantGUI ne devrait pas être appelé directement.
 * Je n'ai pas encore enlevé la fonction qui override run() pour des fins de testing uniquement.
 * Elle devra être enlevée plus tard.
 */

package Service;


import java.awt.*;

import javax.swing.JButton;

public class RestaurantGUI extends javax.swing.JFrame {

    //ServiceGUI table1;
    //ServiceGUI table2;
    //ServiceGUI table3;
    //ServiceGUI table4;
	Table theTables = ProjectStart.getTables();
    /**
     * Creates new form Restaurant
     */
    public RestaurantGUI() {
        initComponents();
        //table1 = new ServiceGUI();
        //table2 = new ServiceGUI();
        //table3 = new ServiceGUI();
        //table4 = new ServiceGUI();
    }

    private void initComponents() {
    	setUndecorated(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setBounds(0,0,screenSize.width, screenSize.height);
        
        cmdLogout = new javax.swing.JButton();
        cmdTable1 = new javax.swing.JButton();
        cmdTable2 = new javax.swing.JButton();
        cmdTable3 = new javax.swing.JButton();
        cmdTable4 = new javax.swing.JButton();
        lblLegende = new javax.swing.JLabel();
        lblOccupe1 = new javax.swing.JLabel();
        lblOccupe2 = new javax.swing.JLabel();
        lblLibre = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 830));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        
        //Bouton logout
        cmdLogout.setText("Logout");
        cmdLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogoutActionPerformed(evt);
            }
        });
        cmdLogout.setBounds(40, 620, 80, 80);
        
        //Table 1       
        cmdTable1.setText("Table 1");
        cmdTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTable1ActionPerformed(evt);
            }
        });
        cmdTable1.setBounds(430, 460, 100, 100);
        
        
        //Table 2
        cmdTable2.setText("Table 2");
        cmdTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTable2ActionPerformed(evt);
            }
        });
        cmdTable2.setBounds(610, 460, 100, 100);
        
        
      //Table 3
        cmdTable3.setText("Table 3");
        cmdTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTable3ActionPerformed(evt);
            }
        });
        cmdTable3.setBounds(430, 620, 100, 100);
        

        //Table 4
        cmdTable4.setText("Table 4");
        cmdTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTable4ActionPerformed(evt);
            }
        });
        cmdTable4.setBounds(610, 620, 100, 100);
        lblOccupe1.isFocusOwner();
        

        //Label l�gende
        lblLegende.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblLegende.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegende.setText("L�gende");
        lblLegende.setBounds(30, 250, 100, 40);

        //Label occup� par m�me serveur
        lblOccupe1.setBackground(new java.awt.Color(255, 0, 0));
        lblOccupe1.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblOccupe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOccupe1.setText("Utilis�");
        lblOccupe1.setOpaque(true);
        lblOccupe1.setBounds(40, 310, 80, 80);

      //Label occup� par autre serveur
        lblOccupe2.setBackground(new java.awt.Color(0, 255, 0));
        lblOccupe2.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblOccupe2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOccupe2.setText("Occup�");
        lblOccupe2.setOpaque(true);
        lblOccupe2.setBounds(40, 410, 80, 80);
        
      //Label libre
        lblLibre.setBackground(new java.awt.Color(255, 255, 255));
        lblLibre.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblLibre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibre.setText("Libre");
        lblLibre.setOpaque(true);
        lblLibre.setBounds(40, 510, 80, 80);

        //Image background du restaurant.
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Service/Restaurant.jpg")));
        lblImage.setBounds(0, 0, 800, 790);
        
        //Ajoute les �l�ments � la fen�tre.
        getContentPane().add(cmdLogout);
        getContentPane().add(cmdTable1);
        getContentPane().add(cmdTable2);
        getContentPane().add(cmdTable3);
        getContentPane().add(cmdTable4);
        getContentPane().add(lblLegende);
        getContentPane().add(lblOccupe1);
        getContentPane().add(lblOccupe2);
        getContentPane().add(lblLibre);
        getContentPane().add(lblImage);

        pack();
    }
   
    private void setColor(){
        
        //Code qui va chercher les disponibili�s des 4 tables dans SQL
        //et affiche la couleur en cons�quence.
        
    	switch(theTables.getStatus(0)){
	    	case "libre":
	    		cmdTable1.setBackground(Color.WHITE);
	    		break;
	    	case "Occup�eParMoi":
	    		cmdTable1.setBackground(Color.RED);
	    		break;
	    	case "Occup�eParAutre":	
	    		cmdTable1.setBackground(Color.GREEN);
	    		break;
	    	default:
	    			break;
    	}
    	
    	switch(theTables.getStatus(1)){
    	case "libre":
    		cmdTable2.setBackground(Color.WHITE);
    		break;
    	case "Occup�eParMoi":
    		cmdTable2.setBackground(Color.RED);
    		break;
    	case "Occup�eParAutre":	
    		cmdTable2.setBackground(Color.GREEN);
    		break;
    	default:
    			break;
    	}
    	
    	switch(theTables.getStatus(2)){
    	case "libre":
    		cmdTable3.setBackground(Color.WHITE);
    		break;
    	case "Occup�eParMoi":
    		cmdTable3.setBackground(Color.RED);
    		break;
    	case "Occup�eParAutre":	
    		cmdTable3.setBackground(Color.GREEN);
    		break;
    	default:
    			break;
    	}
    	
    	switch(theTables.getStatus(3)){
    	case "libre":
    		cmdTable4.setBackground(Color.WHITE);
    		break;
    	case "Occup�eParMoi":
    		cmdTable4.setBackground(Color.RED);
    		break;
    	case "Occup�eParAutre":	
    		cmdTable4.setBackground(Color.GREEN);
    		break;
    	default:
    			break;
    	}
	
        
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setColor();
    }

    private void cmdLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    
    // cr�e une interface Service anonyme, envoie la source de l'evenement 
    // au constructeur et affiche l'interface si la table n'est pas occup�e 
    //par un autre serveur
    private void cmdTable1ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(theTables.getStatus(0) != "Occup�eParAutre"){
    		getButtonSourceAndDisplay(evt);
    		theTables.setStatus(0,"Occup�eParMoi");  
    	}
    }

    private void cmdTable2ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(theTables.getStatus(1) != "Occup�eParAutre"){
    		getButtonSourceAndDisplay(evt); 
    		theTables.setStatus(1,"Occup�eParMoi");
    	}
    }

    private void cmdTable3ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(theTables.getStatus(2) != "Occup�eParAutre"){
    		getButtonSourceAndDisplay(evt);
    		theTables.setStatus(2,"Occup�eParMoi");
    	}
    }

    private void cmdTable4ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(theTables.getStatus(3) != "Occup�eParAutre"){
    		getButtonSourceAndDisplay(evt);
    		theTables.setStatus(3,"Occup�eParMoi");
    	}
    }
    
    private void getButtonSourceAndDisplay(java.awt.event.ActionEvent evt){
    	Object source = evt.getSource();
    	new ServiceGUI((JButton) source).setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantGUI().setVisible(true);
            }
        });
    }
    
    //D�claration des variables.
    private javax.swing.JButton cmdLogout;
    private javax.swing.JButton cmdTable1;
    private javax.swing.JButton cmdTable2;
    private javax.swing.JButton cmdTable3;
    private javax.swing.JButton cmdTable4;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLegende;
    private javax.swing.JLabel lblOccupe1;
    private javax.swing.JLabel lblOccupe2;
    private javax.swing.JLabel lblLibre;

}
