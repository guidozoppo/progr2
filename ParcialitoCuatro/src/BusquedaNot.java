
public class BusquedaNot extends Busqueda {

	Busqueda b1;
	
	public BusquedaNot(Busqueda b1) {
		this.b1 = b1;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return !b1.cumple(peli);
	}
}
