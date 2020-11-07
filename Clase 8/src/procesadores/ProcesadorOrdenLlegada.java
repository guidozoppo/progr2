package procesadores;

public class ProcesadorOrdenLlegada extends Procesador {

	public void agregarTarea(Tarea t1) {
		tareas.add(t1);
	}
	
	@Override
	public boolean esMenor(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		return false;
	}


	public static void main (String [] args) {
		
		ProcesadorOrdenLlegada procesador = new ProcesadorOrdenLlegada();
		procesador.agregarTarea(new Tarea(10,10,10));
		
		ProcesadorMemoria procesador2 = new ProcesadorMemoria();
		procesador2.agregarTarea(new Tarea (220,220,220));
	}

}
