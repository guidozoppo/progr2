import java.util.ArrayList;

public class Serie {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList<Temporada> temporadas;
	
	
	public Serie(String titulo, String descripcion, String creador, String genero, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	public int getTotalEpisodiosVistos() {
		int contador = 0;
		for(int i=0; i<temporadas.size();i++) {
			contador += temporadas.get(i).getEpisodiosVistos();
		}
		return contador;
	}

	public double promedioCalificaciones() {
		int contador = 0;
		for(int i = 0; i<temporadas.size();i++) {
			contador += temporadas.get(i).getPromedioCalificaciones();
		}
		return contador/getTotalEpisodiosVistos();
	}

	public boolean vistoTodosLosEpisodios() {
		for(int i = 0; i<temporadas.size();i++) {
			if(temporadas.get(i).cantidadEpisodios() < temporadas.get(i).cantidadEpisodios() ){
				return false;
			}
		}
		return true;			
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	
}
