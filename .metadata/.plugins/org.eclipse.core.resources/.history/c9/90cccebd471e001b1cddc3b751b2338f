package TPEspecialParte1;

public class EstrategiaObstinado extends EstrategiaJuego {

	private String atributo;
	
	public EstrategiaObstinado(String atributo) {
		this.atributo = atributo;
	}
	
	@Override
	public Atributo funcion(Jugador jugador) {
		Carta cartaJugador = jugador.cartasJugador.get(0);
		for (int i = 0; i < cartaJugador.atributos.size(); i++) {
			String nombreAtributo = cartaJugador.atributos.get(i).getNombre();
			if(nombreAtributo.equals(atributo)) {
				return cartaJugador.atributos.get(i);
			}
		}
		
		return null;
		
	}

}
