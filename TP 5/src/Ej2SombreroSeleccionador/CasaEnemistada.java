package Ej2SombreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {

	private ArrayList<Casa> casasEnemistadas;
	
	public CasaEnemistada(String nombre, int alumnosMax) {
		super(nombre, alumnosMax);
		casasEnemistadas = new ArrayList<>();
	}

	public void addCasaEnemistada(Casa casaEnemistada) {
		casasEnemistadas.add(casaEnemistada);
	}
	
	public ArrayList<Casa> getCasasEnemistadas(){
		ArrayList<Casa> aux = new ArrayList<>();
		for(int i = 0; i<casasEnemistadas.size(); i++) {
			aux.add(casasEnemistadas.get(i));
		}
		return aux;
	}

	public boolean esCasaEnemistada(Casa casa) {
		return casasEnemistadas.contains(casa);
	}

	@Override
	public boolean aceptaAlumno(Alumno a) {
		if(!super.aceptaAlumno(a)) {
			return false;
		}
		for(int i = 0; i < casasEnemistadas.size(); i++) {
			if(this.casasEnemistadas.get(i).aceptaAlumno(a)) {
				return true;
			} 
		}
			return false;
	}

}
