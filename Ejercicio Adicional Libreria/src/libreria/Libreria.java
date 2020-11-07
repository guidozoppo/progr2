package libreria;

public class Libreria {

	public double getPrecio(Producto p1, Cliente c1) {
		return c1.cuantoTeCobro(p1);
	}
	
	public boolean comproProducto(Producto p, Cliente c) {
		return c.comproProducto(p);
	}
	
	public boolean leGusta(Libro l, Cliente c) {
		return c.leGusta(l);
	}
}
