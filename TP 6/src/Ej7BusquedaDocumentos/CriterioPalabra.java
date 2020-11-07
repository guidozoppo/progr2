package Ej7BusquedaDocumentos;

public class CriterioPalabra extends Criterio {

	private String palabra;
	public CriterioPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean Cumple(Documento doc) {
		return doc.getPalabrasClaves().contains(palabra);
	}

}
