package ej5Avicola;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaVto;
	private int nLote;
	private String granjaOrigen;
	private LocalDate fechaEnvasado;
	

	public Producto(LocalDate fechaVto, int nLote, String granjaOrigen, LocalDate fechaEnvasado) {
		this.fechaVto = fechaVto;
		this.nLote = nLote;
		this.granjaOrigen = granjaOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}
	//GETTERS AND SETTERS
	public LocalDate getFechaVto() {
		return fechaVto;
	}
	public void setFechaVto(LocalDate fechaVto) {
		this.fechaVto = fechaVto;
	}
	public int getnLote() {
		return nLote;
	}
	public void setnLote(int nLote) {
		this.nLote = nLote;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
	
	
}
