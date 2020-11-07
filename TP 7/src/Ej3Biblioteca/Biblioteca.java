package Ej3Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Biblioteca{

	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		libros = new ArrayList<>();
	}

	public void addLibro(Libro l) {
		libros.add(l);
	}
	
	public ArrayList<Libro> getLibros(){
		ArrayList<Libro> aux = new ArrayList<>();
		for(int i = 0 ; i < libros.size(); i++) {
			aux.add(libros.get(i));
		}
		return aux;
	}

	public ArrayList<Libro> ordenarLibros(Comparator c1){
		ArrayList<Libro> aux = new ArrayList<>();
		for(int i = 0; i < libros.size(); i++) {
			aux.add(libros.get(i));
		}
		Collections.sort(aux, c1);
		return aux;
	}
	
		
	
	
}
