package view;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HelpDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HelpDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		//this.setLayout(new GridBagLayout());
        //GridBagConstraints gbc = new GridBagConstraints();
		JPanel panel = new JPanel();
       // gbc.insets = new Insets(0, 0, 0, 0);
		setSize(1280, 720);	
		setLocationRelativeTo(parent);
		
		JTextArea info = new JTextArea("Do sada je implementirana funkcionalnost dodavanja studenta i profesora\n"
				+ "Kao i određeni dijalozi koji omogućavaju iste. Dodat je tool bar i meni bar,\n kao i status bar i tabbed pane u glavnom prozoružn"
				+ "Odgovarajuci akceleratori tj menmonici su\n"
				+ "MNEMONICI:\n "
				+ "ALT + F - otvaranje file menija, nakon otvaranja file menija ALT + N otvara dijalog za novog studenta,\n takođe su dodati menmonici za zatvaranje ALT + C (koji trenutno nemaju nikakvu funkcionalnost)\n"
				+ " ALT + E - otvaranje edit menija, nakon otvaranja edit menija ALT + E - edit ALT + D - delete, \n"
				+ " ALT + H - otvaranje help menija, nakon otvaranja help menija ALT + H otvara help dijalog, \nALT + A otvara about dijalog\n"
				+ "AKCELERATORI:\n"
				+ "Dodavanje entiteta - CTRL + N, Zatvaranje - CTRL + C, Editovanje entiteta - CTRL + E,\n Brisanje entiteta - CTRL + D, Otvaranje help-a CTRL + H, Otvaranje about-a CTRL+A\n"
				+ "Sve funkcionalnosti potupno implementirane, Dodavanje studenta, profesora ili predmeta se moze dodati klikom na + dugme\n ili pozicioniranjem na file/new  ili koriscenjem jednog od navedenih mnemonika/akceleratora\n"
				+ "Polja se moraju puniti alfanumerickim ili specijalnim latinicnim karakterima ili cirilicnim\n"
				+ "Format datum studenta je dd.mm.yyyy dok je format datuma rodjenja profesora dd.mm.yyyy.\n"
				+ "Id predmeta i indeks nema nikakvo formatiranje,\n dok broj licne karte mora biti 9 brojeva i mora biti jednistven kao i indeks!\n"
				+ "Adresa stanovanja je formata Ulica broj, Grad, kao i adresa ulice dok godina studiranja mora biti veci od 1900\n"
				+ "Prilikom dodavanja predemta nije potrebno navesti naziv profesora nego se posle dodaje\n"
				+ "Pritiskom na dugme sa olovkom moze da se izmeni bilo koji entitet sistema\n"
				+ "Na tabovima info nalaze se informacije o selektovanom entitetu koji se moze menjati\n"
				+ "shodno pravilima nevedenim u delu koji opisuje dodavanje entiteta\n"
				+ "Pre brisanja i editovanja entiteta mora da se selektuje entitet u tabeli\n"
				+ "Dijalog za edit studenta sadrzi jos dva taba u tabu polozeni nalaze se polozeni ispiti kao i prosek studenta i ukupni broj espb bodova u donjem desnom uglu\n"
				+ "Klikom na dugme ponisti ocenu i selektovanjem predmeta/ocene ponistava se ocena\n"
				+ "Tab nepolozeni sadrzi tri dugmeta i tabelu nepolozenih ispita, dugme obrisi brise selektovan predmet\n"
				+ "Klikom na upis ocene otvara se novi dijalog gde se dodaje ocena i datum mora biti formata dd.mm.yyyy.\n"
				+ "Klikom na dodavanje predmeta otvara se novi dijalog koji sadrzi sve predmete koje student moze da pohadja\n"
				+ "Selektovanjem predmeta i klikom na dugme potvrdi dodaje se u tabelu nepolozenih ispita studenta\n"
				+ "Drugi tab dijalog menjanja profesora je tab predaje u kome se nalaze svi predmeti koje predaje\n"
				+ "pored toga klikom na dugme obrisi brise se selektovani predmet a klikom na dugme dodaj otvara se\n"
				+ "novi dijalog u kome se nalazi lista svih predmeta i odabirom odredjenog predmet i klikom na dugme dodaj\n"
				+ "Taj predmet se dodaje profesor. Dijalog za izmenu predmeta pored informacija o samom predmetu\n"
				+ "sadrzi i polje u koje se unosi profesor klikom na + dugume otvara se lista iz koje moze da se izabere profesor\n"
				+ "i doda predmetu, dugme nije moguce kliknuti ako vec postoji profesor, suprotno klikom na minus dugme profesor se brise\n"
				+ "pored ovih dugmadi postoji i polje za unos i dugme za pretragu. Pretraga studenta se vrsi po broju indeksa, pored broja indeksa moze se dodati i ime i prezime\n"
				+ "Profesor se trazi samo po imenu ili samo po imenu i prezimenu a predmet samo po imenu. Moguce je sortiranje svih tabela po svim kolonama klikom na odgovarajuce zaglavlje.\n"
				+ "Odgovarajucim akceleratorima odnosno menmonicima otvaraju se help dijalog i about dijalog koji sadrze informacije o programu i kreatorima respektivno\n"
				+ "Osim ovoga na samom dnu programa nalazi se statusna linija koja sapostava trenutno vreme.");
		info.setFont(info.getFont().deriveFont((float) 13.0));
		
		info.setBackground(this.getBackground());
		panel.add(info);
		JScrollPane scp = new JScrollPane(panel);

			add(scp);
	}
}
