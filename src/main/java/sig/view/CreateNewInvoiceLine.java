/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package sig.view;

import javax.swing.*;

/**
 *
 * @author Zainab
 */
public class CreateNewInvoiceLine extends javax.swing.JDialog {

    /**
     * Creates new form CreateNewInvoiceLine
     */
    String itemName;
    Double unitPrice;
    int itemCounts;
    int InvoNo;

    public int getInvoNo() {
        return InvoNo;
    }

    public void setInvoNo(int invoNo) {
        InvoNo = invoNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getItemCounts() {
        return itemCounts;
    }

    public void setItemCounts(int itemCounts) {
        this.itemCounts = itemCounts;
    }

    public CreateNewInvoiceLine(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
private  void AddLinebtnActionPerformed(java.awt.event.ActionEvent evt){


    try {
        setUnitPrice(Double.valueOf(unitPriceValue.getText()));
        setItemCounts(Integer.parseInt(itemCountValue.getText()));
    }catch (NumberFormatException nfe) {
        System.out.println("NumberFormat Exception: invalid input string");
    }
    setItemName(itemNameValue.getText());
    System.out.println("Item count "+getItemCounts()+"  , unit Price"+getUnitPrice()+"   , Item name"+getItemName());
    if(getItemCounts()==0||getItemName()==""||getUnitPrice()==0){
        JOptionPane.showMessageDialog(this,"Please Enter All Data!");
    }
    dispose();
//    else {
//        dispose();
//    }
    }
    private void cancelAddbtnActionPerformed(java.awt.event.ActionEvent evt){
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        unitPriceLabel = new javax.swing.JLabel();
        itemCountLabel = new javax.swing.JLabel();
        itemNameValue = new javax.swing.JTextField();
        unitPriceValue = new javax.swing.JTextField();
        itemCountValue = new javax.swing.JTextField();
        AddLinebtn = new javax.swing.JButton();
        cancelAddbtn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Add New Invoice Line");

        itemNameLabel.setText("Item Name:");

        unitPriceLabel.setText("Unit Price:");

        itemCountLabel.setText("Item Count:");

        itemCountValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCountValueActionPerformed(evt);
            }
        });

        AddLinebtn.setText("Add");
        AddLinebtn.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt) {
             AddLinebtnActionPerformed(evt);
    }
                             }
);
        cancelAddbtn.setText("Cancel");
        cancelAddbtn.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddbtnActionPerformed(evt);
            }});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(itemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(itemNameValue))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(itemCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                                        .addComponent(unitPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(unitPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(itemCountValue))))
                                .addContainerGap(36, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelAddbtn)
                                .addGap(49, 49, 49)
                                .addComponent(AddLinebtn)
                                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemNameLabel)
                                        .addComponent(itemNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(unitPriceLabel)
                                        .addComponent(unitPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemCountLabel)
                                        .addComponent(itemCountValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AddLinebtn)
                                        .addComponent(cancelAddbtn))
                                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>

    private void itemCountValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(CreateNewInvoiceLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewInvoiceLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewInvoiceLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewInvoiceLine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateNewInvoiceLine dialog = new CreateNewInvoiceLine(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddLinebtn;
    private javax.swing.JButton cancelAddbtn;
    private javax.swing.JLabel itemCountLabel;
    private javax.swing.JTextField itemCountValue;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemNameValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel unitPriceLabel;
    private javax.swing.JTextField unitPriceValue;
    // End of variables declaration
}