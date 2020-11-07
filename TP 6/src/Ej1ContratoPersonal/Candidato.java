package Ej1ContratoPersonal;

public class Candidato {

	private String nombre;
	private String empresaEmpleadora;
	private double sueldo;
	private Criterio criterio;
	
	public Candidato(String nombre, String empresaEmpleadora, double sueldo, Criterio criterio) {
		this.nombre = nombre;
		this.empresaEmpleadora = empresaEmpleadora;
		this.sueldo = sueldo;
		this.criterio = criterio;
	}

	
	public Criterio getCriterio() {
		return criterio;
	}
	
	public void setCriterio(Criterio c) {
		criterio = c;
	}
	
	public boolean evaluarContrato(Contrato c) {
		return criterio.evaluarContrato(c);
	}
	
 	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresaEmpleadora() {
		return empresaEmpleadora;
	}

	public void setEmpresaEmpleadora(String empresaEmpleadora) {
		this.empresaEmpleadora = empresaEmpleadora;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
