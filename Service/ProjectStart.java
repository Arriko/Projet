package Service;

public class ProjectStart {

	/**
	 * Cette classe est le point d'enter du project et donne acc�s 
	 * au donn�es persistantes de l'application. Peut aussi �tre utiliser
	 * pour des tests.
	 */
	
	private static Table theTables = new Table();
	
	private ProjectStart() {}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantGUI().setVisible(true);
            }
        });
	}
	
	public static Table getTables(){		
		return theTables;		
	}
	

}
