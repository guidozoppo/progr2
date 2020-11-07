package procesadores2;

import java.util.Vector;

import procesadores.Procesador;
import procesadores.Tarea;

public abstract class ColaTareas {

	Vector<Tarea> tareas;
	
	public ColaTareas() {
		tareas = new Vector<Tarea>();
	}
	
	public void addTarea(Tarea t1) {
		boolean encontro = false;
		int i=0;
		while(tareas.size()>i && !encontro) {
			
			Tarea subi = tareas.elementAt(i);
			if(this.esMenor(subi, t1)) {
				tareas.insertElementAt(t1, i);
				encontro = true;
			}
			i++;
		}
		if(!encontro) {
			tareas.add(t1);
		}
	}

	public Tarea getPrimera() {
		if(tareas.size()>0) {
			return tareas.elementAt(0);
		}else {
			return null;
		}
	}
	
	public void borrarPrimera() {
		if(tareas.size()>0) {
			tareas.remove(0);
		}
	}
	
	public int getCantidadTareas() {
		return tareas.size();
	}
	
	public boolean hayTareas() {
		return tareas.size()>0;
	}
	
	public void copiar(ColaTareas tnuevo) {
		for(int i=0; i<tareas.size();i++) {
			tnuevo.addTarea(tareas.elementAt(i));
		}
	} 
	
	public abstract boolean esMenor(Tarea t1, Tarea t2);




}


