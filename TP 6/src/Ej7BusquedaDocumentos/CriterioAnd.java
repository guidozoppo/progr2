package Ej7BusquedaDocumentos;

public class CriterioAnd extends Criterio {

	Criterio criterio1, criterio2;
	
	
	
	public CriterioAnd(Criterio criterio1, Criterio criterio2) {
		this.criterio1 = criterio1;
		this.criterio2 = criterio2;
	}

	@Override
	public boolean Cumple(Documento doc) {
		return  criterio1.Cumple(doc) && criterio2.Cumple(doc);
	}

}
