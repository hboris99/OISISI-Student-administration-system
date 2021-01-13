package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import abstractTableModel.AbstractTableModelNepolozeni;
import model.BazaStudenata;
import model.Student;
import tables.DodavanjePredmetaJList;

public class DodavanjePredmetaStudentuDialog extends JDialog{
	
	private static final long serialVersionUID = -1205380604984917479L;
	JDialog parent;
	String title;
	boolean modal;
	Student s;
	JTable table;
	JLabel labProsek;
	JLabel labEspb;
	
	public DodavanjePredmetaStudentuDialog(JDialog parent, String title, boolean modal, Student s, JTable table, JLabel labProsek, JLabel labEspb) {
		super(parent, title, modal);
		this.s = s;
		this.parent = parent;
		this.title = title;
		this.modal = modal;
		this.table = table;
		this.labProsek = labProsek;
		this.labEspb = labEspb;
		inicijalizuj();
	}

	void inicijalizuj() {
		
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);	
		setLayout(new BorderLayout(20,5));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,25,9));
		
		DodavanjePredmetaJList lista = new DodavanjePredmetaJList(s);
		lista.setVisible(true);
		
		JButton btnDodaj = new JButton("Dodaj");
		panel.add(btnDodaj);
		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani);
		add(panel, BorderLayout.NORTH);
		
		JPanel scrollPanel = new JPanel(new BorderLayout(12,7));
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		JPanel south = new JPanel();
		scrollPanel.setPreferredSize(new Dimension(200,200));
		JScrollPane listScroller = new JScrollPane(lista);
		scrollPanel.add(listScroller, BorderLayout.CENTER);
		scrollPanel.add(east,BorderLayout.EAST);
		scrollPanel.add(west,BorderLayout.WEST);
		scrollPanel.add(south,BorderLayout.SOUTH);
		add(scrollPanel, BorderLayout.CENTER);
			
		btnDodaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s.getNepolozeni().add(lista.getSelectedValue());

				table.setModel(new AbstractTableModelNepolozeni(s));
			}
		});
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		
	}
}
