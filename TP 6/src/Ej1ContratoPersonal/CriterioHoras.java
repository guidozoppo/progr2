package Ej1ContratoPersonal;

public class CriterioHoras extends Criterio{

	private int minimoHoras;
	
	public CriterioHoras(int minHoras) {
		minimoHoras = minHoras;
	}
	
	
	@Override
	public boolean evaluarContrato(Contrato c) {
		return this.minimoHoras >= c.getHorasSemanales();
	}


	public int getMinimoHoras() {
		return minimoHoras;
	}


	public void setMinimoHoras(int minimoHoras) {
		this.minimoHoras = minimoHoras;
	}
	
	
}
