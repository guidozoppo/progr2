package libreria;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private double descuento; //VALOR ENTRE 0 Y 1, 15% = 0.15
	private ArrayList<String> autoresFavoritos;
	private ArrayList<String> generosFavoritos;
	private ArrayList<Producto> compras;
	
	
	public double cuantoTeCobro(Producto p1) {
		
		double precio = p1.getPrecio();
		
		double precioFinal = precio - precio*descuento;
		
		return precioFinal;
	}

	public boolean leGusta(Libro l) {
		return this.leGustaAutor(l.getAutor());
	}
	
	public void addAutorFavorito(String autor) {
		if(	! autoresFavoritos.contains(autor)	) {
			autoresFavoritos.add(autor);
		}
	}
	
	public boolean leGustaAutor(String autor) {
		return autoresFavoritos.contains(autor);
	}
	
	public void addGeneroFavorito(String genero) {
		if(	! generosFavoritos.contains(genero)	) {
			generosFavoritos.add(genero);
		}
	}
	
	public boolean leGustaGenero(String genero) {
		return generosFavoritos.contains(genero);
	}
	
	public void addCompra(Producto producto) {
		compras.add(producto);
	}
	
	public boolean comproProducto(Producto producto) {
		return compras.contains(producto);
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
}
