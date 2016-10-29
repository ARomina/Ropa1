package ar.edu.grupoesfera.cursospring.controladores;

import java.util.Iterator;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	//Primera pantalla de Stock, trae los productos dados de alta que haya (con o sin existencias, o sea, lo que ya estén en stock y los que no)
	/*@RequestMapping (value = "/agregarStockVista")
	public ModelAndView agregarStockVerLista(@ModelAttribute("producto")Producto producto){
		ModelMap modelo = new ModelMap();
		//ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		Stock servicioStock = Stock.getInstance();
	    String info = "AGREGAR STOCK";
		try{
			servicioStock.agregarProductoAStockSiNoEsta(producto);
		}catch(Exception e){
			info = "NO HAY STOCK";
		}
		//modelo.put("servicioStock", servicioStock.agregarProductoAStockSiNoEsta(producto));
		modelo.put("servicioStock", servicioStock.verTodoStock());
		return new ModelAndView ("/agregarStockVista", modelo);
	}*/
	
	//Llama la vista y se comprueba si el stock está vacío
	@RequestMapping(value="/agregarStockVista")
	public ModelAndView verStockParaAgregar(@ModelAttribute("producto") Producto producto){
		Stock servicioStock = Stock.getInstance();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();
		String info;
		//info = "lala";
		/*servicioStock.agregarProductoAStockSiNoEsta(producto);
		if(servicioStock.agregarProductoAStockSiNoEsta(producto)){
			info = "PRODUCTOS AGREGADOS";
		}
		else{
			info = "NO SE AGREGO NADA PORQUE YA ESTABA";
		}*/
		
		for(Iterator<Producto> it = servicioproducto.getProductos().iterator(); it.hasNext();){
	    	  Producto cada = it.next();
	    	  servicioStock.agregarProductoAStockNOMEIMPORTA(cada);
	    }
		
		//servicioStock.agregarProductoAStockNOMEIMPORTA(producto);
		//servicioStock.agregarProductoAStockSiNoEsta(producto);
		if(servicioStock.ComprobarStockVacio()){
			info = "STOCK SIN NADA";
		}
		else{
			info = "STOCK CON ELEMENTOS";
		}
		/*
		try{
		  servicioStock.ComprobarStockVacio();
		  info = "STOCK SIN NADA";
		}catch(Exception e){
		  info = "STOCK CON ELEMENTOS";
		}*/
		modelo.put("info", info);
		//modelo.put("productos", servicioproducto.verProductos());
		//modelo.put("stockCantidad", servicioStock.verProductosDisponibles());
		//modelo.put("productos", servicioStock.verProductosDisponibles());
		//modelo.put("productos", servicioStock.verProductosDisponibles());
		modelo.put("productos", servicioStock.verTodoStock());
		return new ModelAndView ("agregarStockVista", modelo);
	}
	
	/*//Primera pantalla de Stock, trae los productos dados de alta que haya (con o sin existencias, o sea, lo que ya estén en stock y los que no)
	@RequestMapping(value="/agregarStockVista")
	public ModelAndView verStockParaAgregar(Producto producto){
		Stock servicioStock = Stock.getInstance();
		ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
		ModelMap modelo = new ModelMap();	
		modelo.put("productos", servicioproducto.verProductos());
		modelo.put("stock", servicioStock.);
		
		return new ModelAndView ("agregarStock", agregaStockMap);
	}*/
	
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
