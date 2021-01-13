package renderers;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.Predmet;

//https://www.codejava.net/java-se/swing/jlist-custom-renderer-example
public class PredmetRenderer extends JLabel implements ListCellRenderer<Predmet>{


	private static final long serialVersionUID = 4080067833100898490L;

	public PredmetRenderer() {
		super();
		setOpaque(true);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Predmet> list, Predmet value, int index,
			boolean isSelected, boolean cellHasFocus) {
		setText(value.getNaziv());
		if (isSelected) {
		    setBackground(Color.GRAY);
		    setForeground(list.getSelectionForeground());
		} else {
		    setBackground(list.getBackground());
		    setForeground(list.getForeground());
		}
		return this;
	}

}
