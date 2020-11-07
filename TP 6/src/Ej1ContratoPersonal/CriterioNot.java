package Ej1ContratoPersonal;

public class CriterioNot extends Criterio {

	Criterio c1;
	
	public CriterioNot (Criterio c1) {
		this.c1 = c1;
	}
	
	@Override
	public boolean evaluarContrato(Contrato c) {
		return !c1.evaluarContrato(c);
	}

}
