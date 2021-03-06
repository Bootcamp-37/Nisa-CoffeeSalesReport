/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ojdbcexercise.controllers.RelationController1;
import ojdbcexercise.models.Account;

/**
 *
 * @author Laila
 */
public class VerificationPanel extends javax.swing.JPanel {
private RelationController1 countryController;
GridBagLayout layout= new GridBagLayout();
//CountryPanel2 countryPanel2;

    /**
     * Creates new form VerificationPanel
     */
    public VerificationPanel() {
        initComponents();
        this.countryController= new RelationController1();
//        countryPanel2 = new CountryPanel2();
        dpMain.setLayout(layout);
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
//        dpMain.add(countryPanel2,bagConstraints);
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
//        countryPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVerify = new javax.swing.JLabel();
        dpMain = new javax.swing.JPanel();
        pnVerification = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVerification = new javax.swing.JTextField();
        btnVerification = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbVerify.setText(" ");
        add(lbVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 385, -1, -1));

        dpMain.setBackground(new java.awt.Color(255, 153, 153));
        dpMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnVerification.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Verification code");

        txtVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerificationActionPerformed(evt);
            }
        });

        btnVerification.setText("Submit");
        btnVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificationActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("VERIFICATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout pnVerificationLayout = new javax.swing.GroupLayout(pnVerification);
        pnVerification.setLayout(pnVerificationLayout);
        pnVerificationLayout.setHorizontalGroup(
            pnVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVerificationLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(txtVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVerificationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVerificationLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVerificationLayout.createSequentialGroup()
                        .addComponent(btnVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnVerificationLayout.setVerticalGroup(
            pnVerificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerificationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(txtVerification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnVerification)
                .addContainerGap())
        );

        dpMain.add(pnVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 210, 380));

        add(dpMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerificationActionPerformed

    private void btnVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificationActionPerformed
        if(CheckCode(txtVerification.getText())){
           pnVerification.setVisible(false);
//           countryPanel2.setVisible(true);
        }

    }//GEN-LAST:event_btnVerificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerification;
    private javax.swing.JPanel dpMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbVerify;
    private javax.swing.JPanel pnVerification;
    private javax.swing.JTextField txtVerification;
    // End of variables declaration//GEN-END:variables
private boolean CheckCode(String code) {
        Account token1=countryController.getByTokenAccountController(code);
        if (code.isEmpty()) {
            lbVerify.setText("Code not be empty");
            lbVerify.setVisible(true);
            return false;
        } else if ( token1 == null) {
            lbVerify.setText("Code invalid");
            lbVerify.setVisible(true);
            return false;
        }  else {
//            lbVerify.setText("Code is valid");
            lbVerify.setVisible(false);
        }

        return true;
    }
}
