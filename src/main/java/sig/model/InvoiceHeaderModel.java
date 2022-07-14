package sig.model;

import javax.swing.table.DefaultTableModel;

public class InvoiceHeaderModel extends DefaultTableModel {
    public InvoiceHeaderModel() {
        super();
    }

    public InvoiceHeaderModel(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    @Override
    public void removeRow(int row) {
        super.removeRow(row);
    }

    @Override
    public int getRowCount() {
        return super.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }
}
