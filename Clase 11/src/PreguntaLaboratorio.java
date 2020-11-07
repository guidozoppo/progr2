
public class PreguntaLaboratorio extends Pregunta {

private String nombre;
	
	public PreguntaLaboratorio(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return med.getLaboratorio().equals(nombre);
	}


}
