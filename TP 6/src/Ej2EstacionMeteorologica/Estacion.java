package Ej2EstacionMeteorologica;

public abstract class Estacion {

	private String nombre;
	protected Sensor temperatura, humedad, viento, mm;

	public Estacion(String nombre, Sensor temperatura, Sensor humedad, Sensor viento, Sensor mm) {
		this.nombre = nombre;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.viento = viento;
		this.mm = mm;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract boolean predecirLluvia();
	
}
