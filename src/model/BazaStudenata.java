package model;

import java.util.ArrayList;
import java.util.List;

public final class BazaStudenata {
	private static BazaStudenata instance = null;
	private List<Student> studenti;
	private List<String> kolone;

	public BazaStudenata() {
		this.kolone = new ArrayList<String>();
		studenti = new ArrayList<Student>();
		this.kolone.add("INDEX");
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("GOD. STUDIJA");
		this.kolone.add("STATUS");
		this.kolone.add("PROSEK");

	}
	
	public static BazaStudenata getInstance() {
		if(instance == null)
			instance = new BazaStudenata();
		return instance;
	}
	
	public static boolean exists(String indeks) {
		for(Student stud: BazaStudenata.getInstance().getStudenti()) {
			if(stud.getBroj_indeksa().trim().equals(indeks.trim()))
				return true;	
		}
		return false;
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return 6;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	
	public Student getRow(int index) {
		return this.studenti.get(index);
	}
	
	public Student getStudentByIndex(String brIndexa) {
		
		for(Student s: studenti) {
			if(s.getBroj_indeksa().equals(brIndexa.trim()))
				return s;
		}
		
		return null;
	}
	
	
	
//	public int izmeniStudenta(String index) {
//		for(Student s: studenti) {
//			if(s.getBroj_indeksa().equals(index.trim()))
//			
//		}
//	}
	
	public Object getValueAt(int row, int column) {
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
			
			return	Math.round(student.getProsecna_ocena() * 100.0) / 100.0 ;

		default:
			return null;
		}
	}
	

}
