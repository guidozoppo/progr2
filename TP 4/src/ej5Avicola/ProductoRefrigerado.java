package ej5Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

	private String nombreProducto;
	private int codigoOsa;
	private int tempMantenimiento;
	
	public ProductoRefrigerado(LocalDate fechaVto, int nLote, String granjaOrigen, 
			LocalDate fechaEnvasado, int codigoOsa, int tempMantenimiento, String nombreProducto) {
		super(fechaVto, nLote, granjaOrigen, fechaEnvasado);
		this.codigoOsa = codigoOsa;
		this.tempMantenimiento = tempMantenimiento;
	}

	public String toString() {
		return "El producto fresco " + this.getNombreProducto() + " Nº de lote " + this.getnLote() +" fue envasado el dia " 
				+ this.getFechaEnvasado() + " en " + this.getGranjaOrigen() + " y vence el dia " + this.getFechaVto() 
				+ " el codigo OSA es: " +this.getCodigoOsa() + " Se recomienda que se encuentre en la temperatura: " + this.tempMantenimiento;
		}
	//GETTERS AND SETTERS
	public int getCodigoOsa() {
		return codigoOsa;
	}

	public void setCodigoOsa(int codigoOsa) {
		this.codigoOsa = codigoOsa;
	}

	public int getTempMantenimiento() {
		return tempMantenimiento;
	}

	public void setTempMantenimiento(int tempMantenimiento) {
		this.tempMantenimiento = tempMantenimiento;
	}

	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	
	
	

}
