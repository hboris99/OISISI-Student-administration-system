package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.BazaPredmeta;
import model.Predmet;
import validationListeners.PredmetValidationKeyListener;

public class EditPredmetDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	
	Predmet predmet = null;

	public EditPredmetDialog(Frame parent, String title, boolean modal, Predmet p) {
		super(parent, title, modal);

		predmet = p;
				
		boolean[] nizBool = new boolean[3];
		Arrays.fill(nizBool, Boolean.FALSE);
		for (int i = 0; i < 3; i++) {
			System.out.println(nizBool[i]);
		}
		List<JTextField> listTxt = new ArrayList<JTextField>();

		setSize(450, 500);
		setLocationRelativeTo(parent);

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		add(panel);

		JLabel labSifra = new JLabel("Sifra*", JLabel.TRAILING);
		panel.add(labSifra, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labSifra.setPreferredSize(new Dimension(170, 18));
		labSifra.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfSifra = new JTextField(20);
		tfSifra.setText(predmet.getSifra());
		listTxt.add(tfSifra);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfSifra, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 37), 0, 0));

		JLabel labNaziv = new JLabel("Naziv*", JLabel.TRAILING);
		panel.add(labNaziv, new GridBagConstraints(0, 1, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labNaziv.setPreferredSize(new Dimension(170, 18));
		labNaziv.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfNaziv = new JTextField(20);
		tfNaziv.setText(predmet.getNaziv());
		listTxt.add(tfNaziv);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfNaziv, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 37), 0, 0));
		
		JLabel labGodinaStudija = new JLabel("Godina*", JLabel.TRAILING);
		panel.add(labGodinaStudija, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labGodinaStudija.setPreferredSize(new Dimension(170, 18));
		labGodinaStudija.setHorizontalAlignment(SwingConstants.LEFT);

		Integer niz[] = { 1, 2, 3, 4 };
		JComboBox<Integer> comboGodStudija = new JComboBox<Integer>(niz);
		comboGodStudija.setSelectedItem(predmet.getGodina_studija());
		comboGodStudija.setPreferredSize(tfSifra.getPreferredSize());
		panel.add(comboGodStudija, new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 42), 0, 0));
		comboGodStudija.setRenderer(new DefaultListCellRenderer() { // https://docs.oracle.com/javase/7/docs/api/javax/swing/DefaultListCellRenderer.html
			@Override // https://tips4java.wordpress.com/2013/11/17/combo-box-with-custom-renderer/
			public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean b, boolean b1) {// https://stackoverflow.com/questions/42602405/jcombobox-fill-with-enum-variable-value
				Component rendererComponent = super.getListCellRendererComponent(jList, o, i, b, b1);
				int x = Integer.parseInt(o.toString());
				switch (x) {
				case 1:
					setText("I (prva)");
					break;
				case 2:
					setText("II (druga)");
					break;
				case 3:
					setText("III (treca)");
					break;
				case 4:
					setText("VI (cetvrta)");
					break;
				}
				;
				return rendererComponent;
			}
		});

		JLabel labSemestar = new JLabel("Semestar*", JLabel.TRAILING);
		panel.add(labSemestar, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labSemestar.setPreferredSize(new Dimension(170, 18));
		labSemestar.setHorizontalAlignment(SwingConstants.LEFT);

		JComboBox<Predmet.enumSemestar> comboSemestar = new JComboBox<Predmet.enumSemestar>(Predmet.enumSemestar.values());
		comboSemestar.setSelectedItem(predmet.getSemestar());
		comboSemestar.setPreferredSize(tfSifra.getPreferredSize());
		panel.add(comboSemestar, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 42), 0, 0));

		

		JLabel labESPB = new JLabel("ESPB*", JLabel.TRAILING);
		panel.add(labESPB, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labESPB.setPreferredSize(new Dimension(170, 18));
		labESPB.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfESPB = new JTextField(20);
		tfESPB.setText(String.valueOf(predmet.getEspb()));
		listTxt.add(tfESPB);
		// tfEmail.setPreferredSize(new Dimension(700, 20));
		panel.add(tfESPB, new GridBagConstraints(1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 37), 0, 0));
		
		
		JLabel labPredmetniProfesor = new JLabel("Profesor*", JLabel.TRAILING);
		panel.add(labPredmetniProfesor, new GridBagConstraints(0, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 40, -25, -30), 0, 0));
		labPredmetniProfesor.setPreferredSize(new Dimension(170, 18));
		labPredmetniProfesor.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel panelProfesor = new JPanel(new FlowLayout(FlowLayout.LEFT, 7, 0));
		JButton plus = new JButton("+");
		
		JButton minus = new JButton("-");
		
		if(predmet.getProfesor() == null)
			minus.setEnabled(false);
		else
			plus.setEnabled(false);
		
		plus.setFont(new Font("Arial",Font.PLAIN,15));
		minus.setFont(new Font("Arial",Font.PLAIN,15));
		plus.setBorder( new LineBorder(Color.BLACK, 1) );
		minus.setBorder( new LineBorder(Color.BLACK, 1) );
		plus.setPreferredSize(new Dimension(20,20));
		minus.setPreferredSize(new Dimension(20,20));
		
		JDialog thisDialog = this;
		
		JTextField tfProfesor = new JTextField(15);
		if(predmet.getProfesor() != null)
			tfProfesor.setText(predmet.getProfesor().getIme() + " " + predmet.getProfesor().getPrezime());
		tfProfesor.setEditable(false);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DodajProfesoraNaPredmetDialog dialog = new DodajProfesoraNaPredmetDialog(thisDialog, "Odaberi profesora", true, predmet, plus, minus, tfProfesor);
				dialog.setSize(250,400);
				dialog.setLocationRelativeTo(thisDialog);
				dialog.setVisible(true);	
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				predmet.setProfesor(null);
				plus.setEnabled(true);
				minus.setEnabled(false);
				tfProfesor.setText("");
			}
		});
		
		

		listTxt.add(tfProfesor);
		
		panelProfesor.add(tfProfesor);
		panelProfesor.add(plus);
		panelProfesor.add(minus);
		panel.add(panelProfesor, new GridBagConstraints(1, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, -15, -25, 37), 0, 0));

		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setEnabled(false);
		panel.add(btnPotvrdi, new GridBagConstraints(0, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 75, 0, -7), 0, 0));
		btnPotvrdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Potvrdi btn pritisnut");

				if(!BazaPredmeta.exists(tfSifra.getText()) || predmet.getSifra().equals(tfSifra.getText().trim()) ){
					predmet.setSifra(tfSifra.getText());
				}else {
					JOptionPane.showMessageDialog(thisDialog,
						    "Predmet sa tom sifrom vec postoji.",
						    "Greska",
						    JOptionPane.ERROR_MESSAGE);
				}
				predmet.setNaziv(tfNaziv.getText());
				predmet.setGodina_studija((int)comboGodStudija.getSelectedItem());
				predmet.setSemestar((Predmet.enumSemestar)comboSemestar.getSelectedItem());
				predmet.setEspb(Integer.parseInt(tfESPB.getText()));
				
				MainFrame.getInstance().prikaziTabeluPredmeta();
			}
		});

		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani, new GridBagConstraints(1, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 75), 0, 0));

		for (int i = 0; i < 3; i++) {
			listTxt.get(i).addKeyListener(
					new PredmetValidationKeyListener(btnPotvrdi, (ArrayList<JTextField>) listTxt, nizBool));
		}
	
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		setResizable(false);
	}

}
