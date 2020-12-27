package paket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AddStudentActionListener implements ActionListener {
	
	private JFrame parent;
	private TabbedPane tab;

	public AddStudentActionListener(JFrame parent, TabbedPane tab) {
		super();
		this.parent = parent;
		this.tab = tab;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(tab.getTab().getSelectedIndex()) {
		case 0:
			AddStudentDialog dialogStudent = new AddStudentDialog(parent, "Dodavanje studenta", true);
			dialogStudent.setVisible(true);
			break;
		case 1:
			AddProfesorDialog dialogProfesor = new AddProfesorDialog(parent, "Dodavanje prof", true);
			dialogProfesor.setVisible(true);
			break;
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}
	
	
		//AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta", true);
		//dialog.setVisible(true);
	}

}
