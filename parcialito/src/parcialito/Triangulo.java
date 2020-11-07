package parcialito;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo(double b, double a) {
		base = b;
		altura = a;
	}
	
	public double getArea() {
		return base*altura/2;
	}

}
