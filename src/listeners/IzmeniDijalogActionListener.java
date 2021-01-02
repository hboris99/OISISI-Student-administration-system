package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.HelpDialog;
import view.IzmeniProfesoraDialog;
import view.TabbedPane;

public class IzmeniDijalogActionListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;

	public IzmeniDijalogActionListener(JFrame parent, TabbedPane tab) {
		super();
		this.parent = parent;
		this.tab = tab;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		IzmeniProfesoraDialog izmeni_prof = new IzmeniProfesoraDialog(parent,"Izmeni Profesora",true);
		izmeni_prof.setVisible(true);
	}

}
