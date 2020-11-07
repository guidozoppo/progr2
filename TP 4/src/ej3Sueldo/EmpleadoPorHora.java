package ej3Sueldo;

public class EmpleadoPorHora extends Empleado {

	private double horasExtras;
	
	public EmpleadoPorHora(String nombre, double salarioFijo, double horasExtras) {
		super(nombre, salarioFijo);
		this.horasExtras = horasExtras;
	}

	public double calcularSueldo() {
		return super.getSalarioFijo()+(this.getHorasExtras()*10);
	}
	
	//GETTERS AND SETTERS
	public double getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	
	
	@Override
	public String toString() {
		return "El empleado " + super.getNombre() + "Debe cobrar: " + this.calcularSueldo();
	}

	
	
	
}
