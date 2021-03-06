/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airplane;

import Business.AirlinerDirectory;
import Business.Airplane;
import Business.AirplaneDirectory;
import Business.MasterSeatDirectory;
import Business.User.Airliner;
import UserInterface.Flight.ManageFlight;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class AirplaneLogin extends javax.swing.JPanel {

    /**
     * Creates new form AirplaneLogin
     */
    private JPanel userProcessContainer;
    private AirlinerDirectory airlinerDirectory;
    private MasterSeatDirectory sd;
    
    public AirplaneLogin(JPanel upc, AirlinerDirectory ad, MasterSeatDirectory sd) {
       
          initComponents();
        userProcessContainer = upc;
        airlinerDirectory = ad;
        this.sd = sd;
        
        airlineComboBox.removeAllItems();
        for (Airliner airliner : airlinerDirectory.getAirliners()) {
            airlineComboBox.addItem(airliner);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        airlineComboBox = new javax.swing.JComboBox();
        btnGo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Airliner ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Airliner name:");

        airlineComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlineComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineComboBoxActionPerformed(evt);
            }
        });

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGo.setText("GO>>");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        jButton1.setText("<-Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnGo)))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(463, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlineComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineComboBoxActionPerformed

    }//GEN-LAST:event_airlineComboBoxActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
         Airliner airliner = (Airliner) airlineComboBox.getSelectedItem();
        ManageFlight panel = new ManageFlight(userProcessContainer,airliner,sd);
        userProcessContainer.add("ManageFlight",panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnGoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlineComboBox;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
