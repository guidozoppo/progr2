package Ej2EstacionMeteorologica;

public class EstacionUno extends Estacion {

	private double lluviaMax;
	private int registrosLluvia;
	private double tempMin;
	private int registrosTemp;
	

	public EstacionUno(String nombre, Sensor temperatura, Sensor humedad, Sensor viento, Sensor mm,
			double lluviaMax, int registrosLluvia, double tempMin, int registrosTemp) {
		super(nombre, temperatura, humedad, viento, mm);
		this.lluviaMax = lluviaMax;
		this.registrosLluvia = registrosLluvia;
		this.tempMin = tempMin;
		this.registrosTemp = registrosTemp;
	}

	@Override
	public boolean predecirLluvia() {
		if(mm.promedio(registrosLluvia) <= lluviaMax && temperatura.max(registrosTemp) > tempMin) {
			return true;
		} else {
			return false;
		}
	}

}
