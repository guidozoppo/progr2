package Ej7BusquedaDocumentos;

import java.util.ArrayList;

public class Documento {

	private String titulo;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClaves;
	private String contenido;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		autores = new ArrayList<>();
		palabrasClaves = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public void addAutor(String autor) {
		autores.add(autor);
	}
	
	public ArrayList<String> getAutores(){
		ArrayList<String> aux = new ArrayList<>();
		for(int i = 0 ; i < autores.size(); i++) {
			aux.add(autores.get(i));
		}
		return aux;
	}
	
	public void addPalabraClave(String PalabraClave) {
		palabrasClaves.add(PalabraClave);
	}
	
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> aux = new ArrayList<>();
		for(int i = 0 ; i < palabrasClaves.size(); i++) {
			aux.add(palabrasClaves.get(i));
		}
		return aux;
	}
	
	
}
