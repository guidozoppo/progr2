package Ej2SombreroSeleccionador;

import java.util.ArrayList;

public class Casa {

	private String nombre;
	protected ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;
	private int alumnosMax;
	
	public Casa (String nombre, int alumnosMax) {
		this.nombre = nombre;
		this.alumnosMax = alumnosMax;
		alumnos = new ArrayList<>();
		cualidades = new ArrayList<>();
	}
	
	public boolean hayLugar() {
		return alumnos.size() < alumnosMax;
	}

	public boolean aceptaAlumno(Alumno a) {
		for(int i = 0; i<cualidades.size(); i++) {
			String cualNec = this.cualidades.get(i);
			if(!a.tieneCualidad(cualNec)) {
				return false;
			}
		}
		return true;
	}

	public void addAlumno(Alumno alumno) {
		if(hayLugar() && aceptaAlumno(alumno)) {
			alumnos.add(alumno);
		}
		
	}

	public boolean tieneAlumno(Alumno alumnoFamiliar) {
		if(alumnos.contains(alumnoFamiliar)) {
			return true;
		}else {
			return false;
		}
	}
	
	//GETTERS AND SETTERS
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

	public int getAlumnosHabitando() {
		return alumnos.size();
	}

	public int getAlumnosMax() {
		return alumnosMax;
	}

	public void setAlumnosMax(int alumnosMax) {
		this.alumnosMax = alumnosMax;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
