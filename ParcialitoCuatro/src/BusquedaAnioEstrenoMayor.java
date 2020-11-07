
public class BusquedaAnioEstrenoMayor extends Busqueda {

private int anio;
	
	public BusquedaAnioEstrenoMayor(int anio) {
		this.anio = anio;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getAnioEstreno()>anio;
	}

}
