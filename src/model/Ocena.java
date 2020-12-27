package model;

public class Ocena {

	Student student;
//	Predmet predmet;
	int ocena;
	String datum_polaganja;
	
	public Ocena(Student student, /* Predmet predmet, */ int ocena, String datum_polaganja) {
		super();
		this.student = student;
//		this.predmet = predmet;
		this.ocena = ocena;
		this.datum_polaganja = datum_polaganja;
	}
	
}
