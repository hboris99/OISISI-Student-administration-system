package abstractTableModel;

import javax.swing.table.AbstractTableModel;

import model.BazaPredmeta;

public class AbstractTableModelPredmeti extends AbstractTableModel {
	public AbstractTableModelPredmeti() {}

	// broj redova
	@Override
	public int getRowCount() {
		if(BazaPredmeta.getInstance().getPredmeti() == null) {
			return 0;
		}else {
			return BazaPredmeta.getInstance().getPredmeti().size();
		}
		
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return BazaPredmeta.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return BazaPredmeta.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaPredmeta.getInstance().getValueAt(rowIndex, columnIndex);
	}
	
	@Override
    public Class getColumnClass(int column) {
        switch (column) {
        case 0:
            return String.class;
        case 1:
            return String.class;
        case 2:
            return Integer.class;
        case 3:
            return Integer.class;
        case 4:
        	return String.class;
        default: 
        	return String.class;
    }
    }
}
