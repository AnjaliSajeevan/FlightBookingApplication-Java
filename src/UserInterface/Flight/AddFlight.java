/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Flight;

import Business.Airplane;
import Business.AirplaneDirectory;
import Business.Flight;
import Business.MasterSeatDirectory;
import Business.SeatDirectory;
import Business.User.Airliner;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Anjali
 */
public class AddFlight extends javax.swing.JPanel {

    /**
     * Creates new form AddFlight
     */
    
    private JPanel CardSequenceJPanel;
    private Airliner a;
    private MasterSeatDirectory sd;
    
    AddFlight(JPanel CardSequenceJPanel,Airliner a,MasterSeatDirectory sd) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.a=a;
        this.sd = sd;
        ComboBoxAirplane.removeAllItems();
        for (Airplane airplane : a.getAirplaneDirectory().getAirplaneList()) {
            ComboBoxAirplane.addItem(airplane);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDeptTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArrivalTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFlightDuration = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCrewNumbers = new javax.swing.JTextField();
        flightCreateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTicketPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFlightDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxAirplane = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE FLIGHT");

        jLabel8.setText("Flight Number:");

        txtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNumberActionPerformed(evt);
            }
        });

        jLabel3.setText("From:");

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        jLabel4.setText("To:");

        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        jLabel5.setText("Departure Time (24 hour):");

        txtDeptTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptTimeActionPerformed(evt);
            }
        });

        jLabel6.setText("Arrival Time (24 hour):");

        txtArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalTimeActionPerformed(evt);
            }
        });

        jLabel7.setText("Flight Duration (hh:mm:ss) :");

        txtFlightDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightDurationActionPerformed(evt);
            }
        });

        jLabel9.setText("Number of Crew Members:");

        txtCrewNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrewNumbersActionPerformed(evt);
            }
        });

        flightCreateBtn.setText("CREATE");
        flightCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightCreateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Ticket Price:");

        txtTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketPriceActionPerformed(evt);
            }
        });

        jLabel10.setText("Flight Date:");

        jLabel11.setText("Airplane:");

        ComboBoxAirplane.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxAirplane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAirplaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(699, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(115, 115, 115))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2))
                                        .addGap(105, 105, 105)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeptTime, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlightDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCrewNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(319, 319, 319))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeptTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrewNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(48, 48, 48)
                .addComponent(flightCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNumberActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void txtDeptTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptTimeActionPerformed

    private void txtArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalTimeActionPerformed

    private void txtFlightDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightDurationActionPerformed

    private void txtCrewNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrewNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrewNumbersActionPerformed

    private void flightCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightCreateBtnActionPerformed
        // TODO add your handling code here:
              
        
        String error ="";
        if((txtFlightNumber.getText().equalsIgnoreCase(""))||
                (txtFrom.getText().equalsIgnoreCase(""))||
                (txtFlightDuration.getText().equalsIgnoreCase(""))||
                (txtTo.getText().equalsIgnoreCase(""))||
                (txtDeptTime.getText().equalsIgnoreCase(""))||
                (txtArrivalTime.getText().equalsIgnoreCase(""))||
                (txtCrewNumbers.getText().equalsIgnoreCase(""))||
                (txtTicketPrice.getText().equalsIgnoreCase(""))||
                (txtFlightDate.getText().equalsIgnoreCase(""))){
        
            error ="Enter all the required fields!";
            if((txtFlightNumber.getText().equalsIgnoreCase(""))){
            txtFlightNumber.setBorder(new LineBorder(Color.RED,2));
            jLabel8.setForeground(Color.red);
            }
            if((txtFrom.getText().equalsIgnoreCase(""))){
            txtFrom.setBorder(new LineBorder(Color.RED,2));
            jLabel3.setForeground(Color.red);
            }
            if((txtFlightDuration.getText().equalsIgnoreCase(""))){
            txtFlightDuration.setBorder(new LineBorder(Color.RED,2));
            jLabel7.setForeground(Color.red);
            }
            if((txtTo.getText().equalsIgnoreCase(""))){
            txtTo.setBorder(new LineBorder(Color.RED,2));
            jLabel4.setForeground(Color.red);
            }
            if((txtDeptTime.getText().equalsIgnoreCase(""))){
            txtDeptTime.setBorder(new LineBorder(Color.RED,2));
            jLabel5.setForeground(Color.red);
            }
            if((txtArrivalTime.getText().equalsIgnoreCase(""))){
            txtArrivalTime.setBorder(new LineBorder(Color.RED,2));
            jLabel6.setForeground(Color.red);
            }
            if((txtCrewNumbers.getText().equalsIgnoreCase(""))){
            txtCrewNumbers.setBorder(new LineBorder(Color.RED,2));
            jLabel9.setForeground(Color.red);
            }
            if((txtTicketPrice.getText().equalsIgnoreCase(""))){
            txtTicketPrice.setBorder(new LineBorder(Color.RED,2));
            jLabel2.setForeground(Color.red);
            }
            if((txtFlightDate.getText().equalsIgnoreCase(""))){
            txtFlightDate.setBorder(new LineBorder(Color.RED,2));
            jLabel10.setForeground(Color.red);
            } 
        }
        

        if(DateCheck()==false)
        {   error= "Please enter the date in the format dd/mm/yyyy";
            txtFlightDate.setBorder(new LineBorder(Color.RED,2));
            jLabel10.setForeground(Color.red);
        }
        if ( ArrTimeCheck()==false)
            { error="Please enter the time in the correct format HH.MM";
            txtArrivalTime.setBorder(new LineBorder(Color.RED,2));
            jLabel6.setForeground(Color.red);
        }
        if(DeptTimeCheck()==false)
        {  error="Please enter the time in the correct format HH.MM";
            txtDeptTime.setBorder(new LineBorder(Color.RED,2));
            jLabel5.setForeground(Color.red);
        }
        
  
        if (!error.equals(""))
        {
            JOptionPane.showMessageDialog(null, error);
        } else 
        {Flight f = a.getFlightSchedule().addFlight();
        String flightName = txtFlightNumber.getText();
        String origin = txtFrom.getText();
        String flightDuration = txtFlightDuration.getText();
        String arrival = txtTo.getText();
        String deptTime = txtDeptTime.getText();
        String arrivalTime = txtArrivalTime.getText();
        String crewMembers = txtCrewNumbers.getText();
        String ticketPrice = txtTicketPrice.getText();
        String flightDate = txtFlightDate.getText();
        Airplane selectedAiplane = (Airplane)ComboBoxAirplane.getSelectedItem();
        
            
        String airplane = selectedAiplane.toString();
        f.setFlightName(flightName);
        f.setOrigin(origin);
        f.setDestination(arrival);
        f.setFlightDuration(flightDuration);
        f.setCrewMembers(crewMembers);
        f.setTicketPrice(ticketPrice);
        f.setAirplane(airplane);
        f.setArrivalTime(arrivalTime);
       f.setDepartureTime(deptTime);
        DateFormat formattime = new SimpleDateFormat("HH:mm");
        
         Date Dtime;
         
        try {
            Dtime = formattime.parse(deptTime);
            f.setDestinationTime(Dtime);
            Pattern p = Pattern.compile("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$");
            Matcher m = p.matcher(deptTime);
            if (m.matches()) {
                String hourString = m.group(1);
                String minuteString = m.group(2);
                int hour = Integer.parseInt(hourString);
                int minute = Integer.parseInt(minuteString);
            if((hour>0) && (hour < 12)){
            f.setPreferedTime("Morning");
            }
            else if((hour>=12) && (hour<17)){
            f.setPreferedTime("Afternoon");
                    }
            else if((hour>=17) && (hour<20)){
            f.setPreferedTime("Evening");
                    }
            else if((hour>=20) && (hour<24)){
            f.setPreferedTime("Night");
                    }
            }
        } catch (ParseException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date;
        try {
            date = format.parse(flightDate);
            f.setFlightDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        int seats = ((selectedAiplane.getSeatingCapacity())/6);
        for(SeatDirectory s : sd.getSeatDirectory()){
        s.generateSeats(flightName, seats,s.getColumnName());
        }

        JOptionPane.showMessageDialog(null, "Flight Created Successfully");
        
        
        
        txtFlightNumber.setText("");
        txtFrom.setText("");
        txtFlightDuration.setText("");
        txtTo.setText("");
        txtDeptTime.setText("");
        txtArrivalTime.setText("");
        txtCrewNumbers.setText("");
        txtTicketPrice.setText("");
       txtFlightDate.setText("");
        }
    }//GEN-LAST:event_flightCreateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlight manageFlight = (ManageFlight) component;
        manageFlight.populateTable();
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketPriceActionPerformed

    private void ComboBoxAirplaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAirplaneActionPerformed

    }//GEN-LAST:event_ComboBoxAirplaneActionPerformed

     private boolean DateCheck(){
         Pattern p = Pattern.compile("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");
        Matcher m = p.matcher(txtFlightDate.getText());
        boolean b = m.matches();
       return b;
     }

       private boolean ArrTimeCheck(){
        Pattern p = Pattern.compile("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$");
       Matcher m = p.matcher(txtArrivalTime.getText());
       boolean c = m.matches();
        return c;
       }
        
        private boolean DeptTimeCheck()
        { Pattern p = Pattern.compile("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$");
       Matcher m = p.matcher(txtDeptTime.getText());
       boolean d = m.matches();
        return d;
        }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxAirplane;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton flightCreateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtCrewNumbers;
    private javax.swing.JTextField txtDeptTime;
    private javax.swing.JTextField txtFlightDate;
    private javax.swing.JTextField txtFlightDuration;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTicketPrice;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}