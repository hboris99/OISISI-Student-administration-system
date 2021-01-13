package view;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JTextArea;

public class HelpDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HelpDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
		

        gbc.insets = new Insets(1, 0, 0, 0);
		setSize(1280, 720);	
		setLocationRelativeTo(parent);

		JTextArea info = new JTextArea("Do sada je implementirana funkcionalnost dodavanja studenta i profesora\n"
				+ "Kao i određeni dijalozi koji omogućavaju iste. Dodat je tool bar i meni bar,\n kao i status bar i tabbed pane u glavnom prozoružn"
				+ "Odgovarajuci akceleratori tj menmonici su\n"
				+ "MNEMONICI:\n "
				+ "ALT + F - otvaranje file menija, nakon otvaranja file menija ALT + N otvara dijalog za novog studenta,\n takođe su dodati menmonici za zatvaranje ALT + C (koji trenutno nemaju nikakvu funkcionalnost)\n"
				+ " ALT + E - otvaranje edit menija, nakon otvaranja edit menija ALT + E - edit ALT + D - delete, \ndijalozi nisu implementirani ali mnemonici su tu\n"
				+ " ALT + H - otvaranje help menija, nakon otvaranja help menija ALT + H otvara help dijalog, \nALT + A otvara about dijalog\n"
				+ "AKCELERATORI:\n"
				+ "Dodavanje entiteta - CTRL + N, Zatvaranje - CTRL + C, Editovanje entiteta - CTRL + E,\n Brisanje entiteta - CTRL + D, Otvaranje help-a CTRL + H, Otvaranje about-a CTRL+A\n"
				+ "Sve funkcionalnosti potupno implementirane, Dodavanje/Izmena/Brisanje svih entiteta sistema, dodavanje\n predmeta ocenivanje prikaz polozenih tj ne polozenih ispita nakon sto se student doda na isti \ndodavanje predmeta profesoru..");
		info.setFont(info.getFont().deriveFont((float) 25.0));

		info.setBackground(this.getBackground());

			add(info,gbc);
	}
}
