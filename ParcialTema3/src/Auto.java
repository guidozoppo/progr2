import java.util.ArrayList;

public class Auto {

	private String marca;
	private int modelo;
	private ArrayList<String> caracteristicas;
	private ArrayList<String> facilidadesNecesarias;
	
	public Auto(String marca, int modelo) {
		this.marca = marca;
		this.modelo = modelo;
		caracteristicas = new ArrayList<>();
		facilidadesNecesarias = new ArrayList<>();
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void addCaracteristica(String caracteristicas) {
		this.caracteristicas.add(caracteristicas);
	}

	public void addFacilidadesNecesaria(String facilidadesNecesarias) {
		this.facilidadesNecesarias.add(facilidadesNecesarias);
	}
	
	public Auto getCopia() {
		Auto copia = new Auto(this.marca, this.modelo);
		for(String carac:caracteristicas) {
			copia.addCaracteristica(carac);
		}
		for(String facNec:facilidadesNecesarias) {
			copia.addFacilidadesNecesaria(facNec);
		}
		return copia;
	}
	
	
	
	
	
}
