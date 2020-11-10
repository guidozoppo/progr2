package Ej2SistemaPostal;

import java.util.ArrayList;

public class ElementoCombo extends ElementoEnvio{

	private String nombre;
	private Criterio criterio;
	private ArrayList<ElementoEnvio> elementos;

	protected ElementoCombo(int numeroEnvio,  String nombre, Criterio crit) {
		super(numeroEnvio);
		this.criterio = crit;
		this.nombre = nombre;
		elementos = new ArrayList<>();
	}

	@Override
	protected double getPeso() {
		double contador = 0;
		for(ElementoEnvio envio:elementos) {
			contador += envio.getPeso();
		}
		return contador;
	
	}

	@Override
	protected String getCiudadDestino() {
		return elementos.get(0).getCiudadDestino();
	}

	@Override
	protected String getNombreCalleDestino() {
		return elementos.get(0).getNombreCalleDestino();
	}

	@Override
	protected String getNombreRemitente() {
		return elementos.get(0).getNombreRemitente();
	}

	@Override
	protected String getCiudadOrigen() {
		return elementos.get(0).getCiudadOrigen();
	}

	@Override
	protected ArrayList<ElementoEnvio> listaConCriterio(Criterio crit) {
		ArrayList<ElementoEnvio> enviosQueCumplen = new ArrayList<>();
		for(ElementoEnvio envio:elementos) {
			if(crit.cumple(envio)) {
				enviosQueCumplen.addAll(envio.listaConCriterio(crit));
			}
			return enviosQueCumplen;
		}
		return enviosQueCumplen;
	}

	public void addEnvio(ElementoEnvio elem) {
		if(this.criterio.cumple(elem)) {
			elem.setNumeroEnvio(this.numeroEnvio);
			this.elementos.add(elem);
		}
	}

	public String toString() {
		return ("\n--------------------\n"+
				"\nCombo: " + this.getNombre() + 
				"\nEnvios: "+ this.getEnvios() +
				"\nNumero Envios: " + this.getNumeroEnvio() + 
				"\nPeso total: " + this.getPeso());
	}
	
	//GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	public ArrayList<ElementoEnvio> getEnvios(){
		return new ArrayList<>(this.elementos);
	}
	
	
	

}
