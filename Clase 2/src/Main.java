
public class Main {

	public static void main(String[] args) {
		
		/*Juego j1 = new Juego();
		j1.jugar();*/
/*		
		Dado d1 = new Dado(10);
		System.out.println("Primera " + d1.getCara());
		Dado d2 = new Dado(8);
		Dado d3 = new Dado();
		
		d3.setCantidadCaras(10);
		
		for(int i=0; i<10; i++){
			//System.out.print("Salio " + d1.tirarDado()+" | ");
			//System.out.println("Salio2 " + d2.tirarDado());
		}
	
	
		Cubilete cubilete1 = new Cubilete(10);
	
		for(int i=0; i<10; i++){
			System.out.println("El cub salio " + cubilete1.tirar());
		}
		*/
		
		Jugador j1 = new JugadorTramposo("Luis");
		Jugador j2 = new Jugador("Alfredo");
		JuegoDados juegoNuevo = new JuegoDados(j1, j2, 8);
		//JuegoDados juegoOtro = new JuegoDados("Luis", "Sebastian",6);
		juegoNuevo.jugar();
		System.out.println(j1.comparacion(j1, j1));
		//juegoOtro.jugar();
		
		
		Dado dn = new Dado();
		Dado dn2 = new Dado(5);
		System.out.println(dn.equals(dn2));

	}
}
