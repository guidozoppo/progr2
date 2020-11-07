package ej1Alarma;

public class Main {

	public static void main (String[]args) {
		Timbre t1 = new Timbre();
		Alarma a1 = new Alarma(t1);
		
		a1.setMovimiento(true);
		a1.setPuertaVentanaAbierta(true);
		
		a1.comprobar();
		
		/*a1.setMovimiento(false);
		a1.setPuertaVentanaAbierta(false);
		
		a1.comprobar();*/
		
		Timbre t2 = new Timbre();
		Luz l2 = new Luz();
		AlarmaLuminosa al1 = new AlarmaLuminosa(t2, l2);
		
		al1.setMovimiento(true);
		al1.comprobar();
	}
}
