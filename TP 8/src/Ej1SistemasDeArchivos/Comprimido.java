package Ej1SistemasDeArchivos;

import java.util.ArrayList;

public class Comprimido extends Carpeta {
	
	private static final String extension = "zip";
	private double factorCompresion;
	
	public Comprimido(String nombre, double tasa) {
		super(nombre);
		factorCompresion = tasa;
	}
	
	public void setFactorCompresion(Double tasa) {
		this.factorCompresion = tasa;
	}
	
	public double getFactorCompresion() {
		return this.factorCompresion;
	}
	
	
	@Override
	public double getTamanio() {
		return super.getTamanio() * factorCompresion;
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

	
	
	 /**
     * Un comprimido se retorna como resultado de una busqueda
     * si alguno de sus elementos cumple con el filtro
     * @param f
     * @return
     */
	@Override
	public ArrayList<ElementoSA> buscar(Filtro f) {
		ArrayList<ElementoSA> encontrados = new ArrayList<>();
		
		if(super.buscar(f).size()>0) {
			encontrados.add(this);
		}
		return encontrados;
	}
	
	@Override
	public String toString() {
		return this.getNombre()+"."+Comprimido.extension;
	}

}
