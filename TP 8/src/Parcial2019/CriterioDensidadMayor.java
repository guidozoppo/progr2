package Parcial2019;

public class CriterioDensidadMayor implements Criterio {

	private int densidad;
	
	
	public CriterioDensidadMayor(int densidad) {
		this.densidad = densidad;
	}

	@Override
	public boolean cumple(Elemento elem) {
		return elem.densidad() > this.densidad;
	}

}
