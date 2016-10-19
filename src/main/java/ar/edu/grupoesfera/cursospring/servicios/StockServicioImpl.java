package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;

//import java.util.Map;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

//import ar.edu.grupoesfera.cursospring.modelo.Producto;
//import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto; //??

@Service ("servicioStock")
public class StockServicioImpl implements StockServicio{
	
	@Override
	public Boolean ingresoIdStock(){
		return null;
	}
	
	@Override
	public Boolean agregarStock(){
		return null;
	}
	
	@Override
	public Map<Producto, Integer> verStock(){
		 return null;
	}
	
	/*
	public Map<Producto, Integer> verStockExistente(){
		return null;
	}*/
	
}
