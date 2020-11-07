package Ej2EstacionMeteorologica;

public class EstacionTres extends Estacion {

	private int vientoMin, lluviaMax, registroHumedad, humedadMax;
		

	public EstacionTres(String nombre, Sensor temperatura, Sensor humedad, Sensor viento, Sensor mm, int vientoMin,
			int lluviaMax, int registroHumedad, int humedadMax) {
		super(nombre, temperatura, humedad, viento, mm);
		this.vientoMin = vientoMin;
		this.lluviaMax = lluviaMax;
		this.registroHumedad = registroHumedad;
		this.humedadMax = humedadMax;
	}

	@Override
	public boolean predecirLluvia() {
		if(viento.ult() > vientoMin && mm.ult() < lluviaMax && humedad.promedio(registroHumedad) < humedadMax) {
			return true;
		} else {
			return false;
		}
	}

}
