package ej2AlarmaSensorial;

public class Sensor {

	private String nombre;
	private boolean estaActivado;
	
	public Sensor (String nombre) {
		this.nombre = nombre;
		estaActivado = false;
	}

	public boolean estaActivado() {
		return estaActivado;
	}
	
	public void setActivado(boolean estaActivado) {
		this.estaActivado = estaActivado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
