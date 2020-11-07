import java.util.ArrayList;

public class Paciente {

	private String nombre;
	private int edad;
	private ArrayList<String> sintomas;
	private ArrayList<String> requerimientosNecesarios;
	
	public Paciente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		sintomas = new ArrayList<>();
		requerimientosNecesarios = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addSintoma(String s) {
		sintomas.add(s);
	}
	
	public void addRequerimientoNecesario(String reqNec) {
		this.requerimientosNecesarios.add(reqNec);
	}
	
	public Paciente getCopia() {
		Paciente copia = new Paciente(this.nombre, this.edad);
		for (String req : requerimientosNecesarios) {
			copia.addRequerimientoNecesario(req);
		}
		for (String sintoma : sintomas) {
			copia.addSintoma(sintoma);
		}
		return copia;
	}

	public boolean tieneSintoma(String sintoma) {
		return sintomas.contains(sintoma);
	}
	
	public boolean requiereEquipo(String equipo) {
		return requerimientosNecesarios.contains(equipo);
	}
	
}
