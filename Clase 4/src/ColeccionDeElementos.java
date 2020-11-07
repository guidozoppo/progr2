 
public class ColeccionDeElementos {

	Object[] elementos;
	int cantidadElementos;
	
	
	public ColeccionDeElementos() {
		elementos = new Object[2];
		cantidadElementos = 0;
	}
	
	public int getcantidadElementos() {
		return cantidadElementos;
	}
	
	public String toString() {
		return "Soy una coleccion";
	}
	
	public void agregarElemento(Object o1) {
		elementos[cantidadElementos]=o1;
		cantidadElementos++;
		if(cantidadElementos==elementos.length) {
			Object [] aux = new Object[elementos.length*2];
		
			for(int i = 0; i<elementos.length; i++) {
				aux [i] = elementos[i];
			}
			elementos = aux;
		
		}
	}
	
	public Object obtenerElemento(int pos) {
		if(pos>=0) {
			return elementos[pos];
		}else {
			return null;
		}
	}
		
	
	public void borrarElemento(Object o1) {
		
	}
	
	public static void main(String [] args) {
		ColeccionDeElementos colElel = new ColeccionDeElementos();
		
		colElel.agregarElemento("jjjjj");
		colElel.agregarElemento("hola");
		colElel.agregarElemento("hahahaha");
		colElel.agregarElemento(new ColeccionDeElementos()	);
		colElel.agregarElemento(new ColeccionDeElementos()	);
		colElel.agregarElemento(new ColeccionDeElementos()	);
		colElel.agregarElemento(new ColeccionDeElementos()	);
		colElel.agregarElemento(new ColeccionDeElementos()	);
		
		for (int i = 0; i < colElel.getcantidadElementos(); i++) {
			System.out.println(colElel.obtenerElemento(i));
		}
	}
	
}
