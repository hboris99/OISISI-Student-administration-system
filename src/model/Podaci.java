package model;

import java.util.ArrayList;
import java.util.List;

public final class Podaci {
	private static Podaci instance = null;
	private List<Student> studenti = new ArrayList<Student>();
	private List<Profesor> profesori = new ArrayList<Profesor>();

	public Podaci() {}
	
	public static Podaci getInsance() {
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

}
