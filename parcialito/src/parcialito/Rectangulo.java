package parcialito;

public class Rectangulo extends Figura {

	private double lado1;
	private double lado2;
	
	public Rectangulo(double l1, double l2) {
		super("rectangulo");
		lado1 = l1;
		lado2 = l2;
	}
	
	
	public double getArea() {
		return lado1*lado2;
	}

}
