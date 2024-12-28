/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import java.sql.*;
import Backend.Database_Configuration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Screens.Login;

/**
 *
 * @author mu409
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Database_Configuration dbConfig = new Database_Configuration();
    Connection connection = dbConfig.getConnection();

    public Signup() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jAddress = new javax.swing.JTextField();
        jCNIC = new javax.swing.JTextField();
        jPin = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jSubmitBtn = new javax.swing.JButton();
        jLogin = new javax.swing.JLabel();
        jShowPass = new javax.swing.JCheckBox();
        jPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/signup.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN UP");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("CNIC");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jName.setText("Arfaat Hussain");
        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jAddress.setText("Attock ");

        jCNIC.setText("3710120334845");
        jCNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNICActionPerformed(evt);
            }
        });

        jPin.setText("1234");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Pin");

        jEmail.setText("arfaathussain@gmail.com");

        jSubmitBtn.setBackground(new java.awt.Color(204, 204, 204));
        jSubmitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSubmitBtn.setText("SUBMIT");
        jSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitBtnActionPerformed(evt);
            }
        });

        jLogin.setForeground(new java.awt.Color(51, 51, 255));
        jLogin.setText("Login");
        jLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLoginMouseClicked(evt);
            }
        });

        jShowPass.setText("Show Password");
        jShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPassActionPerformed(evt);
            }
        });

        jPhoneNumber.setText("03315183344");
        jPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneNumberActionPerformed(evt);
            }
        });

        jLabel8.setText("Phone Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jShowPass)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPin)
                            .addComponent(jEmail)
                            .addComponent(jAddress)
                            .addComponent(jCNIC)
                            .addComponent(jName))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogin)
                    .addComponent(jShowPass))
                .addGap(18, 18, 18)
                .addComponent(jSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 430, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private boolean validateForm(String userName, String phone, String address, String cnic, int pin) {
        if (userName.trim().isEmpty()) {
            // Invalid Name entry
            JOptionPane.showMessageDialog(null, "Invalid Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (phone.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (address.trim().isEmpty()) {
            // Invalid address
            JOptionPane.showMessageDialog(null, "Invalid Address", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (cnic.length() != 13) {
            // Invalid CNIC
            JOptionPane.showMessageDialog(null, "Invalid CNIC", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Convert pin to String to check its length
        String pinString = Integer.toString(pin);
        if (pinString.length() != 4) {
            // Invalid PIN
            JOptionPane.showMessageDialog(null, "Invalid PIN", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // If all validations pass
        return true;
    }

    private boolean isPersonExist(String cnic, String email, String phone) {

        String query = "select * from accounts where cnic = ? or email = ? or phone = ?;";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setString(1, cnic);
            stmt.setString(2, email);
            stmt.setString(3, phone);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Record found

                JOptionPane.showMessageDialog(null, "Person already exists with the provided CNIC, Email, or Phone!", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }

        } catch (Exception ex) {
            ex.printStackTrace(); // Print error details
        }
        return false;
    }

    private void jSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitBtnActionPerformed
        // TODO add your handling code here:

        String userName = jName.getText();
        String address = jAddress.getText();
        String cnic = jCNIC.getText();
        String email = jEmail.getText();
        String phone = jPhoneNumber.getText();
//        int pin = jPin.
        char[] passwordArray = jPin.getPassword();
        String password = new String(passwordArray);
        int pin = Integer.parseInt(password);

        if (validateForm(userName, phone, address, cnic, pin)) {

            if (isPersonExist(cnic, email, phone)) {
                return;
            }
            try {
                String query = "INSERT INTO accounts (customer_name,email,phone,address,cnic,pin) values(?,?,?,?,?,?)";

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, phone);
                preparedStatement.setString(4, address);
                preparedStatement.setString(5, cnic);
                preparedStatement.setInt(6, pin);

                int rowInserted = preparedStatement.executeUpdate();

                if (rowInserted > 0) {
                    
//                    JOptionPane.showMessageDialog(null, "Data Inserted Successfully!");

                    String query2 = "select account_id from accounts where customer_name = ?;";

                    PreparedStatement stmt2 = connection.prepareStatement(query2);
                    stmt2.setString(1, userName);

                    ResultSet rs = stmt2.executeQuery();

                    if (rs.next()) {
                        int account_id = rs.getInt("account_id");
                        JOptionPane.showMessageDialog(null, "Your Account is created with Account Number: " + account_id, "Information", JOptionPane.INFORMATION_MESSAGE);
                        new Login(account_id,pin).setVisible(true);
                        setVisible(false);
                    }

                } else {
                    System.out.println("Data insertion failure");
                }

                dbConfig.closeResources();
                dbConfig.closeConnection();

            } catch (Exception ex) {
                ex.printStackTrace(); // Print error details
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jSubmitBtnActionPerformed


    private void jShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPassActionPerformed
        // TODO add your handling code here:
        if (jShowPass.isSelected()) {
            // Show password as plain text
            jPin.setEchoChar((char) 0);
        } else {
            // Hide password with default echo char
            jPin.setEchoChar('*');
        }
    }//GEN-LAST:event_jShowPassActionPerformed

    private void jLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseClicked
        // TODO add your handling code here:

        new Login().setVisible(true);
    }//GEN-LAST:event_jLoginMouseClicked

    private void jCNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCNICActionPerformed

    private void jPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneNumberActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jCNIC;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLogin;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPhoneNumber;
    private javax.swing.JPasswordField jPin;
    private javax.swing.JCheckBox jShowPass;
    private javax.swing.JButton jSubmitBtn;
    // End of variables declaration//GEN-END:variables
}
