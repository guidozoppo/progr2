package Ej1ContratoPersonal;

public class CriterioEmpresa extends Criterio {

	private String empresaEmpleadora;
	
	public CriterioEmpresa(String empr) {
		empresaEmpleadora = empr;
	}
	
	@Override
	public boolean evaluarContrato(Contrato c) {
		return empresaEmpleadora.equals(c.getEmpresaEmpleadora());
	}

	public String getEmpresaEmpleadora() {
		return empresaEmpleadora;
	}

	public void setEmpresaEmpleadora(String empresaEmpleadora) {
		this.empresaEmpleadora = empresaEmpleadora;
	}

	
	
}
