package abstractTableModel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Student;

public class AbstractTableModelPolozeni extends AbstractTableModel {

	Student student;
	ArrayList<String> kolone;

	public AbstractTableModelPolozeni(Student s) {
		super();
		student = s;
		kolone = new ArrayList<String>();
		kolone.add("Sifra");
		kolone.add("Naziv");
		kolone.add("ESPB");
		kolone.add("Ocena");
		kolone.add("Datum");
	}

	@Override
	public int getRowCount() {
		return student.getPolozeni().size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}
	@Override
	public String getColumnName(int column) {
		return this.kolone.get(column);
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		
		case 0:
			return student.getPolozeni().get(rowIndex).getPredmet().getSifra();
		case 1:
			return student.getPolozeni().get(rowIndex).getPredmet().getNaziv();
		case 2: 
			return student.getPolozeni().get(rowIndex).getPredmet().getEspb();
		case 3: 
			return student.getPolozeni().get(rowIndex).getOcena();
		case 4:
			return student.getPolozeni().get(rowIndex).getDatum_polaganja();
			
		default: 
			return null;
		}
		

	}

}
