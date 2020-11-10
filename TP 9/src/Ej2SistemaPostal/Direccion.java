package Ej2SistemaPostal;

public class Direccion {

	private String persona;
	private String nombreCiudad;
	private String nombreCalle;
	private int numero;
	
	public Direccion(String persona, String nombreCiudad, String nombreCalle, int numero) {
		this.nombreCiudad = nombreCiudad;
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.persona = persona;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
