/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ojdbcexercise.controllers.RelationController1;
import ojdbcexercise.tools.MailTool;
import ojdbcexercise.tools.TextPrompt;

/**
 *
 * @author Laila
 */
public class LoginPanel extends javax.swing.JPanel {
GridBagLayout layout= new GridBagLayout();
ForgotPassPanel fpp;
RegisterViewPanel cp;
    private RelationController1 countryController;

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
         this.countryController= new RelationController1();
        fpp = new ForgotPassPanel();
        cp = new RegisterViewPanel();
//        pn2.setLayout(layout);
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
//        pn2.add(fpp,bagConstraints);
//        pn2.add(cp,bagConstraints);
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
        fpp.setVisible(false);
        cp.setVisible(false);
         TextPrompt tpUsername= new TextPrompt("Username", txtUsername);
        tpUsername.setForeground( Color.GRAY );
tpUsername.changeAlpha(0.5f);
tpUsername.changeStyle( Font.ITALIC);
TextPrompt tpPassword= new TextPrompt("Password", txtPassword);
        tpPassword.setForeground( Color.GRAY );
tpPassword.changeAlpha(0.5f);
tpPassword.changeStyle( Font.ITALIC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        dpMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lbforgotPass = new javax.swing.JLabel();
        lbRegister = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnLogin2 = new java.awt.Button();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dpMain.setBackground(new java.awt.Color(255, 153, 153));
        dpMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jPanel1.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setToolTipText("USERNAME\n");
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 40));

        txtPassword.setToolTipText("PASSWORD");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 40));

        jLabel5.setText("Doesnt have account?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        lbforgotPass.setText("Forgot Password");
        lbforgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbforgotPassMouseReleased(evt);
            }
        });
        jPanel1.add(lbforgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        lbRegister.setText("Register");
        lbRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbRegisterMouseReleased(evt);
            }
        });
        jPanel1.add(lbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("LOGIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 32, 81, 27));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\bootcamp\\Projects\\Java\\OjdbcExercise_2\\src\\ojdbcexercise\\images\\icons8_Contacts_25px.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 30, 40));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\bootcamp\\Projects\\Java\\OjdbcExercise_2\\src\\ojdbcexercise\\images\\icons8_Lock_25px.png")); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 30, 40));

        btnLogin2.setActionCommand("LOGIN");
        btnLogin2.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin2.setLabel("LOGIN");
        btnLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 220, -1));

        dpMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 380));

        add(dpMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 720, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lbforgotPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbforgotPassMouseReleased

        String email=countryController.getByUsernameAccountController(txtUsername.getText());
        String token= countryController.getTokenByUsernameAccountController(txtUsername.getText());
        System.out.println(token);
        try {
            MailTool.sendMail(email,false,token);
            jPanel1.setVisible(false);
            String msg="Message sent successfully, please check your email";
int confirm=JOptionPane.showConfirmDialog(this, msg,"ok", JOptionPane.OK_OPTION);
            if(confirm==0){
                jPanel1.setVisible(false);


            }
        } catch (Exception ex) {
ex.printStackTrace();
        }

    }//GEN-LAST:event_lbforgotPassMouseReleased

    private void lbRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegisterMouseReleased
        jPanel1.setVisible(false);
    }//GEN-LAST:event_lbRegisterMouseReleased

    private void btnLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin2ActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if (this.countryController.Login1(username, password)) {
            jPanel1.setVisible(false);
Panel2_Admin countryPanel2=new Panel2_Admin();
dpMain.add(countryPanel2);
            
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }//GEN-LAST:event_btnLogin2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLogin2;
    private javax.swing.JPanel dpMain;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbRegister;
    private javax.swing.JLabel lbforgotPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
