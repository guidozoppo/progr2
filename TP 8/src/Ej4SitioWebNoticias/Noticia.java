package Ej4SitioWebNoticias;

import java.util.ArrayList;

public class Noticia extends ElementoPortal {

	private String titulo, autor, texto, link, introduccion;
	private ArrayList<String> palabrasClaves;
	
	
	public Noticia(String titulo, String link) {
		this.titulo = titulo;
		this.link = link;
		palabrasClaves = new ArrayList<>();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getIntroduccion() {
		return introduccion;
	}


	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}


	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<String>(palabrasClaves);
	}

	public boolean tienePalabra(String pal) {
		return palabrasClaves.contains(pal);
	}

	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves.clear();
		this.palabrasClaves.addAll(palabrasClaves);
	}


	@Override
	public int cantNoticias() {
		return 1;
	}
	
	//COPIA COMPLETA
	@Override
	public ElementoPortal getCopia() {
		Noticia copia = new Noticia(this.getTitulo(), this.getLink());
		copia.setAutor(this.getAutor());
		copia.setIntroduccion(this.getIntroduccion());
		copia.setTexto(this.getTexto());
		copia.setPalabrasClaves(this.getPalabrasClaves());
		return copia;
	}
	
	//COPIA RESTRINGIDA
	@Override
	public ElementoPortal getCopia(String palabraClave) {
		if(this.tienePalabra(palabraClave)) {
			return this.getCopia();
		} else {
			return null;
		}
		
	}
	
	
	
}
