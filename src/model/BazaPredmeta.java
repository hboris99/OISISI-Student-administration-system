package model;

import java.util.ArrayList;
import java.util.List;

public final class BazaPredmeta {
	private static BazaPredmeta instance = null;
	private List<Predmet> predmeti = new ArrayList<Predmet>();
	private List<String> kolone;

	private BazaPredmeta() {
		this.kolone = new ArrayList<String>();
		this.kolone.add("SIFRA");
		this.kolone.add("NAZIV");
		this.kolone.add("BROJ ESPB BODOVA");
		this.kolone.add("GODINA NA KOJOJ SE IZVODI");
		this.kolone.add("SEMESTAR");
	}
	
	public static BazaPredmeta getInstance() {
		if(instance == null)
			instance = new BazaPredmeta();
		return instance;
	}

	
	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public int getColumnCount() {
		return 5;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	
	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Predmet predmet = this.predmeti.get(row);
		switch (column) {
		case 0:
			return predmet.getSifra();
		case 1:
			return predmet.getNaziv();
		case 2:
			return String.valueOf(predmet.getEspb());
		case 3:
			return String.valueOf(predmet.getGodina_studija());
		case 4:
			if(predmet.getSemestar() == Predmet.enumSemestar.LETNJI) {
				return "Letnji";
			}else {
				return "Zimski";
				
			}
		
		default:
			return null;
		}
	}
	public void izbrisiPredmet(String naziv) {
		for (Predmet i : predmeti) {
			if (i.getNaziv() == naziv) {
				predmeti.remove(i);
				break;
			}
		}
	}
	
}


