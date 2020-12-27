package paket;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		this.setLayout(new BorderLayout());
		
		
		

					
		StatusBar sb = new StatusBar();
	    this.add(sb, BorderLayout.SOUTH);
	    

	    
	    TabbedPane tab = new TabbedPane();
	    this.add(tab, BorderLayout.CENTER);
	   
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    int width = (int) ((3*screenSize.getWidth())/4);
	    int height = (int) ((3*screenSize.getHeight())/4);
	    setSize(width,height);
	    setTitle("Studentska služba");
	    setResizable(true);
	    
		MenuBar mb = new MenuBar(this,tab);
		this.setJMenuBar(mb);
	    Toolbar tb = new Toolbar(this,tab);
	    add(tb,BorderLayout.NORTH);
	    
	    
	    
	    
	}
}
