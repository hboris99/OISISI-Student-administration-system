package controller;

import model.BazaPredmeta;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor.Titula;
import model.Profesor.Zvanje;
import view.MainFrame;

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
	
	public void obrisiPredmet(Predmet predmet) {
		BazaPredmeta.getInstance().getPredmeti().remove(predmet);
		MainFrame.getInstance().prikaziTabeluPredmeta();
	}
}
