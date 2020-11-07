package Ej3Agricultores;


public class Pastura extends Cereal {

	private int hectareasRequeridas;
	
	public Pastura(String nombre, int hectareasRequeridas) {
		super(nombre);
		this.hectareasRequeridas = hectareasRequeridas;
	}

	public int getHectareasRequeridas() {
		return hectareasRequeridas;
	}

	public void setHectareasRequeridas(int hectareasRequeridas) {
		this.hectareasRequeridas = hectareasRequeridas;
	}

	public boolean AceptaLote(Lote l) {
		return super.sePuedeSembrarEnLote(l) && l.getSuperficie()>hectareasRequeridas;
	}
	
}
