package abstractTableModel;

import javax.swing.AbstractListModel;

import model.BazaProfesora;
import model.Profesor;

public class AbstractListModelDodajProfesoraNaPredmet extends AbstractListModel<Profesor> {

	private static final long serialVersionUID = -1956249906440584803L;

	@Override
	public int getSize() {
		return BazaProfesora.getInstance().getProfesori().size();	
	}

	@Override
	public Profesor getElementAt(int index) {
		return BazaProfesora.getInstance().getProfesori().get(index);
		
	}

}
