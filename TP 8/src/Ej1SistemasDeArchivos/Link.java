package Ej1SistemasDeArchivos;

import java.util.ArrayList;

public class Link extends ElementoSA{

	ElementoSA destino;
	
	public Link(String nombre, ElementoSA destino) {
		super(nombre);
		this.destino = destino;
	}
	
	public ElementoSA getDestino() {
		return this.destino;
	}

	@Override
	public double getTamanio() {
		return 1;
	}
	

	@Override
	public int cantidadArchivos() {
		return 1;
	}
	

	@Override
	public int cantidadElementos() {
		return 1;
	}
	

	@Override
	public int cantidadCarpetas() {
		return 0;
	}

	
	@Override
	public boolean contieneElemento(ElementoSA elementoQueBusco) {
		return destino.contieneElemento(elementoQueBusco);
	}

	
	 /**
     * Un Link se retorna como resultado de la busqueda si
     * lo que apunta cumple con el criterio
     * @param f
     * @return
     */
	@Override
	public ArrayList<ElementoSA> buscar(Filtro f) {
		ArrayList<ElementoSA> retorno = new ArrayList<ElementoSA>();
		
		if(f.cumple(destino)) {
			retorno.add(this);
		}
		
		return retorno;
	}
}
