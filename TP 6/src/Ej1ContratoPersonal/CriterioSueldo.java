package Ej1ContratoPersonal;

public class CriterioSueldo extends Criterio {

	private double sueldo;
	
	public CriterioSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public boolean evaluarContrato(Contrato c) {
		return this.sueldo <= c.getSueldo();
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
