
public class Rectangulo {
	private double x;
	private double y;
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Rectangulo(double x, double y,double x1, double x2, double y1, double y2) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public void desplazamientoX1() {
		this.x1 = x1+getX();
	}
	
	public void desplazamientoX2() {
		this.x2 = x2+getX();
	}
	
	public void desplazamientoY1() {
		this.y1 = y1+getX();
	}
	
	public void desplazamientoY2() {
		this.y2 = y2+getX();
	}
	
	public double areaRectangulo() {
		return ((x2-x1)*(y2-y1));
	}
	
	public int esMayor(Rectangulo r1, Rectangulo  r2) {
		if(r1.areaRectangulo()>r2.areaRectangulo()) {
			return 1;
		}else if(r1.areaRectangulo()<r2.areaRectangulo()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public boolean esCuadrado() {
		if((x2-x1)==(y2-y1)) {
			return true;
		}else {
			return false;
		}
	}

	public double largoLadoSuperior() {
		if((Math.abs(x2-x1))>(Math.abs(y2-y1))) {
			return Math.abs(x2-x1);
		}else {
			return Math.abs(y2-y1);
		}
	}
	
	public String estaParado() {
		if((x2-x1)>(y2-y1)) {
			return "Esta acostado";
		}else {
			return "Esta parado";
		}
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

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	
}
