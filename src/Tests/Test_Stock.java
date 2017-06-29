package Tests;
import static org.junit.Assert.*;
import Model.Produit;
import Model.Stock;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;


public class Test_Stock {

	@Test
	public void test() throws Throwable {
		
		//Constructeur par d�faut
		Stock st1 = new Stock();
		assertEquals("[], {}", st1.toString());
		
		//Accesseur Stock
		assertEquals("{}", st1.getStock().toString());
		
		//Accesseur Catalogue
		assertEquals("[]", st1.getCatalogue().toString());
		
		//Methode pour voir si un produit existe
		assertEquals(false, st1.produitExiste("Big Mac"));
		
		//Methode pour ajouter un produit
		double prix = 2.0;
		int type = 1;
		String nom = "Big Mac";
		File image = null;
		Produit produit = new Produit(prix, type, nom, image);
		st1.ajouterProduit(produit);
		assertEquals(true, st1.produitExiste(nom));
		
		//Methode pour ajouter du stock
		st1.ajouterStock(nom, 10);
		assertEquals("{Big Mac=10}", st1.getStock().toString());
		
		//Methode pour enlever du stock
		st1.enleverStock(nom, 4);
		assertEquals("{Big Mac=6}", st1.getStock().toString());
		
		//Methode pour creer un produit
		st1.creerProduit(4.0, 2, "Sandwich", null);
		assertEquals(true, st1.produitExiste("Sandwich"));
		
		//Accesseur de modification du Catalogue
		ArrayList<Produit> arrayP = new ArrayList<Produit>();
		arrayP.add(produit);
		st1.setCatalogue(arrayP);
		assertEquals("[2.0, 1, Big Mac, null]", st1.getCatalogue().toString());
	}

}
