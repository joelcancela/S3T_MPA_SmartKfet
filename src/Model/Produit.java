/**
 * Classe Produit
 * @author Foucault Marc, Dolla Maxime, Lopez Fabien, Cancella Vaz Joel
 * @version 2.0
 */

package Model;

import java.io.File;
import java.io.Serializable;

public class Produit implements Serializable{
private double prix;
private int type;
private String nom;
private File image;


	public Produit(double unPrix, int unType, String unNom,File uneImage) {
		
		prix = unPrix;
		type = unType;
		nom = unNom;
		image = uneImage;
		
	}
	
	public String toString(){
		
	String s = new String();
	s = prix +", " + type+", " + nom+", " + image;
	
	return s;
		
	}
	
        /**
 * Permet de connaître le prix d'un produit
 * @return le prix
 */
	public double getPrix(){return prix;}
        
                /**
 * Permet de connaître le type d'un produit
 * @return le type
 */
	public int getType(){return type;}
        
                /**
 * Permet de connaître le nom d'un produit
 * @return le nom
 */
	public String getNom(){return nom;}
        
                /**
 * Permet de connaître l'image d'un produit
 * @return l'image
 */
	public File getImage(){return image;}
	
        
                /**
 * Permet de modifier le prix d'un produit
 * @param unPrix Le nouveau prix
 */
	public void setPrix(double unPrix){
		
		prix = unPrix;
	}
        
                       /**
 * Permet de modifier le type d'un produit
 * @param unType Le nouveau type
 */
	public void setType(int unType){
		
		type = unType;
	}
        
                       /**
 * Permet de modifier le nom d'un produit
 * @param unNom Le nouveau nom
 */
	public void setNom(String unNom){
		
		nom = unNom;
	}
        
                       /**
 * Permet de modifier l'image d'un produit
 * @param uneImage La nouvel image
 */
	public void setImage(File uneImage){
		
		image = uneImage;
	}
	
	
	
}
