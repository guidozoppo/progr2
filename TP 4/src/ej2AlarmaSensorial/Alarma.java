package ej2AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
	
	private ArrayList<Sensor> sensores;
	protected Timbre timbre;
	
	public Alarma(Timbre timbre) {
		sensores = new ArrayList<>();
		this.timbre = timbre;
	}
	
	public void addSensor(Sensor s) {
		sensores.add(s);
	}
	
	public void comprobarAlarma() {
		ArrayList<Sensor> activos = new ArrayList<Sensor>();
		for( int i = 0 ; i < sensores.size() ; i++) {
			Sensor sensor1 = this.sensores.get(i);
			if(sensor1.estaActivado()) {
				timbre.isSonido();
				activos.add(sensor1);
			}
		}
		if(!timbre.isSonido()) {
			System.out.println("La alarma no ha sonado");
		} else {
			for(int i2 = 0; i2 < activos.size(); i2++) {
				Sensor active = activos.get(i2);
				System.out.println("La alarma se disparo por movimientos en la zona del " + active.getNombre() + " de la casa");
			}
		}
	}	
}
