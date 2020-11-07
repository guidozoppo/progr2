import java.util.ArrayList;

public class Cama extends ElementoSIS {

	private ArrayList<String> equipamiento;
	private Paciente paciente;
	private Criterio criterioAceptacion; //La cama podrá ser ocupada si el paciente tiene este criterio
	
	public Cama(Criterio criterioAceptacion) {
		equipamiento = new ArrayList<>();
		this.criterioAceptacion = criterioAceptacion;
		paciente = null;
	}
	
	@Override
	public int totalCamas() {
		return 1;
	}

	@Override
	public ArrayList<Cama> getCamas(Paciente pac) {
		ArrayList<Cama> camasQueCumplen = new ArrayList<>();
		if(this.estaLibre()
				&& this.criterioAceptacion.cumple(pac)) {
			camasQueCumplen.add(this);
		}
		return camasQueCumplen;
	}

	private boolean estaLibre() {
		if(paciente == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public ElementoSIS getCopia(Criterio crit) {
		if(!this.estaLibre()) {
			if(crit.cumple(this.paciente)) {
				Cama copia = new Cama(this.criterioAceptacion);
				copia.setPaciente(this.paciente.getCopia());
				for(String eq:this.equipamiento) {
					copia.addEquipamiento(eq);
				}
				return copia;
			}
		}
		return null;
	}
	
	public void addEquipamiento(String equip) {
		this.equipamiento.add(equip);
	}

	public void setPaciente(Paciente p) {
		if(this.estaLibre() && this.criterioAceptacion.cumple(p)) {
			this.paciente = p;
		}
	}
}