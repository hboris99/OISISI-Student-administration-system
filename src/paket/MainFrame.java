package paket;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		MenuBar mb = new MenuBar();
		this.setJMenuBar(mb);
		
		JPanel statusBar = new JPanel();
	    statusBar.setBorder(new CompoundBorder(new LineBorder(Color.DARK_GRAY),
	        new EmptyBorder(-1, 3, -1, 20)));
	    JLabel status = new JLabel("Studentska služba");
	    
	    JLabel date = new JLabel("datum");
	    CurrentTime ct = new CurrentTime(date);
	      
	    statusBar.setLayout(new BorderLayout());
	    statusBar.add(status, BorderLayout.WEST);
	    statusBar.add(date, BorderLayout.EAST);
	    this.add(statusBar);
	    
	    this.setLayout(new BorderLayout());
	    this.add(statusBar, BorderLayout.SOUTH);
	    
	
	}
}
