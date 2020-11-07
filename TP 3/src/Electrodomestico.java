
public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private double consumoElectrico;
	private double peso;
	
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		precioBase = 100;
		color = "Gris Plata";
		consumoElectrico= 10;
		peso = 2;
	}
	
	public boolean esBajoConsumo() {
		if(consumoElectrico < 45) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBalance() {
		return precioBase/peso;
	}

	public boolean esAltaGama() {
		if(getBalance()>3) {
			return true;
		}else {
			return false;
		}
	}

	public String mostrarDatos() {
		return "El electrodomestico" + getNombre() + " de color " + getColor() + " pesa " + getPeso() +  "kg y cuesta " + getPrecioBase() + 
				" pesos y tiene un consumo de " + getConsumoElectrico() + "kw y es de bajo consumo " + esBajoConsumo() + " y es de alta gama " +
				esAltaGama();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getConsumoElectrico() {
		return consumoElectrico;
	}
	public void setConsumoElectrico(double consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
