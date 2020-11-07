package procesadores2;

import procesadores.Tarea;

public class Concreta {

	public static void main(String[] args) {

		Procesador p1 = new Procesador(new ColaTareasMemoria());
		
		p1.agregarTarea(new Tarea(10,60,10));
		p1.agregarTarea(new Tarea(20,50,100));
		p1.agregarTarea(new Tarea(30,40,1000));
		p1.agregarTarea(new Tarea(40,30,10));
		p1.agregarTarea(new Tarea(50,20,100));
		p1.agregarTarea(new Tarea(60,10,1000));
		
		Procesador p2 = p1;
		p1.cambiarOrdenamiento(new ColaTareasCpu());
		
		p1.ejecutarTarea();
		
	}

}
