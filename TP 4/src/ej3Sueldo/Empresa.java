package ej3Sueldo;

import java.util.ArrayList;

public class Empresa {

	ArrayList <Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public void addEmpleados(Empleado e) {
		this.empleados.add(e);
	}
	
	public int sizeEmpleados() {
		return empleados.size();
	}
}
