
public class Principal {

	public static void main(String[] args) {
		
		Medicamento mm = new Medicamento("Aspirina", "Bayer", 60);
		mm.addSintoma("Dolor de cabeza");
		mm.addSintoma("malestar");
		
		Medicamento mm2 = new Medicamento("Aspirina", "Novartis", 60);
		mm2.addSintoma("Dolor de cabeza");
		mm2.addSintoma("malestar");
		
		Farmacia central  = new Farmacia("Central");
		central.addMedicamento(mm);
		central.addMedicamento(mm2);
		
		PreguntaSintoma pnueva = new PreguntaSintoma("Dolor de cabeza");
		
		PreguntaNombre p1 = new PreguntaNombre("Aspirina");
		PreguntaLaboratorio p2 = new PreguntaLaboratorio("Bayer");
		
		PreguntaAnd p3 = new PreguntaAnd(pnueva, p2);
		
		PreguntaPrecio p4 = new PreguntaPrecio(1200);
		
		PreguntaAnd p5 = new PreguntaAnd(p3, p4);
		//System.out.println(central.buscarMedicamentos(p5));
		
		System.out.println(central.buscarMedicamentos(pnueva));
		
	}

}
