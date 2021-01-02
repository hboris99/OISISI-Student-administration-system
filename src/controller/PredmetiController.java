package controller;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor.Titula;
import model.Profesor.Zvanje;

public class PredmetiController {
	
	private static PredmetiController instance = null;
	
	private PredmetiController() {} 
	
	public static PredmetiController getInstance(){
		
        if (instance == null) 
            instance = new PredmetiController(); 
  
        return instance; 
	}
	
	public void dodajPredmet() {
	}
	
	public void obrisiPredmet(int rowSelectedIndex) {
		Predmet pred = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
		BazaPredmeta.getInstance().izbrisiPredmet(pred.getNaziv());
	}
}
