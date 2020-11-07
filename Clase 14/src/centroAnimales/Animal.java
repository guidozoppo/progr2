package centroAnimales;

import java.util.ArrayList;

public class Animal extends ObjetoDinamico{

	//Condiciones que tiene que tener la jaula para que el animal pueda habitarla.
	//Si hay mas de un requisito se puede usar el CriterioOr o CriterioAnd
	private Criterio requisitos;
	
	public Animal(Criterio requisitos) {
		super();
		this.requisitos = requisitos;
	}
	
	public boolean apta(Jaula j) {
		return requisitos.cumple(j);
	}
}
