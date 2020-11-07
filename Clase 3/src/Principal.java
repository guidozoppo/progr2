
public class Principal {

		public Principal() {
			
		}
		
		public void imprimir(Figura f) {
			System.out.println(f.getDatosCompletos());
			System.out.println("La figura " + f.getNombre() + " tiene un area de " + f.getArea());
		}
	
	
	public static void main(String[] args) {
		/*
		Circulo cc = new Circulo(2);
		Rectangulo rr = new Rectangulo(4,5);
		
		Figura ff = new Circulo(3);
		System.out.println(ff.getArea());

		ff = rr;
		System.out.println(ff.getArea());
		*/
		
		Principal principal = new Principal();
		Rectangulo rr = new Rectangulo(4,5);
		principal.imprimir(rr);
		Circulo cc = new Circulo(3);
		principal.imprimir(cc);
		
		MedioCirculo mc = new MedioCirculo(3);
		principal.imprimir(mc);
	}

}
