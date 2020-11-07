package procesadores2;

import procesadores.Tarea;

public class ColaTareasMemoria extends ColaTareas {

	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getMemoria()<t2.getMemoria();
	}

}
