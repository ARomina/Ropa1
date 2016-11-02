package ar.edu.grupoesfera.cursospring.modelo;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Mensaje;

public class ColeccionMensaje {

	private static ColeccionMensaje instance = new ColeccionMensaje();
	private List<Mensaje> mensajes = new LinkedList<Mensaje>();
	//private Set<Mensaje> mensajes = new TreeSet<Mensaje>();
	
	//Constructor default
	private ColeccionMensaje(){}
	
	//Llamada a la instancia
	public static ColeccionMensaje getInstance() {
		return instance;
	}

	//Métodos
	//Guardar y agregar mensaje a lista
	/*public void guardarMensajes(Mensaje mensaje){
	      for(Iterator<Mensaje> it = mensajes.iterator(); it.hasNext();){
	    	  Mensaje cada = it.next();
	    			mensaje.setEmailMensaje(cada.getNombreMensaje());
	    			mensaje.setNombreMensaje(cada.getNombreMensaje());
	    			mensaje.setAsuntoMensaje(cada.getAsuntoMensaje());
	    			mensaje.setTextoMensaje(cada.getTextoMensaje());
	    			
	          }
	    		this.mensajes.add(mensaje);
	}
	*/
	public Boolean guardarMensajes(Mensaje mensaje){
		return this.mensajes.add(mensaje);
	}
	
	
	//Ver mensajes
	public List<Mensaje> verMensajes(){
		return this.mensajes;
	}
	
	//Getters y Setters
	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public static void setInstance(ColeccionMensaje instance) {
		ColeccionMensaje.instance = instance;
	}
	
	//HashCode / Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensajes == null) ? 0 : mensajes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColeccionMensaje other = (ColeccionMensaje) obj;
		if (mensajes == null) {
			if (other.mensajes != null)
				return false;
		} else if (!mensajes.equals(other.mensajes))
			return false;
		return true;
	}
}
