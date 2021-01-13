package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import abstractTableModel.AbstractTableModelPredaje;
import model.Profesor;
import model.Student;
import tables.ProfesorPredajePredmetJList;

public class DodavanjePredmetaProfesoruDialog extends JDialog {
	
	private static final long serialVersionUID = 1L;
	JDialog parent;
	String title;
	boolean modal;
	Profesor p;
	JTable table;
	public DodavanjePredmetaProfesoruDialog(JDialog parent, String title, boolean modal, Profesor p, JTable table) {
		super(parent, title, modal);
		this.parent = parent;
		this.title = title;
		this.modal = modal;
		this.p = p;
		this.table = table;
		inicijalizuj();
	}
	void inicijalizuj() {
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(20,5));
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,25,9));
		
		ProfesorPredajePredmetJList list = new ProfesorPredajePredmetJList(p);
		list.setVisible(true);
		
		JButton dodaj = new JButton("Dodaj");
		panel.add(dodaj);
		JButton odustani = new JButton("Odustani");
		panel.add(odustani);
		add(panel, BorderLayout.NORTH);
		
		JPanel scrollPanel = new JPanel(new BorderLayout(12,7));
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		JPanel south = new JPanel();
		scrollPanel.setPreferredSize(new Dimension(200,200));
		JScrollPane listScroller = new JScrollPane(list);
		scrollPanel.add(listScroller, BorderLayout.CENTER);
		scrollPanel.add(east,BorderLayout.EAST);
		scrollPanel.add(west,BorderLayout.WEST);
		scrollPanel.add(south,BorderLayout.SOUTH);
		add(scrollPanel, BorderLayout.CENTER);
		
		dodaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.getPredmeti_radi().add(list.getSelectedValue());
				table.setModel(new AbstractTableModelPredaje(p));
				
			}
		});
		odustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		

	}
	
}
