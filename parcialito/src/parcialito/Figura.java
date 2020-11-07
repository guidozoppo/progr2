package parcialito;

public abstract class Figura {

	private String nombre;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getArea();
	
	public String toString() {
		return getNombre() + "-" + getArea();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
