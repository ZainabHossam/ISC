
package sig.controllers;

import sig.model.InvoiceHeaderTableModel;
import sig.model.InvoiceHeaders;
import sig.model.InvoiceLine;
import sig.model.InvoiceLineTableModel;
import sig.view.CreateNewInvoiceLine;
import sig.view.NewJFrame;
import sig.view.OtherDialog;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;


/**
 *
 * @author Zainab
 * All Button Actions will be in this class
 */
public class HandelActions extends Component implements ActionListener , ListSelectionListener {
    private NewJFrame frame;
public HandelActions(NewJFrame frame){
    this.frame=frame;

}
    @Override
    public void actionPerformed(ActionEvent Clicked) {
        System.out.println("This is an action Called!");
        switch(Clicked.getActionCommand()){
            case "Load File":
            {
                try {
                    LoadFile();
                } catch (IOException ex) {
                    Logger.getLogger(HandelActions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

                
            case "Save File":
            {
                System.out.println("SaveFile");
            try {
                System.out.println("SaveFile");
                SaveFile();
            } catch (IOException ex) {
                Logger.getLogger(HandelActions.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
                break;

            case "Create New Invoice":
                newInvoice();
                break;
                
            case "Delete Invoice":
                DelInvoice();
                break;
            case "Create New Line":
                AddNewLine();
                break;
                
            case "Cancel":
                DeleteLine();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Clicked.getActionCommand());
        }
    }


    ArrayList<InvoiceHeaders> InvoHeaderArray= new ArrayList<>();
    ArrayList<InvoiceLine> lines=new ArrayList<>();



    private void newInvoice() {
                InvoiceHeaderTableModel model = new InvoiceHeaderTableModel(InvoHeaderArray);
                System.out.println(model.getRowCount());
                try {
                    System.out.println("newInvoice Visited");
                    OtherDialog dialog = new OtherDialog(new javax.swing.JFrame(), true);
                    dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setVisible(true);
                    System.out.println("CustFrom Handel" + dialog.getCustName());
                    if(dialog.getInvoNo()==0||dialog.getInvoDate()==""||dialog.getCustName()=="") {
                        System.out.println("Fields are Empty");
                    }else{
                        System.out.println("In Condition");
                        InvoiceHeaders invoHeader2 = new InvoiceHeaders(dialog.getInvoNo(), dialog.getInvoDate(), dialog.getCustName());
                        InvoHeaderArray.add(invoHeader2);
                        InvoiceHeaderTableModel model2 = new InvoiceHeaderTableModel(InvoHeaderArray);
                        System.out.println(model.getRowCount());
                        frame.setInvoiceHeadersList(InvoHeaderArray);

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }



    private void DelInvoice() {
        int selectedRow = frame.getInvoiceTable().getSelectedRow();
        if(selectedRow>=0) {
            System.out.println("The Selected row is:" + selectedRow);
            InvoHeaderArray.remove(selectedRow);
            frame.getInvoiceTable().addNotify();

        }
        else{
            System.out.println("No Data to Delete");
        }

    }

    private void AddNewLine() {
       // InvoiceLineTableModel model = new InvoiceLineTableModel(lines);
        //InvoiceHeaderTableModel model2 = new InvoiceHeaderTableModel(InvoHeaderArray);
        int selectedRow = frame.getInvoiceTable().getSelectedRow();
      //  System.out.println(model.getRowCount());
        try {
            System.out.println("newLine Visited");
            CreateNewInvoiceLine dialog = new CreateNewInvoiceLine(new javax.swing.JFrame(), true);
            dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
          InvoiceHeaders mInvHeader =  InvoHeaderArray.get(selectedRow);
         // InvoiceLine x = (InvoiceLine)
        System.out.println("Item name" + dialog.getItemName());
            if(dialog.getItemName()==""||dialog.getItemCounts()==0||dialog.getItemCounts()==0) {
                System.out.println("Fields are Empty");
            }else{
                System.out.println("In SaveLine Condition");

             InvoiceLine invoLine2 = new InvoiceLine(mInvHeader,dialog.getItemName(), dialog.getUnitPrice(), dialog.getItemCounts());
                lines.add(invoLine2);
                frame.getInvoiceTableDetails().addNotify();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent event){
        //System.out.println(Row Selected);
        int selectedRow = frame.getInvoiceTable().getSelectedRow();
        System.out.println(selectedRow);
        try {
    //    ArrayList<InvoiceLine> lines=frame.getInvoiceHeadersList().get(selectedRow).getItemDetails();
            lines=frame.getInvoiceHeadersList().get(selectedRow).getItemDetails();
            frame.getInvoiceTableDetails().setModel(new InvoiceLineTableModel(lines));
            System.out.println("The invoice Number is:"+frame.getInvoiceHeadersList().get(selectedRow).getInvoiceNo());
            frame.setInvoiceNumberValue(String.valueOf(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceNo()));
            frame.setInvoiceDataValue(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceDate());
            frame.setCustomerNameValue(frame.getInvoiceHeadersList().get(selectedRow).getCustomerName());
            frame.setInvoiceTotalValue(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceTotal());
        } catch (Exception e) {
            e.printStackTrace(); //optional for seeing the error message
        }
    }


    private void LoadFile() throws FileNotFoundException, IOException {
        try {
        JFileChooser File;
       // ArrayList<InvoiceHeaders> InvoHeaderArray;
        File = new JFileChooser();
        File.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File.addChoosableFileFilter(new FileNameExtensionFilter("CSV Files", "CSV"));
        File.setAcceptAllFileFilterUsed(false);
        int returnVal = File.showOpenDialog(this);
        InvoHeaderArray= new ArrayList<>();
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = File.getSelectedFile();
            String headerStPath = file.getAbsolutePath();
            Path headerPath = Paths.get(headerStPath);
            List<String> headerLines =Files.lines(headerPath).collect(Collectors.toList());
          //  System.out.println("Header lines"+headerLines);
            for(String headerLine:headerLines){
                String []parts=headerLine.split(",");
                int invoiceNo;
                try {
                     invoiceNo= Integer.parseInt(parts[0]);
                    InvoiceHeaders invoHeader =new InvoiceHeaders(invoiceNo,parts[1],parts[2]);
                    InvoHeaderArray.add(invoHeader);
                } catch (NumberFormatException nfe) {
                 System.err.println("Invalid Format");
                }

            }}
         //   System.out.println("First Loop of table header should be loaded");
            returnVal=File.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String lineStrPath=File.getSelectedFile().getAbsolutePath();
                Path linePath= Paths.get(lineStrPath);
                List<String>lineLines=Files.lines(linePath).collect(Collectors.toList());
                for (String lineLine:lineLines){
                    String [] parts=lineLine.split(",");

                    try {
                        int InvoiceID = Integer.parseInt(parts[0]);
                        double price = Double.parseDouble(parts[2]);
                        int Count = parseInt(parts[3]);
                        InvoiceHeaders header = getInvoiceHeaderByInvoiceNo(InvoHeaderArray, InvoiceID);
                        InvoiceLine invoLine = new InvoiceLine(header, parts[1], price, Count);
                        header.getItemDetails().add(invoLine);
                 }catch (NumberFormatException nfe){
                      System.err.println("Invalid Number Format");
                    }

                }
                frame.setInvoiceHeadersList(InvoHeaderArray);
                InvoiceHeaderTableModel model= new InvoiceHeaderTableModel(InvoHeaderArray);
                //   JTable table= new JTable(model);
                System.out.println(model.getRowCount());

            }

        }catch(IOException ex){
            ex.printStackTrace();
            }

        }

   

    private void SaveFile() throws FileNotFoundException, IOException {
    System.out.println("Save IN");
        JFileChooser fs=new JFileChooser(new File("c:\\Desktop"))  ;
           fs.setDialogTitle("Sava a Invoice Header File ");
           fs.showSaveDialog(null);
        int returnVal = fs.showSaveDialog(this);
        if(returnVal==JFileChooser.APPROVE_OPTION){
            //String content = textContent.getText();
           File path=fs.getSelectedFile();
           try{
            FileWriter fw =new FileWriter(path.getPath());
               FileOutputStream fos =new FileOutputStream(path);
               for(int row=0; row<InvoHeaderArray.size();row++) {
                   fw.write(String.valueOf("[" + InvoHeaderArray.get(row).getInvoiceNo() + " ," + InvoHeaderArray.get(row).getCustomerName() + " ," + InvoHeaderArray.get(row).getInvoiceDate() + "]" ));
                   fw.write("\n");
                   // System.out.println("[" + InvoHeaderArray.get(row).getInvoiceNo() + " ," + InvoHeaderArray.get(row).getCustomerName() + " ," + InvoHeaderArray.get(row).getInvoiceDate() + "]");

                       System.out.println("" + InvoHeaderArray.get(row).getItemDetails());
                       System.out.println("");
                  //     fw.write("" +  InvoHeaderArray.get(row).getItemDetails());

                    //   fw.write("{ Item Name:   " + lines.get(i).getItemName() +"\n" +" ,Item Count:   " + lines.get(i).getItemCount() + "\n" +" ,Item Price:   " + lines.get(i).getItemPrice() + "\n" +" ,Item Total:   " + lines.get(i).getItemTotal() + "}");
                       fw.write("\n");
                   }

            fw.flush();
            fw.close();
           }catch(Exception e2){
               //JOptionPane.showMessageDialog();
           }
            JFileChooser fs2=new JFileChooser(new File("c:\\Desktop"))  ;
            fs2.setDialogTitle("Sava a Invoice Lines File ");
            fs2.showSaveDialog(null);
            int returnVal2 = fs2.showSaveDialog(this);
            if(returnVal2==JFileChooser.APPROVE_OPTION){
                //String content = textContent.getText();
                File path2=fs2.getSelectedFile();
                try{
                    FileWriter fw2 =new FileWriter(path2.getPath());
                    FileOutputStream fos =new FileOutputStream(path2);
                    for(int row=0; row<InvoHeaderArray.size();row++) {
                       // fw2.write(String.valueOf("[" + InvoHeaderArray.get(row).getInvoiceNo() + " ," + InvoHeaderArray.get(row).getCustomerName() + " ," + InvoHeaderArray.get(row).getInvoiceDate() + "]" ));
                        fw2.write("\n");
                        // System.out.println("[" + InvoHeaderArray.get(row).getInvoiceNo() + " ," + InvoHeaderArray.get(row).getCustomerName() + " ," + InvoHeaderArray.get(row).getInvoiceDate() + "]");

                        System.out.println("" + InvoHeaderArray.get(row).getItemDetails());
                        System.out.println("");
                        fw2.write("Items of Invoice No: " +InvoHeaderArray.get(row).getInvoiceNo()+"\n"+  InvoHeaderArray.get(row).getItemDetails());

                        //   fw.write("{ Item Name:   " + lines.get(i).getItemName() +"\n" +" ,Item Count:   " + lines.get(i).getItemCount() + "\n" +" ,Item Price:   " + lines.get(i).getItemPrice() + "\n" +" ,Item Total:   " + lines.get(i).getItemTotal() + "}");
                        fw2.write("\n");
                    }
                    fw2.flush();
                    fw2.close();
                }catch(Exception e2){
                    //JOptionPane.showMessageDialog();
                }}
    }}
//search in invoice array
    private InvoiceHeaders getInvoiceHeaderByInvoiceNo(ArrayList<InvoiceHeaders>Invoices,int invoiceNo){
    for (InvoiceHeaders InvoiceNo: Invoices){
        if(InvoiceNo.getInvoiceNo() == invoiceNo){
            return InvoiceNo ;
        }
    }
            return null;
    }

    private void DeleteLine() {
        int selectedRow = frame.getInvoiceTableDetails().getSelectedRow();
        if(selectedRow>=0) {
            System.out.println("The Selected row is:" + selectedRow);
            lines.remove(selectedRow);
            frame.getInvoiceTableDetails().addNotify();
            // frame.getInvoiceTable().clearSelection();

        }
        else{
            System.out.println("No Data to Delete");
        }
        //   ClearInvoDetails();
    }
    
}
