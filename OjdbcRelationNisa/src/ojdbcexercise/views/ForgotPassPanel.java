/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojdbcexercise.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import ojdbcexercise.controllers.RelationController1;

/**
 *
 * @author Laila
 */
public class ForgotPassPanel extends javax.swing.JPanel {
private RelationController1 countryController;
GridBagLayout layout= new GridBagLayout();
    /**
     * Creates new form ForgotPassPanel
     */
    public ForgotPassPanel() {
        initComponents();
         this.countryController= new RelationController1();
        dpMain.setLayout(layout);
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
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
        dpMain = new javax.swing.JPanel();
        PnChangePass = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtToken = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 153, 153));

        dpMain.setBackground(new java.awt.Color(255, 153, 153));

        PnChangePass.setBackground(new java.awt.Color(255, 204, 255));
        PnChangePass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Change Password Form");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("CHANGE YOUR PASSWORD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Token");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 53, -1, -1));
        jInternalFrame1.getContentPane().add(txtToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 86, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("New Password");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 124, -1, -1));
        jInternalFrame1.getContentPane().add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 157, 190, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 204, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 206, 190, -1));

        PnChangePass.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 300));

        javax.swing.GroupLayout dpMainLayout = new javax.swing.GroupLayout(dpMain);
        dpMain.setLayout(dpMainLayout);
        dpMainLayout.setHorizontalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpMainLayout.createSequentialGroup()
                .addComponent(PnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 841, Short.MAX_VALUE))
        );
        dpMainLayout.setVerticalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpMainLayout.createSequentialGroup()
                .addComponent(PnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
countryController.changePass(txtPassword1.getText(),txtToken.getText());
PnChangePass.setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnChangePass;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel dpMain;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtToken;
    // End of variables declaration//GEN-END:variables
}
