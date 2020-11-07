
public class PuntoGeometrico {

	private double x;
	private double y;
	private double xInicial;
	private double yInicial;
	
	public PuntoGeometrico(int x, int y){
		xInicial = 0;
		yInicial = 0;
		this.x = x;
		this.y = y;
	}
	
	public void desplazamiento(double x, double y) {
		this.x = x+getX();
		this.y = y+getY();
	}
	
	public double getDistanciaEuclidea() {
		double distancia = Math.pow((xInicial-x), 2)+Math.pow((yInicial-y), 2);
		return Math.pow(distancia, 2);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getxInicial() {
		return xInicial;
	}

	public void setxInicial(double xInicial) {
		this.xInicial = xInicial;
	}

	public double getyInicial() {
		return yInicial;
	}

	public void setyInicial(double yInicial) {
		this.yInicial = yInicial;
	}


	
	
	
}
