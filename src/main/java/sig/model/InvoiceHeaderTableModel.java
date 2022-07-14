package sig.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class InvoiceHeaderTableModel extends AbstractTableModel {
    private ArrayList<InvoiceHeaders> data;


    private String [] cols={"Invoice No","Customer Name","Date"};

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeaders> data) {
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

//    public void removeRowAt(int row) {
//        //data.remove(row);
//        //data.rem
//        //fireTableDataChanged();
//       fireTableRowsDeleted(row , row);
//        }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeaders header=data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return header.getInvoiceNo();
            case 1:
                return header.getCustomerName();
            case 2:
                return header.getInvoiceDate();
        }
        return "Null";
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
}
