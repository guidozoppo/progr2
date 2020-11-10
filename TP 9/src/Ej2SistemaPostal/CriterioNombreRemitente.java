package Ej2SistemaPostal;

public class CriterioNombreRemitente extends Criterio {

	String nombreRemitente;
	
	
	
	public CriterioNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}



	@Override
	public boolean cumple(ElementoEnvio elem) {
		return elem.getNombreRemitente().equals(this.nombreRemitente);
		}

}
