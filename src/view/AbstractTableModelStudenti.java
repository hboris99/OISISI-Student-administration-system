package view;

import javax.swing.table.AbstractTableModel;

import model.Podaci;


public class AbstractTableModelStudenti extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	public AbstractTableModelStudenti() {}

	// broj redova
	@Override
	public int getRowCount() {
		return Podaci.getInstance().getStudenti().size();
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return Podaci.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return Podaci.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return Podaci.getInstance().getValueAt(rowIndex, columnIndex);
	}

}
