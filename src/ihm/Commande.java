/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import Controler.Controleur;
import Model.Membre;
import Model.Produit;
import Model.Stock;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cj406686
 */
public class Commande extends javax.swing.JPanel {
    Model.Commande currentCmd = new Model.Commande();
    GridBagConstraints gbc = new GridBagConstraints();
    ArrayList<String> commande = new ArrayList<String>();
    Membre m;
    /**
     * Creates new form Commande
     */
    public Commande(Membre membre) {
        m = membre;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(0, 0));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("BOISSONS");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("DESSERTS");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton7.setText("PLATS");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogue/retour.png"))); // NOI18N
        jButton8.setText("Retour");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanel1);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        jLabel1.setText("Etat de la commande");

        jButton9.setBackground(new java.awt.Color(0, 204, 51));
        jButton9.setText("Valider");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setText("Prix Total :");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("€");

        jButton10.setText("Annuler");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton10)))
                        .addGap(12, 12, 12))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.removeAll();
        try {
            boissons();
            this.validate();
            this.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jPanel1.removeAll();
        try {
            plats();
            this.validate();
            this.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Controleur.getIHM().setContentPane(new PanelUser(m));
        Controleur.getIHM().validate();
        Controleur.getIHM().repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        commande.clear();
        jTextArea2.setText("");
        jLabel3.setText("0");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jLabel3.getText().equals("0")) jLabel5.setText("Commande vide");
        else {
        Controleur.paiement(commande,jLabel3.getText());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.removeAll();
        try {
            desserts();
            this.validate();
            this.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    private void plats() throws IOException{
        jPanel1.removeAll();
        Date d = new Date();
        ArrayList<Produit> cata =  Controleur.getSM().getStock().getCatalogue();
        int i=0;
        int j=0;
        for(Produit p : cata){
            if(p.getType()==2){
            BufferedImage image = ImageIO.read(p.getImage());
            JButton bouton = new JButton();
            bouton.setIcon(new ImageIcon(image));
            bouton.setPreferredSize(new Dimension(200, 300));
            bouton.setText(p.getNom() + "  " + Double.toString(p.getPrix()) +"€" );
            bouton.setHorizontalTextPosition(JButton.CENTER);
            bouton.setVerticalTextPosition(JButton.BOTTOM);
            bouton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(d.getHours()>13 && d.getHours()<18){
                if(Controleur.peutCommander(commande, p.getNom())==true){
                System.out.println("Ajouter produit" +p.getNom());
                jTextArea2.insert( "1 "+p.getNom()+" "+p.getPrix()+"€"+ "\n",0);
                double prix = Double.parseDouble(jLabel3.getText());
                double prix2 = p.getPrix();
                prix = prix+prix2;
                jLabel3.setText(""+prix);
                commande.add(p.getNom());
                }
                else{
                    jLabel6.setText("Il n'y a plus de stock pour ce produit");
                }
                }
                else{
                    jLabel6.setText("La tranche horraire n'est pas bonne");
                }
                
                }
            });
            //On positionne la case de départ du composant
            gbc.gridx = i;
            gbc.gridy = j;
            //La taille en hauteur et en largeur
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            if(i>0 && i%2==0){
                j++;
                i=0;
                jPanel1.add(bouton, gbc);
            }
            else{
                jPanel1.add(bouton, gbc);
                i++;
            }
            }
        }

    }
    private void boissons() throws IOException{
        jPanel1.removeAll();
        Date d = new Date();
        ArrayList<Produit> cata =  Controleur.getSM().getStock().getCatalogue();
        int i=0;
        int j=0;
        for(Produit p : cata){
            if(p.getType()==1){
            BufferedImage image = ImageIO.read(p.getImage());
            JButton bouton = new JButton();
            bouton.setIcon(new ImageIcon(image));
            bouton.setPreferredSize(new Dimension(200, 300));
            bouton.setText(p.getNom() + "  " + Double.toString(p.getPrix()) +"€" );
            bouton.setHorizontalTextPosition(JButton.CENTER);
            bouton.setVerticalTextPosition(JButton.BOTTOM);
            bouton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(d.getHours()>13 && d.getHours()<18){
                if(Controleur.peutCommander(commande, p.getNom())==true){
                System.out.println("Ajouter produit" +p.getNom());
                jTextArea2.insert( "1 "+p.getNom()+" "+p.getPrix()+"€"+ "\n",0);
                double prix = Double.parseDouble(jLabel3.getText());
                double prix2 = p.getPrix();
                prix = prix+prix2;
                jLabel3.setText(""+prix);
                commande.add(p.getNom());
                }
                else{
                    jLabel6.setText("Il n'y a plus de stock pour ce produit");
                }
                }
                 else{
                    jLabel6.setText("La tranche horraire n'est pas bonne");
                }
                }
                
            });
            //On positionne la case de départ du composant
            gbc.gridx = i;
            gbc.gridy = j;
            //La taille en hauteur et en largeur
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            if(i>0 && i%2==0){
                j++;
                i=0;
                jPanel1.add(bouton, gbc);
            }
            else{
                jPanel1.add(bouton, gbc);
                i++;
            }
            }
            }
        

    }
    private void desserts() throws IOException{
        jPanel1.removeAll();
        Date d = new Date();
        ArrayList<Produit> cata =  Controleur.getSM().getStock().getCatalogue();
        int i=0;
        int j=0;
        for(Produit p : cata){
            if(p.getType()==3){
            BufferedImage image = ImageIO.read(p.getImage());
            JButton bouton = new JButton();
            bouton.setIcon(new ImageIcon(image));
            bouton.setPreferredSize(new Dimension(200, 300));
            bouton.setText(p.getNom() + "  " + Double.toString(p.getPrix()) +"€" );
            bouton.setHorizontalTextPosition(JButton.CENTER);
            bouton.setVerticalTextPosition(JButton.BOTTOM);
            bouton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                 
                if(Controleur.peutCommander(commande, p.getNom())==true){
                System.out.println("Ajouter produit" +p.getNom());
                jTextArea2.insert( "1 "+p.getNom()+" "+p.getPrix()+"€"+ "\n",0);
                double prix = Double.parseDouble(jLabel3.getText());
                double prix2 = p.getPrix();
                prix = prix+prix2;
                jLabel3.setText(""+prix);
                commande.add(p.getNom());
                }
                else{
                    jLabel6.setText("Il n'y a plus de stock pour ce produit");
                }
                 
              
                }
            });
            //On positionne la case de départ du composant
            gbc.gridx = i;
            gbc.gridy = j;
            //La taille en hauteur et en largeur
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            if(i>0 && i%2==0){
                j++;
                i=0;
                jPanel1.add(bouton, gbc);
            }
            else{
                jPanel1.add(bouton, gbc);
                i++;
            }
            }
        

    }
    }
}
