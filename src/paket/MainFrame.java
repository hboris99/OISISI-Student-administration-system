package paket;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		this.setLayout(new BorderLayout());
		
		MenuBar mb = new MenuBar();
		this.setJMenuBar(mb);
					
		StatusBar sb = new StatusBar();
	    this.add(sb, BorderLayout.SOUTH);
	    
	
	}
}
