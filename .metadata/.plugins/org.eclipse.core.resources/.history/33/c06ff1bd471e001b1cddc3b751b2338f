package TPEspecialParte1;

public class Juego {

	private Jugador j1;
	private Jugador j2;
	private Carta cartaJ1;
	private Carta cartaJ2;
	private Jugador turno;
	private int MAXRONDAS = 5;
	
	public Juego (Jugador j1, Jugador j2) {
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public void agarrarCarta (Jugador j1, Jugador j2) {
		turno = j1;
		Atributo atributo1 = null;
		Atributo atributo2 = null;
		
		for (int i = 1; i < MAXRONDAS; i++) {
			if (j1.cartasJugador.size() > 0 && j2.cartasJugador.size() > 0) {
				System.out.println("-------------------RONDA " + i + " ----------------------");
				System.out.println(j1 + " (Cartas: " + j1.cartasJugador.size() + "). " + j2 + " (Cartas: " + j2.cartasJugador.size() + ").");
				//____________________________________TURNO JUGADOR 1_______________________________________________
				if (turno == j1) {
					cartaJ1 = j1.cartasJugador.get(0);
					
					atributo1 = j1.getEstrategia().funcion(j1);
					
					System.out.println("El jugador " + j1 + " eligio la carta " + cartaJ1.getNombre() + " y se le asigno el atributo " + atributo1.getNombre() + " con el valor: " + atributo1.getValor());
					if(cartaJ1.getPocima() != null) {
						System.out.println("    La carta " + cartaJ1.getNombre() + " cuenta con la pocima " + cartaJ1.getPocima());
					}  else {
						System.out.println("    La carta no cuenta con pocimas");
					}
					
					//----------------------JUEGA EL JUGADOR 2 ----------------------------
					
					cartaJ2 = j2.cartasJugador.get(0);
					atributo2 = cartaJ2.obtenerAtributo(atributo1.getNombre());
					System.out.println("El jugador " + j2 + " eligio la carta " + cartaJ2.getNombre() + " y se le asigno el atributo " + atributo2.getNombre() + " con el valor: " + atributo2.getValor());
					if(cartaJ2.getPocima() != null) {
						System.out.println("    La carta " + cartaJ2.getNombre() + " cuenta con la pocima " + cartaJ2.getPocima());
					} else {
						System.out.println("    La carta no cuenta con pocimas");
					}
					turno = j2;
				} 
				//______________________________________TURNO JUGADOR 2_______________________________________________
				else {
					cartaJ2 = j2.cartasJugador.get(0);
					
					atributo2 = j2.getEstrategia().funcion(j2);
					System.out.println("El jugador " + j2 + " eligio la carta " + cartaJ2.getNombre() + " y se le asigno el atributo " + atributo2.getNombre() + " con el valor: " + atributo2.getValor());
					if(cartaJ2.getPocima() != null) {
						System.out.println("    La carta " + cartaJ2.getNombre() + " cuenta con la pocima " + cartaJ2.getPocima());
					} else {
						System.out.println("    La carta no cuenta con pocimas");
					}
					
					//---------------------JUEGA EL JUGADOR 1-----------------------------
					
					cartaJ1 = j1.cartasJugador.get(0);
					atributo1 = cartaJ1.obtenerAtributo(atributo2.getNombre());
					System.out.println("El jugador " + j1 + " eligio la carta " + cartaJ1.getNombre() + " y se le asigno el atributo " + atributo1.getNombre() + " con el valor: " + atributo1.getValor());
					if(cartaJ1.getPocima() != null) {
						System.out.println("    La carta " + cartaJ1.getNombre() + " cuenta con la pocima " + cartaJ1.getPocima());
					} else {
						System.out.println("    La carta no cuenta con pocimas");
					}
					turno = j1;
				}
				jugar(atributo1, atributo2);
			} else {
				i = MAXRONDAS;
			}
			}
		//LAMAMOS AL GANDOR
	}
	
	public void jugar (Atributo atributo1, Atributo atributo2) {
		if (atributo1.getValor() > atributo2.getValor()) {
			j1.cartasJugador.remove(0);
			j1.cartasJugador.add(cartaJ1);
			j1.cartasJugador.add(cartaJ2);
			j2.cartasJugador.remove(0);
			turno = j1;
			System.out.println("Gano la ronda: " + j1 + "(" + j1.cartasJugador.size() + "). " +  j2 + " (" + j2.cartasJugador.size() + ") \n");
			
		} else if (atributo1.getValor() == atributo2.getValor()){
			j1.cartasJugador.remove(0);
			j1.addCarta(cartaJ1);
			j2.cartasJugador.remove(0);
			j2.cartasJugador.add(cartaJ2);
			System.out.println("Empataron");
		} else {
			j2.cartasJugador.remove(0);
			j2.cartasJugador.add(cartaJ1);
			j2.cartasJugador.add(cartaJ2);
			j1.cartasJugador.remove(0);
			turno = j2;
			System.out.println("Gano la ronda: " + j2 + "(" + j2.cartasJugador.size() + "). " +  j1 + " (" + j1.cartasJugador.size() + ") \n");
		}
	}
	
	public Jugador setGanador () {
		if(j1.cartasJugador.size() > j2.cartasJugador.size()) {
			return j1;
		} else if (j2.cartasJugador.size() > j1.cartasJugador.size()) {
			return j2;
		} else {
			return null;
		}
	}
	
}
