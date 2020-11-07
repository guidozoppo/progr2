import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private int edad;
	private LocalDate fechaNac;
	private int dni;
	private String sexo;
	private int peso;
	private int altura;


	public Persona (int dni) {
		this.dni = dni;
		nombre = "nn";
		//edad = getEdad();
		fechaNac = LocalDate.of(2000, 01, 01);
		sexo = "femenino";
		peso = 1;
		altura = 1;
	}

	public Persona (int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		//edad = getEdad();
		fechaNac = LocalDate.of(2000, 01, 01);
		sexo = "femenino";
		peso = 1;
		altura = 1;
	}

	public Persona (int dni, String nombre, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		//edad = getEdad();
		this.fechaNac = fechaNac;
		sexo = "femenino";
		peso = 1;
		altura = 1;
	}

	public double getMasaCorporal() {
		return peso/(altura*altura);
	}
	
	public boolean estarEnForma() {
		double forma = getMasaCorporal();
		if(forma>18.5 && forma<25) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean cumpleAños() {
		LocalDate fechaHoy = LocalDate.now();
		if ((fechaHoy.getMonthValue()==fechaNac.getMonthValue()) && (fechaHoy.getDayOfWeek()==fechaNac.getDayOfWeek())) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean puedeVotar() {
		if(edad>=16) {
			return true;
		}else {
			return false;
		}
	}

	public boolean esCoherente() {
		LocalDate fechaHoy = LocalDate.now();
		int anio = fechaHoy.getYear()-fechaNac.getYear();
		if (fechaHoy.getDayOfYear() < fechaNac.getDayOfYear()) {
			anio--;
		} 
		if(anio==edad) {
			return true;
		}else {
			return false;
		}
	}

	public String mostrarDatos() {
		String datos = "La persona " + this.getNombre() + " que tiene " + this.getEdad() + " años y su DNI es " + this.getDni() +
				"esta cumpliendo anios " + this.cumpleAños();
		return datos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	




}
