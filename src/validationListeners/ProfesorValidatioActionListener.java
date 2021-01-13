package validationListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ProfesorValidatioActionListener implements ActionListener {

	private JButton btn;
	private ArrayList<JTextField> txt;
	private boolean[] b;
	boolean validate = true;

	public ProfesorValidatioActionListener(JButton btn, ArrayList<JTextField> listTxt, boolean[] b) {
		super();
		this.btn = btn;
		txt = listTxt;
		this.b = b;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		validate = true;
		if (!txt.get(0).getText().equals(""))
			b[0] = txt.get(0).getText().matches("^[A-Za-zćĆčČžŽđĐšŠаАбБвВгГдДђЂеЕжЖиИјЈкКлЛљЉмМнНњЊоОпПрРсСтТћЋуУфФхХцЦчЧџЏшШ]*$");
		if (!txt.get(1).getText().equals(""))
			b[1] = txt.get(1).getText().matches("^[A-Za-zćĆčČžŽđĐšŠаАбБвВгГдДђЂеЕжЖиИјЈкКлЛљЉмМнНњЊоОпПрРсСтТћЋуУфФхХцЦчЧџЏшШ]*$");
		if (!txt.get(2).getText().equals(""))
			b[2] = txt.get(2).getText()
					.matches("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$"); // https://stackoverflow.com/questions/22160079/date-of-birth-validation-by-using-regular-expression/22160167
		if (!txt.get(3).getText().equals(""))
			b[3] = txt.get(3).getText().matches("^[.0-9a-zA-ZćĆčČžŽđĐšŠаАбБвВгГдДђЂеЕжЖиИјЈкКлЛљЉмМнНњЊоОпПрРсСтТћЋуУфФхХцЦчЧџЏшШ\\\\s,-]*$");
		if (!txt.get(4).getText().equals(""))
			b[4] = txt.get(4).getText().matches("0[0-9]{2}\\d{6,7}");
		if (!txt.get(5).getText().equals(""))
			b[5] = txt.get(5).getText().matches(
					"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
		if (!txt.get(6).getText().equals(""))
			b[6] = txt.get(6).getText().matches("^[.0-9a-zA-ZćĆčČžŽđĐšŠаАбБвВгГдДђЂеЕжЖиИјЈкКлЛљЉмМнНњЊоОпПрРсСтТћЋуУфФхХцЦчЧџЏшШ\\\\s,-]+$");

		if (!txt.get(7).getText().equals(""))
			b[7] = txt.get(7).getText().matches("^[0-9]{9}$");
		System.out.println("\t\t"+"------");

		for(int i = 0; i<8; i++) {
			System.out.println("\t\t"+b[i] + " " + txt.get(i).getText());
			if(b[i] == false) validate = false;
		}

		if (validate == true) {
			btn.setEnabled(true);
		} else {
			btn.setEnabled(false);
		}
	}

}
