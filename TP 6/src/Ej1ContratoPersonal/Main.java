package Ej1ContratoPersonal;

public class Main {

	public static void main(String[] args) {
		CriterioEmpresa criterioFiat = new CriterioEmpresa("Fiat");
		CriterioHoras criterio8horas = new CriterioHoras(8);
		CriterioSueldo criterio10000p = new CriterioSueldo(10000);
		
		Candidato Pepe = new Candidato("Pepe", "Fiat", 15000, criterioFiat);
		Candidato Juan = new Candidato("Juan", "Toyota", 20000, criterio8horas);
		Candidato Nicolas = new Candidato("Nicolas", "Renault", 10000, criterio10000p);
		
		Contrato contrato1 = new Contrato(8, 15000, "Fiat");
		Contrato contrato2 = new Contrato(6, 20000, "Renault");
		Contrato contrato3 = new Contrato(6, 10000, "Renault");
		
		Consultora AutitoFeliz = new Consultora("AutitoFeliz");
		AutitoFeliz.addCandidatos(Pepe);
		AutitoFeliz.addCandidatos(Juan);
		AutitoFeliz.addCandidatos(Nicolas);
		
		System.out.println(AutitoFeliz.queCandidatoAceptaContrato(contrato1));
		System.out.println(AutitoFeliz.queCandidatoAceptaContrato(contrato2));
		System.out.println(AutitoFeliz.queCandidatoAceptaContrato(contrato3));
	}

}
