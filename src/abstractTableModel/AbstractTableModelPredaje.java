package abstractTableModel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Predmet;
import model.Profesor;
import model.Student;

public class AbstractTableModelPredaje extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	Profesor p;
	ArrayList<String> kolone;

	public AbstractTableModelPredaje(Profesor prof) {
		super();
		p = prof;
		kolone = new ArrayList<String>();
		kolone.add("Sifra");
		kolone.add("Naziv");
		kolone.add("Godina Studija");
		kolone.add("Semestar");
	}

	public int getRowCount() {
		return p.getPredmeti_radi().size();
	}

	public int getColumnCount() {
		return 4;
	}
	@Override
	public String getColumnName(int column) {
		return this.kolone.get(column);
	}
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		
		case 0:
			return p.getPredmeti_radi().get(rowIndex).getSifra();
		case 1:
			return p.getPredmeti_radi().get(rowIndex).getNaziv();
		case 2: 
			return p.getPredmeti_radi().get(rowIndex).getGodina_studija();
		case 3: 
			if(p.getPredmeti_radi().get(rowIndex).getSemestar() == Predmet.enumSemestar.LETNJI) {
				return "Letnji";
			}else {
				return "Zimski";
			}
		default: 
			return null;
		}
		

}}

