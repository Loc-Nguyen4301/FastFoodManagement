/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fastfoodmanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    public String userEmail;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String email) {
        initComponents();
        userEmail = email;
        if (!userEmail.equals("admin@gmail.com")) {
            btnManageCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnManageListProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
            btnRevenue.setVisible(false);
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

        btnManageListProduct = new javax.swing.JButton();
        btnManageCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        btnViewBillsOrder = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageListProduct.setBackground(new java.awt.Color(136, 138, 255));
        btnManageListProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageListProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnManageListProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-list-48.png"))); // NOI18N
        btnManageListProduct.setText("Manage List Product");
        btnManageListProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageListProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageListProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 240, 100));

        btnManageCategory.setBackground(new java.awt.Color(136, 138, 255));
        btnManageCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-category-48.png"))); // NOI18N
        btnManageCategory.setText("Manage Category");
        btnManageCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 441, 240, 100));

        btnNewProduct.setBackground(new java.awt.Color(136, 138, 255));
        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-new-48.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 240, 100));

        btnLogout.setBackground(new java.awt.Color(136, 138, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-sign-out-48.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 100));

        btnExit.setBackground(new java.awt.Color(136, 138, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-exit-64.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 240, 100));

        btnVerifyUsers.setBackground(new java.awt.Color(136, 138, 255));
        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-approval-48.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, 240, 100));

        btnViewBillsOrder.setBackground(new java.awt.Color(136, 138, 255));
        btnViewBillsOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBillsOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBillsOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-view-48.png"))); // NOI18N
        btnViewBillsOrder.setText("View Bills & Order");
        btnViewBillsOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillsOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillsOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 240, 100));

        btnOrder.setBackground(new java.awt.Color(136, 138, 255));
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-order-48.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 240, 100));

        btnChangePassword.setBackground(new java.awt.Color(136, 138, 255));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-change-password-48.png"))); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 240, 100));

        btnRevenue.setBackground(new java.awt.Color(136, 138, 255));
        btnRevenue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevenue.setForeground(new java.awt.Color(255, 255, 255));
        btnRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-revenue-48.png"))); // NOI18N
        btnRevenue.setText("Revenue");
        btnRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueActionPerformed(evt);
            }
        });
        getContentPane().add(btnRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 240, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageListProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageListProductActionPerformed
        // TODO add your handling code here:
        new ManageListProduct().setVisible(true);
    }//GEN-LAST:event_btnManageListProductActionPerformed

    private void btnManageCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnManageCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Log out", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            setVisible(false);
//            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnViewBillsOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillsOrderActionPerformed
        // TODO add your handling code here:
        new ViewBills().setVisible(true);
    }//GEN-LAST:event_btnViewBillsOrderActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:  
        new Order(userEmail).setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        new ChangePassword().setVisible(true);

    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueActionPerformed
        // TODO add your handling code here:
        new Revenue().setVisible(true);
    }//GEN-LAST:event_btnRevenueActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCategory;
    private javax.swing.JButton btnManageListProduct;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewBillsOrder;
    // End of variables declaration//GEN-END:variables
}