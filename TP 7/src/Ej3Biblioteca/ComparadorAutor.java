package Ej3Biblioteca;

import java.util.Comparator;

public class ComparadorAutor implements Comparator<Libro>{

	public ComparadorAutor() {
		
	}


	
	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}

}
