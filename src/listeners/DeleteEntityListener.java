package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.PredmetiController;
import controller.ProfesoriController;
import controller.StudentController;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenata;
import model.Predmet;
import model.Profesor;
import model.Student;
import view.MainFrame;
import view.TabbedPane;

public class DeleteEntityListener implements ActionListener {

	private JFrame parent;
	private TabbedPane tab;
	
	public DeleteEntityListener(JFrame parent, TabbedPane tab) {
		super();
		this.parent = parent;
		this.tab = tab;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int reply;
		switch (tab.getTab().getSelectedIndex()) {
		case 0:
			if(tab.getStudenti().getSelectedRow() >= 0) {
				reply = -1;
				if (!MainFrame.isEmpty(tab.getStudenti())) {
					reply = JOptionPane.showConfirmDialog(parent, "Da li ste sigurni da zelite da obrisete studenta?", "Potvrda", JOptionPane.YES_NO_OPTION);
				}
				if(reply == JOptionPane.YES_OPTION) {
					for (Student s : BazaStudenata.getInstance().getStudenti()) {
						if (s.getBroj_indeksa().equals(tab.getStudenti().getValueAt(tab.getStudenti().getSelectedRow(), 0))) {
							StudentController.getInstance().obrisiStudenta(s);
							tab.getStudenti().setRowSorter(null);
							break;
						}
					}
				}
			}
			
			break;
		case 1:
			if(tab.getProfesori().getSelectedRow() >= 0 ) {
				reply = -1;
				if (!MainFrame.isEmpty(tab.getProfesori())) {
					reply = JOptionPane.showConfirmDialog(parent, "Da li ste sigurni da zelite da obrisete profesora?", "Potvrda", JOptionPane.YES_NO_OPTION);
				}
				if(reply == JOptionPane.YES_OPTION) {
					for (Profesor p : BazaProfesora.getInstance().getProfesori()) {
						if (p.getBroj_lk().equals(tab.getProfesori().getModel().getValueAt(tab.getProfesori().getSelectedRow(), 4))) {
							ProfesoriController.getInstance().obrisiProf(p);
							break;
						}
					}
				}
			}
			break;
			
		case 2:
			if(tab.getPredmeti().getSelectedRow() >= 0 ) {
				reply = -1;
				if (!MainFrame.isEmpty(tab.getPredmeti())) {
					reply = JOptionPane.showConfirmDialog(parent, "Da li ste sigurni da zelite da obrisete predmet?", "Potvrda", JOptionPane.YES_NO_OPTION);
				}
				if(reply == JOptionPane.YES_OPTION) {
					for (Predmet p : BazaPredmeta.getInstance().getPredmeti()) {
						if (p.getSifra().equals(tab.getPredmeti().getValueAt(tab.getPredmeti().getSelectedRow(), 0))) {
							PredmetiController.getInstance().obrisiPredmet(p);
							break;
						}
					}
				}
			}
			break;
			
			
		default:
			System.out.println("Tab koji ste izabrali ne postoji.");
		}

	}

}
