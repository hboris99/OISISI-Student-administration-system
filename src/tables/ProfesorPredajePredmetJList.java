package tables;

import java.util.ArrayList;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

import abstractTableModel.AbstractListModelDodajPredmet;
import model.BazaPredmeta;
import model.Predmet;
import model.Profesor;
import renderers.PredmetRenderer;

public class ProfesorPredajePredmetJList extends JList<Predmet> {

	private static final long serialVersionUID = 1L;
	ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
	Profesor profi;
	public ProfesorPredajePredmetJList(Profesor p) {
		profi = p;
		inicijalizujListu();
		setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
	}
	private void inicijalizujListu() {
		boolean predaje; 
		for(Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
			predaje = false;
			for(Predmet p2 : profi.getPredmeti_radi()) {
				if(p2 == p) {
					predaje = true;
					break;
				}
			}
			if(predaje == false) predmeti.add(p);
		}
		
		AbstractListModelDodajPredmet list = new AbstractListModelDodajPredmet(predmeti);
		setModel(list);
		
		setCellRenderer(new PredmetRenderer());
		setVisible(true);
	}
	
}
