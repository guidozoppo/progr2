package parcialito;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(String nombre, double r1) {
		super(nombre);
		radio = r1;
	}

	public double getArea() {
		return Math.PI*radio*radio;
	}

}
