/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Ticket;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Manasa
 */
public class ViewTicketPage extends javax.swing.JPanel {

    /**
     * Creates new form ViewTicketPage
     */
    private JPanel CardSequenceJPanel;
    private Ticket ticket;

    public ViewTicketPage(JPanel CardSequenceJPanel,Ticket ticket) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.ticket= ticket;
        txtFlightNumber.setText(ticket.getFlightNum());
        txtFrom.setText(ticket.getFlightFrom());
        txtDestination.setText(ticket.getDestination());
        txtDeptTime.setText(ticket.getDepartTime());
        txtArrivalTime.setText(ticket.getArrivalTime());
        txtTicketPrice.setText(String.valueOf(ticket.getPrice()));
        txtTotalTicketPrice.setText(String.valueOf(ticket.getTotalPrice()));
        txtCustId.setText(ticket.getCustomerID());
        txtAirplane.setText(ticket.getAirplane());
        txtCount.setText(String.valueOf(ticket.getPassengerCount()));
        txtSeat.setText(ticket.getSeats());
        txtFlightDate.setText(String.valueOf(ticket.getTravelDate()));
        txtTicketCreateDate.setText(String.valueOf(ticket.getCreateDate()));
        txtTicketNum.setText(String.valueOf(ticket.getTicketNum()));
        txtStatus.setText(ticket.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTicketPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtArrivalTime = new javax.swing.JTextField();
        txtDeptTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFlightDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        txtAirplane = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSeat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTicketCreateDate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTicketNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalTicketPrice = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketPriceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TICKET SUMMARY");

        jLabel8.setText("Flight Number:");

        txtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNumberActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Ticket Price:");

        jLabel6.setText("Arrival Time:");

        txtArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalTimeActionPerformed(evt);
            }
        });

        txtDeptTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptTimeActionPerformed(evt);
            }
        });

        jLabel5.setText("Departure Time:");

        jLabel4.setText("Flight From :");

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        txtDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinationActionPerformed(evt);
            }
        });

        jLabel3.setText("Destination:");

        jLabel10.setText("Travel Date:");

        jLabel12.setText("Customer ID:");

        txtCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustIdActionPerformed(evt);
            }
        });

        txtAirplane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirplaneActionPerformed(evt);
            }
        });

        jLabel13.setText("Airplane:");

        txtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountActionPerformed(evt);
            }
        });

        jLabel14.setText("Passenger Count:");

        txtSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatActionPerformed(evt);
            }
        });

        jLabel15.setText("Seat Number:");

        txtTicketCreateDate.setBackground(new java.awt.Color(0, 102, 102));
        txtTicketCreateDate.setBorder(null);
        txtTicketCreateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketCreateDateActionPerformed(evt);
            }
        });

        jLabel16.setText("Ticket Create Date:");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setText("Ticket Number:");

        txtTicketNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketNumActionPerformed(evt);
            }
        });

        jLabel7.setText("Ticket Price:");

        txtTotalTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalTicketPriceActionPerformed(evt);
            }
        });

        txtStatus.setBackground(new java.awt.Color(0, 102, 102));
        txtStatus.setBorder(null);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        jLabel11.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTicketCreateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeptTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTicketNum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSeat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAirplane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalTicketPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(317, 317, 317))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel16)
                    .addComponent(txtTicketCreateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtTicketNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTicketPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotalTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(txtDeptTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTicketCreateDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketCreateDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketCreateDateActionPerformed

    private void txtSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatActionPerformed

    private void txtCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountActionPerformed

    private void txtAirplaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirplaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirplaneActionPerformed

    private void txtCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIdActionPerformed

    private void txtDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinationActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtDeptTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptTimeActionPerformed

    private void txtArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalTimeActionPerformed

    private void txtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNumberActionPerformed

    private void txtTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketPriceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTicketNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketNumActionPerformed

    private void txtTotalTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalTicketPriceActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAirplane;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtDeptTime;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightDate;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTicketCreateDate;
    private javax.swing.JTextField txtTicketNum;
    private javax.swing.JTextField txtTicketPrice;
    private javax.swing.JTextField txtTotalTicketPrice;
    // End of variables declaration//GEN-END:variables
}
