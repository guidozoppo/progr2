package procesadores2;
import procesadores.Tarea;

public class Procesador {

	ColaTareas elementos;
	
	public Procesador() {
		elementos = new ColaTareasCpu();
	}
	
	public Procesador(ColaTareas colaTareas) {
		elementos = colaTareas;
	}
	
	public void agregarTarea(Tarea t1) {
		elementos.addTarea(t1);
	}
	
	public void ejecutarTarea() {
		if(elementos.hayTareas()) {
			elementos.getPrimera().ejecutar();
			elementos.borrarPrimera();
		}
	}
	
	public int getCantTareas() {
		return elementos.getCantidadTareas();
	}

	public void cambiarOrdenamiento(ColaTareas tNueva) {
		elementos.copiar(tNueva);
		elementos = tNueva;
	}


}
