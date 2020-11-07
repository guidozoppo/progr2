package centroAnimales;

public class CriterioOr extends Criterio {

	Criterio c1, c2;

	@Override
	public boolean cumple(ObjetoDinamico j) {
		return c1.cumple(j) || c2.cumple(j);
	}

}
