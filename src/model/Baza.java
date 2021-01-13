package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Baza implements Serializable{
	
	private static final long serialVersionUID = -4657300754071101136L;
	private static Baza instance;
	ArrayList<Profesor> profesori;
	ArrayList<Student> studenti;
	ArrayList<Predmet> predmeti;
	
	private Baza() {
		super();
		studenti = new ArrayList<Student>();
		profesori = new ArrayList<Profesor>();
		predmeti = new ArrayList<Predmet>();
		
		for(Student s: studenti) {
			s.setNepolozeni(new ArrayList<Predmet>());
			s.setPolozeni(new ArrayList<Predmet>());
		}
		
		for(Profesor prof: profesori) {
			prof.setPredmeti_radi(new ArrayList<Predmet>());
		}
		
		for(Predmet pred: predmeti) {
			pred.setStudentip(new ArrayList<Student>());
			pred.setStudentinp(new ArrayList<Student>());
		}
	}
	
	public static Baza getInstance() {
		if(instance == null)
			instance = new Baza();
		return instance;
	}
	
	public static void setInstance(Baza b) {
		instance = b; 
	}
	
	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}
	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}
	public ArrayList<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
}
