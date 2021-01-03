package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import controller.PredmetiController;
import controller.ProfesoriController;
import listeners.AddStudentActionListener;
import listeners.IzmeniDijalogActionListener;
import listeners.SearchListener;

public class Toolbar extends JToolBar {

	TabbedPane tab;
	private static final long serialVersionUID = 3L;

	public Toolbar(JFrame parent, TabbedPane tab) {

		super(SwingConstants.HORIZONTAL);
		this.tab = tab;

		Border emptyBorder = BorderFactory.createEmptyBorder();
		Box box = Box.createHorizontalBox();


		JButton addBT = new JButton();
		addBT.setBorder(emptyBorder);
		ImageIcon plusIcon = new ImageIcon(
				new ImageIcon("images"+ File.separator+ "plus_icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		addBT.setIcon(plusIcon);

		addBT.addActionListener(new AddStudentActionListener(parent, tab));
		addBT.setToolTipText("Dodajte novi entitet");
		box.add(Box.createHorizontalStrut(10));
		box.add(addBT);


		JButton editBT = new JButton();
		editBT.setBorder(emptyBorder);
		ImageIcon editIcon = new ImageIcon(
				new ImageIcon("images"+File.separator+"edit_icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		editBT.setIcon(editIcon);

		editBT.addActionListener(new IzmeniDijalogActionListener(parent, tab));

		editBT.setToolTipText("Izmenite postojeći entitet");
		box.add(Box.createHorizontalStrut(10));
		box.add(editBT);


		JButton deleteBT = new JButton();
		deleteBT.setBorder(emptyBorder);
		ImageIcon deleteIcon = new ImageIcon(
				new ImageIcon("images"+File.separator+"delete_icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		deleteBT.setIcon(deleteIcon);

		deleteBT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PredmetiController.getInstance().obrisiPredmet(tab.getPredmeti().getSelectedRow());
				MainFrame.getInstance().prikaziTabeluProfesora();

			}
		});

		deleteBT.setToolTipText("Obrisite postojeći entitet");
		box.add(Box.createHorizontalStrut(10));
		box.add(deleteBT);
		box.add(Box.createHorizontalStrut(450));

		
		JTextField txt = new JTextField(30);
		txt.setFont(new Font("Arial Black", Font.ITALIC, 24));
		box.add(txt);



		JButton searchBT = new JButton();
		searchBT.setBorder(emptyBorder);
		ImageIcon searchIcon = new ImageIcon(
				new ImageIcon("images"+File.separator+"search_icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		searchBT.setIcon(searchIcon);

		searchBT.setToolTipText("Pretraži");
		searchBT.addActionListener(new SearchListener(parent, tab, txt));
		
		box.add(Box.createHorizontalStrut(5));
		box.add(searchBT);
		box.add(Box.createHorizontalStrut(5));

		add(box);
		Border grey_border = BorderFactory.createLineBorder(Color.getHSBColor((float) 251, (float) 69, (float) 255), 1);

		setBorder(grey_border);
		setFloatable(false);

	}
}