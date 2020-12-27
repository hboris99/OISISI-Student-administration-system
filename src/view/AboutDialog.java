package view;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AboutDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AboutDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(1, 0, 0, 0);
		setSize(1280, 720);
		setLocationRelativeTo(parent);
		JLabel header  = new JLabel("Made by: Darko Panić and Boris Horvat");
		gbc.gridx=1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(header,gbc);
		JLabel darkoBio = new JLabel("Darkova biografija");
		gbc.gridx=2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		darkoBio.setFont(darkoBio.getFont().deriveFont((float) 24.0));
		
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(darkoBio,gbc);
		JTextArea darkoBioImpl = new JTextArea("Darko Panić je rođen u Novom Sadu 07.01.1999. godine.\n"
				+ "Upisuje OŠ J.J.Zmaj. u Srbobranu. Od 7. godine se bavi plivanjem, prvo rekreativno\n"
				+ "a posle i takmičarski. Poslezavršene osnovne škole upisuje srednju elektrotehničku školu\n"
				+ "Mihajlo Pupin u Novom sadu i završava sa vukovom dipolomom. Svoju sportsku karijeru zavrsava\n"
				+ "2017. godine sa osvojenih preko 250 medalja i pehara, štafetnim pionirskim rekordom države\n"
				+ "na 4x100 slobodno i mnoštvom medalja sa državnih takmičenja i takmičenja iz regiona.\n"
				+ "2018. godine upisuje Fakultet tehničkih nauka, smer Računarstvo i automatika\n"
				+ "koji i dan danas pohađa.");
		
		gbc.gridx=2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		darkoBioImpl.setFont(darkoBioImpl.getFont().deriveFont((float) 15.0));
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		darkoBioImpl.setBackground(this.getBackground());
		add(darkoBioImpl,gbc);
		/*ImageIcon borisIcon = new ImageIcon(
				new ImageIcon("images"+ File.separator+ "ab.jpg").getImage().getScaledInstance(550, 370 , Image.SCALE_DEFAULT));
		JLabel borisSlika = new JLabel();
		borisSlika.setIcon(borisIcon);
		gbc.gridx=1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(borisSlika,gbc);*/

		JLabel borisBio = new JLabel("Borisova biografija");
		gbc.gridx=1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		borisBio.setFont(borisBio.getFont().deriveFont((float) 24.0));

		add(borisBio,gbc);
		
		JTextArea borisBioImpl = new JTextArea("Boris Horvat je rođen u Novom Sadu 23.08.1999. godine,"
				+ " kao mali interesuje se\nza engleski jezik kao i za umetnost, upisuje OŠ Žarko Zrenanjin, i završava kao \nvukovac."
				+ "Posle završene osnovne škole upisuje Gimnaziju Jovan Jovanović \nZmaj, gde kao �?lan hora osvaja razne nagrade\n na međunarodnim takmi�?enjima"
				+ ", u �?etvrtom razredu\nparalelno upisuje i srednju muzi�?ku školu, odsek za solo pevanje.\nNakon završene srednje škole upisuje "
				+ "FTN odsek Ra�?unarstvo i Automatika,\n koji i dan danas pohađa, u međuvremenu upisuje i srednju muzi�?ku školu za solo pevanje. ");
		
		gbc.gridx=1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.weightx = 2.0;
		gbc.weighty = 0.0;
		borisBioImpl.setFont(borisBioImpl.getFont().deriveFont((float) 15.0));
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		borisBioImpl.setBackground(this.getBackground());
		add(borisBioImpl,gbc);
		
		
		JLabel appVer = new JLabel("Verzija aplikacije: BETA 1.0.0");

		gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
		gbc.weighty = 0.0;
        add(appVer, gbc);
				
		
	}
	
}
