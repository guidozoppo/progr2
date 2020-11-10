package Ej1SistemasDeArchivos;

import java.util.ArrayList;

public class Archivo extends ElementoSA{

	private double tamanio;
	private String extension;
	
	public Archivo(String nombre, String extension, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
		this.extension = extension;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
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
		return elementoQueBusco.equals(this);
	}

	
	@Override
	public ArrayList<ElementoSA> buscar(Filtro f) {
		ArrayList<ElementoSA> aux = new ArrayList<>();
		if(f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	public String toString() {
		return this.getNombre() +"."+ this.getExtension();
	}
	
	public boolean equals(Object obj) {
		try {
			Archivo otro = (Archivo) obj;
			
			return super.equals(otro) && this.getExtension().equals(otro.getExtension());
		}
		catch(Exception exc){
			return false;
		}
	}

	
}
