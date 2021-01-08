package model;

import java.io.Serializable;

public class Predmet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static enum enumSemestar{ZIMSKI,LETNJI};
	
	String sifra;
	String naziv;
	enumSemestar semestar;
	int godina_studija;
	Profesor profesor;
	int espb;
	Student[] studentip;
	Student[] studentinp;
	
	

	public Predmet() {}

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

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public enumSemestar getSemestar() {
		return semestar;
	}

	public void setSemestar(enumSemestar semestar) {
		this.semestar = semestar;
	}

	public int getGodina_studija() {
		return godina_studija;
	}

	public void setGodina_studija(int godina_studija) {
		this.godina_studija = godina_studija;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getEspb() {
		return espb;
	}

	public void setEspb(int espb) {
		this.espb = espb;
	}

	public Student[] getStudentip() {
		return studentip;
	}

	public void setStudentip(Student[] studentip) {
		this.studentip = studentip;
	}

	public Student[] getStudentinp() {
		return studentinp;
	}

	public void setStudentinp(Student[] studentinp) {
		this.studentinp = studentinp;
	}
	
	
}
