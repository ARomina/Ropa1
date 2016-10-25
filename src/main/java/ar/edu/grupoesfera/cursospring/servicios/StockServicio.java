package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

public interface StockServicio {
		
	   Set<Producto> buscarId();
	   Map<Producto, Integer> buscaEnStock();
	   Map<Producto, Integer> agregaAlStock();
	   Map<Producto, Integer> verStock();
	   
}