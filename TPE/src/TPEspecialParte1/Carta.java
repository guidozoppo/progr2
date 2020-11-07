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
	
	public boolean equals(Object o1) {
		try {
			Carta cc = (Carta) o1;
			int cantidad = cc.atributos.size();
			int cant = 0;
			for(int i = 0; i < cantidad; i++) {
				if(this.atributos.get(i).getNombre().equals(cc.atributos.get(i).getNombre())) {
					cant++;
				}
				if(cant == cantidad) {
					return true;
				}
				
			}
			return false;
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
