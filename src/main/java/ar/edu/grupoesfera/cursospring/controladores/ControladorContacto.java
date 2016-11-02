package ar.edu.grupoesfera.cursospring.controladores;

import java.util.Iterator;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionMensaje;
import ar.edu.grupoesfera.cursospring.modelo.Mensaje;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.servicios.ContactoServicio;

@RestController
public class ControladorContacto {

	@Inject
	ContactoServicio servicioContacto;
	
	//Pagina de contacto
	@RequestMapping (value = "/contacto")
	public ModelAndView cargaFormContacto(@ModelAttribute("mensaje") Mensaje mensaje){
		ColeccionMensaje servicioContacto = ColeccionMensaje.getInstance();
		ModelMap modelo = new ModelMap();
		servicioContacto.guardarMensajes(mensaje);
		return new ModelAndView ("contacto", modelo);
		
	}
	
	@RequestMapping(value = "/contactoMensajeExito")
	public ModelAndView contactoMensajeExitoVer(@ModelAttribute("mensaje")Mensaje mensaje){
		ColeccionMensaje servicioContacto = ColeccionMensaje.getInstance();
		ModelMap modelo = new ModelMap();
		servicioContacto.guardarMensajes(mensaje);
		String info;
		//Comprobacion de lista vacia
				if(servicioContacto.getMensajes().isEmpty()){
				  info = "LISTA VACIA";
				}
				else{
					info = "LISTA CON ALGO";
				}
		modelo.put("info", info);
		return new ModelAndView("contactoMensajeExito", modelo);
	}
	
	@RequestMapping (value = "/contactoVerMensajes", method = RequestMethod.GET)
	public ModelAndView verContactoMensajeExito(@ModelAttribute("mensaje") Mensaje mensaje){
		ColeccionMensaje servicioContacto = ColeccionMensaje.getInstance();
		ModelMap modelo = new ModelMap();
		String info;
		//servicioContacto.guardarMensajes(mensaje);
		//Comprobacion de lista vacia
		if(servicioContacto.getMensajes().isEmpty()){
		  info = "LISTA VACIA";
		}
		else{
			info = "LISTA CON ALGO";
		}
		modelo.put("info", info);
		modelo.put("servicioContacto", servicioContacto.verMensajes());
		return new ModelAndView ("contactoVerMensajes", modelo);
		
	}
	
	
	
}
