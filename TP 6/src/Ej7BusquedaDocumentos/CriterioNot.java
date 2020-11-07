package Ej7BusquedaDocumentos;

public class CriterioNot extends Criterio {

	private Criterio criterio1;
	
	public CriterioNot(Criterio criterio1) {
		this.criterio1 = criterio1;
	}

	@Override
	public boolean Cumple(Documento doc) {
		return !criterio1.Cumple(doc);
	}

}
