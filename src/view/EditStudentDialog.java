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

import abstractTableModel.AbstractTableModelNepolozeni;
import abstractTableModel.AbstractTableModelPolozeni;
import controller.StudentController;
import model.BazaPredmeta;
import model.BazaStudenata;
import model.Ocena;
import model.Predmet;
import model.Student;
import validationListeners.StudentValidationActionListener;
import validationListeners.StudentValidationKeyListener;

public class EditStudentDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	Student student = null;;

	public EditStudentDialog(Frame parent, String title, boolean modal, Student s) {
		super(parent, title, modal);
		setResizable(false);
		student = s;
		JTabbedPane tabbedPane = new JTabbedPane();

/////////////////////I	N	F	O	R	M	A	C	I	J	E///////////////////////////
		boolean[] nizBool = new boolean[8];
		Arrays.fill(nizBool, Boolean.FALSE);
		
		List<JTextField> listTxt = new ArrayList<JTextField>();

		setSize(525, 500);
		setLocationRelativeTo(parent);

		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(new GridBagLayout());

		add(panelInfo);

		JLabel labIme = new JLabel("Ime*", JLabel.TRAILING);
		panelInfo.add(labIme, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labIme.setPreferredSize(new Dimension(170, 18));
		labIme.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfIme = new JTextField(17);
		tfIme.setText(student.getIme());
		listTxt.add(tfIme);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panelInfo.add(tfIme, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labPrezime = new JLabel("Prezime*", JLabel.TRAILING);
		panelInfo.add(labPrezime, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labPrezime.setPreferredSize(new Dimension(170, 18));
		labPrezime.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfPrezime = new JTextField(17);
		tfPrezime.setText(student.getPrezime());
		listTxt.add(tfPrezime);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panelInfo.add(tfPrezime, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labDatRodj = new JLabel("Datum rodjenja*", JLabel.TRAILING);
		panelInfo.add(labDatRodj, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labDatRodj.setPreferredSize(new Dimension(170, 18));
		labDatRodj.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfDatRodj = new JTextField(17);
		tfDatRodj.setText(student.getDatum_rodjenja());
		listTxt.add(tfDatRodj);
		// tfDatRodj.setPreferredSize(new Dimension(70, 20));
		panelInfo.add(tfDatRodj, new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labAdresa = new JLabel("Adresa stanovanja*", JLabel.TRAILING);
		panelInfo.add(labAdresa, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labAdresa.setPreferredSize(new Dimension(170, 18));
		labAdresa.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfAdresa = new JTextField(17);
		tfAdresa.setText(student.getAdresa_stanovanja());
		listTxt.add(tfAdresa);
		// tfAdresa.setPreferredSize(new Dimension(700, 20));
		panelInfo.add(tfAdresa, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labBrTel = new JLabel("Broj telefona*", JLabel.TRAILING);
		panelInfo.add(labBrTel, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labBrTel.setPreferredSize(new Dimension(170, 18));
		labBrTel.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfBrTel = new JTextField(17);
		tfBrTel.setText(student.getTelefon());
		listTxt.add(tfBrTel);
		// tfBrTel.setPreferredSize(new Dimension(700, 20));
		panelInfo.add(tfBrTel, new GridBagConstraints(1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labEmail = new JLabel("E-mail adresa*", JLabel.TRAILING);
		panelInfo.add(labEmail, new GridBagConstraints(0, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labEmail.setPreferredSize(new Dimension(170, 18));
		labEmail.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfEmail = new JTextField(17);
		tfEmail.setText(student.getEmail());
		listTxt.add(tfEmail);
		// tfEmail.setPreferredSize(new Dimension(700, 20));
		panelInfo.add(tfEmail, new GridBagConstraints(1, 5, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labBrIndeks = new JLabel("Broj indeksa*", JLabel.TRAILING);
		panelInfo.add(labBrIndeks, new GridBagConstraints(0, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labBrIndeks.setPreferredSize(new Dimension(170, 18));
		labBrIndeks.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfBrIndeks = new JTextField(17);
		tfBrIndeks.setText(student.getBroj_indeksa());
		listTxt.add(tfBrIndeks);
		// tfBrIndeks.setPreferredSize(new Dimension(70, 20));
		panelInfo.add(tfBrIndeks, new GridBagConstraints(1, 6, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labGodUpisa = new JLabel("Godina upisa*", JLabel.TRAILING);
		panelInfo.add(labGodUpisa, new GridBagConstraints(0, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labGodUpisa.setPreferredSize(new Dimension(170, 18));
		labGodUpisa.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfGodUpisa = new JTextField(17);
		tfGodUpisa.setText(String.valueOf(student.getGodina_upisa()));
		listTxt.add(tfGodUpisa);
		// tfGodinaUpisa.setPreferredSize(new Dimension(70, 20));
		panelInfo.add(tfGodUpisa, new GridBagConstraints(1, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		JLabel labGodStudija = new JLabel("Trenutna godina studija*", JLabel.TRAILING);
		panelInfo.add(labGodStudija, new GridBagConstraints(0, 8, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labGodStudija.setPreferredSize(new Dimension(170, 18));
		labGodStudija.setHorizontalAlignment(SwingConstants.LEFT);

		Integer niz[] = { 1, 2, 3, 4 };
		JComboBox<Integer> comboGodStudija = new JComboBox<Integer>(niz);
		comboGodStudija.setSelectedItem(student.getGodina_studija());
		comboGodStudija.setPreferredSize(tfIme.getPreferredSize());
		panelInfo.add(comboGodStudija, new GridBagConstraints(1, 8, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, 42), 0, 0));
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

		JLabel labNacinFin = new JLabel("Nacin finansiranja*", JLabel.TRAILING);
		panelInfo.add(labNacinFin, new GridBagConstraints(0, 9, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, -30), 0, 0));
		labNacinFin.setPreferredSize(new Dimension(170, 18));
		labNacinFin.setHorizontalAlignment(SwingConstants.LEFT);

		JComboBox<Student.enumStatus> comboNacinFin = new JComboBox<Student.enumStatus>(Student.enumStatus.values());
		comboNacinFin.setSelectedItem(student.getStatus());
		comboNacinFin.setPreferredSize(tfIme.getPreferredSize());
//		comboNacinFin.setPreferredSize(new Dimension(tfIme.getWidth(), tfIme.getHeight()));
		panelInfo.add(comboNacinFin, new GridBagConstraints(1, 9, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 42), 0, 0));
		comboNacinFin.setRenderer(new DefaultListCellRenderer() { // https://docs.oracle.com/javase/7/docs/api/javax/swing/DefaultListCellRenderer.html
			private static final long serialVersionUID = 1L;

			@Override // https://tips4java.wordpress.com/2013/11/17/combo-box-with-custom-renderer/
			public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean b, boolean b1) {// https://stackoverflow.com/questions/42602405/jcombobox-fill-with-enum-variable-value
				Component rendererComponent = super.getListCellRendererComponent(jList, o, i, b, b1);
				setText(o == Student.enumStatus.B ? "Budzet" : "Samofinansiranje");
				return rendererComponent;
			}
		});
		
		EditStudentDialog thisDialog = this;
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setEnabled(false);
		panelInfo.add(btnPotvrdi, new GridBagConstraints(0, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 75, 0, -7), 0, 0));
		btnPotvrdi.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {


				student.setIme(tfIme.getText());
				student.setPrezime(tfPrezime.getText());
				student.setDatum_rodjenja(tfDatRodj.getText());
				student.setAdresa_stanovanja(tfAdresa.getText());
				student.setTelefon(tfBrTel.getText());
				student.setEmail(tfEmail.getText());
				if(!BazaStudenata.exists(tfBrIndeks.getText()) || student.getBroj_indeksa().equals(tfBrIndeks.getText()) ){
					
					student.setBroj_indeksa(tfBrIndeks.getText());		
				}else {
					JOptionPane.showMessageDialog(thisDialog,
						    "Student sa tim indeksom vec postoji.",
						    "Greska",
						    JOptionPane.ERROR_MESSAGE);
				}
				student.setGodina_upisa(Integer.parseInt(tfGodUpisa.getText()));
				student.setGodina_studija((int) comboGodStudija.getSelectedItem());
				student.setStatus((Student.enumStatus) comboNacinFin.getSelectedItem());

				MainFrame.getInstance().prikaziTabeluStudenata();
			}
		});

		JButton btnOdustani = new JButton("Odustani");
		panelInfo.add(btnOdustani, new GridBagConstraints(1, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 75), 0, 0));

		for (int i = 0; i < 8; i++) {
			listTxt.get(i).addKeyListener(
					new StudentValidationKeyListener(btnPotvrdi, (ArrayList<JTextField>) listTxt, nizBool));
		}
		comboGodStudija.addActionListener(new StudentValidationActionListener(btnPotvrdi, (ArrayList<JTextField>) listTxt, nizBool));
		comboNacinFin.addActionListener(new StudentValidationActionListener(btnPotvrdi, (ArrayList<JTextField>) listTxt, nizBool));

		

		btnOdustani.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});

		tabbedPane.addTab("Informacije", panelInfo);
		
////////////////////////////P	O	L	O	Z	E	N	I//////////////////////////////
		JPanel panelPolozeni = new JPanel();
		
		JPanel panelButton = new JPanel();
		JButton btnPonisti = new JButton("Poništi ocenu");

		panelButton.add(btnPonisti);
		
		PredmetiJTable tablePolozeni = new PredmetiJTable();
		tablePolozeni.setModel(new AbstractTableModelPolozeni(student));
		
		
		panelPolozeni.add(panelButton);
		JScrollPane polscp = new JScrollPane(tablePolozeni);
		polscp.setPreferredSize(new Dimension(425,360));
		panelPolozeni.add(polscp);
		
		tabbedPane.addTab("Položeni", panelPolozeni);
		
		btnPonisti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(panelPolozeni, "Da li ste sigurni da zelite da ponistite ocenu", "Potvrda", JOptionPane.YES_NO_OPTION);
				if(reply == JOptionPane.YES_OPTION) {
					for(Student sIterator: BazaStudenata.getInstance().getStudenti()) {
						if(sIterator == student) {
							for(Ocena oIterator: student.getPolozeni()) {
								if(oIterator.getPredmet().getSifra().equals(tablePolozeni.getValueAt(tablePolozeni.getSelectedRow(), 0)))
									sIterator.getPolozeni().remove(oIterator);
									break;
							}
							//student.getPolozeni().remove(tablePolozeni.getValueAt(tablePolozeni.getSelectedRow(), reply))
						}
					}
					
				}
				tablePolozeni.setModel(new AbstractTableModelPolozeni(student));
			}
			
		});
		
////////////////////////N	E	P	O	L	O	Z	E	N	I//////////////////////////////		
		JPanel panelNepolozeni = new JPanel();
		
		JPanel panelButtons = new JPanel();
		JButton btnDodaj = new JButton("Dodaj");

		JButton btnObrisi = new JButton("Ukloni");
		JButton btnPolaganje = new JButton("Polaganje");
		
		panelButtons.add(btnDodaj);
		panelButtons.add(btnObrisi);
		panelButtons.add(btnPolaganje);
		PredmetiJTable tableNepolozeni = new PredmetiJTable();	
		tableNepolozeni.setModel(new AbstractTableModelNepolozeni(s));
		
		tabbedPane.addTab("Nepoloženi", panelNepolozeni);
		panelNepolozeni.add(panelButtons);
		JScrollPane scp = new JScrollPane(tableNepolozeni);
		scp.setPreferredSize(new Dimension(425,360));
		panelNepolozeni.add(scp);
		
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DodavanjePredmetaStudentuDialog dialog = new DodavanjePredmetaStudentuDialog(thisDialog, "Dodavanje predmeta", true, s, tableNepolozeni);
				dialog.setVisible(true);
			}
			
		});
		
		btnObrisi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(panelPolozeni, "Da li ste sigurni da zelite da uklinite predmet", "Potvrda", JOptionPane.YES_NO_OPTION);
				Predmet pTemp = null;
				if(reply == JOptionPane.YES_OPTION) {
					for (Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
						if (p.getSifra().equals(tableNepolozeni.getValueAt(tableNepolozeni.getSelectedRow(), 0))) {
							pTemp = p;
							break;
						}
					}
					StudentController.getInstance().ukloniPredmet(student, pTemp);
					tableNepolozeni.setModel(new AbstractTableModelNepolozeni(student));
				}
				else {
					dispose();
				}
			}
		});
		btnPolaganje.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Predmet tmp = new Predmet();
				for (Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
					if (p.getSifra().equals(tableNepolozeni.getValueAt(tableNepolozeni.getSelectedRow(), 0))) {
						tmp = p;
						break;
					}
						
				}
				
				
				
				UnosOceneDijalog oceni = new UnosOceneDijalog(thisDialog, "Upis ocene", true,tableNepolozeni, tablePolozeni ,tmp, student);
				oceni.setVisible(true);
			}
		});
		add(tabbedPane);

	}

}
