/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnlab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Pradeep
 */
public class CalculateCIDR extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CalculateCIDR() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputIPv4View = new javax.swing.JTextField();
        cidrIPv4View = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        netmaskIPv4View = new javax.swing.JTextField();
        noOfHostsIPv4View = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nwAddrIPv4View = new javax.swing.JTextField();
        broadcastAddrIPv4View = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstIPAddrIPv4View = new javax.swing.JTextField();
        lastIPAddrIPv4View = new javax.swing.JTextField();
        clearFields = new javax.swing.JButton();
        calculateAddressButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputIPv6View = new javax.swing.JTextField();
        cidrIPv6View = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        noOfHostsIPv6View = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        startIPAddrIPv6View = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lastIPAddrIPv6View = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        calculateIPv6Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CIDR Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        jLabel1.setText("IPv4 Address");

        jLabel2.setText("CIDR");

        jLabel3.setText("Netmask IP");

        jLabel4.setText("No. of Hosts");

        netmaskIPv4View.setEditable(false);

        noOfHostsIPv4View.setEditable(false);

        jLabel5.setText("Network Address");

        jLabel6.setText("Broadcast Address");

        nwAddrIPv4View.setEditable(false);

        broadcastAddrIPv4View.setEditable(false);

        jLabel7.setText("First  usable IP Address");

        jLabel8.setText("Last Usable IP Address");

        firstIPAddrIPv4View.setEditable(false);

        lastIPAddrIPv4View.setEditable(false);

        clearFields.setText("Clear");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });

        calculateAddressButton.setText("Submit");
        calculateAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateAddressButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(inputIPv4View, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(nwAddrIPv4View)
                    .addComponent(jLabel7)
                    .addComponent(firstIPAddrIPv4View)
                    .addComponent(netmaskIPv4View))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(noOfHostsIPv4View, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(broadcastAddrIPv4View)
                        .addComponent(jLabel8)
                        .addComponent(lastIPAddrIPv4View))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(clearFields)
                        .addGap(18, 18, 18)
                        .addComponent(calculateAddressButton))
                    .addComponent(cidrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netmaskIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfHostsIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nwAddrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broadcastAddrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstIPAddrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastIPAddrIPv4View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearFields)
                    .addComponent(calculateAddressButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("IPv4 Address", jPanel2);

        jLabel9.setText("IPv6 Address");

        jLabel10.setText("CIDR");

        inputIPv6View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIPv6ViewActionPerformed(evt);
            }
        });

        jLabel11.setText("Number of Hosts");

        noOfHostsIPv6View.setEditable(false);

        jLabel12.setText("Starting IP address");

        startIPAddrIPv6View.setEditable(false);

        jLabel13.setText("Last Usable IP Address");

        lastIPAddrIPv6View.setEditable(false);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        calculateIPv6Button.setText("Calculate");
        calculateIPv6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateIPv6ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(inputIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cidrIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(noOfHostsIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(startIPAddrIPv6View)
                            .addComponent(lastIPAddrIPv6View, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculateIPv6Button)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidrIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noOfHostsIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startIPAddrIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastIPAddrIPv6View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(calculateIPv6Button))
                .addContainerGap())
        );

        jTabbedPane4.addTab("IPv6 Address", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed
        
        inputIPv4View.setText("");
        cidrIPv4View.setText("");
        netmaskIPv4View.setText("");
        noOfHostsIPv4View.setText("");
        nwAddrIPv4View.setText("");
        broadcastAddrIPv4View.setText("");
        firstIPAddrIPv4View.setText("");
        lastIPAddrIPv4View.setText("");
        inputIPv4View.requestFocus();
    }//GEN-LAST:event_clearFieldsActionPerformed

    private void calculateAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateAddressButtonActionPerformed
        IPv4Implementation allImplementation1 = new IPv4Implementation();
         final String IPv4Address_PATTERN =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
         Pattern pattern = Pattern.compile(IPv4Address_PATTERN);
        
         String input =inputIPv4View.getText().trim();
         String temp_subnetMask= cidrIPv4View.getText().trim();
        int subnetMask=0,maximumHosts;
        String ipAdd ="";
        String cidr = "";
        Matcher matcher = pattern.matcher(input);
        boolean correctIP = allImplementation1.StrIP2Dec(input);
        if((temp_subnetMask.isEmpty()) || (input.isEmpty() && !matcher.matches())){
            if(input.isEmpty() || !matcher.matches()){
                JOptionPane.showMessageDialog(null, "IP address error");
                inputIPv4View.requestFocus();
                return;
            }            
            if( temp_subnetMask.isEmpty()){
                JOptionPane.showMessageDialog(null, "CIDR");
                cidrIPv4View.requestFocus();
                return;
            }   
        }else if(!correctIP){
            JOptionPane.showMessageDialog(null, "Please put proper IP address");
            inputIPv4View.requestFocus();
            return;
        }else{
//                allImplementation1.StrIP2Dec(input);
                subnetMask = Integer.parseInt(temp_subnetMask);
                if(subnetMask<0 || subnetMask > 32){
                    JOptionPane.showMessageDialog(null, "CIDR");
                    cidrIPv4View.requestFocus();
                    return;
                }
        }
        int bitMaskValue = (1 << (32-subnetMask)) - 1;
        
        int ip32bit=0;
        try {
            ip32bit = allImplementation1.convertStrIP2IntIP(input);
        } catch (Exception e) {
        }
        
        
        int tempNetworkIP = ip32bit & (~bitMaskValue);
        int networkAddIP = tempNetworkIP;
        int firstIP = tempNetworkIP + 1;
        int tempBroadCastIP = firstIP | bitMaskValue;
        int broadCastIP = tempBroadCastIP;
        int lastIP = tempBroadCastIP - 1;

        String firstIPAddress = allImplementation1.convertIntIP2StrIP(firstIP);
        String lastIPAddress = allImplementation1.convertIntIP2StrIP(lastIP);
        String broadCastAddress = allImplementation1.convertIntIP2StrIP(broadCastIP);
        String networkAddress = allImplementation1.convertIntIP2StrIP(networkAddIP);

        if (bitMaskValue>0)
        {
            maximumHosts = bitMaskValue - 1;
        }else
        {
            maximumHosts = 0;
        }
        int netmaskVal=(~bitMaskValue);
        String binaryNetmask = allImplementation1.convertIntIP2StrIP(netmaskVal);

        netmaskIPv4View.setText(""+binaryNetmask);
        noOfHostsIPv4View.setText(""+maximumHosts);
        firstIPAddrIPv4View.setText(firstIPAddress);
        lastIPAddrIPv4View.setText(lastIPAddress);
        broadcastAddrIPv4View.setText(broadCastAddress);
        nwAddrIPv4View.setText(networkAddress);
    }//GEN-LAST:event_calculateAddressButtonActionPerformed

    private void inputIPv6ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIPv6ViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIPv6ViewActionPerformed

    private void calculateIPv6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateIPv6ButtonActionPerformed
        Ipv6Implementation parsed = new Ipv6Implementation();
        String ipv6Address = inputIPv6View.getText();
        String subnetValue = cidrIPv6View.getText();
        boolean result;
