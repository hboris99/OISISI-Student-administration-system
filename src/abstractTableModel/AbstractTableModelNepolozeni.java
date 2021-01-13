package abstractTableModel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.BazaStudenata;
import model.Student;

public class AbstractTableModelNepolozeni extends AbstractTableModel{

	private static final long serialVersionUID = 1574777518428524199L;
	Student student;
	ArrayList<String> kolone;
	
	public AbstractTableModelNepolozeni(Student s) {
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
		if(student.getNepolozeni() == null)
			return 0;
		else
			return student.getNepolozeni().size();
	}

	@Override
	public String getColumnName(int column) {
		return this.kolone.get(column);
	}
	
	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		
		case 0:
			return student.getNepolozeni().get(rowIndex).getSifra();
		case 1:
			return student.getNepolozeni().get(rowIndex).getNaziv();
		case 2: 
			return student.getNepolozeni().get(rowIndex).getEspb();
		case 3: 
			return student.getNepolozeni().get(rowIndex).getGodina_studija();
		case 4:
			return student.getNepolozeni().get(rowIndex).getSemestar();
			
		default: 
			return null;
		}
		

	}

}

