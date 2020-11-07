package centroAnimales;
import java.util.ArrayList;

public class ObjetoDinamico{

	protected ArrayList <Caracteristica> caracteristicas;

	public ObjetoDinamico() {
		caracteristicas = new ArrayList<>();
	}

	public void addCaracteristica(String nombre, Object valor) {
		Caracteristica c = new Caracteristica(nombre, valor);
		if(!tieneCaracteristica(nombre)) {
			this.caracteristicas.add(c);
		} else {
			actualizarCaracteristica(nombre, valor);
		}
	
	}

	public void actualizarCaracteristica(String nombre, Object valor) {
		Caracteristica c = getCaracteristica(nombre);
		if (c != null) {
			c.setValor(valor);
		}
	}

	public Caracteristica getCaracteristica(String nombre) {
		for(int i=0 ; i<caracteristicas.size() ; i++) {
			if(caracteristicas.get(i).getNombre().equals(nombre)) {
				return caracteristicas.get(i);
			}
		}
		return null;
	}

	public boolean tieneCaracteristica(String nombre) {
		Caracteristica c = this.getCaracteristica(nombre);
		return (c != null);
	}

	public boolean tieneCaracteristica(Caracteristica c) {
		return caracteristicas.contains(c);
	}

	public String toString() {
		return caracteristicas.toString();
	}

}