package tables;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

import model.AbstractListModelDodajProfesoraNaPredmet;
import model.Profesor;
import renderers.ProfesorRenderer;

public class DodajProfesoraNaPredmetJList extends JList<Profesor>{

	private static final long serialVersionUID = -2426537083130708417L;

	public DodajProfesoraNaPredmetJList() {
		inicijalizujListu();
		setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
	}
	
	public void inicijalizujListu() {
		
		AbstractListModelDodajProfesoraNaPredmet listModel = new AbstractListModelDodajProfesoraNaPredmet();
		setModel(listModel);
	
		setCellRenderer(new ProfesorRenderer());
	}
	
}
