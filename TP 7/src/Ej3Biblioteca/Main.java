package Ej3Biblioteca;

import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro ("Boca", 100, "Bianchi", 2000, "Emocion");
		Libro l2 = new Libro ("River", 80, "JJ Lopez", 2011, "Tristeza");
		Libro l3 = new Libro ("EDLP", 120, "Sabella", 2009, "Heroica");

		Biblioteca central = new Biblioteca();
		central.addLibro(l1);
		central.addLibro(l2);
		central.addLibro(l3);
		
		Comparator<Libro> ISBN = new ComparadorISBN();
		Comparator<Libro> porAutor = new ComparadorAutor();
		Comparator<Libro> porAnioEdic = new ComparadorAnioEdicion();
		Comparator<Libro> porGenero = new ComparadorGenero();
		
		//System.out.println(central.getLibros());
		
		System.out.println("Ordenado por ISBN: \n" + central.ordenarLibros(ISBN));
		System.out.println("Ordenado por Autor: \n" + central.ordenarLibros(porAutor));
		System.out.println("Ordenado por Año edicion: \n" + central.ordenarLibros(porAnioEdic));
		System.out.println("Ordenado por Genero: \n" + central.ordenarLibros(porGenero));
		
	}

}
