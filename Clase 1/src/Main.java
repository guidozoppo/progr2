
public class Main {
	public static void main (String[] args){
		Avion a1 = new Avion();// = new Avion(1980, "Verde");
		
		System.out.println(a1.getColor());
		
		a1.setColor("Rojo");
		System.out.println(a1.getColor());	
		
		Avion a2 = new Avion(1980, 50);	
		
		System.out.println(a2.getModelo());
	}
}
