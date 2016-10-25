package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Map;
import java.util.Set;

//import java.util.Map;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.modelo.Producto;

//import ar.edu.grupoesfera.cursospring.modelo.Producto;
//import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto; //??

@Service ("servicioStock")
public class StockServicioImpl implements StockServicio{

	@Override
	public Set<Producto> buscarId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Producto, Integer> buscaEnStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Producto, Integer> agregaAlStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Producto, Integer> verStock() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
