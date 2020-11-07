
public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;
	
	public Episodio(String titulo, String descripcion) {
		calificacion = -1;
		this.titulo =  titulo;
		this.descripcion = descripcion;
		flag = false;
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
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		if(1<=calificacion && calificacion<=5) {
			this.calificacion = calificacion;
		}else {
			System.out.println("Calificacion no cambiada");
			
		}
	}
	
	
}
