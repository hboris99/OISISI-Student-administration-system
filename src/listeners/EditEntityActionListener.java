package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTable;

import model.BazaProfesora;
import model.BazaStudenata;
import model.Profesor;
import model.Student;
import view.EditStudentDialog;
import view.IzmeniProfesoraDialog;
import view.TabbedPane;

public class EditEntityActionListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;
	private Student student = null;
	private Profesor profesor = null;
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

			if (!isEmpty(tab.getStudenti())) {
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
			if(!isEmpty(tab.getProfesori())) {
			IzmeniProfesoraDialog dialogProfesor = new IzmeniProfesoraDialog(parent, "Izmena profesora", true, profesor);
			dialogProfesor.setVisible(true);
			}
			break;
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}

//		IzmeniProfesoraDialog izmeni_prof = new IzmeniProfesoraDialog(parent,"Izmeni Profesora",true);
//		izmeni_prof.setVisible(true);
	}

	public static boolean isEmpty(JTable table) {
		if (table != null && table.getModel() != null) {
			return table.getModel().getRowCount() <= 0 ? true : false;
		}
		return false;
	}

}
