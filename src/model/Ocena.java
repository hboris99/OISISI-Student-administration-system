package model;

import java.io.Serializable;

public class Ocena implements Serializable {

	private static final long serialVersionUID = 1L;
	
	Student student;
	Predmet predmet;
	int ocena;
	String datum_polaganja;
	
	public Ocena(Student student, Predmet predmet, int ocena, String datum_polaganja) {
		super();
		this.student = student;
		this.predmet = predmet;
		this.ocena = ocena;
		this.datum_polaganja = datum_polaganja;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getDatum_polaganja() {
		return datum_polaganja;
	}

	public void setDatum_polaganja(String datum_polaganja) {
		this.datum_polaganja = datum_polaganja;
	}
	
}
