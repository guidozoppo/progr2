package procesadores;
import procesadores.*;

public class Principal {

	private Procesador cpu;
	
	public Principal(Procesador cpu) {
		this.cpu = cpu;
	}
	
	
	public int getNumeroTareas() {
		return cpu.getCantidadTareas();
	}
	
	public void ejecutar() {
		System.out.println("Inicio de la Ejecucion");
		while (cpu.getCantidadTareas()>0) {
			cpu.ejecutarTarea();
			System.out.println("-------");
		}
		System.out.println("Fin de la Ejecucion");
		
	}
	
	
	public static void main(String[] args) {
		
		Procesador proc = new ProcesadorCPU();
		
		proc.agregarTarea(new Tarea(10,60,10));
		proc.agregarTarea(new Tarea(20,50,100));
		proc.agregarTarea(new Tarea(30,40,1000));
		proc.agregarTarea(new Tarea(40,30,10));
		proc.agregarTarea(new Tarea(50,20,100));
		proc.agregarTarea(new Tarea(60,10,1000));

		Principal ejemplo = new Principal(proc);
		
		//System.out.println(proc.getCantidadTareas());
		//System.out.println(ejemplo.getNumeroTareas());
		
		//ejemplo.ejecutar();
		
		//System.out.println(proc.getCantidadTareas());
		//System.out.println(ejemplo.getNumeroTareas());
		
		proc = new ProcesadorCPU();
		
		proc.agregarTarea(new Tarea(50,20,100));
		proc.agregarTarea(new Tarea(60,10,1000));		
		
		ejemplo.ejecutar();
		
		System.out.println(ejemplo.getNumeroTareas());
		System.out.println(proc.getCantidadTareas());
		
		
		Procesador pnuevo = new ProcesadorMemoria();
		
		System.out.println(proc.getCantidadTareas());
		System.out.println(pnuevo.getCantidadTareas());

 		//proc = pnuevo;
		proc.copiarTareas(pnuevo);
	//	proc.ejecutarTarea();
	//	System.out.println(proc.getCantidadTareas());
		System.out.println(pnuevo.getCantidadTareas());
		
			
	//	Principal ejemplo = new Principal(proc);
	//	System.out.println(ejemplo.getNumeroTareas());
		
		

		
	//	while (proc.getCantidadTareas()>0)
	//		proc.ejecutarTarea();
		
			
	//	System.out.println(ejemplo.getNumeroTareas());
	//	System.out.println(proc.getCantidadTareas());
		
		
		
		
		
		
	}
	
}
