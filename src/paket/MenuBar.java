package paket;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MenuBar() {
		
		JMenu file = new JMenu("File");
		
		JMenuItem miNew = new JMenuItem("New",'N');
		ImageIcon plus_icon = new ImageIcon(new ImageIcon("images/plus_icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miNew.setIcon(plus_icon);
		miNew.setAccelerator(KeyStroke.getKeyStroke("control N"));
		miNew.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        System.out.println("miNew performed");
		      }
		});

		JMenuItem miClose = new JMenuItem("Close",'C');
		ImageIcon x_icon = new ImageIcon(new ImageIcon("images/x_icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miClose.setIcon(x_icon);
		miClose.setAccelerator(KeyStroke.getKeyStroke("control C"));
		miClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("miClose performed");
			}
		});
		
		file.add(miNew);
		file.addSeparator();
		file.add(miClose);
	
		JMenu edit = new JMenu("Edit");
		
		JMenuItem miEdit = new JMenuItem("Edit", 'E');
		ImageIcon edit_icon = new ImageIcon(new ImageIcon("images/edit_icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miEdit.setIcon(edit_icon);
		miEdit.setAccelerator(KeyStroke.getKeyStroke("control E"));
		miEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("miEdit performed");
			}
		});
		
		JMenuItem miDelete = new JMenuItem("Delete", 'D');
		ImageIcon delete_icon = new ImageIcon(new ImageIcon("images/delete_icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miDelete.setIcon(delete_icon);
		miDelete.setAccelerator(KeyStroke.getKeyStroke("control D"));
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		JMenu help = new JMenu("Help");
		
		JMenuItem miHelp = new JMenuItem("Help", 'H');	
		ImageIcon help_icon = new ImageIcon(new ImageIcon("images/help_icon.png").getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT));
		miHelp.setIcon(help_icon);
		miHelp.setAccelerator(KeyStroke.getKeyStroke("control H"));
		
		JMenuItem miAbout = new JMenuItem("About", 'A');
		ImageIcon about_icon = new ImageIcon(new ImageIcon("images/about_icon.png").getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT));
		miAbout.setIcon(about_icon);
		miAbout.setAccelerator(KeyStroke.getKeyStroke("control A"));
		help.add(miHelp);
		help.addSeparator();
		help.add(miAbout);
		
		add(file);
		add(edit);
		add(help);
	}
	
}
