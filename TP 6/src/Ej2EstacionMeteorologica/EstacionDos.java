package Ej2EstacionMeteorologica;

public class EstacionDos extends Estacion {

	private double humedadMin;
	
	public EstacionDos(String nombre, Sensor temperatura, Sensor humedad, Sensor viento, Sensor mm,
			int registroHumedad) {
		super(nombre, temperatura, humedad, viento, mm);
		this.humedadMin = registroHumedad;
	}

	@Override
	public boolean predecirLluvia() {
		if(humedad.ult() >= this.humedadMin) {
			return true;
		} else {
			return false;
		}
	}

}
