package procesadores;

import java.util.Vector;

public abstract class Procesador {

	protected Vector<Tarea> tareas;
	
	public Procesador() {
		tareas = new Vector<Tarea>();
	}
	
	public void agregarTarea(Tarea tareaDada) {
		boolean encontro = false;
		int i=0;
		while(tareas.size()>i && !encontro) {
			
			Tarea subi = tareas.elementAt(i);
			if(this.esMenor(subi, tareaDada)) {
				tareas.insertElementAt(tareaDada, i);
				encontro = true;
			}
			i++;
		}
		if(!encontro) {
			tareas.add(tareaDada);
		}
	}
	
	public abstract boolean esMenor(Tarea t1, Tarea t2);
	
	
	public void ejecutarTarea() {
		
		if(tareas.size()>0) {
			Tarea primera = tareas.elementAt(0);
			primera.ejecutar();
			tareas.removeElementAt(0);
		
		}
	}
	
	public int getCantidadTareas() {
		return tareas.size();
	}

	public void copiarTareas(Procesador pnuevo) {
		for(int i=0; i<tareas.size();i++) {
			pnuevo.agregarTarea(tareas.elementAt(i));
		}
	} 



}
