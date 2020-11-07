package Ej1Diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra>{

	private String nombre;
	private String funcion;
	private ArrayList<String> definiciones;
	private ArrayList<Palabra> sinonimos;
	private ArrayList<Palabra> antonimos;
	
	public Palabra(String nombre, String funcion) {
		this.nombre = nombre;
		this.funcion = funcion;
		definiciones = new ArrayList<>();
		sinonimos = new ArrayList<>();
		antonimos = new ArrayList<>();
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}


	public ArrayList<String> getDefiniciones() {
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0; i<definiciones.size();i++) {
			aux.add(definiciones.get(i));
		}
		return aux;
	}



	public void addDefinicion(String def) {
		definiciones.add(def);
	}


	public ArrayList<Palabra> getSinonimos() {
		ArrayList<Palabra> aux = new ArrayList<>();
		for(int i=0; i<sinonimos.size();i++) {
			aux.add(sinonimos.get(i));
		}
		Collections.sort(aux);
		return aux;
	}

	
	public void addSinonimo(Palabra sinonimos) {
		this.sinonimos.add(sinonimos);
	}

	public ArrayList<Palabra> getAntonimos() {
		ArrayList<Palabra> aux = new ArrayList<>();
		for(int i=0; i<antonimos.size();i++) {
			aux.add(antonimos.get(i));
		}
		Collections.sort(aux);
		return aux;
	}


	public void addAntonimos(Palabra antonimos) {
		this.antonimos.add(antonimos);
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

	@Override
	public int compareTo(Palabra pal) {
		return this.getNombre().compareTo(pal.getNombre());
	}
	
	
}
