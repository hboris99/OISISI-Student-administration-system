package model;

enum enumSemestar{ZIMSKI,LETNJI};
public class Predmet {
	String sifra;
	String naziv;
	enumSemestar semestar;
	int godina_studija;
	Profesor profesor;
	int espb;
	Student[] studentip;
	Student[] studentinp;
	
	Predmet(String sifra, String naziv, enumSemestar semestar, int godina_studija, Profesor profesor,
			int espb, Student[] studentip, Student[] studentin[])
	{
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.semestar = semestar;
		this.godina_studija = godina_studija;
		this.profesor = profesor;
		this.espb = espb;
		this.studentip = studentip;
		this.studentip = studentinp;
		
		
	}
}
