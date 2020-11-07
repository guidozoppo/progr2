
public class Dado {

	private int cara;
	private int cantidadCaras;
	
	public Dado(  ){
		cantidadCaras = 6;
		tirarDado();
	}
	
	public Dado(int cantCaras){
		this.setCantidadCaras(cantCaras);
		tirarDado();
	}
	public int tirarDado(){
		cara = (int) (Math.random()*cantidadCaras)+1; //Va el (int) porque el random devuelve un Double y con el int se hace el casting de double a int. 
		return cara;
	}
	
	public int getCara(){
		return cara;
	}
	
	public int getCantidadCaras(){
		return cantidadCaras;
	}
	
	public void setCantidadCaras(int cantCaras){
		if(cantCaras<=0){
			cantCaras = 6;
		}
		cantidadCaras = cantCaras;
		tirarDado();
	}

	public boolean equals(Object o1) {
		try {
			Dado d1 = (Dado)o1; //al objeto o1 tratalo como un objeto dado
			return cantidadCaras == d1.getCantidadCaras();
		}catch(Exception e) {
			return false;
		}
	}


}

