package Ej3Agricultores;

import java.util.ArrayList;

public class Lote {
	
	private String nombre;
	private int superficie;
	private ArrayList<String> minerales;
	
	public Lote(String nombre, int superficie) {
		this.nombre = nombre;
		this.superficie = superficie;
		minerales = new ArrayList<>();
	}
	
			
	public void addMinerales(String m) {
		minerales.add(m);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<String> getMinerales() {
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0 ; i<minerales.size(); i++) {
			aux.add(minerales.get(i));
		}
		return aux;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	
	
	
	
}
