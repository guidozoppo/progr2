package ej1Alarma;

public class Alarma {
	
	private boolean vidrioRoto;
	private boolean puertaVentanaAbierta;
	private boolean movimiento;
	protected Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.vidrioRoto = false;
		this.puertaVentanaAbierta = false;
		this.movimiento = false;
		this.timbre = timbre;
	}
	
	public void comprobar() {
		if(vidrioRoto || puertaVentanaAbierta || movimiento) {
			timbre.hacerSonar();
			System.out.println("Alarma encendida, timbre sonando");
		} else {
			System.out.println("Alarma apagada");
		}
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaVentanaAbierta() {
		return puertaVentanaAbierta;
	}

	public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
		this.puertaVentanaAbierta = puertaVentanaAbierta;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
	
	
	
	
}
