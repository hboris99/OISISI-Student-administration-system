package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import model.Student;
import tables.DodavanjePredmetaJList;

public class DodavanjePredmetaStudentuDialog extends JDialog{
	
	private static final long serialVersionUID = -1205380604984917479L;
	JDialog parent;
	String title;
	boolean modal;
	Student s;
	
	public DodavanjePredmetaStudentuDialog(JDialog parent, String title, boolean modal, Student s) {
		super(parent, title, modal);
		this.s = s;
		this.parent = parent;
		this.title = title;
		this.modal = modal;
		inicijalizuj();
	}

	void inicijalizuj() {
		
		JPanel panel = new JPanel();
		add(panel);
		DodavanjePredmetaJList lista = new DodavanjePredmetaJList(s);
		lista.setVisible(true);
		
		JButton btnDodaj = new JButton("Dodaj");
		panel.add(btnDodaj);
		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani);
		
		panel.add(lista);
		
		
		
		
	}
}
