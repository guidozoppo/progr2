package Ej2SistemaPostal;

import java.util.ArrayList;

public abstract class ElementoEnvio {

	protected int numeroEnvio;
	
	protected ElementoEnvio(int numeroEnvio) {
		this.numeroEnvio = numeroEnvio;
	}
	
	protected abstract double getPeso();
	protected abstract String getCiudadDestino();
	protected abstract String getNombreCalleDestino();
	protected abstract String getNombreRemitente();
	protected abstract String getCiudadOrigen();
	protected abstract ArrayList<ElementoEnvio> listaConCriterio(Criterio crit);

	public int getNumeroEnvio() {
		return numeroEnvio;
	}

	public void setNumeroEnvio(int numeroEnvio) {
		this.numeroEnvio = numeroEnvio;
	}
	
	
}
