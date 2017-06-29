package Tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import Model.Commande;
import Model.Membre;
import Model.Produit;
import Model.SmartKFet;
import Model.Stock;

import org.junit.Test;


public class Test_SmartKFet {

	@Test//(expected=Throwable.class)
	public void test() throws Throwable {
		
		//Constructeur par défaut
		SmartKFet sm1 = new SmartKFet();
		assertEquals("[Membre : Super, Admin, 00, 50.0], [], [], [], [Membre : Super, Admin, 00, 50.0], [], {}", sm1.toString());
		
		//Accesseur Membre
		assertEquals("[Membre : Super, Admin, 00, 50.0]", sm1.getMembre().toString());
		
		//Accesseur Commande non payée
		assertEquals("[]", sm1.getCommandeNP().toString());
		
		//Accesseur Commande payée
		assertEquals("[]", sm1.getCommandeP().toString());
		
		//Accesseur Commande
		assertEquals("[]", sm1.getCommande().toString());
		
		//Accesseur Admin
		assertEquals("[Membre : Super, Admin, 00, 50.0]", sm1.getAdmin().toString());
		
		//Accesseur Stock
		assertEquals("[], {}", sm1.getStock().toString());
		
		//Methode pour ajouter un membre
		Membre m1 = new Membre();
		sm1.ajouterMembre(m1);
		assertEquals("[Membre : Super, Admin, 00, 50.0, Membre : , , , 0.0]", sm1.getMembre().toString());
		
		//Methode pour ajouter un administrateur
		Membre m2 = new Membre(sm1, "Lopez", "Fabien", "LF", "mougins");
		sm1.ajouterMembre(m2);
		sm1.ajouterAdmin("LF");
		assertEquals("[Membre : Super, Admin, 00, 50.0, Membre : Lopez, Fabien, LF, 0.0]", sm1.getAdmin().toString());
		
		//Methode pour supprimer un administrateur
		sm1.supprimerAdmin("LF");
		assertEquals("[Membre : Super, Admin, 00, 50.0]", sm1.getAdmin().toString());
		
		//Methode pour supprimer un membre
		sm1.supprimerMembre("LF");
		assertEquals("[Membre : Super, Admin, 00, 50.0, Membre : , , , 0.0]", sm1.getMembre().toString());
		
		//Methode pour ajouter une commande
		Commande c1 = new Commande();
		sm1.ajouterCommande(c1);
		assertEquals("[null, null, Prix: 0.0, Panier: null]", sm1.getCommandeNP().toString());
		
		//Methode pour supprimer une commande
		//Methode NON FAITE
		//sm1.suppCommande(c1);
		//assertEquals("[]", sm1.getCommandeNP().toString());
		
		//Methode pour creer un Membre
		sm1.creerMembre("Cancela", "Joel", "CJ", "skyfox");
		assertEquals("[Membre : Super, Admin, 00, 50.0, Membre : , , , 0.0, Membre : Cancela, Joel, CJ, 0.0]", sm1.getMembre().toString());
		
		//Methode pour voir si un Identifiant existe
		assertEquals(true, sm1.idExiste("CJ"));
		assertEquals(false, sm1.idExiste("FM"));
		
		//Methode pour voir si un Mot de passe existe et est bien associé à son identifiant
		assertEquals(true, sm1.passGood("CJ", "skyfox"));
		assertEquals(false, sm1.passGood("CJ", "sky"));
		assertEquals(false, sm1.passGood("00", "skyfox"));
		assertEquals(false, sm1.passGood("FM", "skyfox"));
		
		//Methode pour avoir un Membre grâce à son Identifiant
		assertEquals("Membre : Cancela, Joel, CJ, 0.0", sm1.avoirMembre("CJ").toString());
		assertEquals(null, sm1.avoirMembre("FM"));
		
		//Methode pour identifier un Membre
		assertEquals("Membre : Cancela, Joel, CJ, 0.0", sm1.identifier("CJ", "skyfox").toString());
		
		//Methode pour connecter un Administrateur
		assertEquals(0, sm1.coAdmin("00", "0000"));
		
		//Methode pour savoir si un Membre existe
		assertEquals(true, sm1.membreExiste("CJ"));
		assertEquals(false, sm1.membreExiste("FM"));
		
		//Methode pour savoir si un Admin existe
		assertEquals(true, sm1.adminExiste("00"));
		assertEquals(false, sm1.adminExiste("CJ"));
		
		//Methode pour creer un Produit
		Stock st1 = new Stock();
		sm1.creerProduit(2.0, 1, "Glace", null);
		assertEquals(true, sm1.getStock().produitExiste("Glace"));
		
		//Methode pour ajouter du Stock
		sm1.ajouterStock("Glace", 10);
		assertEquals("[2.0, 1, Glace, null], {Glace=10}", sm1.getStock().toString());
		
		//Methode pour enlever du Stock grâce au nom
		sm1.enleverStock("Glace", 5);
		assertEquals("[2.0, 1, Glace, null], {Glace=5}", sm1.getStock().toString());
		
		//Methode pour enlever du Stock grâce à la Commande
		ArrayList<String> com = new ArrayList<String>();
		com.add("Glace");
		sm1.enleverStock(com);
		assertEquals("[2.0, 1, Glace, null], {Glace=4}", sm1.getStock().toString());
		sm1.enleverStock(com);
		sm1.enleverStock(com);
		sm1.enleverStock(com);
		sm1.enleverStock(com);
		assertEquals("[2.0, 1, Glace, null], {Glace=0}", sm1.getStock().toString());
		
		//Methode pour supprimer un Produit
		sm1.supprimerProduit("Glace");
		assertEquals(false, st1.produitExiste("Glace"));
		
		//Methode pour ajouter une commande payée
		sm1.commandePayer(0);
		assertEquals("[]", sm1.getCommandeNP().toString());
		assertEquals("[null, null, Prix: 0.0, Panier: null]", sm1.getCommandeP().toString());
		
		
		
		//MODIFICATION DE LA CLASSE SMARTKFET => METHODE commandePayer
		
	}

}
