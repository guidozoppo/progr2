package ej4Seleccion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Masajista extends Integrante {

	private int aniosXP;
	private ArrayList <Titulo> titulos;
	
	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechaNac, String estado, int aniosXP) {
		super(nombre, apellido, pasaporte, fechaNac, estado);
		this.aniosXP = aniosXP;
	}

	public int getAniosXP() {
		return aniosXP;
	}

	public void setAniosXP(int aniosXP) {
		this.aniosXP = aniosXP;
	}

	public ArrayList<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(ArrayList<Titulo> titulos) {
		this.titulos = titulos;
	}
	
	

}
