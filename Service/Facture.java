package Service;

/**
 * Cette classe contient des informations relative a une facture
 * 
 * @author Nick
 */

public class Facture {
	
	private String pr�nomServeur;
	private int tableNum;
	private int conviveNum;
	private Repas[] repas = null; 
	private final double TAXE = 0.15; // taxe de 15%
	private double montantTaxe;
	private double sousTotal;
	private double total;
	
	public Facture() {
		// use the constructor to set the private values from the database
		// or test values
		resetFacture();
	}
	
	// calc/get montant des taxes
	public void calcMontantTaxe() {
		montantTaxe = sousTotal * TAXE;
	}
	public double getMontantTaxe() {
		return montantTaxe;
	}
	
	// calc/get soustotal
	public void calcSousTotal(){
		for (Repas monRepas : repas){
			if(monRepas.getPrixRepas() != 0 &&  monRepas.getQt�Repas() != 0)	
				sousTotal += monRepas.getPrixRepas() * monRepas.getQt�Repas();	
		}
	}	
	public double getSousTotal(){
		return sousTotal;
	}
	
	// calc/get total
	public void calcTotal(){
		total = sousTotal + montantTaxe;		
	}	
	public double getTotal(){
		return total;
	}
	
	// get/set pr�nom serveur
	public String getPr�nomServeur(){
		return pr�nomServeur;
	}	
	public void setPr�nomServeur(String pr�nom){
		pr�nomServeur = pr�nom;
	}
	
	// get/set table number
	public int getTableNum(){
		return tableNum;
	}	
	public void setTableNum(int table){
		tableNum = table;
	}
	
	// get/set convive number
	public int getConviveNum(){
		return conviveNum;
	}	
	public void setConviveNum(int convive){
		conviveNum = convive;
	}	

	public Repas[] getRepas() {
		return repas;
	}
	public void setRepas(Repas[] maListDeRepas) {
		repas = maListDeRepas;
	}
	
	public void resetFacture(){
		pr�nomServeur = "";
		tableNum = 0;
		conviveNum = 0;
		if(repas == null){
			repas = new Repas[10]; //10 repas par convive maximum
		}
		else{
			for (Repas monRepas : repas){
				monRepas.resetRepas();	
			}
		}
		montantTaxe = 0;
		sousTotal = 0;
		total = 0;
	}
	// for testing purposes
	public void loadFacture(String pr�, int tab, int conv, Repas[] listRepas){
		pr�nomServeur = pr�;
		tableNum = tab;
		conviveNum = conv;
		setRepas(listRepas);	
	}
	
	// C'est dans cette methode qu'il faut se connecter � la base de donn�es
	// afin d'enregistrer les donn�es contenu dans l'objet facture 
	// Faire un UPDATE (en sql) et y ins�rer les attribues priv�es
	// dans les tables correspondantes
	public void saveFacture(){
		
	}
	
}
