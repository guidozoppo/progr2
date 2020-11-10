package Ej4SitioWebNoticias;

public abstract class ElementoPortal {

	public abstract int cantNoticias();
	//COPIA COMPLETA
	public abstract ElementoPortal getCopia();
	//COPIA RESTRINGIDA
	public abstract ElementoPortal getCopia(String palabraClave);

	//FALTA AGREGAR LAS BUSQUEDAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
