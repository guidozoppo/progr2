package Ej1ContratoPersonal;

public class Contrato {

	private double sueldo;
	private String empresaEmpleadora;
	private int horasSemanales;
	
	public Contrato(int horasSemanales, double sueldo, String empresaEmpleadora) {
		this.sueldo = sueldo;
		this.empresaEmpleadora = empresaEmpleadora;
		this.horasSemanales = horasSemanales;
	}

	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getEmpresaEmpleadora() {
		return empresaEmpleadora;
	}

	public void setEmpresaEmpleadora(String empresaEmpleadora) {
		this.empresaEmpleadora = empresaEmpleadora;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	
	
	
	
}
