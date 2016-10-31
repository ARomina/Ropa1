package ar.edu.grupoesfera.cursospring.controladores;

import java.util.Iterator;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.Stock;
import ar.edu.grupoesfera.cursospring.servicios.ProductoServicio;
import ar.edu.grupoesfera.cursospring.servicios.StockServicio;

@RestController
public class ControladorStock {

	@Inject
	private StockServicio servicioStock;
	@Inject
	private ProductoServicio servicioproducto;
	/*
	@RequestMapping(value = "/agregarStock")
	public ModelAndView agregarStock(@ModelAttribute("stock")Stock stock){
		ModelMap modelo = new ModelMap();
		Stock servicioStock = Stock.getInstance();
		modelo.put("stocks", servicioStock.verProductosConSinStock());
		return new ModelAndView("agregarStock", modelo);
		
	}*/
	
	//Llama la primera vista que muestra los producto; lista Productos para ponerlos a Stock
	@RequestMapping(value="/agregarStockVista")
	public ModelAndView verStockParaAgregar(@ModelAttribute("producto") Producto producto){
		Stock servicioStock = Stock.getInstance();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		String info;
		
		//Itero la coleccion producto y agrega lo que no existe en stock (a stock) con cantidad 0
		for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    	  servicioStock.agregarProductoAStockSiNoEsta(cada);
	    }
		
		//Comprobación para ver si listaStock está vacío
		if(servicioStock.ComprobarStockVacio()){
			info = "STOCK SIN NADA";
		}
		else{
			//después de agregarProductoAStockSiNoEsta(producto)
			info = "STOCK CON ELEMENTOS";
		}
		modelo.put("info", info);
		modelo.put("productosStock", servicioStock.verTodoStock());
		return new ModelAndView ("agregarStockVista", modelo);
	}
	
	//Vista agregarStock (para agregar cantidades)
	@RequestMapping(value="/agregarStock")
	 public ModelAndView agregarStock(@ModelAttribute("stock")Stock stock,
			                          @ModelAttribute("producto")Producto producto,
			                          @RequestParam(value="idProducto")Integer idProducto){
		String info;
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		Stock servicioStock = Stock.getInstance();
		ModelMap modelo = new ModelMap();
		/*for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    	  if(servicioStock.verProductosDisponibles().contains(idProducto)){
	    	  servicioStock.agregarProductoAStockSiNoEsta(cada);
	    	  }
	    }*/
		/*//Itero la coleccion producto y agrega lo que no existe en stock (a stock) con cantidad 0
				for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
			    	  Producto cada = it.next();
			    	  servicioStock.agregarProductoAStockSiNoEsta(cada);
			    }*/
				
				//Comprobación para ver si listaStock está vacío
				if(servicioStock.ComprobarStockVacio()){
					info = "STOCK SIN NADA";
				}
				else{
					//después de agregarProductoAStockSiNoEsta(producto)
					info = "STOCK CON ELEMENTOS";
				}
				modelo.put("info", info);
				modelo.put("productosStock", servicioStock.verStockParaAgregar(producto));
		
		return new ModelAndView("agregarStock", modelo);
	}
	
	//Getters y Setters
	public StockServicio getServicioStock() {
		return servicioStock;
	}

	public void setServicioStock(StockServicio servicioStock) {
		this.servicioStock = servicioStock;
	}

	public ProductoServicio getServicioproducto() {
		return servicioproducto;
	}

	public void setServicioproducto(ProductoServicio servicioproducto) {
		this.servicioproducto = servicioproducto;
	}
	
}
