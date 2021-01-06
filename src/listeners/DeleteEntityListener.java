package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.StudentController;
import model.BazaStudenata;
import model.Student;
import view.AddProfesorDialog;
import view.TabbedPane;

public class DeleteEntityListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;
	
	public DeleteEntityListener(JFrame parent, TabbedPane tab) {
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
					StudentController.getInstance().obrisiStudenta(s);
					break;
				}
			}
			
			break;
		case 1:

			break;
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}

		// AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta",
		// true);
		// dialog.setVisible(true);
	}

}
