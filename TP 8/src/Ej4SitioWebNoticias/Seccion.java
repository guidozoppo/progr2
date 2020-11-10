package Ej4SitioWebNoticias;

import java.util.ArrayList;

public class Seccion extends ElementoPortal{

	private String descripcion;
	private String imagen;
	private ArrayList<ElementoPortal> elementos;
	
	public Seccion(String descripcion) {
		this.descripcion = descripcion;
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoPortal elem) {
		elementos.add(elem);
	}
	
	public int cantNoticias() {
		int contador = 0;
		for(ElementoPortal e:elementos) {
			contador += e.cantNoticias();
		}
		return contador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

	//COPIA COMPLETA
	@Override
	public ElementoPortal getCopia() {
		Seccion copia = new Seccion(this.getDescripcion());
		copia.setImagen(this.getImagen());
		
		for(ElementoPortal e:elementos) {
			copia.addElemento(e.getCopia());
		}
		return copia;
	}
	
	/*
	//COPIA RESTRINGIDA ACA ESTOY CREANDO LAS SECCIONES AUNQUE ESTEN VACIAS
	@Override
	public ElementoPortal getCopia(String palabraClave) {
		Seccion copia = new Seccion(this.getDescripcion());
		copia.setImagen(this.getImagen());
		
		for(ElementoPortal e:elementos) {
			ElementoPortal copiaHijo = e.getCopia(palabraClave);
			if(copiaHijo != null)
			copia.addElemento(copiaHijo);
		}
		return copia;
	}*/
	
	//COPIA RESTRINGIDA ACA SI UNA SECCION ESTA VACIA NO LA CREO
	@Override
	public ElementoPortal getCopia(String palabraClave) {
		//PARA NO CREAR UNA COPIA CUANDO LA SECCION ES VACIA PRIMERO CREO UN ArrayList auxiliar
		ArrayList<ElementoPortal> aux = new ArrayList<>();
		
		//Al auxiliar le agrego una copia siempre y cuando la copia cumpla con la condicion de la palabra clave
		for(ElementoPortal e:elementos) {
			ElementoPortal copiaHijo = e.getCopia(palabraClave);
			if(copiaHijo != null) {
				aux.add(copiaHijo);
			}
		}
		//Y ahora, si el aux tiene contenido, creo la seccion con contenido adentro, evitando que la seccion este vacia.
		if(aux.size() > 0) {
			Seccion copia = new Seccion(this.getDescripcion());
			copia.setImagen(this.getImagen());
			for(ElementoPortal elem:aux) {
				copia.addElemento(elem);
			}
			return copia;
		
		} else {
			return null;	
		}
		
	}
	
	

}
