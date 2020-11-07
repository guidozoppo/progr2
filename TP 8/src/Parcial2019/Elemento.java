package Parcial2019;

import java.util.ArrayList;

public abstract class Elemento {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double ingresos() {
		return this.totalIngresos()/this.cantHabitantes();
	}
	
	public double densidad() {
		return this.cantHabitantes() / this.superficieTotal();
	}
	
	public abstract int cantHabitantes();
	public abstract int totalIngresos();
	public abstract double superficieTotal();
	public abstract ArrayList<ElementoSimple> buscar(Criterio c);
}
