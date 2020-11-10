import java.util.ArrayList;

public abstract class ElementoSIC {

	public abstract int totalCocheras();
	public abstract ElementoSIC getCopia(Criterio crit);
	public abstract ArrayList<Cochera> getCocheras(Auto a);
	
}
