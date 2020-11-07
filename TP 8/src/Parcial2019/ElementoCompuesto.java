package Parcial2019;

import java.util.ArrayList;
import java.util.Collections;

public class ElementoCompuesto extends Elemento{

	private ArrayList<Elemento> hijos;

	@Override
	public int cantHabitantes() {
		int total = 0;
		for(Elemento el:hijos) {
			total += el.cantHabitantes();
		}
		return total;
	}

	@Override
	public int totalIngresos() {
		int total = 0;
		for(Elemento el:hijos) {
			total += el.totalIngresos();
		}
		return total;
	}

	@Override
	public double superficieTotal() {
		double total = 0;
		for(Elemento el:hijos) {
			total += el.superficieTotal();
		}
		return total;
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Criterio c) {
		ArrayList<ElementoSimple> aux = new ArrayList<ElementoSimple>();
		for(Elemento el:hijos) {
			aux.addAll(el.buscar(c));
		}
		Collections.sort(aux);
		return aux;
	}
}
