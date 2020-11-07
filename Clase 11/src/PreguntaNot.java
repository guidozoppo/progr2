
public class PreguntaNot extends Pregunta {

	Pregunta p2;
	
	public PreguntaNot(Pregunta pb) {
		p2 = pb;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return ! p2.cumple(med);
	}

}
