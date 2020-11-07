
public class BusquedaActor extends Busqueda {

	private Actor actor;
	
	public BusquedaActor(Actor persona) {
		this.actor = persona;
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.tieneActor(actor);
	}

}
