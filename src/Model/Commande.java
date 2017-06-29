/**
 * Classe Commande
 * @author Foucault Marc, Dolla Maxime, Lopez Fabien, Cancella Vaz Joel
 * @version 3.0
 */
package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class Commande implements Serializable {
private int id;
private Membre cli;
private Date date;
private boolean etat;
private HashMap<String, Integer> panier;
private SmartKFet kfet;
private double prix;
	


	public Commande(){
		
		cli = null;
		date = null;
		etat = false;
		panier = null;
		kfet = null;
		id = 0;
                prix =0;
	}
	public Commande(Membre unCli,SmartKFet k, double p, ArrayList<String> com){
		
		cli=unCli;
		date = new Date();
		etat = false;
		panier = remplir(com);
		kfet = k;
		id = (k.getCommandeNP().size()) + (k.getCommandeP().size()) + (k.getCommande().size());
                prix = p;
		
	}
        
 /**
 * Permet de récupérer le mebre
 * @return le membre
 */
	public Membre getCli(){ return cli;}
        
         /**
 * Permet de connaître la date de création du compte
 * @return la date
 */
	public Date getDate(){return date;}
        
         /**
 * Permet de savoir si un membre est admin
 * @return l'etat
 */
	public boolean getEtat(){return etat;}
        
         /**
 * Permet de connaître l'id du client
 * @return l'id du client
 */
	public int getID(){return id;}
        
         /**
 * Permet de changer l'etat du client
 * @param n Le nouvel etat
 */
	
	public void setEtat(boolean n){
		etat = n;
	}
        
         /**
 * Permet de connaître le panier d'un client
 * @return le panier
 */
	public HashMap<String, Integer> getPanier(){return panier;}
	
         /**
 * Permet d'ajouter un produit
 * @param p Nom du produit
 * @param q Quantité du produit
 */
	public void addProduit(String p, Integer q){
		
		panier.put(p, q);
	}
        
                /**
 * Permet d'ajouter un stock à un produit
 * @param p Nom du produit
 */
	public void addQuantite(String p){
		
		Integer q2 = panier.get(p);
		Integer q3 = q2+1;
		panier.replace(p, q3);
	}
        
                        /**
 * Permet de retirer un stock à un produit
 * @param p Nom du produit
 */
	public void delQuantite(String p){
		
		Integer q2 = panier.get(p);
		Integer q3 = q2 -1;
		if(q3==0) panier.remove(p);
		else panier.replace(p, q3);
	}

                        /**
 * Permet de remplir la commande
 * @param com ArrayList de nom d eproduit
 */
    public HashMap<String, Integer> remplir(ArrayList<String> com) {
        HashMap<String, Integer> p = new HashMap<String, Integer>();
        for(int i =0;i<com.size();i++){
            
                if(!(p.containsKey(com.get(i)))){
                    
                p.put(com.get(i), 0);
            }
        }
        for(int i=0;i<com.size();i++){
            if(p.containsKey(com.get(i))){
                Integer q = p.get(com.get(i));
                String nom =com.get(i);
                p.remove(com.get(i));
                p.put(nom, q+1);
            } 
        }   
        return p;
    }

	public String toString(){
		
		String s = new String();
		s = cli +", " + kfet +", " + "Prix: " + prix +", " + "Panier: " + panier;
		
		return s;
		
	}
}
