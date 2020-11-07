package ej2AlarmaSensorial;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa(Timbre timbre, Luz luz) {
		super(timbre);
		this.luz = luz;
	}

	public void comprobar() {
		super.comprobarAlarma();
		if(super.timbre.isSonido()) {
			luz.encender();
			System.out.println("La luz esta encendida");
		}else {
			System.out.println("La luz esta apagada");
		}
	}
}
