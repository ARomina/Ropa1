package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.Stock;
import ar.edu.grupoesfera.cursospring.servicios.StockServicio;
//import ar.edu.grupoesfera.cursospring.modelo.ColeccionStock;

@RestController
public class ControladorStock {

		@Inject
		private StockServicio servicioStock;
		
		//Ver pantalla de agregar stock
		@RequestMapping ("/agregarRevertirStock")
		public ModelAndView verStock(@ModelAttribute("producto") Producto producto){
			ModelMap modelo = new ModelMap();
			String info;
			info = "AGREGAR STOCK";
			//Stock servicioStock = Stock.getInstance();
			modelo.put("info", info);
			return new ModelAndView ("agregarRevertirStock", modelo);
		}
		
		//Buscar stock
		@RequestMapping (value = "/stockResultadoBusqueda", method = RequestMethod.POST)
		public ModelAndView buscarStock(@ModelAttribute("producto")Producto producto,
										@RequestParam (value="idproducto")Integer idproducto){
			String info;
			Stock servicioStock = Stock.getInstance();
			ModelMap modelo = new ModelMap();
			if(servicioStock.ingresoIdStock(idproducto)){
				info = "PRODUCTO ENCONTRADO";
				servicioStock.verStock();
			}
			
			
			try{
				servicioStock.ingresoIdStock(idproducto);
				info="PRODUCTO ENCONTRADO";
			}catch(Exception e){
				servicioStock.verStock();
				info=e.getMessage();
			}
			modelo.put("idproducto", idproducto);
			modelo.put("info", info);
			return new ModelAndView ("stockResultadoBusqueda", modelo);
		}
		
		/*
		@RequestMapping (value = "/bajaProConfirma")
		public ModelAndView bajaProConfirma(@ModelAttribute("producto")Producto producto,
									              @RequestParam (value="id")Integer id){
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			ModelMap modelo = new ModelMap();
			servicioproducto.guardaProductoExistente(producto);
			modelo.put("id",producto.getId());
			modelo.put("categoria",producto.getCategoria());	
			modelo.put("nombreProducto",producto.getNombreProducto());
			modelo.put("color",producto.getColor());
			modelo.put("talle",producto.getTalle());
			modelo.put("precio",producto.getPrecio());
			return new ModelAndView ("/bajaProConfirma", modelo);
		}
		
		/*
		//Buscar y agregar o revertir stock
		@RequestMapping (path="/agregarRevertirStock", method = RequestMethod.POST)
		public ModelAndView buscarStock(@ModelAttribute("idproducto")Producto producto){
			String info= "AGREGAR STOCK";
			Stock servicioStock = Stock.getInstance();
			ModelMap modelo = new ModelMap();
			try{
				servicioStock.ingresoIdStock(producto);
				info="PRODUCTO ENCONTRADO";
			}catch(Exception e){
				servicioStock.verStock();
				info=e.getMessage();
			}
			modelo.put("info", info);
			return new ModelAndView ("agregarRevertirStock", modelo);
		}
		/*
		//Ver listado del stock
		@RequestMapping ("/verStock")
		public ModelAndView verStock(@ModelAttribute("producto") Producto producto){
			ModelMap modelo = new ModelMap();
			//ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			//Stock servicioStock = Stock.getInstance();
			//modelo.put("servicioStock", servicioStock.verStock());
			return new ModelAndView ("verStock", modelo);
		}*/
	
}

