package abstractTableModel;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

import model.Predmet;

public class AbstractListModelDodajPredmet extends AbstractListModel <Predmet>{

	private static final long serialVersionUID = -2766414648331084875L;
	
	ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
	
	public AbstractListModelDodajPredmet(ArrayList<Predmet> predmeti) {
		super();
		this.predmeti = predmeti;
	}

	@Override
	public int getSize() {
		if(predmeti == null)
			return 0;
		else
			return predmeti.size();
	}

	@Override
	public Predmet getElementAt(int index) {
		return predmeti.get(index);
	}

}
