package ej3Sueldo;

public class EmpleadoComision extends Empleado {
	
	private double ventas;
	private double porcentajeVentas;
	
	
	public EmpleadoComision(String nombre, double salarioFijo, double ventas) {
		super(nombre, salarioFijo);
		this.ventas = ventas;
		this.porcentajeVentas = ventas * 0.1;
		
	}

	public double calcularSueldo() {
		return super.getSalarioFijo()+(super.getSalarioFijo()*this.getPorcentajeVentas());
	}
	
	//GETTERS AND SETTERS
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getPorcentajeVentas() {
		return porcentajeVentas;
	}
	public void setPorcentajeVentas(double porcentajeVentas) {
		this.porcentajeVentas = porcentajeVentas;
	}

	
	@Override
	public String toString() {
		return "El empleado " + super.getNombre() + " debe cobrar: " + this.calcularSueldo();
	}
	
	
	

	
	
	
	
}
