package Ej2SombreroSeleccionador;

public class CasaLinaje extends Casa {

	public CasaLinaje(String nombre, int alumnosMax) {
		super(nombre, alumnosMax);
	}

	@Override
	public boolean aceptaAlumno(Alumno a) {
		if(!super.aceptaAlumno(a)) {
			return false;
		}
		if(a.tieneFamiliar(a)) {
			return true;
		} else {
			return false;
		}
	}
}
