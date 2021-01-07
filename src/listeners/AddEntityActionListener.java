package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.BazaStudenata;
import view.AddPredmetDialog;
import view.AddProfesorDialog;
import view.AddStudentDialog;
import view.TabbedPane;

public class AddEntityActionListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;

	public AddEntityActionListener(JFrame parent, TabbedPane tab) {
		super();
		this.parent = parent;
		this.tab = tab;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (tab.getTab().getSelectedIndex()) {
		case 0:
			AddStudentDialog dialogStudent = new AddStudentDialog(parent, "Dodavanje studenta", true);
			dialogStudent.setResizable(false);
			dialogStudent.setVisible(true);
			break;
		case 1:
			AddProfesorDialog dialogProfesor = new AddProfesorDialog(parent, "Dodavanje profesora", true);
			dialogProfesor.setVisible(true);
			break;
		case 2:
			AddPredmetDialog dialogPredmet = new AddPredmetDialog(parent, "Dodavanje predmeta", true);
			dialogPredmet.setSize(450, 370);
			dialogPredmet.setResizable(false);
			dialogPredmet.setVisible(true);
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}

		// AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta",
		// true);
		// dialog.setVisible(true);
	}

}
