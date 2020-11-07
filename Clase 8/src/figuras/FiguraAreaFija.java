package figuras;

public abstract class FiguraAreaFija extends Figura {

	double area;
	
	public FiguraAreaFija(double aa) {
		super("Fija");
		area = aa;
	}
	
	public double getArea() {
		// TODO Auto-generated method stub
		return area;
	}



}
