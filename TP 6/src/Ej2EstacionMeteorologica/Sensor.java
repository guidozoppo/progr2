package Ej2EstacionMeteorologica;

import java.util.ArrayList;

public class Sensor {

	private String nombre;
	private ArrayList<Double> registros;
	
	public Sensor(String nombre) {
		this.nombre = nombre;
		registros = new ArrayList<>();
	}

	private int inicio(int cantidadRegistros) {
		int inicio;
		if(this.registros.size()>= cantidadRegistros) {
			inicio = this.registros.size() - cantidadRegistros;
		} else {
			inicio = 0;
		}
		return inicio;
	}
	
	public double promedio(int cantidadRegistros){
		int inicio = inicio(cantidadRegistros);
		double suma = 0;
		int divisor = 0;
		for(int i = inicio; i < this.registros.size(); i++) {
			suma += registros.get(i);
			divisor++;
		} 
		if (divisor == 0) {
			return 0;
		}
		return suma / divisor;
	}
	
	public double max(int cantidadRegistros) {
		int inicio = inicio (cantidadRegistros);
		double max = 0;
		for (int i = inicio; i < registros.size(); i++) {
			if(registros.get(i) > max) {
				max = registros.get(i);
			}
		}
		return max;
	}
	
	public double ult() {
		int ultimo = this.registros.size();
		ultimo = ultimo - 1;
		return registros.get(ultimo);
	}
	
	/////GETTERS AND SETTERS/ADD/////////////////////////
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addRegistro(Double registro) {
		registros.add(registro);
	}

	public ArrayList<Double> getRegistros(){
		ArrayList<Double> aux = new ArrayList<>();
		for(int i = 0; i<registros.size(); i++) {
			aux.add(registros.get(i));
		}
		return aux;
	}



}
