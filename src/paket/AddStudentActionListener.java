package paket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AddStudentActionListener implements ActionListener {
	
	private JFrame parent;

	public AddStudentActionListener(JFrame parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TabbedPane tabbedPane = new TabbedPane();
		
		switch(tabbedPane.getTabIndex().getSelectedIndex()) {
		case 0:
			AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta", true);
			dialog.setVisible(true);
			break;
		case 1:
			AddProfesorDialog dialog2 = new AddProfesorDialog(parent, "Dodavanje prof", true);
			dialog2.setVisible(true);
			break;
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}
	
	
		//AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta", true);
		//dialog.setVisible(true);
	}

}
