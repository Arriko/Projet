/**
 * 
 */
package Service;

/**
 * Cette classe contient des informations relative au repas
 * 
 * @author Nick
 */
public class Repas {
	
	private String typeRepas;
	private String nomRepas;
	private double prixRepas;
	private int qt�Repas;
	
	public Repas(){
		resetRepas();
	}
	
	// get/set type Repas
	public String getTypeRepas(){
		return typeRepas;
	}	
	public void setTypeRepas(String type){
		typeRepas = type;
	}
	
	// get/set nom Repas
	public String getNomRepas(){
		return nomRepas;
	}	
	public void setNomRepas(String nom){
		nomRepas = nom;
	}
	
	// get/set prix Repas
	public double getPrixRepas(){
		return prixRepas;
	}	  
	public void setPrixRepas(double prix){
		prixRepas = prix;
	}
	
	// get/set quantit� Repas
	public int getQt�Repas(){
		return qt�Repas;
	}	  
	public void setQt�Repas(int qt�){
		qt�Repas = qt�;
	}
	
	public void resetRepas(){
		typeRepas = "";
		nomRepas = "";
		prixRepas = 0;
		qt�Repas = 0;
	}
	// for testing purposes
	public void LoadRepas(String ty, String no, double pr, int qt){
		typeRepas = ty;
		nomRepas = no;
		prixRepas = pr;
		qt�Repas = qt;
	}

}
