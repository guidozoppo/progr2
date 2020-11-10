import java.util.ArrayList;

public class Nivel extends ElementoSIC {

	private ArrayList<ElementoSIC> elementos;
	
	public Nivel() {
		this.elementos = new ArrayList<>();
	}
	
	@Override
	public int totalCocheras() {
		int contador = 0;
		for(ElementoSIC e:elementos){
			contador += e.totalCocheras();
		}
		return contador;
	}

	@Override
	public ElementoSIC getCopia(Criterio crit) {
		Nivel copia = new Nivel(); //Creo copia de nivel
		for(ElementoSIC e:elementos) {
			ElementoSIC copiaHijo = e.getCopia(crit); 
			if(copiaHijo != null) {
				copia.addElemento(e);
			}
		}
		if(copia.tieneElementos()) {
			return copia;
		}
		return null;
	}

	@Override
	public ArrayList<Cochera> getCocheras(Auto a) {
		ArrayList<Cochera> cocherasQueCumplen = new ArrayList<>();
		for(ElementoSIC e: elementos) {
			cocherasQueCumplen.addAll(e.getCocheras(a));
		}
		return cocherasQueCumplen;
	}
	
	public boolean tieneElementos() {
		return this.elementos.size() > 0;
	}

	public void addElemento(ElementoSIC el) {
		this.elementos.add(el);
	}
}
