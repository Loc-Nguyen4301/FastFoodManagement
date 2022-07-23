/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fastfoodmanagement;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.BillDao;
import dao.CategoryDao;
import dao.ProductDao;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Product;
import common.OpenPDF;

/**
 *
 * @author Admin
 */
public class Order extends javax.swing.JFrame {

    public int billId = 1;
    public double grandTotal = 0;
    public double productPrice = 0;
    public double productTotal = 0;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobilenumberPattern = "^[0-9]*$";
    public String userEmail;

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
    }

    public Order(String email) {
        initComponents();
        userEmail = email;
        txtProductName.setEditable(false);
        txtPrice.setEditable(false);
        txtTotal.setEditable(false);
        btnAdd.setEnabled(false);
        btnGenerate.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) spinnerQuantity.getEditor()).getTextField();
        tf.setEnabled(false); 
    }

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) tableProductName.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordsByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
    }

    public void filterProductByName(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) tableProductName.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        }
    }

    public void clearProductFields() {
        txtProductName.setText("");
        txtPrice.setText("");
        spinnerQuantity.setValue(1);
        txtTotal.setText("");
        btnAdd.setEnabled(false);
    }

    public void validateFields() {
        String name = txtCustomerName.getText();
        String mobilenumber = txtMobileNumber.getText();
        if (!name.equals("") && mobilenumber.length() == 10 && mobilenumber.matches(mobilenumberPattern) && grandTotal > 0) {
            btnGenerate.setEnabled(true);
        } else {
            btnGenerate.setEnabled(false);
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboboxCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductName = new javax.swing.JTable();
        txtBillId = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        spinnerQuantity = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(136, 158, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-order-48.png"))); // NOI18N
        jLabel7.setText("Order");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 37, 173, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 104, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Details ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 142, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 182, -1, -1));

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });
        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 220, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 261, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 296, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 104, 277, -1));

        comboboxCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboboxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(comboboxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 139, 277, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 182, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ProductName");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 104, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 104, 201, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 139, 201, -1));

        txtProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 139, 200, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 182, 200, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 182, -1, -1));

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 201, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add to Cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 261, -1, -1));

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        tableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 302, 531, 288));

        tableProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableProductName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductName"
            }
        ));
        tableProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductNameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProductName);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 220, 277, 171));

        txtBillId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBillId.setForeground(new java.awt.Color(255, 255, 255));
        txtBillId.setText("--");
        getContentPane().add(txtBillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 104, 148, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-close-48.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1325, 0, 40, 40));

        btnGenerate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerate.setText("Generate Bill && Print");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 651, -1, -1));

        spinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQuantityStateChanged(evt);
            }
        });
        getContentPane().add(spinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 221, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GrandTotal");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, -1, -1));

        txtGrandTotal.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtGrandTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtGrandTotal.setText("000");
        getContentPane().add(txtGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 120, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 180, 212, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                                                   *Click on to delete order");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 530, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background1.jpeg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel14.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel14.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
//        new Home(userEmail).setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        billId = Integer.parseInt(BillDao.getId());
        txtBillId.setText(BillDao.getId());
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            comboboxCategory.addItem(categoryObj.getName());
        }
        String category = (String) comboboxCategory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_formComponentShown

    private void comboboxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCategoryActionPerformed
        // TODO add your handling code here:
        String category = (String) comboboxCategory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_comboboxCategoryActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String category = (String) comboboxCategory.getSelectedItem();
        String name = txtSearch.getText();
        filterProductByName(name, category);
    }//GEN-LAST:event_txtSearchKeyReleased


    private void tableProductNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductNameMouseClicked
        // TODO add your handling code here:
        int index = tableProductName.getSelectedRow();
        TableModel model = tableProductName.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(productName);

        txtProductName.setText(product.getName());
        txtPrice.setText(product.getPrice());
        spinnerQuantity.setValue(1);
        txtTotal.setText(product.getPrice());

        productPrice = Double.parseDouble(product.getPrice());
        productTotal = Double.parseDouble(product.getPrice());
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_tableProductNameMouseClicked

    private void spinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQuantityStateChanged
        // TODO add your handling code here:
        int quantity = (Integer) spinnerQuantity.getValue();
        if (quantity <= 1) {
            spinnerQuantity.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_spinnerQuantityStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtProductName.getText();
        String price = txtPrice.getText();
        String quantity = String.valueOf(spinnerQuantity.getValue());
        DefaultTableModel dtm = (DefaultTableModel) tableOrder.getModel();
        dtm.addRow(new Object[]{name, price, quantity, productTotal});
        grandTotal += productTotal;
        txtGrandTotal.setText(String.valueOf(grandTotal));
        clearProductFields();
        validateFields();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtCustomerNameKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        String customerName = txtCustomerName.getText();
        String customerMobileNumber = txtMobileNumber.getText();
        
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        Date date = new Date();
        String todayDate = dFormat.format(date);
        String todayDateTime = dFormat1.format(date);

        String total = String.valueOf(grandTotal);
        String createby = userEmail;

        Bill bill = new Bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setMobileNumber(customerMobileNumber);
        bill.setDate(todayDate);
        bill.setTotal(total);
        bill.setCreateBy(createby);
        
        BillDao.save(bill);

        //Creating document 
        String path = "E:\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + billId + ".pdf"));
            doc.open();
            Paragraph fastfoodName = new Paragraph("                                                                Fast Food Management\n  ");
            doc.add(fastfoodName);
            Paragraph starLine = new Paragraph("***************************************************************************************************************");
            doc.add(starLine);
            Paragraph infor = new Paragraph("\tBill ID: " + billId + "\nCustomerName: " + customerName + "\nGio Bat Dau : " + todayDateTime + "\nTotal Paid: " + grandTotal + "\n");
            doc.add(infor);

            PdfPTable tb1 = new PdfPTable(4);
            tb1.addCell("ProductName");
            tb1.addCell("Price");
            tb1.addCell("Quantity");
            tb1.addCell("Total");

            for (int i = 0; i < tableOrder.getRowCount(); i++) {
                String a = tableOrder.getValueAt(i, 0).toString();
                String b = tableOrder.getValueAt(i, 1).toString();
                String c = tableOrder.getValueAt(i, 2).toString();
                String d = tableOrder.getValueAt(i, 3).toString();
                tb1.addCell(a);
                tb1.addCell(b);
                tb1.addCell(c);
                tb1.addCell(d);
            }

            doc.add(tb1);
            doc.add(starLine);
            Paragraph thanksMsg = new Paragraph("Thank you, Please visit again ^^");
            doc.add(thanksMsg);
            OpenPDF.openById(String.valueOf(billId));
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        new Order(createby).setVisible(true);


    }//GEN-LAST:event_btnGenerateActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void tableOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseClicked
        // TODO add your handling code here:
        int index = tableOrder.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this product", "Select", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            TableModel model = tableOrder.getModel();
            String total = model.getValueAt(index, 3).toString();
            grandTotal -= Double.parseDouble(total);
            txtGrandTotal.setText(String.valueOf(grandTotal));
            ((DefaultTableModel) tableOrder.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_tableOrderMouseClicked

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
            java.util.logging.Logger.getLogger(Order.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JComboBox<String> comboboxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTable tableProductName;
    private javax.swing.JLabel txtBillId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JLabel txtGrandTotal;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}