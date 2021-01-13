package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTable;

import abstractTableModel.AbstractTableModelStudenti;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private static MainFrame instance = null;
	
	private JTable tabelaStudenata;
	private JTable tabelaProfesora;
	private JTable tabelaPredmeta;

	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}

	private MainFrame() {

		this.setLayout(new BorderLayout());

		StatusBar sb = new StatusBar();
		this.add(sb, BorderLayout.SOUTH);

		TabbedPane tab = TabbedPane.getInstance();
		this.add(tab, BorderLayout.CENTER);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) ((3 * screenSize.getWidth()) / 4);
		int height = (int) ((3 * screenSize.getHeight()) / 4);
		setSize(width, height);
		setTitle("Studentska služba");
		setResizable(true);
		MenuBar mb = new MenuBar(this, tab);
		this.setJMenuBar(mb);
		Toolbar tb = new Toolbar(this, tab);
		add(tb, BorderLayout.NORTH);
		
		prikaziTabeluStudenata();

	}
	
	public void azurirajPrikaz(String akcija, int vrednost) {
		
		AbstractTableModelStudenti model = (AbstractTableModelStudenti) tabelaStudenata.getModel();
		// azuriranje modela tabele, kao i njenog prikaza
		model.fireTableDataChanged();
		validate();
	}
	
	public void prikaziTabeluPredmeta() {
		tabelaPredmeta = new PredmetiJTable();
		TabbedPane tab = TabbedPane.getInstance();
		add(tab);
		this.azurirajPrikaz(null, -1);

	}
	
	public void prikaziTabeluProfesora() {
		tabelaProfesora = new ProfesoriJTable();
		TabbedPane tab = TabbedPane.getInstance();
		add(tab);
		this.azurirajPrikaz(null, -1);

	}
	
	public void prikaziTabeluStudenata() {
		tabelaStudenata = new StudentiJTable();
		TabbedPane tab = TabbedPane.getInstance();
		add(tab);
		this.azurirajPrikaz(null, -1);
	}
	
	public static boolean isEmpty(JTable table) {
		if (table != null && table.getModel() != null) {
			return table.getModel().getRowCount() <= 0 ? true : false;
		}
		return false;
	}
}
