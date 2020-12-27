package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.AboutDialog;

public class AboutDialogActionListener implements ActionListener {
	
	private JFrame parent;

	public AboutDialogActionListener(JFrame parent) {
		super();
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		AboutDialog abt = new AboutDialog(parent,"About",true);
		abt.setVisible(true);
	}

}
