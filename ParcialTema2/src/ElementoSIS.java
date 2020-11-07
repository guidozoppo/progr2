import java.util.ArrayList;

public abstract class ElementoSIS {

	
	
	public abstract int totalCamas();
	public abstract ArrayList<Cama> getCamas(Paciente pac);
	public abstract ElementoSIS getCopia(Criterio crit);
	
}
