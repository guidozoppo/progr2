package Ej3Biblioteca;
import java.util.Comparator;

public class ComparadorISBN implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		if(l1.getISBN() > l2.getISBN()) {
			return 1;
		} else if (l1.getISBN() < l2.getISBN()) {
			return -1;
		} else {
			return 0;
		}
	}

}
