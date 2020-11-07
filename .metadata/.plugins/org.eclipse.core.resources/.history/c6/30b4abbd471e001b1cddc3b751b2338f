package TPEspecialParte1;

public class PocimaCocktail extends Pocima {

	Pocima pocima1;
	Pocima pocima2;
	
	public PocimaCocktail(String nombre, Pocima pocima1, Pocima pocima2) {
		this.nombre = nombre;
		this.pocima1 = pocima1;
		this.pocima2 = pocima2;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		pocima1.hacerEfecto(carta);
		pocima2.hacerEfecto(carta);
	}

	public String toString() {
		return this.getNombre() + " (es una mezcla entre " + pocima1.getNombre() + " y " + pocima2.getNombre() + ")";
	}
	
}
