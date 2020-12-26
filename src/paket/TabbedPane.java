package paket;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class TabbedPane extends JPanel {
		public TabbedPane() {
			super(new GridLayout(1,1));
			
			JTabbedPane tabbedPane = new JTabbedPane();
			
			/*String stud[] = {"Indeks","Ime", "Prezime", "Godina Studija", "Status", "Prosek"};
			DefaultTableModel model2 = new DefaultTableModel(stud, 0);
			JTable tabela2 = new JTable(model2);
			JScrollPane sp2=new JScrollPane(tabela2);
			tabbedPane.addTab("Student",sp2);*/
			String prof[] = {"Ime", "Prezime", "Titula", "Zvanje"};
			DefaultTableModel model = new DefaultTableModel(prof, 0);
			JTable tabela1 = new JTable(model);
			JScrollPane sp =new JScrollPane(tabela1);
			tabbedPane.addTab("Profesor",sp);
			
			
			add(tabbedPane);
			
			
			
		}
		
	}


