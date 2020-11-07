package Ej2SombreroSeleccionador;

public class Main {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Harry Potter");
		Alumno a2 = new Alumno("Ron Wisley");
		Alumno a3 = new Alumno("Ginney Wisley");
		a1.addCualidad("inteligente");
		a1.addCualidad("agil");
		a2.addCualidad("debil");
		a3.addCualidad("veloz");
		a3.addFamiliaresAsistenAEscuela(a2);
		Casa c1 = new Casa("Gryfindor", 100);
		CasaLinaje c2 = new CasaLinaje("Slytherin", 100);
		CasaEnemistada c3 = new CasaEnemistada("Huffelpof", 100);
		c3.addCasaEnemistada(c2);
		c2.addCualidad("veloz");
		c3.addCualidad("inteligente");
		c2.addAlumno(a2);
		
		System.out.println(c2.aceptaAlumno(a3));
		System.out.println(c3.aceptaAlumno(a1));
		System.out.println(c1.aceptaAlumno(a1));

	}

}
