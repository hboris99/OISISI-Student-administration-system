package controller;

import model.BazaStudenata;
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
		for (Student s : BazaStudenata.getInstance().getStudenti()) {
			if (s == student) {
				BazaStudenata.getInstance().getStudenti().remove(s);
				break;
			}
		}
		MainFrame.getInstance().prikaziTabeluStudenata();
	}
}
