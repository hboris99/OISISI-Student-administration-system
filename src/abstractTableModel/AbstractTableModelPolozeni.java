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
		kolone.add("Godina");
		kolone.add("Semestar");
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
			return student.getPolozeni().get(rowIndex).getSifra();
		case 1:
			return student.getPolozeni().get(rowIndex).getNaziv();
		case 2: 
			return student.getPolozeni().get(rowIndex).getEspb();
		case 3: 
			return student.getPolozeni().get(rowIndex).getGodina_studija();
		case 4:
			return student.getPolozeni().get(rowIndex).getSemestar();
			
		default: 
			return null;
		}
		

	}

}
