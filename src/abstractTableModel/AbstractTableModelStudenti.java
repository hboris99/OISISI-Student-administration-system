package abstractTableModel;

import javax.swing.table.AbstractTableModel;

import model.BazaStudenata;


public class AbstractTableModelStudenti extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	public AbstractTableModelStudenti() {}

	// broj redova
	@Override
	public int getRowCount() {
		return BazaStudenata.getInstance().getStudenti().size();
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return BazaStudenata.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return BazaStudenata.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaStudenata.getInstance().getValueAt(rowIndex, columnIndex);
	}

	@Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
            	return String.class;
            case 5:
            	return Integer.class;
            default: 
            	return String.class;
        }
    }

}
