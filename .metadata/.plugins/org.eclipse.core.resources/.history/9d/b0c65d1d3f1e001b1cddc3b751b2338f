package TPEspecialParte1;

import java.util.ArrayList;

public class Carta implements Comparable <Carta> {

	private String nombre;
	ArrayList<Atributo> atributos;
	private Pocima pocima;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		atributos = new ArrayList<>();
		pocima = null;
	}

	public void addAtributo (Atributo atributo) {
		atributos.add(atributo);
	}
	
	public Pocima getPocima() {
		return pocima;
	}

	public void setPocima(Pocima pocima) {
		this.pocima = pocima;
	}

	@Override
	public int compareTo(Carta o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public Atributo obtenerAtributo(String nombre) {
		for (Atributo atributo:atributos) {
			if(atributo.getNombre().equals(nombre)) {
				return atributo;
			}
		}
		return null;
	}
	
	
	
}
