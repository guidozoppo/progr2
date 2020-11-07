package TPEspecialParte1;

public class PocimaQuieroValeCuatro extends Pocima {

	public PocimaQuieroValeCuatro(String nombre, double valor) {
		this.valor = valor;
		this.nombre = nombre;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		for (int i = 0; i < carta.atributos.size(); i++) {
			Atributo atributo = carta.atributos.get(i);
			//double valorPrincipal = atributo.getValor();
			atributo.setValor(valor);
		}
		
	}

	@Override
	public String toString() {
		return this.getNombre() + " (todos los atributos pasan a tener el valor: " + valor + ")";
	}

}
