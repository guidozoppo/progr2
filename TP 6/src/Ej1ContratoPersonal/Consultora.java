package Ej1ContratoPersonal;

import java.util.ArrayList;

public class Consultora {

	private String nombre;
	private ArrayList<Candidato> candidatos;
	
	public Consultora(String nombre) {
		this.nombre = nombre;
		candidatos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Candidato> getCandidatos() {
		ArrayList<Candidato> aux = new ArrayList<>();
		for(int i = 0; i < candidatos.size(); i++) {
			aux.add(candidatos.get(i));
		}
		return aux;
	}
	public void addCandidatos(Candidato candidato) {
		this.candidatos.add(candidato);
	}
	
	public ArrayList<String> queCandidatoAceptaContrato(Contrato cont){
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0; i<candidatos.size(); i++){
			if(candidatos.get(i).evaluarContrato(cont)) {
				aux.add(candidatos.get(i).getNombre());
			}
		}
		return aux;
	}
	
}
