package ej3Sueldo;

public class Empleado {

	private String nombre;
	private double salarioFijo;
	
	public Empleado (String nombre, double salarioFijo) {
		this.nombre = nombre;
		this.salarioFijo = salarioFijo;
	}
	
	public double calcularSueldo() {
		return salarioFijo;
	}

	
	
	//GETTERS AND SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioFijo() {
		return salarioFijo;
	}
	public void setSalarioFijo(double salarioFijo) {
		this.salarioFijo = salarioFijo;
	}



	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salarioFijo=" + salarioFijo + "]";
	}
	
	
}
