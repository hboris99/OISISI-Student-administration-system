package model;

import java.util.ArrayList;
import java.util.List;

public final class Podaci {
	private static Podaci instance = null;
	private List<Student> studenti = new ArrayList<Student>();
	private List<Profesor> profesori = new ArrayList<Profesor>();
	private List<String> kolone;

	public Podaci() {
		this.kolone = new ArrayList<String>();
		this.kolone.add("INDEX");
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("GOD. STUDIJA");
		this.kolone.add("STATUS");
		this.kolone.add("PROSEK");

	}
	
	public static Podaci getInstance() {
		if(instance == null)
			instance = new Podaci();
		return instance;
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public List<Profesor> getProfesori() {
		return profesori;
	}

	public int getColumnCount() {
		return 6;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public String getValueAt(int row, int column) {
		Student student = this.studenti.get(row);
		switch (column) {
		case 0:
			return student.getBroj_indeksa();
		case 1:
			return student.getIme();		
		case 2:
			return student.getPrezime();
		case 3:
			return String.valueOf(student.getGodina_studija());
		case 4:
			if(student.getStatus() == Student.enumStatus.B) { 
				return "Budzet";
			}else {
				return "Samofinansiranje";
			}
		case 5:
			return "0";

		default:
			return null;
		}
	}


}
