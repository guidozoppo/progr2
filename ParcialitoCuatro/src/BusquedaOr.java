
public class BusquedaOr extends Busqueda {

	Busqueda b1;
	Busqueda b2;
	
	public BusquedaOr(Busqueda b1, Busqueda b2) {
		this.b1 = b1;
		this.b2 = b2;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return b1.cumple(peli) || b2.cumple(peli);
	}
}
