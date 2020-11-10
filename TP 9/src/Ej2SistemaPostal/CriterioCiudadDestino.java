package Ej2SistemaPostal;

public class CriterioCiudadDestino extends Criterio {

	String ciudad;
	
	public CriterioCiudadDestino(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public boolean cumple(ElementoEnvio elem) {
		return elem.getCiudadDestino().equals(this.ciudad);
	}

}
