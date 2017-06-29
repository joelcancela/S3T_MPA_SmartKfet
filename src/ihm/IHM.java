/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

/**
 *
 * @author cj406686
 */
import java.awt.Color; 

import javax.swing.JFrame;

import javax.swing.JPanel;

 

public class IHM extends JFrame {

  public IHM(){             

    this.setTitle("Smart K'Fet");
    this.setSize(1280, 800);
    this.setLocationRelativeTo(null);               
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Connexion()); 
    this.validate();
    this.repaint();

  }       
}