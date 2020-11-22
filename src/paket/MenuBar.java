package paket;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
		
		file.setMnemonic('F');
		JMenuItem miNew = new JMenuItem("New",'N');
		ImageIcon plusIcon = new ImageIcon(new ImageIcon("images/plus_icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miNew.setIcon(plusIcon);
		miNew.setAccelerator(KeyStroke.getKeyStroke("control N"));
		miNew.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        System.out.println("miNew performed");
		      }
		});

		JMenuItem miClose = new JMenuItem("Close",'C');
		ImageIcon xIcon = new ImageIcon(new ImageIcon("images/x_Icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miClose.setIcon(xIcon);
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
		
		edit.setMnemonic('E');	
		JMenuItem miEdit = new JMenuItem("Edit", 'E');
		ImageIcon editIcon = new ImageIcon(new ImageIcon("images/edit_Icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miEdit.setIcon(editIcon);
		miEdit.setAccelerator(KeyStroke.getKeyStroke("control E"));
		miEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("miEdit performed");
			}
		});
		
		JMenuItem miDelete = new JMenuItem("Delete", 'D');
		ImageIcon deleteIcon = new ImageIcon(new ImageIcon("images/delete_Icon.png").getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));
		miDelete.setIcon(deleteIcon);
		miDelete.setAccelerator(KeyStroke.getKeyStroke("control D"));
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		JMenu help = new JMenu("Help");
		
		help.setMnemonic('H');
		JMenuItem miHelp = new JMenuItem("Help", 'H');	
		ImageIcon helpIcon = new ImageIcon(new ImageIcon("images/help_Icon.png").getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT));
		miHelp.setIcon(helpIcon);
		miHelp.setAccelerator(KeyStroke.getKeyStroke("control H"));
		
		JMenuItem miAbout = new JMenuItem("About", 'A');
		ImageIcon aboutIcon = new ImageIcon(new ImageIcon("images/about_Icon.png").getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT));
		miAbout.setIcon(aboutIcon);
		miAbout.setAccelerator(KeyStroke.getKeyStroke("control A"));
		help.add(miHelp);
		help.addSeparator();
		help.add(miAbout);
		
		add(file);
		add(edit);
		add(help);
	}
	
}
