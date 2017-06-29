package Tests;
import static org.junit.Assert.*;
import Model.Produit;

import org.junit.Test;


public class Test_Produit {

	@Test
	public void test() {
		
		//Constructeur normal
		Produit p1 = new Produit(2.0, 1, "orangina", null);
		assertEquals("2.0, 1, orangina, null", p1.toString());
		
		//Accesseur Prix
		assertEquals((Double)2.0, (Double)p1.getPrix());
		
		//Accesseur Type
		assertEquals(1, p1.getType());
		
		//Accesseur Nom
		assertEquals("orangina", p1.getNom());
		
		//Accesseur Image
		assertEquals(null, p1.getImage());
		
		//Accesseur de modification Prix
		p1.setPrix(4.0);
		assertEquals((Double)4.0, (Double)p1.getPrix());
		
		//Accesseur de modification Type
		p1.setType(2);
		assertEquals(2, p1.getType());
		
		//Accesseur de modification Nom
		p1.setNom("fanta");
		assertEquals("fanta", p1.getNom());
		
	}

}
