package TPEspecialParte1;

public class EstrategiaTimbero extends EstrategiaJuego {

	@Override
	public Atributo funcion(Jugador jugador) {
		int random;
		Atributo atributo;
		random = (int) (Math.random()*jugador.cartasJugador.get(0).atributos.size());
		atributo = jugador.cartasJugador.get(0).atributos.get(random);
		return atributo;
	}

}
