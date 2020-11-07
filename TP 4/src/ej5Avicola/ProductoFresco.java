package ej5Avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

	private String nombreProducto;
	
	public ProductoFresco(LocalDate fechaVto, int nLote, String granjaOrigen, LocalDate fechaEnvasado, String nombreProducto) {
		super(fechaVto, nLote, granjaOrigen, fechaEnvasado);
		this.nombreProducto = nombreProducto;
	}

	public String toString() {
		return "El producto fresco " + this.getNombreProducto() + " Nº de lote " + this.getnLote() +" fue envasado el dia " + this.getFechaEnvasado() + " en " + this.getGranjaOrigen() + " y vence el dia " + this.getFechaVto() ;
	}

	
	//GETTERS AND SETTERS
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	
	
	
	
}


