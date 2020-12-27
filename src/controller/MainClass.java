package paket;

import javax.swing.WindowConstants;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame.getInstance();
		MainFrame.getInstance().setLocationRelativeTo(null);
		MainFrame.getInstance().setVisible(true);
		MainFrame.getInstance().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
