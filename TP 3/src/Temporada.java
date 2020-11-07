import java.util.ArrayList;

public class Temporada {
	private ArrayList<Episodio> episodios;
	private int numero;
	
	public Temporada(int numero, ArrayList<Episodio>episodios) {
		this.episodios = episodios;
		this.numero = numero;
	}
	
	public int getEpisodiosVistos() {
		int contador = 0;
		for(int i=0; i<episodios.size();i++) {
			if(episodios.get(i).isFlag() == true) {
				contador++;
			}
		}
		return contador;
	}
	
	public double getPromedioCalificaciones() {
		int contador = 0;
		for(int i = 0; i<episodios.size();i++) {
			if(episodios.get(i).isFlag() == true) {
				contador += episodios.get(i).getCalificacion();			
			}
		}
		return contador/getEpisodiosVistos();
	}
	
	public int cantidadEpisodios() {
		return episodios.size();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
	
	
	
	
}
