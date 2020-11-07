package TPEspecialParte1;

import java.util.Comparator;

public class Atributo implements Comparable<Atributo>{

	private String nombre;
	private double valor;
	
	public Atributo (String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Atributo o) {
		return (int) (this.getValor() - o.getValor());
	}

	

	

	
	
	
	
}
