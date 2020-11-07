import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<Actor> actores;
	private int anioEstreno;
	private int duracion;
	private int edadMinima;
	
	public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		generos = new ArrayList<String>();
		actores = new ArrayList<Actor>();
	}

	
	public void addGenero(String genero) {
		generos.add(genero.toLowerCase());
	}
	
	public void addActor(Actor act) {
		if(!this.tieneActor(act)) {
			actores.add(act);
		}
	}
	
	public boolean tieneActor(Actor act) {
		return actores.contains(act);
	}
	
	public boolean contieneGenero(String genero) {
		if(genero != null) {
			return generos.contains(genero.toLowerCase());
		} else {
			return false;
		}
	}
	
	public boolean tituloContienePalabra(String palabra) {
		if(titulo !=null) {
			return titulo.toLowerCase().contains(palabra.toLowerCase());
		} else {
			return false;
		}
	}
	
	public boolean tieneDirector(String direc) {
		return director == direc;
	}

	//---------------GETTERS AND SETTERS--------------------
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}
	


	
	/*public boolean equals(Object o1) {
		try {
			Pelicula auxi = (Pelicula) o1;
			
			if( (actores.equals(auxi.tieneActor(act)) ) && ( !director.equals(auxi.getDirector()) ) ) {
				
			
				}
				return true;
				
			}else {
				return false;
			}
	
	}*/
}
