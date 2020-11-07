package Ej1ContratoPersonal;

public class CriterioOr extends Criterio {

	Criterio c1;
	Criterio c2;
	
	public CriterioOr(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean evaluarContrato(Contrato c) {
		return c1.evaluarContrato(c) || c2.evaluarContrato(c);
	}

}
