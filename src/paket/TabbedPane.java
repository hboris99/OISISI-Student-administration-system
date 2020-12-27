package paket;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import view.AbstractTableModelStudenti;


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
	private JTable tabela1; 

	private TabbedPane() {
			super(new GridLayout(1,1));
			
			JTabbedPane tabbedPane = new JTabbedPane();
			
			AbstractTableModelStudenti modelStudenti = new AbstractTableModelStudenti();
			JTable tabela2 = new JTable(modelStudenti);
			JScrollPane sp2=new JScrollPane(tabela2);
			tabbedPane.addTab("Student",sp2);

			AbstractTableModelStudenti modelProfesori = new AbstractTableModelStudenti(); // promeniti u profesore!!!
			JTable tabela1 = new JTable(modelProfesori);
			JScrollPane sp =new JScrollPane(tabela1);
			tabbedPane.addTab("Profesor",sp);
		
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
		public void setTab(JTabbedPane tab) {
			this.tab = tab;
		}
		public JTable getTabela1() {
			return tabela1;
		}
		public void setTabela1(JTable tabela1) {
			this.tabela1 = tabela1;
		}
	
		
		
	}


