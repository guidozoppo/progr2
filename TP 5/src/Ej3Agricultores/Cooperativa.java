package Ej3Agricultores;

import java.util.ArrayList;

public class Cooperativa {

	String nombre;
	private ArrayList<Lote> lotes;
	private ArrayList<Cereal> cereales;
	private ArrayList<String> mineralesEspec;

	public Cooperativa(String nombre) {
		this.nombre = nombre;
		lotes = new ArrayList<>();
		cereales = new ArrayList<>();
		mineralesEspec = new ArrayList<>();
	}
	
	
	
	public ArrayList<Lote> getLotes() {
		ArrayList<Lote> aux = new ArrayList<>();
		for(int i=0 ; i<lotes.size(); i++) {
			aux.add(lotes.get(i));
		}
		return aux;
	}

	public ArrayList<Cereal> getCereales() {
		ArrayList<Cereal> aux = new ArrayList<>();
		for(int i=0 ; i<cereales.size(); i++) {
			aux.add(cereales.get(i));
		}
		return aux;
	}

	public ArrayList<String> getMineralesEspec() {
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0 ; i<mineralesEspec.size(); i++) {
			aux.add(mineralesEspec.get(i));
		}
		return aux;
	}


	public String tipoLote(Lote l) {
		if (l.getMinerales().containsAll(mineralesEspec)) {
			return "Es especial";
		}
		else {
			return "Es comun";
		}
	}
	
	public void addLote(Lote l) {
		lotes.add(l);
	}
	
	public void addCereal(Cereal l) {
		cereales.add(l);
	}
	
	public void addMineralEspecial(String minEspec) {
		mineralesEspec.add(minEspec);
	}
	
	public ArrayList<String> queCerealesAdmiteEsteLote(Lote l){
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0; i<cereales.size(); i++) {
			if(cereales.get(i).sePuedeSembrarEnLote(l)){
				aux.add(cereales.get(i).getNombre());
			}
		}
		return aux;
	}
	
	public ArrayList<String> queLotesAdmiteEsteCereal(Cereal cer){
		ArrayList<String> aux = new ArrayList<>();
		for(int i=0; i<lotes.size(); i++) {
			if(cer.sePuedeSembrarEnLote(lotes.get(i))) {
				aux.add(lotes.get(i).getNombre());
			}
		}
		return aux;
	}
	

	
}
