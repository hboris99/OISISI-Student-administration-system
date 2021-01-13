package controller;

import model.BazaStudenata;
import model.Predmet;
import model.Student;
import view.MainFrame;

public class StudentController {

	private static StudentController instance = null;

	private StudentController() {
	}

	public static StudentController getInstance() {

		if (instance == null)
			instance = new StudentController();

		return instance;
	}

	public void dodajStudenta() {

	}

	public void obrisiStudenta(Student student) {

		BazaStudenata.getInstance().getStudenti().remove(student);

		MainFrame.getInstance().prikaziTabeluStudenata();
	}

	public void ukloniPredmet(Student student, Predmet predmet) {
		for(Student s: BazaStudenata.getInstance().getStudenti()) {
			if(s == student) {
				for(Predmet p: s.getNepolozeni()) {
					if(p == predmet) {
						s.getNepolozeni().remove(p);	
						break;
					}
				}
			}
		}
		
	}
}
