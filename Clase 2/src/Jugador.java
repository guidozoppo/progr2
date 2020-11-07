
public class Jugador {
	
	private String nombre;
	private int puntos;
	
	
	public Jugador(String nn){
		nombre = nn;
		puntos = 0;	
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	public int tirarDados(Cubilete vaso){
		return vaso.tirar();
	}
	
	public void incrementarPuntos(){
		puntos++;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean comparacion(Jugador j1, Jugador j2) {
		if(j1==j2) {
			return true;
		}else {
			return false;
		}
	}
}
