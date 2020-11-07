
public class PreguntaNombre extends Pregunta {

	private String nombre;
	
	public PreguntaNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return med.getNombre().equals(nombre);
	}

}
