package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTable;

import model.BazaStudenata;
import model.Student;
import view.EditStudentDialog;
import view.IzmeniProfesoraDialog;
import view.TabbedPane;

public class EditEntityActionListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;
	private Student student = null;

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
				}
			}

			if (!isEmpty(tab.getStudenti())) {
				EditStudentDialog dialogStudent = new EditStudentDialog(parent, "Izmena studenta", true, student);
				dialogStudent.setVisible(true);
			}
			break;

		case 1:
			IzmeniProfesoraDialog dialogProfesor = new IzmeniProfesoraDialog(parent, "Izmena profesora", true);
			dialogProfesor.setVisible(true);
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
