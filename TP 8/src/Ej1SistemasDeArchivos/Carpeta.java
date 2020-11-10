package Ej1SistemasDeArchivos;

import java.util.ArrayList;

public class Carpeta extends ElementoSA{

	private ArrayList<ElementoSA> contenido;
	
	public Carpeta(String nombre) {
		super(nombre);	
		this.contenido = new ArrayList<>();
	}
	
	public double getTamanio() {
		double tamanioTotal = 0;
		for(ElementoSA elem: contenido) {
			tamanioTotal += elem.getTamanio();
		}
		return tamanioTotal;
	}

	
	public void addElemento(ElementoSA elem) {
		contenido.add(elem);
	}
	
	public boolean estaVacia() {
		return contenido.size() == 0;
	}
	
	@Override
	public int cantidadArchivos() {
		int contador = 0;
		for(ElementoSA elem:contenido) {
			contador += elem.cantidadArchivos();
		}
		return contador;
	}

	
	@Override
	public int cantidadElementos() {
		int contador = 0;
		for(ElementoSA elem:contenido) {
			contador += elem.cantidadElementos();
		}
		return contador+1;
	}

	
	@Override
	public int cantidadCarpetas() {
		int contador = 0;
		for(ElementoSA elem:contenido) {
			contador += elem.cantidadCarpetas();
		}
		return contador+1;
	}

	
	public String toString() {
		return this.getNombre()+"/";
	}
	
	@Override
	public boolean contieneElemento(ElementoSA elementoQueBusco) {
		if(elementoQueBusco.equals(this)) {
			return true;
		} else {
			for(ElementoSA elem:contenido) {
				if(elem.contieneElemento(elementoQueBusco)) {
					return true;
				}
			}
		}
		return false;
	}

	
	@Override
	public ArrayList<ElementoSA> buscar(Filtro f) {
		ArrayList<ElementoSA> encontrados = new ArrayList<>();
	
		if(f.cumple(this)) {
			encontrados.add(this);
		}
		for(ElementoSA elem:contenido) {
			encontrados.addAll(elem.buscar(f));
		}
	
		return encontrados;
	}
	
	

	
	
	
}
