package paket;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class TabbedPane extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tab;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public TabbedPane() {
			super(new GridLayout(1,1));
			
			JTabbedPane tabbedPane = new JTabbedPane();
			
			String stud[] = {"Indeks","Ime", "Prezime", "Godina Studija", "Status", "Prosek"};
			DefaultTableModel model2 = new DefaultTableModel(stud, 0);
			JTable tabela2 = new JTable(model2);
			JScrollPane sp2=new JScrollPane(tabela2);
			tabbedPane.addTab("Student",sp2);
			String prof[] = {"Ime", "Prezime", "Titula", "Zvanje"};
			DefaultTableModel model = new DefaultTableModel(prof, 0);
			JTable tabela1 = new JTable(model);
			JScrollPane sp =new JScrollPane(tabela1);
			tabbedPane.addTab("Profesor",sp);
			
			
			tab = tabbedPane;
			add(tab);
			
			//http://www.java2s.com/Tutorials/Java/Swing_How_to/JTabbedPane/Tell_if_the_tab_that_is_the_active_tab_in_JTabbedPane.htm
			
			
			
			
		}
	
		public JTabbedPane getTab() {
			return tab;
		}
		public void setTab(JTabbedPane tab) {
			this.tab = tab;
		}
	
		
		
	}


