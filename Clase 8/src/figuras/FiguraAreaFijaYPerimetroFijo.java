package figuras;

public class FiguraAreaFijaYPerimetroFijo extends FiguraAreaFija {

	double perimetro;
	
	public FiguraAreaFijaYPerimetroFijo(double area, double perimetro) {
		super(area);
		this.perimetro = perimetro;
	}
	
	@Override
	public double getPerimetro() {
	
		return perimetro;
	}

}
