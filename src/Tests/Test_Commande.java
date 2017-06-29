package Tests;
import Model.Commande;
import Model.Membre;
import Model.SmartKFet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Test_Commande {

	@Test
	public void test() throws Throwable {
		
		//Constructeur par défaut
		Commande c1 = new Commande();
		assertEquals("null, null, Prix: 0.0, Panier: null", c1.toString());
		
		//Constructeur normal
		Membre cli = new Membre();
		SmartKFet kfet = new SmartKFet();
		ArrayList<String> com = new ArrayList<String>();
		double prix = 2.0;
		Commande c2 = new Commande(cli, kfet, prix, com);
		assertEquals("Membre : , , , 0.0, [Membre : Super, Admin, 00, 50.0], [], [], [], [Membre : Super, Admin, 00, 50.0], [], {}, Prix: 2.0, Panier: {}", c2.toString());
		
		//Accesseur Client
		assertEquals("Membre : , , , 0.0", c2.getCli().toString());
		
		//Accesseur Date
		assertEquals(new Date().toString(), c2.getDate().toString());
		
		//Accesseur Etat
		assertEquals(false, c2.getEtat());
		
		//Accesseur Identifiant
		assertEquals(0, c2.getID());
		
		//Accesseur Panier
		assertEquals("{}", c2.getPanier().toString());
		
		//Accesseur de modification Etat
		c2.setEtat(true);
		assertEquals(true, c2.getEtat());
		
		//Methode d'ajout d'un produit
		c2.addProduit("Big Mac", 2);
		assertEquals("{Big Mac=2}", c2.getPanier().toString());
		
		//Methode d'ajout d'une quantité
		c2.addQuantite("Big Mac");
		assertEquals("{Big Mac=3}", c2.getPanier().toString());
		
		//Methode de suppression d'une quantité
		c2.delQuantite("Big Mac");
		assertEquals("{Big Mac=2}", c2.getPanier().toString());
		
		//Methode pour remplir une commande
		c2.remplir(com);
		assertEquals("{}", c2.remplir(com).toString());

	}

}
