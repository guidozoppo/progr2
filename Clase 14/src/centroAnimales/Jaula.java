package centroAnimales;

//import java.util.ArrayList;

public class Jaula extends ObjetoDinamico {

	public Jaula() {
		super();
	}
	
	public boolean apto(Animal a) {
		return a.apta(this);
	}
}
