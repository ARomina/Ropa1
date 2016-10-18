package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.Stock;
import ar.edu.grupoesfera.cursospring.servicios.StockServicio;
import ar.edu.grupoesfera.cursospring.modelo.ColeccionStock;

@RestController
public class ControladorStock {

		@Inject
		private StockServicio servicioStock;
		
		//Agregar o revertir stock
		@RequestMapping ("/agregarRevertirStock")
		public ModelAndView cargaStock(){
			ModelMap modelo = new ModelMap();
			return new ModelAndView ("agregarRevertirStock", modelo);
		}
		
		//Ver listado del stock
		@RequestMapping ("/verStock")
		public ModelAndView verStock(@ModelAttribute("producto") Producto producto){
			ModelMap modelo = new ModelMap();
			//ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			ColeccionStock servicioStock = ColeccionStock.getInstance();
			servicioStock.agregarProductoAlStock(producto);
			modelo.put("servicioStock", servicioStock.verStockExistente());
			return new ModelAndView ("verStock", modelo);
		}
	
}

