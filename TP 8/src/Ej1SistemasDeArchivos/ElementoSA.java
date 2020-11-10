package Ej1SistemasDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoSA {
	
	private String nombre;
	private LocalDate fechaCreacion, fechaModificacion;
	private Carpeta padre;
	
	public ElementoSA(String nombre) {
		this.nombre = nombre;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion= LocalDate.now();
		padre = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	

	public void setFechaModificacion() {
		this.fechaModificacion = LocalDate.now();
	}
	

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public Carpeta getPadre() {
		return padre;
	}

	public void setPadre(Carpeta padre) {
		this.padre = padre;
	}

	public boolean tienePadre() {
		return this.padre != null;
	}
	
	public String rutaCompleta() {
		if(tienePadre()) {
			return this.getPadre().rutaCompleta()+this.toString();
		}else {
			return this.toString();
		}
	}
	
	public abstract double getTamanio();
	public abstract int cantidadArchivos();
	public abstract int cantidadElementos();
	public abstract int cantidadCarpetas();
	public abstract boolean contieneElemento(ElementoSA elementoQueBusco);
	public abstract ArrayList<ElementoSA> buscar (Filtro f);
	
	@Override
	public boolean equals(Object obj) {
		try {
			ElementoSA otra = (ElementoSA) obj;
			
			if(tienePadre()) {
				return this.getNombre().equals(otra.getNombre()) && this.getPadre().equals(otra.getPadre());
			} else {
				return this.getNombre().equals(otra.getNombre()) && !otra.tienePadre();
			}
			
		} 
		catch(Exception e) {
			return false;
		}
	}
	
}
