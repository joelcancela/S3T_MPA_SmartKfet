/**
 * Classe SmartKFet
 * @author Foucault Marc, Dolla Maxime, Lopez Fabien, Cancella Vaz Joel
 * @version 6.0
 */


package Model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SmartKFet implements Serializable{
private ArrayList<Membre> membre;
private ArrayList<Commande> commande;
private ArrayList<Commande> commandeNP;
private ArrayList<Commande> commandeP;
private ArrayList<Membre> admin;
private Stock st;

	public SmartKFet() throws Throwable{
		 
		 membre = new ArrayList<Membre>();
		 commandeNP = new ArrayList<Commande>();
		 commandeP = new ArrayList<Commande>();
		 commande = new ArrayList<Commande>();
		 admin = new ArrayList<Membre>();
		 Membre m = new Membre(this,"Super","Admin","00","0000");
		 m.setAdmin(true);
                 m.setSolde(50);
		 admin.add(m);
                 membre.add(m);
		 st = new Stock();
	}

                                                   /**
 * Permet de connaître la liste des membres
 * @return la liste des membres
 */
	public ArrayList<Membre> getMembre(){
		
		return membre;
	}
        
                                                           /**
 * Permet de connaître la liste des commande non payées
 * @return la liste 
 */
	public ArrayList<Commande> getCommandeNP(){
		
		return commandeNP;
	}
        
                                                                  /**
 * Permet de connaître la liste des commande payées
 * @return la liste 
 */
	public ArrayList<Commande> getCommandeP(){
		
		return commandeP;
	}
        
                                                                          /**
 * Permet de connaître la liste des commande 
 * @return la liste 
 */
	public ArrayList<Commande> getCommande(){
		
		return commande;
	}
        
                                                                          /**
 * Permet de connaître la liste des admins
 * @return la liste 
 */
	public ArrayList<Membre> getAdmin(){
		
		return admin;
	}
       
                                                                          /**
 * Permet d'avoir le stock de la cafet
 * @return le stock
 */
        public Stock getStock(){
            return st;
        }
	
                                                                  /**
 * Permet d'ajouter un membre
 * @param mb Le membre 
 */
	public void ajouterMembre(Membre mb){
		membre.add(mb);
	}
        
                                                                          /**
 * Permet d'ajouter un admin
 * @param Id L'id du membre qui deviendra admin
 */
	public void ajouterAdmin(String Id) throws Throwable{
           if(adminExiste(Id) == true)throw new Throwable("-2.1"); 
           else{
            for(int i=0;i<membre.size();i++){
                if(membre.get(i).getId().equals(Id)){
                    membre.get(i).setAdmin(true);
                    admin.add(membre.get(i));
                  }
             }
            }
        }
        
                                                                          /**
 * Permet de supprimer un admin
 * @param Id L'id du membre qui deviendra admin
 */
        public void supprimerAdmin(String Id) throws Throwable{
            if(adminExiste(Id) == false)throw new Throwable("-2.1");                    
            else {
                for(int i = 0; i<admin.size();i++){
                    if(admin.get(i).getId().equals(Id)){
                      admin.remove(admin.get(i)); 
                    }
                }
                for(int i = 0; i<membre.size();i++){
                    if(membre.get(i).getId().equals(Id)){
                      membre.get(i).setAdmin(false); 
                    }
                }
            }
        }
        
                                                                                  /**
 * Permet d'ajouter une commande
 * @param mb La commande à ajouter
 */
	public void ajouterCommande(Commande mb){
		commandeNP.add(mb);
	}
        
                                                                                          /**
 * Permet de supprimer une commande
 * @param mb La commande à ajouter
 */
	public void suppCommande(Commande mb){
		
		
	}

                                                                                          /**
 * Permet de creer un membre
 * @param unNom Le nom du membre
 * @param unPrenom Le prenom du membre
 * @param unId L'id du membre
 * @param unMdp Le mdp du membre
 */
        public void creerMembre(String unNom, String unPrenom, String unId, String unMdp)throws Throwable{
            
            Membre m = new Membre(this,unNom,unPrenom,unId,unMdp);
            ajouterMembre(m);
        }
        
                                                                                                 /**
 * Permet de supprimer un membre
 * @param unId L'id du membre
 */
        public void supprimerMembre(String unId) throws Throwable{        
            if(membreExiste(unId) == false)throw new Throwable("-2.1");                    
            else {
                for(int i = 0; i<membre.size();i++){
                    if(membre.get(i).getId().equals(unId)){
                      membre.remove(membre.get(i)); 
                    }
                }
            }
        }
        
        
                                                                                                        /**
 * Permet de savoir si cette id existe pour un membre
 * @param unId L'id du membre
 * @return true si l'id existe
 */
	public boolean idExiste(String unId){
		
		for( int i=0;i<membre.size();i++){
			
			if((membre.get(i).getId().equals(unId) )) return true;
			
		}
		return false;
	}
        
                                                                                                                /**
 * Permet de savoir si le mot de passe correspond à un id
 * @param unId L'id du membre
 * @param mdp Le mdp du membre
 * @return true si le mdp correspond
 */
	public boolean passGood(String unId, String mdp){
		
		for( int i=0;i<membre.size();i++){
			
			if((membre.get(i).getId().equals(unId) ) && (membre.get(i).getMdp().equals(mdp))) return true;
			
		}
		return false;
	}
        
                                                                                                                /**
 * Permet de récupérer un membre
 * @param unId L'id du membre
 * @return le membre
 */
        public Membre avoirMembre(String id){
            
            for( int i=0;i<membre.size();i++){
			
			if(membre.get(i).getId().equals(id))return membre.get(i);
			
		}
            return null;
            
        }
	
                                                                                                                /**
 * Permet de pouvoir identifier un membre
 * @param unId L'id du membre
 * @param mdp Le mdp du membre
 * @return le Membre
 * @throws -1 si l'id n'existe pas
 * @throws -2 si le mdp ne correspond pas
 */
	public Membre identifier(String id, String mdp)throws Throwable{
		
		boolean a;
		boolean b;
		a = idExiste(id);
		b = passGood(id,mdp);
		
		if(a == false) throw new Throwable("-1");
		if(b == false) throw new Throwable("-2");
                Membre m = avoirMembre(id);
		
		return m;
	}
        
                                                                                                                        /**
 * Permet de pouvoir co un admin
 * @param unId L'id de l'admin
 * @param mdp Le mdp de l'admin
 * @return 0 si l'admin est crée
 * @throws -3 si aucun admin ne correspond
 */
	public int coAdmin(String id, String mdp)throws Throwable{
		
		for( int i=0;i<admin.size();i++){
			
			if((admin.get(i).getId().equals(id))){
				
				Membre a = identifier(id,mdp);
				return 0;	
			}
			
		}
		throw new Throwable("-3");	
	}

                                                                                                                        /**
 * Permet de savoir si un membre existe
 * @param unId L'id du membre
 * @return true si le membre existe
 
 */
	public boolean membreExiste(String unId){
		for( int i=0;i<membre.size();i++){
       
			if(membre.get(i).getId().equals(unId))  return true;
			
		}            
		return false;
	}
                                                                                                                        /**
 * Permet de savoir si un admin existe
 * @param unId L'id de l'admin
 * @return true si l'admin existe
 
 */
        public boolean adminExiste(String unId){
		for( int i=0;i<admin.size();i++){
       
			if(admin.get(i).getId().equals(unId))  return true;
			
		}            
		return false;
	}

                                                                                                                                /**
 * Permet de créer un produit
 * @param prix Le prix du produit
 * @param type Le type du produit
 * @param nom Le nom du produit
 * @param image L'image du produit
 */
	public void creerProduit(double prix, int type, String nom, File image)throws Throwable{
		
		st.creerProduit(prix, type, nom, image);
	}
        
                                                                                                                                        /**
 * Permet de supprimer un produit
 * @param nom Le nom du produit
 */
        public void supprimerProduit(String nom)throws Throwable{
            st.supprimerProduit(nom);
        }
        
                                                                                                                                        /**
 * Permet d'ajouter du stock à un produit
 * @param nom Le nomp du produit
 * @param q Le quantité du produit
 */
        public void ajouterStock(String nom,int q)throws Throwable{
            
            st.ajouterStock(nom, q);
        }
        
                                                                                                                                                /**
 * Permet d'enlever du stock à un produit 
 * @param nom Le nomp du produit
 * @param q Le quantité du produit
 */
        public void enleverStock(String nom,int q)throws Throwable{
            
            st.enleverStock(nom, q);
        }
        
                                                                                                                                               /**
 * Permet d'enlever du stock par rapport à une commande
 * @param com La liste des produit commander
 */
        public void enleverStock(ArrayList<String> com)throws Throwable{
            Integer g = 1;
            for(int i =0; i<com.size();i++){
              
                enleverStock(com.get(i),g);
            }
            
        }
	
                                                                                                                                                       /**
 * Permet de ^placer une commande en payé
 * @param i Id de la commande
 */
	public void commandePayer(int i) throws Throwable{
		
		Commande c = new Commande();
		for(int j=0; j<commandeNP.size();j++){
			
			if(commandeNP.get(j).getID() == i){ 
				c = commandeNP.get(j);
				commandeNP.remove(j);
				commandeP.add(c);
			}
			else{
				throw new Throwable("-1");
			}
		}
			
	}
        ////  Méthode non utiliser pour l'instant ----------------------------------------------------
	public void addProd(String n, Integer q, int id){
		
		for( int i = 0 ; i< commande.size(); i++)
		{
			if(commande.get(i).getID() == id) commande.get(i).addProduit(n,q);
		}
	}
	public void addQ(String p, int id){
		
		for( int i = 0 ; i< commande.size(); i++)
		{
			if(commande.get(i).getID() == id) commande.get(i).addQuantite(p);
		}
	}
	public void delQ(String p, int id){
		
		for( int i = 0 ; i< commande.size(); i++)
		{
			if(commande.get(i).getID() == id) commande.get(i).delQuantite(p);
		}
	}
        
        //---------------------------------------------------------------------------------------------
        
                                                                                                                                                              /**
 * Permet de valider une commande
 * @param i Id de la commande
 */ 
	public void validerCommande(int id){
		
		for( int i = 0 ; i< commande.size(); i++)
		{
			if(commande.get(i).getID() == id){
				commandeNP.add(commande.get(i));
				
				for(int j =0; j<membre.size();j++){
					
					if(membre.get(j).getId().equals(commande.get(i).getCli().getId())){
						
						membre.get(j).getCommande().add(commande.get(i));
					}
				}				
			}
		}
	}

                                                                                                                                                               /**
 * Permet de crée une commande payé avec le solde
 * @param me Membre qui commande
 * @param com Liste des produits commandés
 * @param p prix de la commande
 */
    public void creerCommande(Membre me, ArrayList<String> com, String p) throws Throwable {
        double d = Double.parseDouble(p);
        Commande c = new Commande(me,this,d,com);
        commandeNP.add(c);
        enleverStock(com);
    }

                                                                                                                                                                  /**
 * Permet de crée une commande payé à la caisse
 * @param me Membre qui commande
 * @param com Liste des produits commandés
 * @param p prix de la commande
 */
    public void creerCommandeCaisse(Membre me, ArrayList<String> com, String p) throws Throwable {
        double d = Double.parseDouble(p);
        enleverStock(com);
        for(int i=0;i<membre.size();i++){
            if(membre.get(i).getId().equals(me.getId())){
                membre.get(i).payer(d);
                Commande c = new Commande(membre.get(i),this,d,com);
                commandeP.add(c);
            }
        }
    }

                                                                                                                                                                  /**
 * Permet de savoir si le produit sélectionner peut être commander
 * @param com Liste des produits commandés
 * @param nom Le nom du produit
 * @return true si il peut être commandé
 */
    public boolean peutCommander(ArrayList<String> com,String nom) {
        if(st.peutCommander(com, nom)==true)return true;
        return false;
    }
	

	public String toString(){
    		
    	String s = new String();
    	s = membre +", " + commande +", " + commandeNP +", " + commandeP+", " + admin+", " + st;
    		
    	return s;
    		
    }
	
	
}