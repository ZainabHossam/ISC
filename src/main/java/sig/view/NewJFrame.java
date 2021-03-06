/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sig.view;


import java.util.ArrayList;
import javax.swing.*;
import sig.controllers.HandelActions;
import sig.model.InvoiceHeaderTableModel;
import sig.model.InvoiceHeaders;
import sig.model.InvoiceLineTableModel;




/**
 *
 * @author Zainab
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        HandelAction = new HandelActions(this);
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceTableDetails = new javax.swing.JTable();
        DeleteInvoiceBtn = new javax.swing.JButton();
        DeleteInvoiceBtn.addActionListener(HandelAction);
        CreateNewInvoiceBtn = new javax.swing.JButton();
        CreateNewInvoiceBtn.addActionListener(HandelAction);
        IncoiceNumber = new javax.swing.JLabel();
        InvoiceNumberValue = new javax.swing.JTextField();
        InvoiceDate = new javax.swing.JLabel();
        InvoiceDataValue = new javax.swing.JTextField();
        CustomerName = new javax.swing.JLabel();
        CustomerNameValue = new javax.swing.JTextField();
        InvoiceTotal = new javax.swing.JLabel();
        InvoiceTotalValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceTable = new javax.swing.JTable();
        InvoiceTable.getSelectionModel().addListSelectionListener(HandelAction);
        CancelBtn = new javax.swing.JButton();
        CancelBtn.addActionListener(HandelAction);
        SaveBtn = new javax.swing.JButton();
        SaveBtn.addActionListener(HandelAction);
        jMenuBar2 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        LoadFile.addActionListener(HandelAction);
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(HandelAction);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });
        menuBar1.add(menu2);

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Sales Invoice Generator");
        jInternalFrame1.setAlignmentY(0.0F);
        jInternalFrame1.setAutoscrolls(true);
        jInternalFrame1.setName("Sales Invoice Generator"); // NOI18N
        jInternalFrame1.setVisible(true);

        jLabel1.setText("InvoiceTable");

        InvoiceTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvoiceTableDetails.setShowGrid(true);
        jScrollPane1.setViewportView(InvoiceTableDetails);

        DeleteInvoiceBtn.setText("Delete Invoice");
        DeleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceBtnActionPerformed(evt);
            }
        });

        CreateNewInvoiceBtn.setText("Create New Invoice");

        IncoiceNumber.setText("Invoice Number");

        InvoiceNumberValue.setText(" ");
        InvoiceNumberValue.setEnabled(false);

        InvoiceDate.setText("Invoice Date");

        CustomerName.setText("Customer Name");

        InvoiceTotal.setText("Invoice Total");

        InvoiceTotalValue.setEnabled(false);
        InvoiceTotalValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceTotalValueActionPerformed(evt);
            }
        });

        jLabel6.setText("Invoice Items");
        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvoiceTable.setShowGrid(true);
        jScrollPane2.setViewportView(InvoiceTable);

        CancelBtn.setText("Delete Line");
        CancelBtn.setActionCommand("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Create New Line");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        FileMenu.setText("File");
        FileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileMenuMouseClicked(evt);
            }
        });

        LoadFile.setText("Load File");
        LoadFile.setToolTipText("");
        LoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileActionPerformed(evt);
            }
        });
        FileMenu.add(LoadFile);

        SaveFile.setText("Save File");

        SaveFile.setActionCommand("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        FileMenu.add(SaveFile);


        jMenuBar2.add(FileMenu);

        jInternalFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(CreateNewInvoiceBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteInvoiceBtn)))
                        .addGap(256, 256, 256)
                        .addComponent(SaveBtn)
                        .addGap(65, 65, 65)
                        .addComponent(CancelBtn))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(IncoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvoiceNumberValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustomerNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                    .addComponent(InvoiceDataValue)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(InvoiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InvoiceTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IncoiceNumber)
                    .addComponent(InvoiceNumberValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceDataValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(InvoiceDate)
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CustomerName)
                                    .addComponent(CustomerNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(InvoiceTotal)
                                    .addComponent(InvoiceTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteInvoiceBtn)
                    .addComponent(CreateNewInvoiceBtn)
                    .addComponent(SaveBtn)
                    .addComponent(CancelBtn))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        jInternalFrame1.getAccessibleContext().setAccessibleName("");
        jInternalFrame1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2ActionPerformed

    private void DeleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceBtnActionPerformed

    private void InvoiceTotalValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceTotalValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceTotalValueActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void FileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileMenuMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_FileMenuMouseClicked

    private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileActionPerformed
        // TODO add your handling code here:

    }
    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileActionPerformed

    /**
     * @param args the command line arguments
     */
            public static void main (String args[]){
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
                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new NewJFrame().setVisible(true);
                    }
                });
            }

    public void setInvoiceNumberValue(String invoiceNumberValue) {
        InvoiceNumberValue.setText(invoiceNumberValue) ;
    }

    public void setInvoiceDataValue(String invoiceDataValue) {
        InvoiceDataValue.setText(invoiceDataValue);
    }

    public void setCustomerNameValue(String customerNameValue) {
        CustomerNameValue.setText(customerNameValue);
    }

    public void setInvoiceTotalValue(double invoiceTotalValue) {
        InvoiceTotalValue.setText(String.valueOf(invoiceTotalValue));
    }

    public void setInvoiceDate(){

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
            private javax.swing.JButton CancelBtn;
            public javax.swing.JButton CreateNewInvoiceBtn;
            private javax.swing.JLabel CustomerName;
            private javax.swing.JTextField CustomerNameValue;
            private javax.swing.JButton DeleteInvoiceBtn;
            private javax.swing.JMenu FileMenu;
            private javax.swing.JLabel IncoiceNumber;
            private javax.swing.JTextField InvoiceDataValue;
            private javax.swing.JLabel InvoiceDate;
            private javax.swing.JTextField InvoiceNumberValue;
            private javax.swing.JTable InvoiceTable;
    private javax.swing.JTable InvoiceTableDetails;
            private javax.swing.JLabel InvoiceTotal;
            private javax.swing.JTextField InvoiceTotalValue;
            private javax.swing.JMenuItem LoadFile;
            private javax.swing.JButton SaveBtn;
            private javax.swing.JMenuItem SaveFile;
            private javax.swing.JFrame jFrame1;
            private javax.swing.JFrame jFrame2;
            private javax.swing.JInternalFrame jInternalFrame1;
            private javax.swing.JLabel jLabel1;
            private javax.swing.JLabel jLabel2;
            private javax.swing.JLabel jLabel6;
            private javax.swing.JMenuBar jMenuBar2;
            private javax.swing.JScrollPane jScrollPane1;
            private javax.swing.JScrollPane jScrollPane2;
            private java.awt.Menu menu1;
            private java.awt.Menu menu2;
            private java.awt.MenuBar menuBar1;
            private InvoiceHeaderTableModel headerTableModel;
            private InvoiceLineTableModel LineTableModel;
            private InvoiceHeaders HandelActions;
    public HandelActions getHandelAction() {
        return HandelAction;
    }



    public ArrayList<InvoiceHeaders> getInvoiceHeadersList() {
        return InvoiceHeadersList;
    }

    public void setInvoiceHeadersList(ArrayList<InvoiceHeaders> invoiceHeadersList) {
        this.InvoiceHeadersList = invoiceHeadersList;
        headerTableModel=new InvoiceHeaderTableModel(invoiceHeadersList);
        this.InvoiceTable.setModel(headerTableModel);

    }

    // End of variables declaration//GEN-END:variables
            public HandelActions HandelAction;

    public JTable getInvoiceTable() {
        return InvoiceTable;
    }

    public JTable getInvoiceTableDetails() {
        return InvoiceTableDetails;
    }

    private ArrayList<InvoiceHeaders> InvoiceHeadersList;
        }
