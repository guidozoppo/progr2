package ej1Alarma;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa(Timbre timbre, Luz luz) {
		super(timbre);
		this.luz = luz;
	}

	public void comprobar() {
		super.comprobar();
		if(super.timbre.isSonido()) {
			luz.encender();
			System.out.println("La luz esta encendida");
		}else {
			System.out.println("La luz esta apagada");
		}
	}
}
