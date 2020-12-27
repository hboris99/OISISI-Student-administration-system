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
		JTextArea darkoBioImpl = new JTextArea("Boris Horvat je rođen u Novom Sadu 23.08.1999 godine,\n"
				+ "kao mali interesuje se za engleski jezik kao i za umetnost,\n upisuje OŠ Žarko Zrenanjin, i završava kao vukovac."
				+ "Posle\n završene osnovne škole upisuje Gimnaziju Jovan Jovanović \nZmaj, gde kao �?lan hora osvaja razne nagrade na međunarodnim \ntakmi�?enjima"
				+ ", u �?etvrtom razredu paralelno upisuje i srednju\n muzi�?ku školu, odsek za solo pevanje. Nakon završene srednje\n škole upisuje "
				+ "FTN odsek Ra�?unarstvo i Automatika, koji i dan danas pohađa, u \nmeđuvremenu upisuje i srednju muzi�?ku školu za solo pevanje. ");
		
		gbc.gridx=2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		darkoBioImpl.setFont(darkoBioImpl.getFont().deriveFont((float) 16.0));
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
		JTextArea borisBioImpl = new JTextArea("Boris Horvat je rođen u Novom Sadu 23.08.1999 godine,\n"
				+ "kao mali interesuje se za engleski jezik kao i za umetnost,\n upisuje OŠ Žarko Zrenanjin, i završava kao vukovac."
				+ "Posle\n završene osnovne škole upisuje Gimnaziju Jovan Jovanović \nZmaj, gde kao �?lan hora osvaja razne nagrade na međunarodnim \ntakmi�?enjima"
				+ ", u �?etvrtom razredu paralelno upisuje i srednju\n muzi�?ku školu, odsek za solo pevanje. Nakon završene srednje\n škole upisuje "
				+ "FTN odsek Ra�?unarstvo i Automatika, koji i dan danas pohađa, u \nmeđuvremenu upisuje i srednju muzi�?ku školu za solo pevanje. ");
		
		gbc.gridx=1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		borisBioImpl.setFont(borisBioImpl.getFont().deriveFont((float) 16.0));
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
