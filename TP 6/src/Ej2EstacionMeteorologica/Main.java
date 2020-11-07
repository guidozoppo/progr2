package Ej2EstacionMeteorologica;

public class Main {

	public static void main(String[] args) {
		
		Sensor humedad = new Sensor("humedad");
		humedad.addRegistro(23.3);
		humedad.addRegistro(30.5);
		humedad.addRegistro(49.3);
		humedad.addRegistro(20.1);
		humedad.addRegistro(13.8);
		humedad.addRegistro(23.3);
		humedad.addRegistro(30.5);
		humedad.addRegistro(49.3);
		humedad.addRegistro(20.1);
		humedad.addRegistro(40.8);
		humedad.addRegistro(55.3);
		humedad.addRegistro(60.1);
		
		Sensor lluvia = new Sensor("lluvia");
		lluvia.addRegistro(23.3);
		lluvia.addRegistro(113.3);
		lluvia.addRegistro(100.3);
		lluvia.addRegistro(33.9);
		lluvia.addRegistro(203.8);
		lluvia.addRegistro(13.6);
		lluvia.addRegistro(23.3);
		lluvia.addRegistro(113.3);
		lluvia.addRegistro(100.3);
		lluvia.addRegistro(33.9);
		lluvia.addRegistro(103.8);
		lluvia.addRegistro(13.6);
		lluvia.addRegistro(23.3);
		lluvia.addRegistro(13.3);
		lluvia.addRegistro(100.3);
		lluvia.addRegistro(33.9);
		lluvia.addRegistro(10.8);
		lluvia.addRegistro(13.6);
		lluvia.addRegistro(23.3);
		lluvia.addRegistro(213.3);

		Sensor viento = new Sensor("viento");
		viento.addRegistro(35.9);
		viento.addRegistro(45.9);
		
		Sensor temperatura = new Sensor("temperatura");
		temperatura.addRegistro(25.5);
		temperatura.addRegistro(15.0);
		temperatura.addRegistro(17.5);
		temperatura.addRegistro(28.5);
		temperatura.addRegistro(33.8);
		temperatura.addRegistro(25.5);
		temperatura.addRegistro(15.0);
		temperatura.addRegistro(17.5);
		temperatura.addRegistro(28.5);
		temperatura.addRegistro(33.8);
		temperatura.addRegistro(25.5);
		temperatura.addRegistro(15.0);
		temperatura.addRegistro(17.5);
		temperatura.addRegistro(28.5);
		temperatura.addRegistro(33.8);
		
		EstacionUno tandil = new EstacionUno("Tandil", temperatura, humedad, viento, lluvia, 110.0, 8,25.0,12);
		EstacionDos vela = new EstacionDos("Vela", temperatura, humedad, viento, lluvia, 54);
		EstacionUno balcarce = new EstacionUno("Balcarce", temperatura, humedad, viento, lluvia, 135.0, 16, 28.0, 12);
		EstacionTres bahiaBlanca= new EstacionTres("Bahia Blanca", temperatura, humedad, viento, lluvia, 9, 35, 29, 53);
		EstacionDos azul = new EstacionDos("Azul", temperatura, humedad, viento, lluvia, 63);
		
		System.out.println("Llueve en Tandil?" + tandil.predecirLluvia());
		System.out.println("Llueve en Vela?" + vela.predecirLluvia());
		System.out.println("Llueve en Balcarce?" + balcarce.predecirLluvia());
		System.out.println("Llueve en Bahia Blanca?" + bahiaBlanca.predecirLluvia());
		System.out.println("Llueve en Azul?" + azul.predecirLluvia());

	}

}
