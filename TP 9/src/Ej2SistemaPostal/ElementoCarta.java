package Ej2SistemaPostal;

import java.util.ArrayList;

public class ElementoCarta extends ElementoEnvio{

	private Direccion destinatario;
	private Direccion remitente;
	private boolean entregaDomicilio;
	private double peso;
	
	public ElementoCarta(int numeroEnvio, Direccion remitente, Direccion destinatario, boolean entregaDomicilio,double peso) {
		super(numeroEnvio);
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.entregaDomicilio = entregaDomicilio;
		this.peso = peso;
	}

	@Override
	protected double getPeso() {
		return this.peso;
	}

	@Override
	protected String getCiudadDestino() {
		return this.destinatario.getNombreCiudad();
	}

	@Override
	protected String getNombreCalleDestino() {
		return this.destinatario.getNombreCalle();
	}

	@Override
	protected String getNombreRemitente() {
		return this.remitente.getPersona();
	}
	
	protected String getNombreDestinatario() {
		return this.destinatario.getPersona();
	}

	@Override
	protected String getCiudadOrigen() {
		return this.remitente.getNombreCiudad();
	}

	@Override
	protected ArrayList<ElementoEnvio> listaConCriterio(Criterio crit) {
		ArrayList<ElementoEnvio> enviosQueCumplen = new ArrayList<>();
		if(crit.cumple(this)) {
			enviosQueCumplen.add(this);
		}
		return enviosQueCumplen;
	}
	
	@Override
	public String toString() {
		return ("\n\n Ciudad Origen: " + this.getCiudadOrigen() + 
				"\nCiudad Destino: " + this.getCiudadDestino() + 
				"\nPeso del envio: "+ this.getPeso() + 
				"\nRemitente: "+ this.getNombreRemitente() + 
				"\nDestinatario: "+ this.getNombreDestinatario() + 
				"\nNumero de envio: "+ this.getNumeroEnvio());
	}

	//GETTERS AND SETTERS
	public boolean isEntregaDomicilio() {
		return entregaDomicilio;
	}

	public void setDestinatario(Direccion destinatario) {
		this.destinatario = destinatario;
	}

	public void setRemitente(Direccion remitente) {
		this.remitente = remitente;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEntregaDomicilio(boolean entregaDomicilio) {
		this.entregaDomicilio = entregaDomicilio;
	}
	
	
	
	
	
}
