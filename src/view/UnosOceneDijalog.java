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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import abstractTableModel.AbstractTableModelNepolozeni;
import abstractTableModel.AbstractTableModelPredaje;
import model.BazaStudenata;
import model.Ocena;
import model.Predmet;
import model.Student;
import validationListeners.StudentValidationKeyListener;

public class UnosOceneDijalog extends JDialog {

	private static final long serialVersionUID = 1L;

	public UnosOceneDijalog(EditStudentDialog parent, String title, boolean modal, JTable table, Predmet p, Student s) {
		super(parent, title, modal);

		boolean[] nizBool = new boolean[4];
		Arrays.fill(nizBool, Boolean.FALSE);
		for (int i = 0; i < 4; i++) {
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
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labSifra.setPreferredSize(new Dimension(170, 18));
		labSifra.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfSifra = new JTextField(17);
		listTxt.add(tfSifra);
		panel.add(tfSifra, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));
		tfSifra.setText(p.getSifra());
		
		JLabel labNaziv = new JLabel("Naziv*", JLabel.TRAILING);
		panel.add(labNaziv, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labNaziv.setPreferredSize(new Dimension(170, 18));
		labNaziv.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField tfNaziv = new JTextField(17);
		listTxt.add(tfNaziv);
		// tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfNaziv, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));
		tfNaziv.setText(p.getNaziv());
		Integer niz[] = { 6, 7, 7, 9, 10 };
		JComboBox<Integer> comboOcena = new JComboBox<Integer>(niz);
		comboOcena.setPreferredSize(tfSifra.getPreferredSize());
		panel.add(comboOcena, new GridBagConstraints(1, 8, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, 42), 0, 0));
		comboOcena.setRenderer(new DefaultListCellRenderer() { // https://docs.oracle.com/javase/7/docs/api/javax/swing/DefaultListCellRenderer.html
			@Override // https://tips4java.wordpress.com/2013/11/17/combo-box-with-custom-renderer/
			public Component getListCellRendererComponent(JList<?> jList, Object o, int i, boolean b, boolean b1) {// https://stackoverflow.com/questions/42602405/jcombobox-fill-with-enum-variable-value
				Component rendererComponent = super.getListCellRendererComponent(jList, o, i, b, b1);
				int x = Integer.parseInt(o.toString());
				switch (x) {
				case 6:
					setText("6");
					break;
				case 7:
					setText("7");
					break;
				case 8:
					setText("8");
					break;
				case 9:
					setText("9");
					break;
				case 10:
					setText("10");
					break;
				}
				;
				return rendererComponent;
			}
		});

		JLabel labDatum = new JLabel("Datum*", JLabel.TRAILING);
		panel.add(labDatum, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, -25, -30), 0, 0));
		labDatum.setPreferredSize(new Dimension(170, 18));
		labDatum.setHorizontalAlignment(SwingConstants.LEFT);

		JTextField txtDatum = new JTextField(17);
		listTxt.add(txtDatum);
		// tfAdresa.setPreferredSize(new Dimension(700, 20));
		panel.add(txtDatum, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 20, -25, 37), 0, 0));

		

		UnosOceneDijalog thisDialog = this;

		
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setEnabled(false);
		panel.add(btnPotvrdi, new GridBagConstraints(0, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 75, 0, -7), 0, 0));
		btnPotvrdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Potvrdi btn pritisnut");
				Ocena o = new Ocena(s, p,(int) comboOcena.getSelectedItem() , txtDatum.getText());
				

				if(!BazaStudenata.exists(s.getBroj_indeksa())){
					BazaStudenata.getInstance().getStudenti().add(s);
				}else {
					JOptionPane.showMessageDialog(thisDialog,
						    "Student sa tim indeksom vec postoji.",
						    "Greska",
						    JOptionPane.ERROR_MESSAGE);
				}

				for (Student stud : BazaStudenata.getInstance().getStudenti()) {
					System.out.println(stud);
				}
				
				MainFrame.getInstance().prikaziTabeluStudenata();
			}
		});

		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani, new GridBagConstraints(1, 10, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 25, 0, 75), 0, 0));
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
	}
}