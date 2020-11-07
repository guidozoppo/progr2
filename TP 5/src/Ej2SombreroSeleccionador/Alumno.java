package Ej2SombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiaresAsistenAEscuela;
	//private boolean vaAEscuela;
	
	public Alumno(String nombre/*, boolean vaAEscuela*/) {
		this.nombre = nombre;
		//this.vaAEscuela = vaAEscuela;
		familiaresAsistenAEscuela = new ArrayList<>();
		cualidades = new ArrayList<>();
	}

	public boolean tieneFamiliar(Alumno a) {
		return familiaresAsistenAEscuela.contains(a);
	}
	
	public boolean tieneCualidad(String c) {
		return cualidades.contains(c);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getCualidades() {
		ArrayList<String> aux = new ArrayList<>();
		for(int i = 0 ; i<cualidades.size(); i++) {
			aux.add(cualidades.get(i));
		}
		return aux;
	}

	public void addCualidad(String cualidad) {
		cualidades.add(cualidad);
	}

	/*public boolean isVaAEscuela() {
		return vaAEscuela;
	}

	public void setVaAEscuela(boolean vaAEscuela) {
		this.vaAEscuela = vaAEscuela;
	}*/
	
	public ArrayList<Alumno> getFamiliaresAsistenAEscuela() {
		ArrayList<Alumno> aux = new ArrayList<>();
		for(int i = 0 ; i<familiaresAsistenAEscuela.size(); i++) {
			aux.add(familiaresAsistenAEscuela.get(i));
		}
		return aux;
	}

	public void addFamiliaresAsistenAEscuela(Alumno fliar) {
		familiaresAsistenAEscuela.add(fliar);
	}
	
}
