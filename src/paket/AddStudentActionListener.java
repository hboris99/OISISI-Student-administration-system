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
		AddStudentDialog dialog = new AddStudentDialog(parent, "Dodavanje studenta", true);
		dialog.setVisible(true);
	}

}
