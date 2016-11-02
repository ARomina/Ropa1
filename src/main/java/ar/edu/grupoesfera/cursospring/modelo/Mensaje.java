package ar.edu.grupoesfera.cursospring.modelo;

public class Mensaje {

	private String nombreMensaje;
	private String emailMensaje;
	private String asuntoMensaje;
	private String textoMensaje;
	
	//Getters y Setters
	public String getNombreMensaje() {
		return nombreMensaje;
	}
	public void setNombreMensaje(String nombreMensaje) {
		this.nombreMensaje = nombreMensaje;
	}
	public String getEmailMensaje() {
		return emailMensaje;
	}
	public void setEmailMensaje(String emailMensaje) {
		this.emailMensaje = emailMensaje;
	}
	public String getAsuntoMensaje() {
		return asuntoMensaje;
	}
	public void setAsuntoMensaje(String asuntoMensaje) {
		this.asuntoMensaje = asuntoMensaje;
	}
	public String getTextoMensaje() {
		return textoMensaje;
	}
	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailMensaje == null) ? 0 : emailMensaje.hashCode());
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
		Mensaje other = (Mensaje) obj;
		if (asuntoMensaje == null) {
			if (other.asuntoMensaje != null)
				return false;
		} else if (!asuntoMensaje.equals(other.asuntoMensaje))
			return false;
		if (emailMensaje == null) {
			if (other.emailMensaje != null)
				return false;
		} else if (!emailMensaje.equals(other.emailMensaje))
			return false;
		if (nombreMensaje == null) {
			if (other.nombreMensaje != null)
				return false;
		} else if (!nombreMensaje.equals(other.nombreMensaje))
			return false;
		if (textoMensaje == null) {
			if (other.textoMensaje != null)
				return false;
		} else if (!textoMensaje.equals(other.textoMensaje))
			return false;
		return true;
	}

}
