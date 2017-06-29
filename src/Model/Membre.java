/**
 * Classe Membre
 * @author Foucault Marc, Dolla Maxime, Lopez Fabien, Cancella Vaz Joel
 * @version 2.0
 */

package Model;
import java.io.Serializable;
import java.util.ArrayList;

public class Membre implements Serializable{
private String nom;
private String prenom;
private String id;
private String mdp;
private boolean admin;
private double solde;
private SmartKFet kfet;
private ArrayList<Commande> commande;

	public Membre(){
		
		nom = "";
		prenom = "";
		id = "";
		mdp ="";
		admin = false;
		solde = 0.0f;
	}
	public Membre(SmartKFet unk, String unNom, String unPrenom, String unId, String unMdp) throws Throwable{
		
		if (unk.membreExiste(unId)) throw new Throwable("-2.4");
		nom = unNom;
		prenom = unPrenom;
		id  = unId;
		mdp = unMdp;
		admin = false;
		solde = 0;
		kfet = unk;
		commande = new ArrayList<Commande>();
		
	}
	
 /**
 * Permet de connaître le nom du membre
 * @return le nom du membre
 */
	public String getNom() {return nom;}
        
        /**
 * Permet de connaître le prenom du membre
 * @return le prenom du membre
 */
	public String getPrenom() {return prenom;}
        
        /**
 * Permet de connaître l'id du membre
 * @return l'id du membre
 */
	public String getId() {return id;}
        
        /**
 * Permet de connaître le mdp du membre
 * @return le mdp du membre
 */
	public String getMdp(){ return mdp;}
        
        /**
 * Permet de savoir si un membre est admin 
 * @return true si c'est un admin
 */
	public boolean getAdmin() {return admin;}
        
        /**
 * Permet de connaître le solde du membre
 * @return le solde du membre
 */
	public double getSolde() {return solde;}
        
        /**
 * Permet de récupéré l'historique des commandes d'un membre
 * @return l'historique
 */
	public ArrayList<Commande> getCommande(){return commande;}

/**
 * Permet de modifier le solde du membre
 * @param montant Le nouveau solde
 */
	public void setSolde(double montant) {
		
		solde = solde + montant;
		
	}
        
        /**
 * Permet de payer une commande. On déduit du solde l eprix de la commande.
 * @param montant Le coût de la commande
 */
        public void payer(double montant){
            
            solde = solde - montant;
        }
        
        /**
 * Permet de modifier l'etat admin d'un membre
 * @param b True si c'est un admin
 */
	public void setAdmin(boolean b){
		
		if (b == true) admin = true;
		if (b == false) admin = false;
		
	}
        
        /**
 * Permet de modifier le nom du membre
 * @param unNom Le nouveau nom
 */
	public void setNom(String unNom){
		
		nom = unNom;
		
	}
        
        /**
 * Permet de modifier le prenom du membre
 * @param unPrenom Le nouveau prenom
 */
	public void setPrenom(String unPrenom){
		
		prenom = unPrenom;
		
	}
        
        /**
 * Permet de modifier l'id du membre
 * @param unId Le nouvel id
 */
	public void setId(String unId){
		
		id = unId;
	
	}
        
        /**
 * Permet de modifier le mdp du membre
 * @param unMdp Le nouveau mdp
 */
	public void setMdp(String unMdp){
		mdp = unMdp;
	}
        
        /**
 * Permet de connaître les détail d'un membre
 * @return un string contenant les détails
 */
	public String toString(){
		
		String s = new String();
		s = "Membre : "+ nom +", "+ prenom + ", "+ id + ", "+ solde;
		
		return s;
		
	}

}

