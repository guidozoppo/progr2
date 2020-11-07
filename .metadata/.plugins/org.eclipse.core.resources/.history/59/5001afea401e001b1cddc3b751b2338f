package TPEspecialParte1;

public class Principal {

	public static void main(String[] args) {
		Mazo mazo = new Mazo ();
		
		Carta carta1 = new Carta ("Superman");
		Atributo atributo1Carta1 = new Atributo("Velocidad", 200.0);
		Atributo atributo2Carta1 = new Atributo("Fuerza", 500.0);
		carta1.addAtributo(atributo1Carta1);
		carta1.addAtributo(atributo2Carta1);
		
		Carta carta2 = new Carta ("Flash");
		Atributo atributo1Carta2 = new Atributo ("Velocidad", 800.0);
		Atributo atributo2Carta2 = new Atributo ("Fuerza", 200.0);
		carta2.addAtributo(atributo1Carta2);
		carta2.addAtributo(atributo2Carta2);
		
		Carta carta3 = new Carta ("Hulk");
		Atributo atributo1Carta3 = new Atributo ("Velocidad", 100.0);
		Atributo atributo2Carta3 = new Atributo ("Fuerza", 800.0);
		carta3.addAtributo(atributo1Carta3);
		carta3.addAtributo(atributo2Carta3);
		
		mazo.addCarta(carta1);
		mazo.addCarta(carta2);
		mazo.addCarta(carta3);
		
		Pocima pocima1 = new PocimaFortalecedora("Pocima Fortalecedora", 20.0);
		Pocima pocima2 = new PocimaFortalecedoraPlus("Pocima Fortalecedora Plus", 50.0);
		Pocima pocima3 = new PocimaKriptonita("Pocima Kriptonita", 25.0);
		Pocima pocima4 = new PocimaNumeroMagico("Pocima Numero Magico", 23.0);
		Pocima pocima5 = new PocimaQuieroValeCuatro("Pocima Quiero Vale Cuatro", 4.0);
		Pocima pocima6 = new PocimaReductorDePlomo("Pocima Reductor de Plomo", 55.0);
		Pocima pocima7 = new PocimaSelectivaFuerza("Pocima Selectiva Fuerza", 35.0);
		Pocima pocima8 = new PocimaSelectivaPeso("Pocima Selectiva Peso", 43.0);
		Pocima pocima9 = new PocimaCocktail("Pocima Cocktail", pocima1, pocima2);
		Pocima pocima10 = new PocimaFortalecedora("Pocima Fortalecedora 2", 25.0);
		Pocima pocima11 = new PocimaFortalecedoraPlus("Pocima Fortalecedora Plus 2", 55.0);
		Pocima pocima12 = new PocimaKriptonita("Pocima Kriptonita 2", 30.0);
		Pocima pocima13 = new PocimaNumeroMagico("Pocima Numero Magico 2", 28.0);
		Pocima pocima14 = new PocimaQuieroValeCuatro("Pocima Quiero Vale Cuatro 2", 9.0);
		Pocima pocima15 = new PocimaReductorDePlomo("Pocima Reductor de Plomo 2", 60.0);
		Pocima pocima16 = new PocimaSelectivaFuerza("Pocima Selectiva Fuerza 2", 40.0);
		Pocima pocima17 = new PocimaSelectivaPeso("Pocima Selectiva Peso 2", 48.0);
		Pocima pocima18 = new PocimaCocktail("Pocima Cocktail 2", pocima12, pocima9);
		
		mazo.addPocima(pocima1);
		mazo.addPocima(pocima2);
		mazo.addPocima(pocima3);
		mazo.addPocima(pocima4);
		mazo.addPocima(pocima5);
		mazo.addPocima(pocima6);
		mazo.addPocima(pocima7);
		mazo.addPocima(pocima8);
		mazo.addPocima(pocima9);
		mazo.addPocima(pocima10);
		mazo.addPocima(pocima11);
		mazo.addPocima(pocima12);
		mazo.addPocima(pocima13);
		mazo.addPocima(pocima14);
		mazo.addPocima(pocima15);
		mazo.addPocima(pocima16);
		mazo.addPocima(pocima17);
		mazo.addPocima(pocima18);
		
		EstrategiaJuego timbero = new EstrategiaTimbero();
		EstrategiaJuego ambicioso = new EstrategiaAmbicioso();
		EstrategiaJuego obstinado = new EstrategiaObstinado("Fuerza");
		
		Jugador j1 = new Jugador ("Jose", timbero);
		Jugador j2 = new Jugador ("Eduardo", ambicioso);
		
		Juego baraja = new Juego(j1, j2);
		
		mazo.repartirCartas(j1, j2);
		baraja.agarrarCarta(j1, j2);
		System.out.println("¡¡ EL GANADOR ES " + baraja.setGanador() + " !!");
	}

}
