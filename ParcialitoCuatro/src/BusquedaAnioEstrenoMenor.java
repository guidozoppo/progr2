
public class BusquedaAnioEstrenoMenor extends Busqueda {

private int anio;
	
	public BusquedaAnioEstrenoMenor(int anio) {
		this.anio = anio;
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getAnioEstreno()<anio;
	}

}
