
package sig.controllers;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import static javax.swing.text.StyleConstants.Size;
import sig.model.InvoiceHeaders;
import sig.view.NewJFrame;

/**
 *
 * @author Zainab
 * All Button Actions will be in this class
 */
public class HandelActions implements ActionListener {

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
        }
    }

    private void newInvoice() {
        
    }

    private void DelInvoice() {
    }

    private void SaveInvoice() {
    }

    private void LoadFile() throws FileNotFoundException, IOException {
      /*  JFileChooser File;
        File = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        File.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File.addChoosableFileFilter(new FileNameExtensionFilter("CSV Files", "CSV"));
        File.setAcceptAllFileFilterUsed(false);
           int returnVal = File.showOpenDialog(null);
           
           //XSSFWorkbook excelJTableImport= newXSSFWorkbook();
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = File.getSelectedFile();
            XSSFWorkbook file=
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
               }
            do{
                InvoiceTableElements.add();
                
            }while(true);
       /* FileInputStream excelFile;

        ArrayList<String>columnNamesFromExcel = new ArrayList<>();
            excelFile = new FileInputStream(file);
         while(excelFile.)}*/
       
       
       
    
      
            
        }

   

    private void SaveFile() throws FileNotFoundException, IOException {
     
               
    }

    private void CancelChanges() {
      
    }
    
}
