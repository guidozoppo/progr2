import java.util.ArrayList;

public class Cochera extends ElementoSIC {

	private ArrayList<String> facilidades;
	private Criterio criterioAceptacion;
	private Auto auto;
	
	public Cochera(Criterio criterioAceptacion) {
		this.criterioAceptacion = criterioAceptacion;
		this.auto = null;
		this.facilidades = new ArrayList<>();
	}
	
	@Override
	public int totalCocheras() {
		return 1;
	}

	@Override
	public ElementoSIC getCopia(Criterio crit) {
		Cochera copia = new Cochera(this.criterioAceptacion);
		if(!this.estaLibre()){  
			if (crit.cumple(this.auto)) {
			copia.setAuto(this.auto.getCopia());
			for(String fac:facilidades) {
				copia.addFacilidad(fac);
			}
			return copia;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Cochera> getCocheras(Auto a) {
		ArrayList<Cochera> cocherasQueCumplen = new ArrayList<>();
		if(this.estaLibre() && this.criterioAceptacion.cumple(a)) {
			cocherasQueCumplen.add(this);
		}
		return cocherasQueCumplen;
	}

	public boolean estaLibre() {
		return auto == null;
	}

	public void setAuto(Auto auto) {
		if(this.estaLibre() && this.criterioAceptacion.cumple(auto)) {
			this.auto = auto;
		}
	}

	public void addFacilidad(String fac) {
		facilidades.add(fac);
	}

}
