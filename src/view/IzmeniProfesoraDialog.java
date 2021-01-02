package view;

import java.awt.Frame;

import javax.swing.JDialog;

public class IzmeniProfesoraDialog extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IzmeniProfesoraDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);

		setSize(450, 500);
		setLocationRelativeTo(parent);
		
	}
	
}
