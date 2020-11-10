package Ej2SistemaPostal;

public class CriterioAnd extends Criterio {

	Criterio c1, c2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(ElementoEnvio elem) {
		return c1.cumple(elem) && c2.cumple(elem);
	}

}
