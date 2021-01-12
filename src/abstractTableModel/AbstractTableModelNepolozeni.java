package abstractTableModel;

import javax.swing.table.AbstractTableModel;

import model.Student;

public class AbstractTableModelNepolozeni extends AbstractTableModel{

Student student;
	
	public AbstractTableModelNepolozeni(Student s) {
		super();
		student = s;
	}

	@Override
	public int getRowCount() {
		return student.getNepolozeni().size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		
		case 0:
			return student.getNepolozeni().get(rowIndex).getPredmet().getSifra();
		case 1:
			return student.getNepolozeni().get(rowIndex).getPredmet().getNaziv();
		case 2: 
			return student.getNepolozeni().get(rowIndex).getPredmet().getEspb();
		case 3: 
			return student.getNepolozeni().get(rowIndex).getOcena();
		case 4:
			return student.getNepolozeni().get(rowIndex).getDatum_polaganja();
			
		default: 
			return null;
		}
		

	}

}

