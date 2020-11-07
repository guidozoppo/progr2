package figuras;

public abstract class Figura {
	
	String nombre;
	
	public Figura(String n) {
		nombre = n;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public String getNombre() {
		return nombre;
	}
	
	
	//METODO TEMPLATE, UTILIZA METODOS ABSTRACTOS
	public String getNombreCompleto() {
		String salida= "La figura se llama: " + nombre;
		
		salida = salida + " su area es: " + this.getArea();
		
		salida = salida + " su perimetro es: " + this.getPerimetro();
		
		return salida;
	}
	
	
	public static void imprimirPorConsola(Figura f1) {
		System.out.println(f1.getNombreCompleto());
		//System.out.println(f1.getRadio());
	}
	
	public static void main (String[] args) {
		
		Circulo f1 = new Circulo(10);
		Circulo c1 = new Circulo(20);
		
		Figura.imprimirPorConsola(f1);
		Figura.imprimirPorConsola(c1);
		
		Figura ff = new FiguraAreaFijaYPerimetroFijo(10, 20);
	}
}
