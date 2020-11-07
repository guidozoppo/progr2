package ej3Sueldo;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa();
		Empleado e1 = new Empleado("Carlos", 1000);
	
		System.out.println(e1);
		
		EmpleadoComision ec1 = new EmpleadoComision("Carlos", 1000, 10);
		System.out.println(ec1);
		
		EmpleadoComision eh1 = new EmpleadoComision("Carlos", 1000, 10);
		System.out.println(eh1);
		
		empresa1.addEmpleados(eh1);
		System.out.println(empresa1.sizeEmpleados());
	}

	
}
