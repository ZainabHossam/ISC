
package sig.model;
import java.util.ArrayList;
import java.util.Date;

/*@author Zainab*/
//Parent of InvoiceItemsDetails
public class InvoiceHeaders {
    /*Invoice No., Invoice Date, Customer Name, and the Total
    amount of the invoice in the table that shows a preview of every 
    invoice (See Screenshot 1, left-side panel) */
    private int InvoiceNo;
    private Date InvoiceDate;
    private String CustomerName;
    private double invoiceTotal;
    private ArrayList<InvoiceLine>ItemDetails;

    public InvoiceHeaders(int InvoiceNo, Date InvoiceDate, String CustomerName) {
        this.InvoiceNo = InvoiceNo;
        this.InvoiceDate = InvoiceDate;
        this.CustomerName = CustomerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(int InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public ArrayList<InvoiceLine> getItemDetails() {
        if(ItemDetails==null){
            ItemDetails=new ArrayList<>();
        }
        return ItemDetails;
    }

    public void setItemDetails(ArrayList<InvoiceLine> ItemDetails) {
        this.ItemDetails = ItemDetails;
    }

    public double getInvoiceTotal() {
        double total=0;
        for(InvoiceLine line: getItemDetails()){
            total+=line.getItemTotal();
        }
        return total;
    }
}
