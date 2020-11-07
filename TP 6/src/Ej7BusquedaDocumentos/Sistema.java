package Ej7BusquedaDocumentos;

import java.util.ArrayList;

public class Sistema {

	private ArrayList<Documento> documentos;
	
	public Sistema() {
		documentos = new ArrayList<>();
	}
	
	public void addDocumento(Documento doc) {
		documentos.add(doc);
	}
	
	public ArrayList<Documento> buscar(Criterio c1){
		ArrayList<Documento> aux = new ArrayList<Documento>();
		for(int i = 0 ; documentos.size() > i ; i++) {
			Documento d1 = this.documentos.get(i);
			if(c1.Cumple(d1)) {
				aux.add(d1);
			}
		}
		return aux;
	}

}
