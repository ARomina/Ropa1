package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface StockServicio {
	//Map<Producto, Integer> verProductosConSinStock();
	void agregarProductoAStockNOMEIMPORTA();
	Boolean comprobarStockVacio();
	Boolean agregarProductoAStockSiNoEsta();
	Boolean agregarStock();
	Set<Producto> verProductosDisponibles();
	Integer verStockProducto();
	Map<Producto, Integer> verTodoStock();
}
