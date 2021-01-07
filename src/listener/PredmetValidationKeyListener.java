package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PredmetValidationKeyListener implements KeyListener {
	
	private JButton btn;
	private ArrayList<JTextField> txt;
	private boolean[] b;
	boolean validate = true;

	public PredmetValidationKeyListener(JButton btn, ArrayList<JTextField> txt, boolean[] b) {
		super();
		this.btn = btn;
		this.txt = txt;
		this.b = b;
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		validate = true;
		
		if(!txt.get(0).getText().equals("")) b[0] = true;
		if(!txt.get(1).getText().equals("")) b[1] = true;
		if(!txt.get(2).getText().equals("")) b[2] = true;

		for(int i = 0; i<3; i++) {
			System.out.println("\t\t"+b[i] + " " + txt.get(i).getText());
			if(b[i] == false) validate = false;
		}
		
		if(validate == true) {
			btn.setEnabled(true);
		}else {
			btn.setEnabled(false);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
