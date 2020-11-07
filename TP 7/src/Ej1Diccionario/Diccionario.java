package Ej1Diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {

	private ArrayList<Palabra> palabras;
	
	public Diccionario() {
		palabras = new ArrayList<>();
	}
	
	public void addPalabra(Palabra p) {
		if(!palabras.contains(p)) {
			palabras.add(p);
		}
	}
	
	public void eliminarPalabara(Palabra p) {
		palabras.remove(p);
	}
	
	public void ordenarPalabras() {
		Collections.sort(palabras);
	}
	
	public ArrayList<Palabra> getPalabra(){
		ArrayList<Palabra> aux = new ArrayList<>();
		for(int i=0; i<palabras.size();i++) {
			aux.add(palabras.get(i));
		}
		Collections.sort(aux);
		return aux;
	}

	public ArrayList<Palabra> getPalabraEntre(Palabra palabra1, Palabra palabra2){
		ArrayList<Palabra> aux = new ArrayList<>();
		for(Palabra pal:palabras) {
			if(pal.compareTo(palabra1)>0 && 
					pal.compareTo(palabra2)<0) {
				aux.add(pal);
			}
		}
		return aux;
	}



}


