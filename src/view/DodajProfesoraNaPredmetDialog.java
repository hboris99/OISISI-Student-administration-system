package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Predmet;
import tables.DodajProfesoraNaPredmetJList;

public class DodajProfesoraNaPredmetDialog extends JDialog{

	private static final long serialVersionUID = -3784592234454427257L;
	
	Predmet predmet;
	JButton minus;
	JButton plus;
	JTextField txt;
	
	
	public DodajProfesoraNaPredmetDialog(JDialog parent, String title, boolean modal, Predmet p, JButton plus, JButton minus, JTextField txt) {
		super(parent, title, modal);
		this.plus = plus;
		this.minus = minus;
		this.txt = txt;
		predmet = p;
		inicijalizuj();
	}
	
	public void inicijalizuj() {
		
		JPanel panel = new JPanel(new BorderLayout(10,10));
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		JPanel north = new JPanel();
		panel.add(west, BorderLayout.WEST);
		panel.add(east, BorderLayout.EAST);
		panel.add(north, BorderLayout.NORTH);
		
		DodajProfesoraNaPredmetJList lista = new DodajProfesoraNaPredmetJList();
		JScrollPane jsp = new JScrollPane(lista);
		panel.add(jsp, BorderLayout.CENTER);
		
		
		JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,30,30));
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				predmet.setProfesor(lista.getSelectedValue());
				plus.setEnabled(false);
				minus.setEnabled(true);
				txt.setText(lista.getSelectedValue().getIme() + " " + lista.getSelectedValue().getPrezime());
				dispose();
			}
		});
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
		
		buttonsPanel.add(btnPotvrdi);
		buttonsPanel.add(btnOdustani);
		panel.add(buttonsPanel, BorderLayout.SOUTH);
		
		add(panel);
	}
}
