package Tests;
import static org.junit.Assert.*;
import Model.Membre;
import Model.SmartKFet;

import org.junit.Test;


public class Test_Membre {

	@Test
	public void test() throws Throwable {
		
		//Constructeur par défaut
		Membre m1 = new Membre();
		assertEquals("Membre : , , , 0.0", m1.toString());
		
		//Constructeur normal
		SmartKFet kfet = new SmartKFet();
		Membre m2 = new Membre(kfet, "Lopez", "Fabien", "LF", "mougins");
		assertEquals("Membre : Lopez, Fabien, LF, 0.0", m2.toString());
		
		//Accesseur Nom
		assertEquals("Lopez", m2.getNom().toString());
		
		//Accesseur Prenom
		assertEquals("Fabien", m2.getPrenom().toString());

		//Accesseur Id
		assertEquals("LF", m2.getId().toString());

		//Accesseur Mot de passe
		assertEquals("mougins", m2.getMdp().toString());
		
		//Accesseur Admin
		assertEquals(false, m2.getAdmin());
		
		//Accesseur Solde
		assertEquals((Double)0.0, (Double)m2.getSolde());

		//Accesseur Commande
		assertEquals("[]", m2.getCommande().toString());
		
		//Accesseur de modification Nom 
		m2.setNom("Cancela");
		assertEquals("Cancela", m2.getNom().toString());
		
		//Accesseur de modification Prenom 
		m2.setPrenom("Joel");
		assertEquals("Joel", m2.getPrenom().toString());
		
		//Accesseur de modification Id 
		m2.setId("CJ");
		assertEquals("CJ", m2.getId().toString());
		
		//Accesseur de modification Mot de passe 
		m2.setMdp("skyfox");
		assertEquals("skyfox", m2.getMdp().toString());
		
		//Accesseur de modification Admin 
		m2.setAdmin(true);
		assertEquals(true, m2.getAdmin());
		
		//Accesseur de modification Solde 
		m2.setSolde(50.0);
		assertEquals((Double)50.0, (Double)m2.getSolde());
		
		//Methode payer
		m2.payer(20.0);
		assertEquals((Double)30.0, (Double)m2.getSolde());
		
	}

}
