
public class PreguntaPrecio extends Pregunta {

	private double precioBuscado;
	
	public PreguntaPrecio(double precio) {
		precioBuscado = precio;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return med.getPrecio() == precioBuscado;
	}


}
