
public class BusquedaDirector extends Busqueda {

	private String direc;
	
	public BusquedaDirector(String persona) {
		this.direc = persona;
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.tieneDirector(direc);
	}

}
