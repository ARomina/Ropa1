package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

@Service("servicioStock")
public class StockServicioImpl implements StockServicio{

	@Override
	public void agregarProductoAStockNOMEIMPORTA() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Boolean comprobarStockVacio() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean agregarProductoAStockSiNoEsta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Producto> verProductosDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Producto, Integer> verTodoStock() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public Map<Producto, Integer> verProductosConSinStock() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}
