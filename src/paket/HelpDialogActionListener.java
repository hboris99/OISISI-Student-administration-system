package paket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class HelpDialogActionListener implements ActionListener {

	private JFrame parent;

	public HelpDialogActionListener(JFrame parent) {
		super();
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		HelpDialog hlp = new HelpDialog(parent,"Help",true);
		hlp.setVisible(true);
	}

}
