
public class PreguntaOr extends Pregunta {

	Pregunta p1;
	Pregunta p2;
	
	public PreguntaOr(Pregunta pa, Pregunta pb) {
		p1 = pa;
		p2 = pb;
	}
	
	@Override
	public boolean cumple(Medicamento med) {
		return p1.cumple(med) || p2.cumple(med);
	}

}
