package Ej3Biblioteca;

import java.util.Comparator;

public class ComparadorGenero implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getGeneroPrincipal().compareTo(l2.getGeneroPrincipal());
	}

	

}
