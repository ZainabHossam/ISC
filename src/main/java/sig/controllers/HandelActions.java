
package sig.controllers;

import sig.model.InvoiceHeaders;
import sig.model.InvoiceLine;
import sig.model.InvoiceLineTableModel;
import sig.view.NewJFrame;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            try {
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
            case "Save":
                SaveInvoice();
                break;
                
            case "Cacel":
                CancelChanges();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Clicked.getActionCommand());
        }
    }

    private void newInvoice() {

        
    }

    private void DelInvoice() {
    }

    private void SaveInvoice() {

    }

    @Override
    public void valueChanged(ListSelectionEvent event){
        //System.out.println(Row Selected);
        int selectedRow = frame.getInvoiceTable().getSelectedRow();
        System.out.println(selectedRow);
        ArrayList<InvoiceLine> lines=frame.getInvoiceHeadersList().get(selectedRow).getItemDetails();
        frame.getInvoiceTableDetails().setModel(new InvoiceLineTableModel(lines));
       System.out.println("The invoice Number is:"+frame.getInvoiceHeadersList().get(selectedRow).getInvoiceNo());
        frame.setInvoiceNumberValue(String.valueOf(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceNo()));
        frame.setInvoiceDataValue(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceDate());
        frame.setCustomerNameValue(frame.getInvoiceHeadersList().get(selectedRow).getCustomerName());
        frame.setInvoiceTotalValue(frame.getInvoiceHeadersList().get(selectedRow).getInvoiceTotal());
    }

    private void LoadFile() throws FileNotFoundException, IOException {
        try {
        JFileChooser File;
        ArrayList<InvoiceHeaders> InvoHeaderArray;
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

            }

        }catch(IOException ex){
            ex.printStackTrace();
            }

        }

   

    private void SaveFile() throws FileNotFoundException, IOException {
     
               
    }
//search in invoice array
    private InvoiceHeaders getInvoiceHeaderByInvoiceNo(ArrayList<InvoiceHeaders>Invoices,int invoiceNo){
    for (InvoiceHeaders InvoiceNo: Invoices){
        if(InvoiceNo.getInvoiceNo() == invoiceNo){
            return InvoiceNo ;
        }
    }
            return null;
    }

    private void CancelChanges() {
      
    }
    
}
