
public class Figura3DRegular {

	Figura base;
	double altura;
	
	public Figura3DRegular(Figura ff, double alto) {
		base = ff;
		altura = alto;
	}
	
	public double getVolumen() {
		return base.getArea()*altura;
	}
	
	public String getNombre() {
		return base.getNombre()+ "3D";
	}
	
	public static void main(String[] args) {
		Circulo cc = new Circulo(2);
		Figura3DRegular figNueva = new Figura3DRegular(cc, 10);
		System.out.println(figNueva.getNombre());
		System.out.println(figNueva.getVolumen());
		
		
		Rectangulo rr = new Rectangulo(10, 10);
		Figura3DRegular figNueva2 = new Figura3DRegular(rr, 10);
		System.out.println(figNueva2.getNombre());
		System.out.println(figNueva2.getVolumen());		
	}

}
