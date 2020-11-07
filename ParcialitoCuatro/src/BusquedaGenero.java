
public class BusquedaGenero extends Busqueda {

private String genero;
	
	public BusquedaGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.contieneGenero(genero);
	}

}
