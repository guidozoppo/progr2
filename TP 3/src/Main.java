import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Electrodomestico Elec1 = new Electrodomestico("Lavarropa");
		Elec1.setConsumoElectrico(44);
		Elec1.setPeso(50);
		Elec1.setPrecioBase(1);
		System.out.println(Elec1.mostrarDatos());
	
	
		Persona Carla = new Persona(4121096, "Carla", LocalDate.of(1998, 10, 13));
		Carla.setEdad(75);
		Carla.setNombre("Guido");
		Carla.setSexo("Masculino");
		Carla.setEdad(21);
		System.out.println(Carla.mostrarDatos());
	
		
		PuntoGeometrico a = new PuntoGeometrico(5,6);
		a.setxInicial(10);
		a.setyInicial(12);
		System.out.println(a.getDistanciaEuclidea());
		System.out.println("El valor de x es " + a.getX()+ " y el de y es " + a.getY());
		a.desplazamiento(5, 6);
		System.out.println("Luego del desplazamiento, el valor de x es " + a.getX()+ " y el de y es " + a.getY());
		
		Rectangulo r1 = new Rectangulo(0,0,8,2,12,4);
		Rectangulo r2 = new Rectangulo(0,0,4,2,8,6);
		System.out.println(r1.esMayor(r1, r2));
		System.out.println(r1.areaRectangulo());
		System.out.println(r1.esCuadrado());
		System.out.println(r1.largoLadoSuperior());
		System.out.println(r1.estaParado());
	}

}
