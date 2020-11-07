package Ej7BusquedaDocumentos;

public class CriterioTitulo extends Criterio {

	String titulo;
	
	public CriterioTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean Cumple(Documento doc) {
		return doc.getTitulo().equals(titulo);
	}

}
