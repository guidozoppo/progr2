package Ej2SistemaPostal;

public class CriterioPeso extends Criterio {

	double peso;
	
	
	public CriterioPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(ElementoEnvio elem) {
		return elem.getPeso() <= this.peso;
	}

}
