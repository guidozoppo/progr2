import java.util.ArrayList;

public class Farmacia {

	private ArrayList<Medicamento> medicamentos;
	private String nombre;
	
	public Farmacia(String nombre) {
		this.nombre = nombre;
		medicamentos = new ArrayList<Medicamento>();
	}
	
	public void addMedicamento(Medicamento mm) {
		if( !this.tieneMedicamento(mm)) {
			medicamentos.add(mm);
		}
	}
	
	public boolean tieneMedicamento(Medicamento mmm) {
		return medicamentos.contains(mmm); //este contains usa el equals de medicamento que no está implementado.
	}

	public ArrayList<Medicamento> buscarMedicamentos(Pregunta pregunta){
		ArrayList<Medicamento> retorno = new ArrayList<Medicamento>();
		for(int i = 0; i<medicamentos.size() ; i++) {
			Medicamento medi = medicamentos.get(i);	
			if(pregunta.cumple(medi)) {
				retorno.add(medi);
			}
		}
		return retorno;
	}
	
}
