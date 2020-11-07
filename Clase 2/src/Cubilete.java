
public class Cubilete {
	
	private Dado d1;
	private Dado d2;
	
	public Cubilete(){
		d1 = new Dado();
		d2 = new Dado();
	}
	
	public Cubilete(int caras){
		d1 = new Dado(caras);
		d2 = new Dado(caras);
	}
	public Cubilete(int caras1, int caras2){
		d1 = new Dado(caras1);
		d2 = new Dado(caras2);
	}
	
	public int tirar(){
		return d1.tirarDado() + d2.tirarDado();
	}
	
	public int ultimaTirada(){
		return d1.getCara() + d2.getCara();
	}

	public Dado getD1() {
		return d1;
	}

	public void setD1(Dado d1) {
		this.d1 = d1;
	}

	public Dado getD2() {
		return d2;
	}

	public void setD2(Dado d2) {
		this.d2 = d2;
	}
	

	
	
	
	
}
