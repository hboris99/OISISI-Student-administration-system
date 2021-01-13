package view;

import java.awt.Component;
import java.awt.Dimension;
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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import abstractTableModel.AbstractTableModelPredaje;
import controller.ProfesoriController;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenata;
import model.Predmet;
import model.Profesor;
import model.Profesor.Zvanje;
import model.Student;
import tables.PredajeJTable;
import validationListeners.ProfesorValidatioActionListener;
import validationListeners.ProfesorValidationKeyListener;

public class IzmeniProfesoraDialog extends JDialog{
	
	private static final long serialVersionUID = 1L;
	
	Profesor profesor = null;;
	
	public IzmeniProfesoraDialog(Frame parent, String title, boolean modal, Profesor p) {
		super(parent, title, modal);

		profesor = p;
		
		boolean[] nizBool = new boolean[8];
		Arrays.fill(nizBool, Boolean.FALSE);
		
		List<JTextField> listTxt = new ArrayList<JTextField>();

		setSize(450, 500);
		setLocationRelativeTo(parent);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Info", panel);
		add(tp);

		JLabel labIme = new JLabel("Ime*", JLabel.TRAILING);
		panel.add(labIme, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labIme.setPreferredSize(new Dimension(170, 18));
		labIme.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfIme = new JTextField(17);
		tfIme.setText(profesor.getIme());
		listTxt.add(tfIme);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfIme, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labPrezime = new JLabel("Prezime*", JLabel.TRAILING);
		panel.add(labPrezime, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labPrezime.setPreferredSize(new Dimension(170, 18));
		labPrezime.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfPrezime = new JTextField(17);
		tfPrezime.setText(profesor.getPrezime());
		listTxt.add(tfPrezime);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfPrezime, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labDatRodj = new JLabel("Datum rodjenja*", JLabel.TRAILING);
		panel.add(labDatRodj, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labDatRodj.setPreferredSize(new Dimension(170, 18));
		labDatRodj.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfDatRodj = new JTextField(17);
		tfDatRodj.setText(profesor.getDatum_rodjenja());
		listTxt.add(tfDatRodj);
		// tfDatRodj.setPreferredSize(new Dimension(70, 20));
		panel.add(tfDatRodj, new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labAdresa = new JLabel("Adresa stanovanja*", JLabel.TRAILING);
		panel.add(labAdresa, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labAdresa.setPreferredSize(new Dimension(170, 18));
		labAdresa.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfAdresa = new JTextField(17);
		tfAdresa.setText(profesor.getAdresa_stanovanja());
		listTxt.add(tfAdresa);
		// tfAdresa.setPreferredSize(new Dimension(700, 20));
		panel.add(tfAdresa, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labBrTel = new JLabel("Broj telefona*", JLabel.TRAILING);
		panel.add(labBrTel, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labBrTel.setPreferredSize(new Dimension(170, 18));
		labBrTel.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfBrTel = new JTextField(17);
		tfBrTel.setText(profesor.getTelefon());
		listTxt.add(tfBrTel);
		// tfBrTel.setPreferredSize(new Dimension(700, 20));
		panel.add(tfBrTel, new GridBagConstraints(1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labEmail = new JLabel("E-mail adresa*", JLabel.TRAILING);
		panel.add(labEmail, new GridBagConstraints(0, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labEmail.setPreferredSize(new Dimension(170, 18));
		labEmail.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfEmail = new JTextField(17);
		tfEmail.setText(profesor.getEmail());
		listTxt.add(tfEmail);
		// tfEmail.setPreferredSize(new Dimension(700, 20));
		panel.add(tfEmail, new GridBagConstraints(1, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labBrIndeks = new JLabel("Adresa Kancelarija*", JLabel.TRAILING);
		panel.add(labBrIndeks, new GridBagConstraints(0, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labBrIndeks.setPreferredSize(new Dimension(170, 18));
		labBrIndeks.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfAdresaKanc = new JTextField(17);
		tfAdresaKanc.setText(profesor.getAdresa_kancelarije());
		listTxt.add(tfAdresaKanc);
		// tfBrIndeks.setPreferredSize(new Dimension(70, 20));
		panel.add(tfAdresaKanc, new GridBagConstraints(1, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labGodUpisa = new JLabel("Broj Licne Karte*", JLabel.TRAILING);
		panel.add(labGodUpisa, new GridBagConstraints(0, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labGodUpisa.setPreferredSize(new Dimension(170, 18));
		labGodUpisa.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfBrLK = new JTextField(17);
		tfBrLK.setText(String.valueOf(profesor.getBroj_lk()));
		listTxt.add(tfBrLK);
		// tfGodinaUpisa.setPreferredSize(new Dimension(70, 20));
		panel.add(tfBrLK, new GridBagConstraints(1, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labTitula = new JLabel("Titula*", JLabel.TRAILING);
		panel.add(labTitula, new GridBagConstraints( 0, 9, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, 0, -30 ), 0, 0 ) );
		labTitula.setPreferredSize(new Dimension(170,18));
		labTitula.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JComboBox<Profesor.Titula> comboTitula = new JComboBox<Profesor.Titula>(Profesor.Titula.values());

		comboTitula.setPreferredSize(new Dimension(158, 18));
		comboTitula.setSelectedItem(p.getTitula());

//		comboNacinFin.setPreferredSize(new Dimension(tfIme.getWidth(), tfIme.getHeight()));
		panel.add(comboTitula, new GridBagConstraints(1, 9, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 42), 0, 0));
		comboTitula.setRenderer(new DefaultListCellRenderer() { // https://docs.oracle.com/javase/7/docs/api/javax/swing/DefaultListCellRenderer.html
			@Override // https://tips4java.wordpress.com/2013/11/17/combo-box-with-custom-renderer/
			public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean b, boolean b1) {// https://stackoverflow.com/questions/42602405/jcombobox-fill-with-enum-variable-value
				Component rendererComponent = super.getListCellRendererComponent(jList, o, i, b, b1);
				if(o == Profesor.Titula.BSC) {
				setText("Bsc");
				}else if (o == Profesor.Titula.MR) {
					setText("Mr");

				}else if (o == Profesor.Titula.DR) {
					setText("Dr");

				}else if (o == Profesor.Titula.MSC) {
					setText("Msc");
					
				}else {
					setText("Prof. dr");
				}
				return rendererComponent;
			}
		});

		JLabel labZvanje = new JLabel("Zvanje*", JLabel.TRAILING);
		panel.add(labZvanje, new GridBagConstraints( 0, 8, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labZvanje.setPreferredSize(new Dimension(170,18));
		labZvanje.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JComboBox<Profesor.Zvanje> comboZvanje = new JComboBox<Profesor.Zvanje>(Profesor.Zvanje.values());
		
		comboZvanje.setPreferredSize(new Dimension(158, 18));
		comboZvanje.setSelectedItem(p.getZvanje());
		//		comboNacinFin.setPreferredSize(new Dimension(tfIme.getWidth(), tfIme.getHeight()));
		panel.add(comboZvanje, new GridBagConstraints(1, 8, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, 42), 0, 0));
		comboZvanje.setRenderer(new DefaultListCellRenderer() { // https://docs.oracle.com/javase/7/docs/api/javax/swing/DefaultListCellRenderer.html
			@Override // https://tips4java.wordpress.com/2013/11/17/combo-box-with-custom-renderer/
			public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean b, boolean b1) {// https://stackoverflow.com/questions/42602405/jcombobox-fill-with-enum-variable-value
				Component rendererComponent = super.getListCellRendererComponent(jList, o, i, b, b1);
				if(o == Profesor.Zvanje.SUN) {
				setText("Saradnik u nastavi");
				}else if (o == Profesor.Zvanje.AS) {
					setText("Asistent");
				}else if (o == Profesor.Zvanje.ASD) {
					setText("Asistent sa doktoratom");
				}else if (o == Profesor.Zvanje.DOC) {
					setText("Docent");
				}else if (o == Profesor.Zvanje.VPROF) {
					setText("Vandredni Profesor");
				}else if (o == Profesor.Zvanje.REDPROF) {
					setText("Redovni Profesor");
				}
				else {
					setText("Profesor Emeritius");
				}
				return rendererComponent;
			}
		});
		IzmeniProfesoraDialog thisDialog = this;

		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setEnabled(false);
		panel.add(btnPotvrdi, new GridBagConstraints(0, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 75, 0, -7), 0, 0));
		btnPotvrdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.setIme(tfIme.getText());
				p.setPrezime(tfPrezime.getText());
				p.setDatum_rodjenja(tfDatRodj.getText());
				p.setAdresa_stanovanja(tfAdresa.getText());
				p.setTelefon(tfBrTel.getText());
				p.setEmail(tfEmail.getText());
				p.setAdresa_kancelarije(tfAdresaKanc.getText());
				if(!BazaProfesora.exists(tfBrLK.getText()) || p.getBroj_lk().equals(tfBrLK.getText())){
					
					p.setBroj_lk(tfBrLK.getText());		
				}else {
					JOptionPane.showMessageDialog(thisDialog,
						    "Profesor sa tim brojem licne karte vec postoji.",
						    "Greska",
						    JOptionPane.ERROR_MESSAGE);
				}
				p.setZvanje((Profesor.Zvanje) comboZvanje.getSelectedItem());
				p.setTitula((Profesor.Titula) comboTitula.getSelectedItem());
			
				MainFrame.getInstance().prikaziTabeluStudenata();
				
				
				}
		});

		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani, new GridBagConstraints(1, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 75), 0, 0));

		for (int i = 0; i < 8; i++) {
			listTxt.get(i).addKeyListener(
					new ProfesorValidationKeyListener(btnPotvrdi, (ArrayList<JTextField>) listTxt, nizBool));
		}
		comboTitula.addActionListener(new ProfesorValidatioActionListener(btnPotvrdi, (ArrayList<JTextField>)listTxt, nizBool));
		comboZvanje.addActionListener(new ProfesorValidatioActionListener(btnPotvrdi, (ArrayList<JTextField>)listTxt, nizBool));

		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
			
		JPanel panelButton = new JPanel();
		JPanel panelPredmeti = new JPanel();
		JButton btnDodaj = new JButton("Dodaj predmet");
		JButton btnUkloni = new JButton("Ukloni predmet");
		
		
		panelButton.add(btnDodaj);
		panelButton.add(btnUkloni);
		
		
		PredmetiJTable predajeNaPredmetima = new PredmetiJTable();
		predajeNaPredmetima.setModel(new AbstractTableModelPredaje(p));
		JScrollPane sp = new JScrollPane(predajeNaPredmetima);
		tp.addTab("Predmeti", panelPredmeti);
		panelPredmeti.add(panelButton);
		sp.setPreferredSize(new Dimension(425,360));
		panelPredmeti.add(sp);
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DodavanjePredmetaProfesoruDialog dialog = new DodavanjePredmetaProfesoruDialog(thisDialog, "Dodavanje Predmeta", true, p, predajeNaPredmetima);
				dialog.setVisible(true);
			}
				
			
		});
		
		btnUkloni.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(predajeNaPredmetima.getSelectedRow() >= 0) {
					int reply = JOptionPane.showConfirmDialog(panelPredmeti, "Da li ste sigurni da zelite da uklinite predmet", "Potvrda", JOptionPane.YES_NO_OPTION);
					Predmet tmp = null;
					if(reply == JOptionPane.YES_OPTION) {
						for(Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
							if(p.getSifra().equals(predajeNaPredmetima.getValueAt(predajeNaPredmetima.getSelectedRow(),0))) {
								tmp = p;
								break;
							}
						}
						ProfesoriController.getInstance().ukloniPredmet(p, tmp);
						predajeNaPredmetima.setModel(new AbstractTableModelPredaje(p));
					}else {
						dispose();
					}
				}
			}
		});
		
		}
	
}
