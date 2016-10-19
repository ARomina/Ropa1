package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;
import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface StockServicio {
		
	   Boolean ingresoIdStock();
	   Boolean agregarStock();
	   Map<Producto, Integer> verStock();
	   
	   //Map<Producto, Integer> verStockExistente();
		/* 
		 * (...) agregarStock();
		 * (...) revertirStock();  //??
		 * Map<Producto, Integer> verStock();
		 * */
}