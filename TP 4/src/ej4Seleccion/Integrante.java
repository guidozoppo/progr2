package ej4Seleccion;

import java.time.LocalDate;

public class Integrante {

	private String nombre;
	private String apellido;
	private int nPasaporte;
	private LocalDate fechaNac;
	private String estado;
	
	public Integrante(String nombre, String apellido, int pasaporte, LocalDate fechaNac, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		nPasaporte = pasaporte;
		this.fechaNac = fechaNac;
		this.estado = estado;
	}

	public boolean estaDisponible() {
		if(this.estado == "En pais de origen") {
			return true;
		} return false;
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getnPasaporte() {
		return nPasaporte;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	
}
