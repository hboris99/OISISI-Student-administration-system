package paket;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class StatusBar extends JPanel {
	
	public StatusBar() {
		
	   setBorder(new CompoundBorder(new LineBorder(Color.DARK_GRAY),
	        new EmptyBorder(-1, 3, -1, 20)));
	    JLabel labelLeft = new JLabel("Studentska služba");
	    JLabel labelRight = new JLabel("datum");
	    new CurrentTime(labelRight);
	      
	    setLayout(new BorderLayout());
	    add(labelLeft,BorderLayout.WEST);
	    add(labelRight, BorderLayout.EAST);
	}
	
	
}
