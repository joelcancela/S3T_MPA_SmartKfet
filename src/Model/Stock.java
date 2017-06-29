/**
 * Classe Stock
 * @author Foucault Marc, Dolla Maxime, Lopez Fabien, Cancella Vaz Joel
 * @version 3.0
 */


package Model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


public class Stock implements Serializable{
private ArrayList<Produit> catalogue;
private HashMap<String, Integer> stock;

	public Stock(){
		
		stock = new HashMap<String, Integer>();
		catalogue = new ArrayList<Produit>();
	}
	
	public String toString(){
		
	String s = new String();
	s = catalogue +", " + stock;
		
	return s;
		
	}
	
                       /**
 * Permet de connaître le stock pour chaque produit
 * @return un dictionnaire de donnée
 */
	public HashMap<String, Integer> getStock(){return stock;}
	
                              /**
 * Permet de savoir si un produit existe
 * @param p Nom du produit
 * @return true si le produit existe dans la cafet
 */
	public boolean produitExiste(String p){
		
		for(int i = 0; i<catalogue.size();i++){
			if(catalogue.get(i).getNom().equals(p)) return true;
                    }
                return false;
		
	}
	
                                      /**
 * Permet d'ajouter un produit à la cafet
 * @param p Un produit
 * 
 */
	public void ajouterProduit(Produit p){
		
		System.out.println(p.getNom());
		String a = p.getNom();
		catalogue.add(p);
		stock.put(a,0);
	}
        
                                      /**
 * Permet de d'ajouter du stock pour un produit
 * @param p Nom du produit
 * @param q Quantité du produit
 */
	public void ajouterStock(String nom, int q)throws Throwable{
		if(q<0){throw new Throwable("-2.2");}
                if(produitExiste(nom)){
		Integer q1 = q;
		Integer q2 = stock.get(nom);
		Integer q3 = q1 +q2;
		stock.replace(nom, q3);}
                else {throw new Throwable("-2.1");}
	}
        
                                              /**
 * Permet de d'enlever du stock pour un produit
 * @param p Nom du produit
 * @param q Quantité du produit
 */
	public void enleverStock(String nom, int q)throws Throwable{
		
		if(q<0){throw new Throwable("-2.2");}
                if(produitExiste(nom)){
                    Integer q1 = q;
                    Integer q2 = stock.get(nom);
                    Integer q3 = q2 -q1;
                    stock.replace(nom, q3);}
                else {throw new Throwable("-2.1");}
        
	}
        
                                              /**
 * Permet de de créer un nouveau produit
 * @param prix Le prix du produit
 * @param type Type du produit
 * @param nom Nom du produit
 * @param image Image du produit
 */
	public void creerProduit(double prix, int type, String nom, File image)throws Throwable{
		
		if(produitExiste(nom)) throw new Throwable("-2.3");
		Produit a = new Produit(prix, type, nom, image);
		ajouterProduit(a);
	}
        
                                                      /**
 * Permet de supprimer un produit de la cafet
 * @param nom Nom du produit
 */
        public void supprimerProduit(String nom)throws Throwable{
            if(produitExiste(nom)){
                stock.remove(nom);
                for(int i = 0; i<catalogue.size();i++){
                    if(catalogue.get(i).getNom().equals(nom)){
                      catalogue.remove(catalogue.get(i)) ; 
                    }
                }              
            }
            else {throw new Throwable("-2.1");}
        }
	
                                               /**
 * Permet de modifier de catalogue
 * @param cata Nouveau catalogue
 */
    public void setCatalogue(ArrayList<Produit> cata) {
        catalogue=cata;
    }
    
                                                   /**
 * Permet de connaître le catalogue
 * @return Le catalogue
 */
    public ArrayList<Produit> getCatalogue(){
            return catalogue;
    }

                                                   /**
 * Permet de savoir si un produit peut être commander apr rapport au stock disponible
 * @param com L'etat de la commande actuel
 * @param nom Le nom du produit qui est testé
 * @return true si on peut le commander
 */
    boolean peutCommander(ArrayList<String> com,String nom) {
        HashMap<String, Integer> h = stock;
        Integer g=0;
       for(int i=0;i<com.size();i++){
           if(com.get(i).equals(nom)){
               g++;
           }
       }
       if(stock.get(nom)>g) return true;
       return false;
    }
 
	
}
