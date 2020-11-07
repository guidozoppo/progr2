package Ej3Agricultores;

public class Main {

	public static void main(String[] args) {
		
		Cooperativa Agraria = new Cooperativa("Agraria");
		
		Lote DonAngel = new Lote("Don Angel", 500);
		DonAngel.addMinerales("Piedra");
		DonAngel.addMinerales("Carbon");
		
		Lote Molina = new Lote("Molina", 750);
		Molina.addMinerales("Oro");
		Molina.addMinerales("Plata");
		
		Lote Sunino = new Lote("Sunino", 70);
		Sunino.addMinerales("Bronce");
		Sunino.addMinerales("Cobre");
		
		Cereal Girasol = new Cereal("Girasol");
		Girasol.addMineralesRequiere("Piedra");
		
		Cereal Soja = new Cereal("Soja");
		Soja.addMineralesRequiere("Carbon");
	
		Cereal Maiz = new Cereal("Maiz");
		Maiz.addMineralesRequiere("Oro");
		
		Pastura pastura1 = new Pastura("Pasto", 30);
		pastura1.addMineralesRequiere("Cobre");
		
		
		
		Agraria.addLote(DonAngel);
		Agraria.addLote(Sunino);
		Agraria.addLote(Molina);
		Agraria.addMineralEspecial("Piedra");
		Agraria.addMineralEspecial("Oro");
		Agraria.addCereal(Soja);
		Agraria.addCereal(Maiz);
		Agraria.addCereal(Girasol);
		Agraria.addCereal(pastura1);
		
		System.out.println(Agraria.tipoLote(DonAngel));
		System.out.println(Agraria.tipoLote(Molina));
		System.out.println(Agraria.tipoLote(Sunino));
		
		System.out.println("Los lotes que admiten Pastura son: " + Agraria.queLotesAdmiteEsteCereal(pastura1));
		System.out.println("Los lotes que admiten Soja son: " + Agraria.queLotesAdmiteEsteCereal(Soja));
		System.out.println("Los lotes que admiten Maiz son: " + Agraria.queLotesAdmiteEsteCereal(Maiz));
		System.out.println("Los lotes que admiten Girasol son: " + Agraria.queLotesAdmiteEsteCereal(Girasol));

		
		/*System.out.println(Girasol.sePuedeSembrarEnLote(DonAngel));
		System.out.println(Girasol.sePuedeSembrarEnLote(Sunino));
		System.out.println(Girasol.sePuedeSembrarEnLote(Molina));*/
			
		System.out.println("Don Angel admite estos cereales: " + Agraria.queCerealesAdmiteEsteLote(DonAngel));
		System.out.println("Sunino admite estos cereales: " + Agraria.queCerealesAdmiteEsteLote(Sunino));
		System.out.println("Molina admite estos cereales: " + Agraria.queCerealesAdmiteEsteLote(Molina));
	}

}
