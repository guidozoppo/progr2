package ej4Seleccion;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Contingente boca = new Contingente();
		Integrante roman = new Futbolista("Roman", "Riquelme", 122, LocalDate.of(1986, 06, 24), "En pais de origen", "MO", "Derecho", 78);
		
		boca.addIntegrante(roman);
		System.out.println(roman.estaDisponible());
	}

}
