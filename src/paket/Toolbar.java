package paket;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Toolbar extends JToolBar{
	
	private static final long serialVersionUID = 3L;
	public Toolbar() {
		
		super(SwingConstants.HORIZONTAL);
		
		Border emptyBorder = BorderFactory.createEmptyBorder(); 

		
		
		
		
		
		JButton addBT = new JButton();
		addBT.setBorder(emptyBorder);
		ImageIcon plusIcon = new ImageIcon(new ImageIcon("images/plus_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		addBT.setIcon(plusIcon);
		/*REFERENCA: https://www.codejava.net/java-se/swing/setting-shortcut-key-and-hotkey-for-menu-item-and-button-in-swing 
		 Video sam ideju i primenio na ovaj slucaj, jer nisam bio siguran kako se koriste metode getActionMap i get input map 
		 */
		Action addBTaction = new AbstractAction("",plusIcon) {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.out.println("Addbt preformed");
		    }

		};
		addBTaction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control N"));

		addBT.getActionMap().put("addBTaction", addBTaction);
		addBT.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		        (KeyStroke) addBTaction.getValue(Action.ACCELERATOR_KEY), "addBTaction");
		
		addBT.setToolTipText("Dodajte novi entitet");
		add(addBT);
		
		addSeparator();
		
		
		
		JButton editBT = new JButton();
		editBT.setBorder(emptyBorder);
		ImageIcon editIcon = new ImageIcon(new ImageIcon("images/edit_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		editBT.setIcon(editIcon);
		
		Action editBTaction = new AbstractAction("",editIcon) {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.out.println("EditBT preformed");
		    }

		};
		editBTaction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control E"));

		editBT.getActionMap().put("editBTaction", editBTaction);
		editBT.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		        (KeyStroke) editBTaction.getValue(Action.ACCELERATOR_KEY), "editBTaction");
		
		editBT.setToolTipText("Izmenite postojeći entitet");
		add(editBT);
		
		addSeparator();
		
		JButton deleteBT = new JButton();
		deleteBT.setBorder(emptyBorder);
		ImageIcon deleteIcon = new ImageIcon(new ImageIcon("images/delete_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT));
		deleteBT.setIcon(deleteIcon);
		
		Action deleteBTaction = new AbstractAction("",deleteIcon) {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.out.println("deleteBT preformed");
		    }

		};
		deleteBTaction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control D"));

		deleteBT.getActionMap().put("deleteBTaction", deleteBTaction);
		deleteBT.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		        (KeyStroke) deleteBTaction.getValue(Action.ACCELERATOR_KEY), "deleteBTaction");
		
		deleteBT.setToolTipText("Obrisite postojeći entitet");
		add(deleteBT);
		
		Dimension d = new Dimension();
		d.setSize(1000, 24);
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
		
		Action searchBTaction = new AbstractAction("",searchIcon) {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.out.println("searchBT preformed");
		    }

		};
		searchBTaction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control F"));

		searchBT.getActionMap().put("searchBTaction", searchBTaction);
		searchBT.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
		        (KeyStroke) searchBTaction.getValue(Action.ACCELERATOR_KEY), "searchBTaction");
		
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
