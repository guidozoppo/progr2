package centroAnimales;

public class CriterioCaracteristicaIgual extends Criterio {

	private Object valorBuscado;
	private String nombreCaracteristica;
	
	public CriterioCaracteristicaIgual(String nombreCaracteristica, Object valor) {
		this.valorBuscado = valor;
		this.nombreCaracteristica = nombreCaracteristica;
	}

	@Override
	public boolean cumple(ObjetoDinamico j) {
		Caracteristica c = j.getCaracteristica(nombreCaracteristica);
		if(c == null) {
			return false;
		} else {
			return c.getValor().equals(valorBuscado);
		}
	}

}
