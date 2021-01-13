package validationListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class UnosOceneKeyListener implements KeyListener {


	private JButton btn;
	private ArrayList<JTextField> txt;
	private boolean[] b;
	boolean validate = true;

	public UnosOceneKeyListener(JButton btn, ArrayList<JTextField> txt, boolean[] b) {
		super();
		this.btn = btn;
		this.txt = txt;
		this.b = b;
	}
	
	
		

	@Override
	public void keyTyped(KeyEvent e) {
		validate = true;
		
		if(!txt.get(0).getText().equals("")) b[0] = true;
		if(!txt.get(1).getText().equals("")) b[1] = true;
		if(!txt.get(2).getText().equals("")) b[2] = true;
		if (!txt.get(2).getText().equals(""))
			b[2] = txt.get(2).getText().matches("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$");
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
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
