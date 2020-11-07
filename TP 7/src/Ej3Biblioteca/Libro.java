package Ej3Biblioteca;

public class Libro {

	private String nombre;
	private int ISBN;
	private String autor;
	private int anioEdicion;
	private String generoPrincipal;
	
	public Libro(String nombre, int iSBN, String autor, int anioEdicion, String generoPrincipal) {
		this.nombre = nombre;
		ISBN = iSBN;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
		this.generoPrincipal = generoPrincipal;
	}

	
	public String toString() {
	  return nombre + ", " + autor + ", " + anioEdicion + ", " + generoPrincipal + ", " + ISBN + "\n";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getGeneroPrincipal() {
		return generoPrincipal;
	}

	public void setGeneroPrincipal(String generoPrincipal) {
		this.generoPrincipal = generoPrincipal;
	}
	
	
	
}
