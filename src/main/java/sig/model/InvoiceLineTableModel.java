package sig.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class InvoiceLineTableModel extends AbstractTableModel {
    private ArrayList<InvoiceLine>data;
private String []cols={"Item Name","Unit Price","Count"};

    public InvoiceLineTableModel(ArrayList<InvoiceLine> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line=data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return line.getItemName();
            case 1:
                return line.getItemPrice();
            case 2:
                return line.getItemCount();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
}
