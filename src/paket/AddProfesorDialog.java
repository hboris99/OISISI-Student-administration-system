package paket;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AddProfesorDialog extends JDialog {
	public AddProfesorDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		
		boolean[] nizBool = new boolean[8];
		Arrays.fill(nizBool, Boolean.TRUE);
		for(int i = 0; i<8; i++) {
			System.out.println(nizBool[i]);
		}
		
		setSize(450, 500);
		setLocationRelativeTo(parent);
			
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		add(panel);
		
		JLabel labIme = new JLabel("Ime*", JLabel.TRAILING);
		panel.add(labIme, new GridBagConstraints( 0, 0, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labIme.setPreferredSize(new Dimension(170,18));
		labIme.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfIme = new JTextField(17);
		//tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfIme, new GridBagConstraints( 1, 0, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labPrezime = new JLabel("Prezime*", JLabel.TRAILING);
		panel.add(labPrezime, new GridBagConstraints( 0, 1, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labPrezime.setPreferredSize(new Dimension(170,18));
		labPrezime.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfPrezime = new JTextField(17);
		//tfIme.setPreferredSize(new Dimension(70, 20));
		panel.add(tfPrezime, new GridBagConstraints( 1, 1, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		    
		JLabel labDatRodj = new JLabel("Datum rodjenja*", JLabel.TRAILING);
		panel.add(labDatRodj, new GridBagConstraints( 0, 2, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labDatRodj.setPreferredSize(new Dimension(170,18));
		labDatRodj.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfDatRodj = new JTextField(17);
		//tfDatRodj.setPreferredSize(new Dimension(70, 20));
		panel.add(tfDatRodj, new GridBagConstraints( 1, 2, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labAdresa = new JLabel("Adresa stanovanja*", JLabel.TRAILING);
		panel.add(labAdresa, new GridBagConstraints( 0, 3, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labAdresa.setPreferredSize(new Dimension(170,18));
		labAdresa.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfAdresa = new JTextField(17);
		//tfAdresa.setPreferredSize(new Dimension(700, 20));
		panel.add(tfAdresa, new GridBagConstraints( 1, 3, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labBrTel = new JLabel("Broj telefona*", JLabel.TRAILING);
		panel.add(labBrTel, new GridBagConstraints( 0, 4, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labBrTel.setPreferredSize(new Dimension(170,18));
		labBrTel.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfBrTel = new JTextField(17);
		//tfBrTel.setPreferredSize(new Dimension(700, 20));
		panel.add(tfBrTel, new GridBagConstraints( 1, 4, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labEmail = new JLabel("E-mail adresa*", JLabel.TRAILING);
		panel.add(labEmail, new GridBagConstraints( 0, 5, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labEmail.setPreferredSize(new Dimension(170,18));
		labEmail.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfEmail = new JTextField(17);
		//tfEmail.setPreferredSize(new Dimension(700, 20));
		panel.add(tfEmail, new GridBagConstraints( 1, 5, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		
		JLabel labadrKanc = new JLabel("Adresa kancelarije*", JLabel.TRAILING);
		panel.add(labadrKanc, new GridBagConstraints( 0, 6, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labadrKanc.setPreferredSize(new Dimension(170,18));
		labadrKanc.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfadrKanc = new JTextField(17);
		//tfBrIndeks.setPreferredSize(new Dimension(70, 20));
		panel.add(tfadrKanc, new GridBagConstraints( 1, 6, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labbrLK = new JLabel("Godina upisa*", JLabel.TRAILING);
		panel.add(labbrLK, new GridBagConstraints( 0, 7, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labbrLK.setPreferredSize(new Dimension(170,18));
		labbrLK.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfbrLK = new JTextField(17);
		//tfGodinaUpisa.setPreferredSize(new Dimension(70, 20));
		panel.add(tfbrLK, new GridBagConstraints( 1, 7, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labZvanje = new JLabel("Zvanje*", JLabel.TRAILING);
		panel.add(labZvanje, new GridBagConstraints( 0, 8, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labZvanje.setPreferredSize(new Dimension(170,18));
		labZvanje.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfZvanje = new JTextField(17);
		//tfGodinaUpisa.setPreferredSize(new Dimension(70, 20));
		panel.add(tfZvanje, new GridBagConstraints( 1, 8, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
		
		JLabel labTitula = new JLabel("Titula*", JLabel.TRAILING);
		panel.add(labTitula, new GridBagConstraints( 0, 9, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, -25, -30 ), 0, 0 ) );
		labTitula.setPreferredSize(new Dimension(170,18));
		labTitula.setHorizontalAlignment(SwingConstants.LEFT);
		    
		JTextField tfTitula = new JTextField(17);
		//tfGodinaUpisa.setPreferredSize(new Dimension(70, 20));
		panel.add(tfTitula, new GridBagConstraints( 1, 9, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 20, -25, 37 ), 0, 0 ) );
	
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setEnabled(false);
		panel.add(btnPotvrdi, new GridBagConstraints( 0, 10, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 75, 0, -7 ), 0, 0 ) );
		btnPotvrdi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}	
		});
		
		JButton btnOdustani = new JButton("Odustani");
		panel.add(btnOdustani, new GridBagConstraints( 1, 10, 1, 1, 1.0,
		    	  1.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
		    	  new Insets( 0, 25, 0, 75 ), 0, 0 ) );
		
		
		tfIme.addFocusListener(new ImeFocusListener(btnPotvrdi, tfIme, nizBool));
		
		
		for(int i = 0; i<8; i++) {
			System.out.println("\t"+nizBool[i]);
		}
		
	}
}
