package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.BazaProfesora;
import model.BazaStudenata;
import model.Profesor;
import model.BazaPredmeta;
import model.BazaStudenata;
import model.Predmet;
import model.Student;
import view.EditPredmetDialog;
import view.EditStudentDialog;
import view.IzmeniProfesoraDialog;
import view.MainFrame;
import view.TabbedPane;

public class EditEntityActionListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;
	private Student student = null;
	private Profesor profesor = null;
	private Predmet predmet = null;

	public EditEntityActionListener(JFrame parent, TabbedPane tab) {
		super();
		this.parent = parent;
		this.tab = tab;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (tab.getTab().getSelectedIndex()) {
		case 0:
			
			for (Student s : BazaStudenata.getInstance().getStudenti()) {
				if (s.getBroj_indeksa().equals(tab.getStudenti().getValueAt(tab.getStudenti().getSelectedRow(), 0))) {
					student = s;
					break;
				}
			}

			if (!MainFrame.isEmpty(tab.getStudenti())) {
				EditStudentDialog dialogStudent = new EditStudentDialog(parent, "Izmena studenta", true, student);
				dialogStudent.setVisible(true);
			}
			break;

		case 1:
			
			for(Profesor p: BazaProfesora.getInstance().getProfesori()) {
				if(p.getBroj_lk().equals(tab.getProfesori().getModel().getValueAt(tab.getProfesori().getSelectedRow(),4))) {
				profesor = p;
				break;
				}
			}
			System.out.println(tab.getProfesori().getValueAt(tab.getProfesori().getSelectedRow(),0));
			if(!MainFrame.isEmpty(tab.getProfesori())) {
			IzmeniProfesoraDialog dialogProfesor = new IzmeniProfesoraDialog(parent, "Izmena profesora", true, profesor);
			dialogProfesor.setVisible(true);
			}
			break;
			
		case 2:
			for (Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
				if (p.getSifra().equals(tab.getPredmeti().getValueAt(tab.getPredmeti().getSelectedRow(), 0))) {
					predmet = p;
					break;
				}
			}

			if (!MainFrame.isEmpty(tab.getPredmeti())) {
				EditPredmetDialog dialogPredmet = new EditPredmetDialog(parent, "Izmena predmeta", true, predmet);
				dialogPredmet.setVisible(true);
			}
			break;
			
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}

//		IzmeniProfesoraDialog izmeni_prof = new IzmeniProfesoraDialog(parent,"Izmeni Profesora",true);
//		izmeni_prof.setVisible(true);
	}

}
