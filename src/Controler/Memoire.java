package Controler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Memoire {

/**
* Methode de sauvegarde
*
@param Object o, object à sauvegarder
@param String fileName, fichier externe dans lequel est fait la sauvegarde
**/
    public  static void save (Object o, String fileName){
        ObjectOutputStream oos = null;
        try {
            final FileOutputStream fichier = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(o);
            oos.flush();
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }

/**
* Methode de lecture
*
@param String fileName, fichier externe à partir duquel la sauvegarde est chargé
@return retourne objet sauvegarder
**/
    public  static Object read (String fileName){
        ObjectInputStream ois = null;
        Object o = null;
        try {
            final FileInputStream fichier = new FileInputStream(fileName);
            ois = new ObjectInputStream(fichier);
            o = ois.readObject();
            System.out.println(o);
        } catch (final java.io.FileNotFoundException e) {
            System.out.println("Pas de précédentes sauvegardes");
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();

            }
        }
        return o;
    }
}