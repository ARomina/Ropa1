package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto; //??

@Service ("servicioStock")
public class StockServicioImpl implements StockServicio{
	
	public Boolean agregarProductoAlStock(){
		return null;
	}
	
	public Map<Producto, Integer> verStockExistente(){
		return null;
	}
	
	/*
	@Override
	public (...) agregarStock(){
	   return null;
	}
	
	@Override
	public (...) revertirStock(){
	   return null;
	}
	
	@Override
	public Map<Productos, Integer> verStock(){
	   return null;
	}
	*/
}
