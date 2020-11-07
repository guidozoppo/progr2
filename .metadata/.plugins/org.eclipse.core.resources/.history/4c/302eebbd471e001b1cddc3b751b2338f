package TPEspecialParte1;

public class PocimaSelectivaFuerza extends Pocima {

	public PocimaSelectivaFuerza (String nombre, double valor) {
		this.valor = valor;
		this.nombre = nombre;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		for (int i = 0; i < carta.atributos.size(); i++) {
			Atributo atributo = carta.atributos.get(i);
			double valorPrincipal = atributo.getValor();
			String nombreAtributo = atributo.getNombre();
			if(nombreAtributo.equals("Fuerza")) {
				atributo.setValor(valorPrincipal + (valor/100)*valorPrincipal);
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return this.getNombre() + " (aumenta el atributo fuerza en un " + valor + "%)";
	}

}
