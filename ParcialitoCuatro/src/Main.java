/*
		- Buscar todas las películas que en el título contenga la palabra “luna”.
		- Buscar todas las películas que contengan un género específico (por ejemplo, “terror”).
		- Buscar todas las películas en las que haya actuado Will Smith y cuyo director NO haya sido Martin Scorsese.
- Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 95 minutos.
*/
public class Main {

	public static void main(String[] args) {
		Pelicula boca = new Pelicula("Boca La Pasion", "BocaSinopsis", "Bianchi", 2007, 10, 2);
		boca.addGenero("Emotiva");
		System.out.println("Es de genero emotiva? " + boca.contieneGenero("Emotiva"));
		System.out.println("En el titulo esta la palabra boca? " + boca.tituloContienePalabra("Boca"));
		
		
		Actor WillSmith = new Actor("Smith");
		boca.addActor(WillSmith);
		
		BusquedaActor Smith = new BusquedaActor(WillSmith);
		System.out.println("Smith es actor? " + Smith.cumple(boca));
		
		Plataforma Netflix = new Plataforma("Netflix");
		//Netflix.addPelicula(boca);
		Netflix.setBusqueda(Smith);
		System.out.println("Es rentable la pelicula Boca La Pasion? " + Netflix.esRentable(boca));
		
		//System.out.println("Actores: " + boca.getActores() + "\n" + "Director: " + boca.getDirector());
		
		
		BusquedaDirector Scorsese = new BusquedaDirector("Scorsese");
		System.out.println("Scorsese es director? " + Scorsese.cumple(boca));
		
		BusquedaNot NoScorsese = new BusquedaNot(Scorsese);
		System.out.println("Scorsese no es director " + NoScorsese.cumple(boca));
		
		BusquedaAnd SmithYNoScorsese = new BusquedaAnd(Smith, NoScorsese);
		System.out.println("Smith es actor y Scorsese no es director? " + SmithYNoScorsese.cumple(boca));
		
		BusquedaAnioEstrenoMenor Anio = new BusquedaAnioEstrenoMenor(2015);
		BusquedaDuracion minutos = new BusquedaDuracion(95);
		BusquedaAnd AnioYMinutos = new BusquedaAnd(Anio, minutos);
		System.out.println("Se grabo antes del 2015 y dura menos de 95': " + AnioYMinutos.cumple(boca));
		
		BusquedaDuracion minutosCientoVeinte = new BusquedaDuracion(120);
		BusquedaGenero Comedia = new BusquedaGenero("Comedia");
		BusquedaNot NoComedia = new BusquedaNot(Comedia);
		BusquedaAnd menorCientoVeinteYNoComedia = new BusquedaAnd(minutosCientoVeinte, NoComedia);
		System.out.println("Dura menos que 120 minuos y no es de comedia? "+ menorCientoVeinteYNoComedia.cumple(boca));
		
		BusquedaAnioEstrenoMayor dosMilDiecisiete = new BusquedaAnioEstrenoMayor(2017);
		BusquedaGenero Infantil = new BusquedaGenero("Infantil");
		BusquedaGenero Documental = new BusquedaGenero("Documental");
		BusquedaOr InfDoc = new BusquedaOr(Infantil, Documental);
		BusquedaOr dosMilDiecisieteOInfODoc = new BusquedaOr(InfDoc, dosMilDiecisiete);
		
		boca.addGenero("Infantil");
		System.out.println("Es mayor al 2017 o es infantil o documental? " + dosMilDiecisieteOInfODoc.cumple(boca));
}
}
