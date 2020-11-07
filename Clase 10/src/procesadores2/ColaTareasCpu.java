package procesadores2;

import procesadores.Tarea;

public class ColaTareasCpu extends ColaTareas {

	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		return t1.getCpu()<t2.getCpu();
	}

}
