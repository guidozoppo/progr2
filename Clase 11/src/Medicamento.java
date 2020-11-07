import java.util.ArrayList;

public class Medicamento {

	private String nombre;
	private String laboratorio;
	private double precio;
	private ArrayList<String> sintomas;
	
	public Medicamento(String nombre, String laboratorio, double precio) {
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
		sintomas = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean trataSintoma(String sintoma) {
		if(sintoma != null) {
			return sintomas.contains(sintoma.toUpperCase());//el equals es el de string, por eso no se implementa.
		} else {
			return false;
		}
	}
	
	public void addSintoma(String sintoma) {
		if(!this.trataSintoma(sintoma)) {
			sintomas.add(sintoma.toUpperCase());
		}
	}
	
	public void removeSintoma(String sintoma) {
		if(sintoma != null) {
			sintomas.remove(sintoma.toUpperCase());
		}
	}
	
	public int getCantidadSintomas() {
		return sintomas.size();
	}
	
	public boolean equals(Object o1) {
		try {
			Medicamento aux = (Medicamento) o1;
			
			if( (nombre.equals(aux.getNombre()) ) && ( laboratorio.equals(aux.getLaboratorio()) ) &&
					(sintomas.size()==aux.getCantidadSintomas()) ) {
				
				for(int i= 0 ; i<sintomas.size(); i++) {
					String sintomai = sintomas.get(i);
					if( !aux.trataSintoma(sintomai) ) {
						return false;	
					}
				}
				return true;
				
			}else {
				return false;
			}
			
			
		}catch(Exception e) {
			return false;
		}
	}

	public String toString() {
		return nombre + " - " + laboratorio;
	}

}
