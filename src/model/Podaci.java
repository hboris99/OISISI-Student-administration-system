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
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("DATUM RODJ.");
		this.kolone.add("ADRESA");
		this.kolone.add("BR TELEFONA");
		this.kolone.add("EMAIL");
		this.kolone.add("BR. INDEXA");
		this.kolone.add("GOD. UPISA");
		this.kolone.add("GOD. STUDIJA");
		this.kolone.add("STATUS");
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
		return 10;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public String getValueAt(int row, int column) {
		Student student = this.studenti.get(row);
		switch (column) {
		case 0:
			return student.getIme();
		case 1:
			return student.getPrezime();
		case 2:
			return student.getDatum_rodjenja();
		case 3:
			return student.getAdresa_stanovanja();
		case 4:
			return student.getTelefon();
		case 5:
			return student.getEmail();
		case 6:
			return student.getBroj_indeksa();
		case 7:
			return String.valueOf(student.getGodina_upisa());
		case 8:
			return String.valueOf(student.getGodina_studija());
		case 9: 
			if(student.getStatus() == Student.enumStatus.B) { 
				return "Budzet";
			}else {
				return "Samofinansiranje";
			}
		default:
			return null;
		}
	}


}
