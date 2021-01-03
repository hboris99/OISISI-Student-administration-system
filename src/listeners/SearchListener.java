package listeners;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import view.MainFrame;
import view.TabbedPane;

public class SearchListener implements ActionListener {
	private JFrame parent;
	public TabbedPane tab;
	private JTextField query;
	public SearchListener(JFrame parent, TabbedPane tab, JTextField txt) {
		super();
		this.parent = parent;
		this.tab = tab;
		this.query = txt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(tab.getTab().getSelectedIndex()) {
		case 0:
			break;
		case 1:
			  String[] delovi = query.getText().split("\\s");
			  
			  TableRowSorter<TableModel> profSorter	= new TableRowSorter<>(tab.getProfesori().getModel());
			  tab.getProfesori().setRowSorter(profSorter);
			  if(query.getText().trim().length() == 0) {
				  profSorter.setRowFilter(null);
			  }else {
				  if(delovi.length == 2) {
				  List<RowFilter<Object, Object>> filteri = new ArrayList<RowFilter<Object, Object>>(2);
				  filteri.add(RowFilter.regexFilter(delovi[0]));
				  filteri.add(RowFilter.regexFilter(delovi[1]));
				  RowFilter<Object, Object> profesorFilter = RowFilter.andFilter(filteri);
				  profSorter.setRowFilter(profesorFilter);
				  }else {
					  profSorter.setRowFilter(RowFilter.regexFilter("(?i)" + query.getText()));
				  }
			  }
				MainFrame.getInstance().prikaziTabeluProfesora();
				break;
		case 2:
			 TableRowSorter<TableModel> predmetiSorter	= new TableRowSorter<>(tab.getPredmeti().getModel());
			  tab.getProfesori().setRowSorter(predmetiSorter);
			  if(query.getText().trim().length() == 0) {
				  predmetiSorter.setRowFilter(null);
			  }else {
				  predmetiSorter.setRowFilter(RowFilter.regexFilter("(?i)" + query.getText()));

			  }

		}
		
	}
}
