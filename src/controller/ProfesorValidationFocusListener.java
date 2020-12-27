package controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ProfesorValidationFocusListener implements FocusListener {
	private JButton btn;
	private ArrayList<JTextField> txt;
	private boolean[] b;

	public ProfesorValidationFocusListener(JButton btn, ArrayList<JTextField> listTxt, boolean[] b) {
		super();
		this.btn = btn;
		txt = listTxt;
		this.b = b;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent e) {
		boolean validate = true;

		if (!txt.get(0).getText().equals(""))
			b[0] = txt.get(0).getText().matches("[A-Z][a-z]*");
		if (!txt.get(1).getText().equals(""))
			b[1] = txt.get(1).getText().matches("[A-Z][a-z]*");
		if (!txt.get(2).getText().equals(""))
			b[2] = txt.get(2).getText()
					.matches("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$"); // https://stackoverflow.com/questions/22160079/date-of-birth-validation-by-using-regular-expression/22160167
		if (!txt.get(3).getText().equals(""))
			b[3] = txt.get(3).getText().matches("([a-zA-Z]+\\s+)+\\d+");
		if (!txt.get(4).getText().equals(""))
			b[4] = txt.get(4).getText().matches("06\\d{8}");
		if (!txt.get(5).getText().equals(""))
			b[5] = txt.get(5).getText().matches(
					"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
		if (!txt.get(6).getText().equals(""))
			b[6] = txt.get(6).getText().matches("([a-zA-Z]+\\s+)+\\d+");

		if (!txt.get(7).getText().equals(""))
			b[7] = txt.get(7).getText().matches("^[0-9]{9}$");
		b[8] = true;

		System.out.println("\t\t" + "------");
		for (int i = 0; i < 9; i++) {
			System.out.println("\t\t" + b[i]);
			if (b[i] == false)
				validate = false;
		}

		if (validate == true) {
			btn.setEnabled(true);
		} else {
			btn.setEnabled(false);
		}

	}
}
