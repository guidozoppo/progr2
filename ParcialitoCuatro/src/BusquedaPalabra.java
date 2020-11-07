
public class BusquedaPalabra extends Busqueda {

private String titulo;
	
	public BusquedaPalabra(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.tituloContienePalabra(titulo.toLowerCase());
	}

}
