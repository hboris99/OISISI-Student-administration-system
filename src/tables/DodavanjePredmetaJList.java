package tables;

import java.util.ArrayList;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

import model.AbstractListModelDodajPredmet;
import model.BazaPredmeta;
import model.Ocena;
import model.Predmet;
import model.Student;
import renderers.PredmetRenderer;

public class DodavanjePredmetaJList extends JList<Predmet>{

	private static final long serialVersionUID = 561208091453062211L;
	ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
	Student student;
	
	public DodavanjePredmetaJList(Student s) {
		student = s;
		inicijalizujListu();
		setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
	}
	
	public void inicijalizujListu() {
		boolean found;
		for(Predmet p: BazaPredmeta.getInstance().getPredmeti()) {
			if(student.getGodina_studija() < p.getGodina_studija()) 
				continue;
			found = false;
			for(Predmet p2: student.getNepolozeni()) {
				if(p2 == p) {
					found = true;
					break;
				}
			}
			for(Ocena o: student.getPolozeni()) {
				if(o.getPredmet() == p) {
					found = true;
					break;
				}
			}
			
			
			if(found == false) predmeti.add(p);
		}
		
		AbstractListModelDodajPredmet listModel = new AbstractListModelDodajPredmet(predmeti);
		setModel(listModel);
		
		setCellRenderer(new PredmetRenderer());
		
		setVisible(true);
		
	}
	
}
