package paket;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ImeFocusListener implements FocusListener {

	private JButton btn;
	private JTextField txt;
	private boolean[] b;
	

	public ImeFocusListener(JButton btn, JTextField txt, boolean[] b) {
		super();
		this.btn = btn;
		this.txt = txt;
		this.b = b;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		boolean validate = true;
		
		b[0] = txt.getText().matches("[A-Z][a-z]*");
		
		for(int i = 0; i<8; i++) {
			System.out.println("\t\t"+b[i]);
			if(b[i]==false) validate = false;
		}
		
		if(validate == true) {
			btn.setEnabled(true);
		}else {
			btn.setEnabled(false);
		}
			
		}

}
