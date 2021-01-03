package controller;

import model.BazaProfesora;
import model.Predmet;
import model.Profesor.Titula;
import model.Profesor.Zvanje;

public class ProfesoriController {
	
	private static ProfesoriController instance = null;
	
	private ProfesoriController() {} 
	
	public static ProfesoriController getInstance(){
		
        if (instance == null) 
            instance = new ProfesoriController(); 
  
        return instance; 
	}
	
	public void dodajProf(String prezime, String ime, String datum_rodjenja,	String adresa_stanovanja,String telefon,String email,String adresa_kancelarije,
			String broj_lk,Titula titula,Zvanje zvanje,Predmet[] predmeti_radi) {
		BazaProfesora.getInstance().dodajProfesora(prezime, ime, datum_rodjenja,adresa_stanovanja, telefon,email,adresa_kancelarije,
													broj_lk,titula, zvanje,predmeti_radi);
	}
	
	public void obrisiProf(int rowSelectedIndex) {
		//Profesor prof = BazaProfesora.getInstance().getRow(rowSelectedIndex);
		//BazaProfesora.getInstance().izbrisiProfesora(prof.getBroj_lk());
	}
	
	
	
}
