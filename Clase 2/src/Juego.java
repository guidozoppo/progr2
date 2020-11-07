
public class Juego {

	int puntos1;
	int puntos2;
	
	public Juego(){
		puntos1=0;
		puntos2=0;
	}
	
	public void jugar(){
		puntos1=0;
		puntos2=0;
		int tirada1=0;
		int tirada2=0;
		for(int i=0; i<10; i++){
			tirada1 = tirarDado()+tirarDado();
			tirada2 = tirarDado()+tirarDado();
			if ((tirada1 >= 7) && (tirada1>tirada2)){
				puntos1++;
			}else{
				if((tirada2 >= 7) && (tirada2>tirada1)){
					puntos2++;
				}
			}
		}//Sale FOR
		
		String ganador = getGanador();
		
		if(ganador != null){
			System.out.println("Gano el " + ganador + " - " + puntos1 + " - " + puntos2 );
		}else{
			System.out.println("Hubo un empate");
		}
		
	}
	
	// Genera un numero aleatorio entre 1 y 6
		public int tirarDado() {
			return  (int)  (Math.random()*6)+1;
		}
	
	public String getGanador(){
		if(puntos1>puntos2){
			return "Jugador 1";
		}else if(puntos2>puntos1){
			return "Jugador 2";
		}else {
			return null;
		}
		
	}
}
