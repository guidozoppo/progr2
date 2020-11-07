package TPEspecialParte1;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

	ArrayList <Carta> cartas;
	ArrayList <Pocima> pocimas;
	private Carta tipoCarta;
	
	public Mazo (Carta tipoCarta) {
		this.tipoCarta = tipoCarta;
		cartas = new ArrayList<>();
		pocimas = new ArrayList<>();
	}
	
	public void repartirCartas (Jugador j1, Jugador j2) {
		if(this.verificarAtributos()) {
			Jugador turno = j1;
			mesclarCartas(cartas);
			for (int i = 0; i < cartas.size(); i++) {
				Carta carta = cartas.get(i);
				if (turno == j1) {
					j1.addCarta(carta);
					repartirPocimas(carta);
					turno = j2;
				} else {
					j2.addCarta(carta);
					repartirPocimas(carta);
					turno = j1;
				}
				
			}
		} else {
			System.out.println("Hay cartas con diferentes atributos");
		}
	}
	
	public void repartirPocimas (Carta carta) {
		mesclarPocimas(pocimas);
		if(pocimas.size() > 0) {
			carta.setPocima(pocimas.get(0));
			pocimas.remove(0);
			Pocima pocima = carta.getPocima();
			pocima.hacerEfecto(carta);
		}
		
	}
	
	public void mesclarPocimas(ArrayList<Pocima>pocimas) {
		Collections.shuffle(pocimas);
	}
	
	public void mesclarCartas (ArrayList<Carta>cartas) {
		Collections.shuffle(cartas);
	}
	
	public void addCarta (Carta carta) {
		cartas.add(carta);
	}
	
	public boolean verificarAtributos() {
		for(int i = 0; i < cartas.size(); i++) {
			if(!cartas.get(i).equals(tipoCarta)) {
				return false;
			}
		
		}
		return true;
		
	}
	
	public void addPocima (Pocima pocima) {
		pocimas.add(pocima);
	}
	
	
}