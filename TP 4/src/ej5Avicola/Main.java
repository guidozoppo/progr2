package ej5Avicola;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ProductoFresco huevoBlanco = new ProductoFresco(LocalDate.of(2020, 10, 13), 150, "Granja Tres Arroyos", LocalDate.of(2019, 10, 13), "Huevo Blanco");

		System.out.println(huevoBlanco);
	}

}
