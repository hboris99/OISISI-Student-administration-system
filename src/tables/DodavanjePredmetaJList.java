package tables;

import java.util.ArrayList;

import javax.swing.JList;

import model.BazaPredmeta;
import model.Ocena;
import model.Predmet;
import model.Student;

public class DodavanjePredmetaJList extends JList<Predmet>{

	private static final long serialVersionUID = 561208091453062211L;
	ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
	Student student;
	
	public DodavanjePredmetaJList(Student s) {
		student = s;
		inicijalizujListu();
	
	}
	
	public void inicijalizujListu() {
		boolean found;
		for(Predmet p: BazaPredmeta.getInstance().getPredmeti()) {
			if(student.getGodina_studija() < p.getGodina_studija()) 
				continue;
			found = false;
			for(Ocena o: student.getNepolozeni()) {
				if(o.getPredmet() == p) {
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
		
	}
	


}
