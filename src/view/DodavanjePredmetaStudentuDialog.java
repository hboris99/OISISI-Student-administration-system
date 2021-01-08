package view;

import java.awt.Frame;

import javax.swing.JDialog;

public class DodavanjePredmetaStudentuDialog extends JDialog{
	
	Frame parent;
	String title;
	boolean modal;

	public DodavanjePredmetaStudentuDialog(Frame parent, String title, boolean modal) {
		super();
		this.parent = parent;
		this.title = title;
		this.modal = modal;
	}

	void inicijalizuj() {
		
		//JPanel panel = new JPanel;
	}
}
