package Ej2SistemaPostal;

public class CriterioCiudadOrigen extends Criterio {

String ciudad;
	
	public CriterioCiudadOrigen(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public boolean cumple(ElementoEnvio elem) {
		return elem.getCiudadOrigen().equals(this.ciudad);
	}

}
