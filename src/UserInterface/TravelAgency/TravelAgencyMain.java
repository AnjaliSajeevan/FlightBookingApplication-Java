/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.AbstractClasses.User;
import Business.AbstractClasses.UserDirectory;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.AgentDirectory;
import Business.FlightSchedule;
import Business.MasterSeatDirectory;
import Business.MasterTicketCatalog;
import Business.SeatDirectory;
import Business.TravelAgency;
import Business.User.Customer;
import UserInterface.Airline.ManageAirline;
import UserInterface.Customer.CustomerLogin;
import UserInterface.Customer.CustomerPage;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author manasa
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private AirlinerDirectory airlinerDirectory;
    private CustomerDirectory customerList;
    private AgentDirectory agentDirectory;
    private MasterSeatDirectory seatDirectory;
    private MasterTicketCatalog ticketDirectory;
    private UserDirectory userDirectory;
    

     
    public TravelAgencyMain() {
        initComponents();   
        userDirectory = new UserDirectory();
        airlinerDirectory = new AirlinerDirectory();
        customerList = new CustomerDirectory();
        agentDirectory = new AgentDirectory();
        seatDirectory = new MasterSeatDirectory();
        SeatDirectory sdA = new SeatDirectory("A");
        SeatDirectory sdB = new SeatDirectory("B");
        SeatDirectory sdC = new SeatDirectory("C");
        SeatDirectory sdD = new SeatDirectory("D");
        SeatDirectory sdE = new SeatDirectory("E");
        SeatDirectory sdF = new SeatDirectory("F");       
        seatDirectory.addSeatDirectory(sdA);
        seatDirectory.addSeatDirectory(sdB);
        seatDirectory.addSeatDirectory(sdC);
        seatDirectory.addSeatDirectory(sdD);
        seatDirectory.addSeatDirectory(sdE);
        seatDirectory.addSeatDirectory(sdF);
        
        ticketDirectory = new MasterTicketCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        CardSequenceJPanel = new javax.swing.JPanel();
        rightJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRegisterAirliner = new javax.swing.JButton();
        btnManageTravelAgency = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 917));

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(800);
        jSplitPane1.setDividerSize(2);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(229, 200));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1000, 815));

        CardSequenceJPanel.setBackground(new java.awt.Color(0, 102, 102));
        CardSequenceJPanel.setPreferredSize(new java.awt.Dimension(643, 734));
        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setLeftComponent(CardSequenceJPanel);

        rightJPanel.setBackground(new java.awt.Color(0, 102, 102));
        rightJPanel.setPreferredSize(new java.awt.Dimension(298, 917));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Travel Agency !");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Sign up!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnRegisterAirliner.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRegisterAirliner.setText("Register Airlines");
        btnRegisterAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAirlinerActionPerformed(evt);
            }
        });

        btnManageTravelAgency.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageTravelAgency.setText("Manage Travel Agency");
        btnManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTravelAgencyActionPerformed(evt);
            }
        });

        btnManageCustomers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegisterAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageTravelAgency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegisterAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnManageTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPanelLayout.createSequentialGroup()
                .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightJPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rightJPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(rightJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAirlinerActionPerformed
        // TODO add your handling code here:
       for(User i: userDirectory.getUser()){
           if(i.getRole().equals("CUSTOMER")){
            JOptionPane.showMessageDialog(null,"No Access for Customers!\nOnly Agents have access to this page!","Warning", JOptionPane.WARNING_MESSAGE);           
                return;
           }
           }
       if(userDirectory.getUser().size() == 0){
        JOptionPane.showMessageDialog(null,"Please login to access this page!\nOnly Admin can access this page","Warning", JOptionPane.WARNING_MESSAGE);           
                return;          
       }
        ManageAirline panel = new ManageAirline(CardSequenceJPanel,airlinerDirectory,seatDirectory);
        CardSequenceJPanel.add("ManageAirline",panel);
        CardLayout layout =(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnRegisterAirlinerActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
               if(userDirectory.getUser().size() == 0){
        JOptionPane.showMessageDialog(null,"Please login to access this page!","Warning", JOptionPane.WARNING_MESSAGE);           
                return;          
       }
               
        String i = "";
        for(User user: userDirectory.getUser()){
             i = user.getUserName();
        }
        CustomerPage custPanel = new CustomerPage(CardSequenceJPanel,customerList,i,agentDirectory,airlinerDirectory,seatDirectory,ticketDirectory);
        CardSequenceJPanel.add("CustomerPage",custPanel);
        CardLayout layout =(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTravelAgencyActionPerformed
        // TODO add your handling code here:
        for(User i: userDirectory.getUser()){
           if(i.getRole().equals("CUSTOMER")){
            JOptionPane.showMessageDialog(null,"No Access for Customers!\nOnly Agents have access to this page!","Warning", JOptionPane.WARNING_MESSAGE);           
                return;
           }
           }
               if(userDirectory.getUser().size() == 0){
        JOptionPane.showMessageDialog(null,"Please login to access this page!\nOnly Admin can access this page","Warning", JOptionPane.WARNING_MESSAGE);           
                return;          
       }
        boolean c = airlinerDirectory.getAirliners().isEmpty();
        if( (c==false)){
            String cuserid = "";
            for(User u:userDirectory.getUser()){
                 cuserid = u.getUserName();
            }
        MasterTravelSchedule mastertravel = new MasterTravelSchedule(CardSequenceJPanel,airlinerDirectory,customerList,cuserid);
        CardSequenceJPanel.add("MasterTravelSchedule",mastertravel);
        CardLayout layout =(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Please enter airline details", "Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnManageTravelAgencyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainLogin loginpanel = new MainLogin(customerList,agentDirectory,userDirectory);
        CardSequenceJPanel.add("MainLogin",loginpanel);
        CardLayout layout =(CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageTravelAgency;
    private javax.swing.JButton btnRegisterAirliner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
