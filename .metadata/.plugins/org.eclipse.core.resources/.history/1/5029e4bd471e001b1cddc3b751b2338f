package TPEspecialParte1;

import java.util.ArrayList;
import java.util.Collections;

public class EstrategiaAmbicioso extends EstrategiaJuego {

	@Override
	public Atributo funcion(Jugador jugador) {
		ArrayList<Atributo> atributos = new ArrayList<>(jugador.cartasJugador.get(0).atributos);
		Collections.sort(atributos);
		return atributos.get(atributos.size()-1);
	}

}
