package model;

import java.util.ArrayList;
import java.util.List;

import model.Profesor.Titula;
import model.Profesor.Zvanje;

public final class BazaProfesora {
	private static BazaProfesora instance = null;
	private List<Profesor> profesori = new ArrayList<Profesor>();
	private List<String> kolone;

	private BazaProfesora() {
		this.kolone = new ArrayList<String>();
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add(" TITULA");
		this.kolone.add("ZVANJE");
	}
	
	public static BazaProfesora getInstance() {
		if(instance == null)
			instance = new BazaProfesora();
		return instance;
	}

	
	public List<Profesor> getProfesori() {
		return profesori;
	}

	public int getColumnCount() {
		return 4;
	}
	public boolean isValid(String brLK) {
		boolean valid = true;
		int i = 0;
		for(Profesor p : profesori) {
			
			if(p.getBroj_lk().equals(brLK)) {
				valid = false;
				break;
			}
			else {
				valid = true;
			}
		}
		return valid;
		
	}
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}
	public String getValueAt(int row, int column) {
		Profesor profesor = this.profesori.get(row);
		switch (column) {
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2:
			if(profesor.getTitula() == Profesor.Titula.BSC) {
				return "Bsc";
			}
			else if (profesor.getTitula() == Profesor.Titula.DR) {
				return "Dr";
			}
			else if (profesor.getTitula() == Profesor.Titula.MR){
				
				return "Mr";
			}else if (profesor.getTitula() == Profesor.Titula.MSC){
				
				return "Msc";
			}else {
				return "Prof Dr.";
			}
		case 3:
			if(profesor.getZvanje() == Profesor.Zvanje.AS) {
				return "Asistent";
			}else if(profesor.getZvanje() == Profesor.Zvanje.ASD) {
				return "Asistent sa doktoratom";
				
			}else if(profesor.getZvanje() == Profesor.Zvanje.DOC) {
				return "Docent";
				
			}else if(profesor.getZvanje() == Profesor.Zvanje.SUN) {
				return "Saradnik u nastavi";
				
			}else if(profesor.getZvanje() == Profesor.Zvanje.PROFEM) {
				return "Profesor emeratius";
				
			}else if(profesor.getZvanje() == Profesor.Zvanje.REDPROF) {
				return "Redovan profesor";
				
			}else {
				return "Vandredni profesor";
			}
		
		default:
			return null;
		}
	}
	
	public void dodajProfesora(String prezime, String ime, String datum_rodjenja,	String adresa_stanovanja,String telefon,String email,String adresa_kancelarije,
			String broj_lk,Titula titula,Zvanje zvanje,Predmet[] predmeti_radi) {
		this.profesori.add(new Profesor(prezime, ime, datum_rodjenja,adresa_stanovanja, telefon,email,adresa_kancelarije,
				broj_lk,titula, zvanje,predmeti_radi));
	}
	
	public void izbrisiProfesora(String licna) {
		//for (Profesor i : profesori) {
			//if (i.getBroj_lk() == licna) {
				//profesori.remove(i);
			//	break;
			//}
		//}
	}
	
}



