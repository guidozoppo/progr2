package centroAnimales;

public class Caracteristica {

	private String nombre;
	private Object valor;
	
	public Caracteristica(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	
	@Override
	public boolean equals(Object o1) {
		try {
			Caracteristica otra = (Caracteristica)o1;
			return this.getNombre().equals(otra.getNombre());
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public String toString() {
		return getNombre()+": "+ getValor();
	}
	
	public String getNombre() {
		return nombre;
	}



	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	

	
}
