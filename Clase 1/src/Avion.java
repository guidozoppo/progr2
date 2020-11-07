
public class Avion {

	private String nombre;
	private int modelo;
	private String color;
	private int capacidad;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nn){
		if ((nn==null)&&(! nn.equals("Drops"))){
			nombre = nn;
		}
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Avion(){
		this.capacidad = 10;
		color = "blanco";
		modelo = 1980;
		nombre = "Airbus";
	}
	 
	public Avion(int capacidad){
		this.capacidad = capacidad;
		
	}
	
	public Avion(int capacidad, String color){
		this();
		this.capacidad = capacidad;
		this.color = color;
	}

	public Avion(int modelo, int cap){
		capacidad = cap;
		this.modelo = modelo;
	}
	

}
