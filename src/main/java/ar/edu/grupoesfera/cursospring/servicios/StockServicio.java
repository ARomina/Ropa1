package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

import java.util.Map;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto; //??

public interface StockServicio {
		
	   Boolean agregarProductoAlStock();
	   Map<Producto, Integer> verStockExistente();
	
		/* 
		 * (...) agregarStock();
		 * (...) revertirStock();  //??
		 * Map<Productos, Integer> verStock();
		 * */
}