//        result = parsed.parse("2605:2700:0:3::4713:93e3/127");
        result = parsed.parse(ipv6Address+"/"+subnetValue);
		if(result){
                        startIPAddrIPv6View.setText(parsed.startHostAddressIP);
                        lastIPAddrIPv6View.setText(parsed.lastHostAddressIP);
                        noOfHostsIPv6View.setText(""+(int)parsed.getNumberOfHosts());
			System.out.println("Is it a valid IP address " + result);	
//			parsed.displayHostIpInfo();
		}
		else{
			System.out.println("Wrong IP Format");			
		}
		//result = parsed.parse("2605:2700:0:3::4713:93e3");
    }//GEN-LAST:event_calculateIPv6ButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputIPv6View.setText(null);
        cidrIPv6View.setText(null);
        noOfHostsIPv6View.setText(null);
        startIPAddrIPv6View.setText(null);
        lastIPAddrIPv6View.setText(null);
        inputIPv6View.requestFocus();
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateCIDR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateCIDR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateCIDR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateCIDR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculateCIDR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField broadcastAddrIPv4View;
    private javax.swing.JButton calculateAddressButton;
    private javax.swing.JButton calculateIPv6Button;
    private javax.swing.JTextField cidrIPv4View;
    private javax.swing.JTextField cidrIPv6View;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearFields;
    private javax.swing.JTextField firstIPAddrIPv4View;
    private javax.swing.JTextField inputIPv4View;
    private javax.swing.JTextField inputIPv6View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastIPAddrIPv4View;
    private javax.swing.JTextField lastIPAddrIPv6View;
    private javax.swing.JTextField netmaskIPv4View;
    private javax.swing.JTextField noOfHostsIPv4View;
    private javax.swing.JTextField noOfHostsIPv6View;
    private javax.swing.JTextField nwAddrIPv4View;
    private javax.swing.JTextField startIPAddrIPv6View;
    // End of variables declaration//GEN-END:variables
}
