
public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(double radio) {
		super("Circulo");  //constructor con nombre
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI*radio*radio;
	}
	
	public double getPerimetro() {
		return Math.PI*2*radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public static void main(String[]args ) {
		Circulo JuanCarlos = new Circulo(3.5);
		System.out.println(JuanCarlos);
		System.out.println(JuanCarlos.getNombre()); //el nombre ya fue puesto en super("Circulo")
		System.out.println(JuanCarlos.getArea());
		JuanCarlos.setRadio(2);
		System.out.println(JuanCarlos.getArea());
		
	}
}
