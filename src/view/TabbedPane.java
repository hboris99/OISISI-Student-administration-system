package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import abstractTableModel.AbstractTableModelPredmeti;
import abstractTableModel.AbstractTableModelProfesori;
import abstractTableModel.AbstractTableModelStudenti;


public class TabbedPane extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static TabbedPane instance = null;

	public static TabbedPane getInstance() {
		if (instance == null) {
			instance = new TabbedPane();
		}
		return instance;
	}
	
	private JTabbedPane tab;
	private JTable studenti; 
	private JTable profesori; 
	private JTable predmeti; 
	

	private TabbedPane() {
			super(new GridLayout(1,1));
			
			JTabbedPane tabbedPane = new JTabbedPane();
			
			AbstractTableModelStudenti modelStudenti = new AbstractTableModelStudenti();
			studenti = new JTable(modelStudenti);
			JScrollPane sp2=new JScrollPane(studenti);
			tabbedPane.addTab("Student",sp2);

			AbstractTableModelProfesori modelProfesori = new AbstractTableModelProfesori(); 
			profesori = new JTable(modelProfesori);
			TableColumnModel idTcm = profesori.getColumnModel();
			idTcm.removeColumn(idTcm.getColumn(4));
			//profesoriSorter = new TableRowSorter<TableModel>();
			//profesori.setRowSorter(profesoriSorter);
			JScrollPane sp =new JScrollPane(profesori);
			tabbedPane.addTab("Profesor",sp);
		
			AbstractTableModelPredmeti modelPredmeti = new AbstractTableModelPredmeti();
			predmeti = new JTable(modelPredmeti);
			//predmetiSorter = new TableRowSorter<TableModel>();
			//predmeti.setRowSorter(predmetiSorter);
			JScrollPane sp3 = new JScrollPane(predmeti);
			tabbedPane.addTab("Predmeti", sp3);
			
			tab = tabbedPane;
			add(tab);
			
			//http://www.java2s.com/Tutorials/Java/Swing_How_to/JTabbedPane/Tell_if_the_tab_that_is_the_active_tab_in_JTabbedPane.htm
			
			
			tabbedPane.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					//MainFrame.getInstance().prikaziTabeluStudenata();		
				}
			});
			
			
		}
	
		public JTabbedPane getTab() {
			return tab;
		}

		public JTable getStudenti() {
			return studenti;
		}

		public void setStudenti(JTable studenti) {
			this.studenti = studenti;
		}

		public JTable getProfesori() {
			return profesori;
		}

		public void setProfesori(JTable profesori) {
			this.profesori = profesori;
		}

		public JTable getPredmeti() {
			return predmeti;
		}

		public void setPredmeti(JTable predmeti) {
			this.predmeti = predmeti;
		}

		
		
	
		
		
	}


