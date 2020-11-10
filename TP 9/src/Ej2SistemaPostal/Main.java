package Ej2SistemaPostal;

public class Main {

	public static void main(String[] args) {
			Direccion unicen = new Direccion("UNICEN", "Tandil", "Paz", 321);
			Direccion particularTandil = new Direccion("Juana Gómez", "Tandil", "San Lorenzo", 654);
			Direccion particularJuarez = new Direccion("Mabel Vega", "Juárez", "Tucumán", 31);
			
			ElementoCarta carta = new ElementoCarta(123, unicen, particularTandil, true, 29);
			ElementoCarta carta1 = new ElementoCarta(396, particularJuarez, particularTandil, true, 45);
			ElementoCarta paquete = new ElementoCarta(195, particularTandil, unicen, false, 15);
			ElementoCarta paquete1 = new ElementoCarta(456, unicen, particularJuarez, false, 12);
			
			CriterioCiudadDestino criterioDestino = new CriterioCiudadDestino("Tandil");
			CriterioCiudadDestino criterioDestino1 = new CriterioCiudadDestino("Juárez");
			CriterioCalleDestino criterioCalle = new CriterioCalleDestino("Tucumán");
			CriterioNombreRemitente criterioRemitente = new CriterioNombreRemitente("UNICEN");
			CriterioPeso criterioPeso = new CriterioPeso(30);
			
			ElementoCombo comboPostalDestino = new ElementoCombo(789, "Combo Destino Postal", criterioDestino);
			ElementoCombo comboPostalDestino1 = new ElementoCombo(987, "Combo Destino Postal", criterioDestino1);
			
			ElementoCombo comboEmpresarial = new ElementoCombo(654, "Combo Empresarial", criterioRemitente);
			
			comboPostalDestino.addEnvio(carta);
			comboPostalDestino.addEnvio(paquete);
			
			comboPostalDestino1.addEnvio(carta);
			comboPostalDestino1.addEnvio(carta1);
					
			comboEmpresarial.addEnvio(paquete1);
			comboEmpresarial.addEnvio(carta);
			
			System.out.println(comboPostalDestino);
			System.out.println(comboPostalDestino1);
			System.out.println(comboEmpresarial);
			
			System.out.println("\nLista máximo 30gr: "+comboPostalDestino.listaConCriterio(criterioPeso));

	}

}
