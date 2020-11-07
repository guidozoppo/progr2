package Parcial2019;

import java.util.ArrayList;

public class ElementoSimple extends Elemento implements Comparable<ElementoSimple> {

	private double superficie;
	private int cantHabitantes;
	private int montoIngresos;
	
	@Override
	public int cantHabitantes() {
		return this.getCantHabitantes();
	}

	@Override
	public int totalIngresos() {
		return this.getMontoIngresos();
	}

	@Override
	public double superficieTotal() {
		return this.getSuperficie();
	}
	
	
	@Override
	public int compareTo(ElementoSimple elemSimple) {
		return this.getNombre().compareTo(elemSimple.getNombre());
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Criterio c) {
		ArrayList<ElementoSimple> aux = new ArrayList<ElementoSimple>();
		if(c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	//////////////////////
	

	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public int getMontoIngresos() {
		return montoIngresos;
	}

	public void setMontoIngresos(int montoIngresos) {
		this.montoIngresos = montoIngresos;
	}

	
	
	
	
	
	

}
