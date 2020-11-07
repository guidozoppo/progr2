package Parcial2019;

public class CriterioNombre implements Criterio {

	private String nombre;
	
	
	public CriterioNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Elemento elem) {
		return elem.getNombre().equals(nombre);
	}

}
