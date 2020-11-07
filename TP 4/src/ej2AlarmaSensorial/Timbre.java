package ej2AlarmaSensorial;

public class Timbre {
		
	private boolean sonido;
	
	public Timbre() {
		sonido = false;
	}

	public void hacerSonar() {
		sonido = true;
	}

	public boolean isSonido() {
		return sonido;
	}

	
}
