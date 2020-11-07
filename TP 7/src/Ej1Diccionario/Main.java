package Ej1Diccionario;

public class Main {

	public static void main(String[] args) {
		
		Diccionario RAE = new Diccionario();
		
		Palabra Arbol = new Palabra("Arbol", "Sustantivo");
		Palabra Zorro = new Palabra("Zorro", "Sustantivo");
		Palabra Carlos = new Palabra("Carlos", "Sustantivo");
		
		Arbol.addSinonimo(Zorro);
		Arbol.addSinonimo(Carlos);
		
		RAE.addPalabra(Arbol);
		RAE.addPalabra(Zorro);
		RAE.addPalabra(Carlos);
		
		System.out.println(RAE.getPalabraEntre(Arbol, Zorro));
		System.out.println(RAE.getPalabra());
		
		RAE.eliminarPalabara(Carlos);
		System.out.println(RAE.getPalabra());
		System.out.println(Arbol.getSinonimos());
		
	}

}
