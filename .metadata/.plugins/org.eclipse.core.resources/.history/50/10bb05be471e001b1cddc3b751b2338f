package TPEspecialParte1;

public class PocimaKriptonita extends Pocima {

	public PocimaKriptonita (String nombre, double valor) {
		this.valor = valor;
		this.nombre = nombre;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		for (int i = 0; i < carta.atributos.size(); i++) {
			Atributo atributo = carta.atributos.get(i);
			double valorPrincipal = atributo.getValor();
			atributo.setValor(valorPrincipal - (valor/100)*valorPrincipal);
		}
		
	}

	@Override
	public String toString() {
		return this.getNombre() + " (disminuye todos los atriubutos un " + valor + "%)";
	}

}
