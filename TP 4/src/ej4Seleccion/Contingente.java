package ej4Seleccion;

import java.util.ArrayList;

public class Contingente {
	
	ArrayList <Integrante> integrantes;
	
	public Contingente() {
		integrantes = new ArrayList<>();
	}
	
	public void addIntegrante(Integrante i) {
		integrantes.add(i);
	}
}
