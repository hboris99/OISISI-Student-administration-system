package view;

import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;
import model.BazaStudenata;

public class AbstractTableModelProfesori extends AbstractTableModel {
	public AbstractTableModelProfesori() {}

	// broj redova
	@Override
	public int getRowCount() {
		return BazaProfesora.getInstance().getProfesori().size();
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return BazaProfesora.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return BazaProfesora.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaProfesora.getInstance().getValueAt(rowIndex, columnIndex);
	}

	
}
