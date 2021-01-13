package renderers;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import model.Predmet;
import model.Profesor;

public class ProfesorRenderer extends JLabel implements ListCellRenderer<Profesor> {

	private static final long serialVersionUID = -3927302902072429002L;

	public ProfesorRenderer() {
		super();
		setOpaque(true);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Profesor> list, Profesor value, int index,
			boolean isSelected, boolean cellHasFocus) {
		setText(value.getIme() + " " + value.getPrezime());
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
