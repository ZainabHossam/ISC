/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.model;

/**
 *
 * @author Zainab
 */
//Child of InvoiceTableElements
public class InvoiceLine {
    private String ItemName;
    private double ItemPrice;
    private int ItemCount;
    private InvoiceHeaders InvoiceNo;

    public InvoiceLine(InvoiceHeaders InvoiceNo, String ItemName, double ItemPrice, int ItemCount) {
        this.InvoiceNo = InvoiceNo;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemCount = ItemCount;
    }

    public InvoiceHeaders getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(InvoiceHeaders InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public String getItemName() {
        return ItemName;
    }

    public double getItemTotal() {
        return ItemCount*ItemPrice;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int ItemCount) {
        this.ItemCount = ItemCount;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "InvoiceNo=" + InvoiceNo  +
                ", ItemName='" + ItemName + '\'' +
                ", ItemPrice=" + ItemPrice +
                ", ItemCount=" + ItemCount +
                ", ItemTotal=" + getItemTotal() +
                '}';
    }
}
