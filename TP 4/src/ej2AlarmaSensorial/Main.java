package ej2AlarmaSensorial;

public class Main {

	public static void main (String[]args) {
		//ALARMA COMUN
				/*Timbre bell2 = new Timbre();
				Alarma alarm2 = new Alarma(bell2);
				
				Sensor sensorOne = new Sensor("patio");
				Sensor sensorTwo = new Sensor("antesala");
				Sensor sensorThree = new Sensor ("quincho");
				
				alarm2.addSensor(sensorOne);
				alarm2.addSensor(sensorTwo);
				alarm2.addSensor(sensorThree);
				
				
				sensorOne.setActivado(true);
				sensorTwo.setActivado(true);
				sensorThree.setActivado(true);
				
				alarm2.comprobarAlarma();*/
				
				//ALARMA LUMINOSA
				
				Timbre bell1 = new Timbre();
				Luz light1 = new Luz();
				AlarmaLuminosa alarm1 = new AlarmaLuminosa(bell1, light1);
				
				Sensor sensor1 = new Sensor("living");
				Sensor sensor2 = new Sensor ("cocina");
				Sensor sensor3 = new Sensor ("dormitorio");
				Sensor sensor4 = new Sensor ("garage");
				
				alarm1.addSensor(sensor1);
				alarm1.addSensor(sensor2);
				alarm1.addSensor(sensor3);
				alarm1.addSensor(sensor4);
				
				sensor1.setActivado(false);
				sensor2.setActivado(true);
				sensor3.setActivado(false);
				sensor4.setActivado(true);
				
			alarm1.comprobarAlarma();
				
	}
}
