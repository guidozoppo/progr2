package Ej3Biblioteca;
import java.util.Comparator;

public class ComparadorAnioEdicion implements Comparator<Libro>{

	



	@Override
	public int compare(Libro l1, Libro l2) {
		if(l1.getAnioEdicion() > l2.getAnioEdicion()) {
			return 1;
		} else if (l1.getAnioEdicion() < l2.getAnioEdicion()) {
			return -1;
		} else {
			return 0;
		}
	}

}
