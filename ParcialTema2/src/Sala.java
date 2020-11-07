import java.util.ArrayList;

public class Sala extends ElementoSIS {

	private ArrayList<ElementoSIS> elementos;
	
	public Sala() {
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoSIS elem) {
		elementos.add(elem);
	}
	
	@Override
	public int totalCamas() {
		int contador = 0;
		for(ElementoSIS el:elementos) {
			contador += el.totalCamas();
		}
		return contador;
	}

	@Override
	public ArrayList<Cama> getCamas(Paciente pac) {
		ArrayList<Cama> camasQueCumplen = new ArrayList<>();
		
		for(ElementoSIS e:elementos) {
			camasQueCumplen.addAll(e.getCamas(pac));
		}
		
		/* SI ME PIDIERAN SIN ELEMENTOS REPETIDOS
		for(ElementoSIS e:elementos) {
			ArrayList<Cama> aux = e.getCamas(pac);
			for(Cama cumple:aux) {
				if(!camasQueCumplen.contains(cumple)) {
					camasQueCumplen.add(cumple);
				}
			}
		}*/
		return camasQueCumplen;
	}

	@Override
	public ElementoSIS getCopia(Criterio crit) {
		Sala copia = new Sala();
		for(ElementoSIS e:elementos) {
			ElementoSIS copiaHijo = e.getCopia(crit);
			if(copiaHijo != null) {
				copia.addElemento(e);
			}
		}
		if(copia.tieneElementos()) {
			return copia;
		}
		return null;
	}

	public boolean tieneElementos() {
		return elementos.size() > 0;
	}
}
