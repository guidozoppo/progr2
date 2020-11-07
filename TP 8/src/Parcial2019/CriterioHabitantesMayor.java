package Parcial2019;

public class CriterioHabitantesMayor implements Criterio {

	private int cant;
	
	
	public CriterioHabitantesMayor(int cant) {
		this.cant = cant;
	}

	@Override
	public boolean cumple(Elemento elem) {
		return elem.cantHabitantes() > this.cant;
	}

}
