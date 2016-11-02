package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Mensaje;

public interface ContactoServicio {

	//void guardarMensajes();
	Boolean guardarMensajes();
	//void guardarMensaje();
	List<Mensaje> verMensajes();
}
