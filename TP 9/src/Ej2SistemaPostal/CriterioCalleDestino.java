package Ej2SistemaPostal;

public class CriterioCalleDestino extends Criterio {

String nombreCalle;
	
	public CriterioCalleDestino(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	
	@Override
	public boolean cumple(ElementoEnvio elem) {
		return elem.getNombreCalleDestino().equals(this.nombreCalle);
	}

}
