package paket;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class StatusBar {

	public StatusBar() {
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    statusBar.setBorder(new CompoundBorder(new LineBorder(Color.DARK_GRAY),
	        new EmptyBorder(4, 4, 4, 4)));
	    final JLabel status = new JLabel();
	    statusBar.add(status);

	    JLabel content = new JLabel("Content in the middle");
	    content.setHorizontalAlignment(JLabel.CENTER);
	    
	}
}
