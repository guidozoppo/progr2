
public class DadoCargado extends Dado {

	private int ladoCargado;
	private double probabilidad;
	
	public DadoCargado(int ladoCargado, double probabilidad) {
		this.ladoCargado = ladoCargado;
		this.probabilidad = probabilidad;
	}
	
	public DadoCargado(int ladoCargado) {
		this.ladoCargado = ladoCargado;
		probabilidad = 0.5;
	}
	
	public DadoCargado(double probabilidad) {
		ladoCargado = 6;
		this.probabilidad = probabilidad;
	}
	
	public int tirarDado() {
		double valor = Math.random();
		if(valor<probabilidad) {
			return ladoCargado;
		} else {
			return super.tirarDado();
		}
	}
	
	public static void main(String[]args) {
		
		//Dado d1 = new Dado();
		DadoCargado dc = new DadoCargado(6, 0.5);
		DadoCargado dc2 = new DadoCargado(6, 0.5);
		Cubilete vaso = new Cubilete();
		
		for(int i = 0 ; i<20; i++) {
			int d1 = vaso.tirar();	
			
			//SACO DADOS NORMALES Y LOS GUARDO
			Dado dn = vaso.getD1();	
			Dado dn2 = vaso.getD2();
			//PONGO LOS DADOS CARGADOS EN EL VASO
			vaso.setD1(dc);
			vaso.setD2(dc2);
			
			System.out.println("d1: " + d1
					+ " - d2: " + vaso.tirar());
			
			//VUELVO A PONER LOS DADOS COMUNES
			vaso.setD1(dn);
			vaso.setD2(dn2);
		}
	}

	



}
