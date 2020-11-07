
public class PreguntaSintoma extends Pregunta {

private String sintoma;
	
	public PreguntaSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return med.trataSintoma(sintoma);
	}

}
