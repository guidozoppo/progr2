package Ej2SistemaPostal;

public class CriterioNot extends Criterio {

	Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}
	
	@Override
	public boolean cumple(ElementoEnvio elem) {
		return !c1.cumple(elem);
	}

}
