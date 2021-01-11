package view;

import javax.swing.WindowConstants;

import controller.Serijalizacija;
import listeners.CloseAppWindowListener;
import model.BazaPredmeta;
import model.BazaStudenata;


public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Serijalizacija.deserijalizuj();

		MainFrame.getInstance();
		MainFrame.getInstance().setLocationRelativeTo(null);
		MainFrame.getInstance().setVisible(true);
		MainFrame.getInstance().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		MainFrame.getInstance().addWindowListener(new CloseAppWindowListener());
	}

}
