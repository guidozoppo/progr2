package TPEspecialParte1;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	ArrayList <Carta> cartasJugador;
	private EstrategiaJuego estrategia;
	
	public Jugador (String nombre, EstrategiaJuego estrategia) {
		this.nombre = nombre;
		cartasJugador = new ArrayList<>();
		this.estrategia = estrategia;
	}
	
	public void addCarta (Carta carta) {
		cartasJugador.add(carta);
	}
	
	@Override
	public String toString () {
		return nombre;
	}

	public EstrategiaJuego getEstrategia() {
		return estrategia;
	}
	
	
	
}
