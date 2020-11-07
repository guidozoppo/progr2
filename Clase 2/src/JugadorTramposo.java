
public class JugadorTramposo extends Jugador {

	private DadoCargado dado1;
	private DadoCargado dado2;

	public JugadorTramposo(String nombre) {
		super(nombre);
		dado1 = new DadoCargado(6,0.95);
		dado2 = new DadoCargado(6,0.95);
	}
	
	@Override
	public int tirarDados(Cubilete vaso){
		Dado dn = vaso.getD1();	
		Dado dn2 = vaso.getD2();
		
		vaso.setD1(dado1);
		vaso.setD2(dado2);
		
		int tirada = vaso.tirar();
		
		vaso.setD1(dn);
		vaso.setD2(dn2);
		
		
		return tirada;
	}
}
