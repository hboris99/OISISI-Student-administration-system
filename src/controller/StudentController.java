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

		BazaStudenata.getInstance().getStudenti().remove(student);

		MainFrame.getInstance().prikaziTabeluStudenata();
	}
}
