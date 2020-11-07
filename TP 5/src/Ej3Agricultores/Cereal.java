package Ej3Agricultores;

import java.util.ArrayList;

public class Cereal {

	private String nombre;
	private ArrayList<String> mineralesRequiere;
	
	public Cereal (String nombre) {
		this.nombre = nombre;
		mineralesRequiere = new ArrayList<>();
	}

	public boolean sePuedeSembrarEnLote(Lote l) {
		return l.getMinerales().containsAll(mineralesRequiere);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public ArrayList<String> getMineralesRequiere() {
		return mineralesRequiere;
	}*/

	public void addMineralesRequiere(String min) {
		mineralesRequiere.add(min);
	}
	
	
}
