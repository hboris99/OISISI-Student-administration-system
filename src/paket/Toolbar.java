package paket;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Toolbar extends JToolBar{
	
	TabbedPane tab;
	private static final long serialVersionUID = 3L;
	public Toolbar(JFrame parent, TabbedPane tab) {
		
		
		super(SwingConstants.HORIZONTAL);
		this.tab = tab; 
		
		Border emptyBorder = BorderFactory.createEmptyBorder(); 

		
		
		addSeparator();
		
		
		JButton addBT = new JButton();
		addBT.setBorder(emptyBorder);
		ImageIcon plusIcon = new ImageIcon(new ImageIcon("images/plus_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		addBT.setIcon(plusIcon);
		
		addBT.addActionListener(new AddStudentActionListener(parent,tab));
		addBT.setToolTipText("Dodajte novi entitet");
		add(addBT);
		
		addSeparator();
		
		
		
		JButton editBT = new JButton();
		editBT.setBorder(emptyBorder);
		ImageIcon editIcon = new ImageIcon(new ImageIcon("images/edit_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		editBT.setIcon(editIcon);
		
		editBT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("editBT performed");
			}
		});
		
		editBT.setToolTipText("Izmenite postojeći entitet");
		add(editBT);
		
		addSeparator();
		
		JButton deleteBT = new JButton();
		deleteBT.setBorder(emptyBorder);
		ImageIcon deleteIcon = new ImageIcon(new ImageIcon("images/delete_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		deleteBT.setIcon(deleteIcon);
		
		deleteBT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("deleteBT performed");
			}
		});
		
		
		deleteBT.setToolTipText("Obrisite postojeći entitet");
		add(deleteBT);
		
		Dimension d = new Dimension();
		d.setSize(700, 24);
		addSeparator(d);    //veliki separator 
		
		JTextArea tb = new JTextArea();
		tb.setSize(32,24);
		tb.setFont(new Font("Arial Black",Font.ITALIC,24));
		add(tb);
		
		addSeparator();
		
		JButton searchBT = new JButton();
		searchBT.setBorder(emptyBorder);
		ImageIcon searchIcon = new ImageIcon(new ImageIcon("images/search_icon.png").getImage().getScaledInstance(26, 26,Image.SCALE_SMOOTH));
		searchBT.setIcon(searchIcon);
		
		searchBT.setToolTipText("Pretraži");
		searchBT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("searchBT performed");
			}
		});
		add(searchBT);
		
		addSeparator();
		
		Border grey_border = BorderFactory.createLineBorder(Color.getHSBColor((float)251,(float) 69,(float) 255), 1);

		setBorder(grey_border);
		setFloatable(false);
	
	}
}
