
public class BusquedaDuracion extends Busqueda {

private int duracion;
	
	public BusquedaDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getDuracion()<duracion;
	}

}
