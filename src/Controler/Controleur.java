 package Controler;

import Model.Membre;
import Model.SmartKFet;
import ihm.*;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;


public class Controleur implements Serializable{
        private static final long serialVersionUID = 395972339557656308L;
	private static final String reg = "Save.txt";
	private static IHM leihm;
	private static SmartKFet sm;
        private static Membre m;
	
	public static void main(String args[]) throws Throwable{
                    Object o  = Memoire.read(reg);
            if (o != null){
                if (o instanceof SmartKFet){
                    sm = (SmartKFet) o;
                }
            }
            if(o==null){
		sm=new SmartKFet();
            }
        leihm= new IHM();
            /*Produit burger = new Produit((float) 2.10, 1, "Burger", new File("src/catalogue/burger.jpg"));
            Produit burger2 = new Produit((float) 2.10, 1, "Burger", new File("src/catalogue/burger.jpg"));
            ArrayList<Produit> cata = new ArrayList<Produit>();
            cata.add(burger);             
            cata.add(burger2);
            Stock stk = new Stock();
            stk.setCatalogue(cata);*/
	

    }
        public static void connecterMembre(String user, String pass) throws Throwable{
                m=sm.identifier(user,pass);
               
                    leihm.setContentPane(new PanelUser(m));
                    leihm.validate();
                    leihm.repaint();
                
                
            }
        
        public static void connecterGuest(String user) throws Throwable{
            if(user.equals("")){
                throw new Throwable("-1");}
                    Membre m1 = new Membre();
                    m1.setNom(user);
                    leihm.setContentPane(new PanelUser(m1));
                    leihm.validate();
                    leihm.repaint();
        }
            
        
        public static void connecterAdmin(String user, String pass) throws Throwable{
                int test=sm.coAdmin(user,pass);
                if(test == 0){ 
                    leihm.setContentPane(new PanelAdmin());
                    leihm.validate();
                    leihm.repaint();
                }
                if(test == 1){
                throw new Throwable("-1");}
                if(test == 2){
                throw new Throwable("-2");}
                if(test == 3){
                throw new Throwable("-3");}
        }
        public static void ajouterProduit(double prix, int type, String nom, File image) throws Throwable{
                sm.creerProduit(prix,type,nom,image);
                Memoire.save(sm, reg);
        }
        public static void supprimerProduit(String nom)throws Throwable{
            sm.supprimerProduit(nom);
            Memoire.save(sm, reg);
        }
        public static void ajouterStock(String nom, int q) throws Throwable{
                sm.ajouterStock(nom,q);
                Memoire.save(sm, reg);
        }
        public static void enleverStock(String nom, int q) throws Throwable{
                sm.enleverStock(nom,q);
                Memoire.save(sm, reg);
        }
        public static SmartKFet getSM(){
            return sm;
        }
        public static void goToCommande() throws Throwable{
                    leihm.setContentPane(new Commande(m));
                    leihm.validate();
                    leihm.repaint();
        }
        public static void gererEtudiants() throws Throwable{
                    leihm.setContentPane(new PanelAdminMember());
                    leihm.validate();
                    leihm.repaint();
        }
        public static void gererProduits() throws Throwable{
                    leihm.setContentPane(new PanelAdminProduct());
                    leihm.validate();
                    leihm.repaint();
        }
        public static void gererStocks() throws Throwable{
                    leihm.setContentPane(new PanelAdminStock());
                    leihm.validate();
                    leihm.repaint();
        }
        public static IHM getIHM(){
            return leihm;
        }
        
        public static void ajouterMembre(String nom, String prenom, String id, String mdp)throws Throwable{
        sm.creerMembre(nom,prenom,id,mdp);
        Memoire.save(sm, reg);
    }

    public static void supprimerMembre(String id) throws Throwable{
        sm.supprimerMembre(id);
        Memoire.save(sm, reg);
    }

    public static ArrayList<String> getMembre() {
        ArrayList<Membre> membres = sm.getMembre();
        ArrayList<String> id = new ArrayList<String>();
        for (int i=0;i<membres.size();i++){
            id.add(membres.get(i).getId());
        }
        return id;
    }

    public static void ajouterAdmin(String Id)throws Throwable {
        sm.ajouterAdmin(Id);
        Memoire.save(sm, reg);
    }

    public static void supprimerAdmin(String Id)throws Throwable {
        sm.supprimerAdmin(Id);
        Memoire.save(sm, reg);
    }

    public static ArrayList<String> getAdmin() {
        ArrayList<Membre> admin = sm.getAdmin();
        ArrayList<String> id = new ArrayList<String>();
        for (int i=0;i<admin.size();i++){
            id.add(admin.get(i).getId());
        }
        return id;
    }

    public static void paiement(ArrayList<String> commande, String text) {
        leihm.setContentPane(new Paiement(m,commande,text));
        leihm.validate();
        leihm.repaint();
    }

    public static void creerCommande(Membre me, ArrayList<String> com, String p)throws Throwable {
        sm.creerCommande(me,com,p);
        Memoire.save(sm, reg);
    }

    public static void creerCommandeCaisse(Membre me, ArrayList<String> com, String p)throws Throwable {
        sm.creerCommandeCaisse(me,com,p);
        Memoire.save(sm, reg);
    }

    public static boolean peutCommander(ArrayList<String> commande,String nom) {
        if(sm.peutCommander(commande,nom)==true)return true;
        else {return false;}
         
    }
    public static void setUser(Membre mg){
        m=mg;
    }

}