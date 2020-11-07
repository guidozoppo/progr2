import java.util.ArrayList;

public class Plataforma {
	
	String nombre;
	private ArrayList<Pelicula> peliculas;
	Busqueda rentabilidad;
	
	public Plataforma(String nombre) {
		peliculas = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public ArrayList<Pelicula> buscar (Busqueda b1){
		ArrayList<Pelicula> lasQueCumplen = new ArrayList<>();
		for(Pelicula peli:peliculas) {
			if(b1.cumple(peli)) {
				lasQueCumplen.add(peli);
			}
		}
		return lasQueCumplen;
	}
	
	public void setBusqueda(Busqueda nueva) {
		rentabilidad = nueva;
	}
	
	public void addPelicula(Pelicula p) {
		if(esRentable(p)) {
			peliculas.add(p);
		} else {
			System.out.println("No se pudo agregar, no es rentable");
		}
	}
	
	public boolean esRentable(Pelicula peli) {
		return rentabilidad.cumple(peli);
	}
}
