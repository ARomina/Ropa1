package ar.edu.grupoesfera.cursospring.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Stock {

	private static Stock instance = new Stock();
	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	
	//Llamar la instancia
	public static Stock getInstance(){
		return instance;
	}
	
	//Constructor
	public Stock(){}
	
	//M�todos
	
	//Ver lista de productos
	public Set<Producto> verProductosDisponibles(){
		return listaStock.keySet();
	}
	
	//Ver Stock (MAPA)
	public Map<Producto, Integer> verTodoStock(){
		return listaStock;
	}
	
	//Comprobar si el map stock est� vac�o
	public Boolean ComprobarStockVacio(){
		if(this.listaStock.isEmpty()){
			return true;  //"si, est� vacio"
		}
		else{
			//si tiene algo, false, "no, no est� vacio"
			return false;
		}
	}
	
	//Retorna la cantidad en stock de un determinado producto
	public Integer verStockProducto(Producto producto){
		if(!this.listaStock.containsKey(producto)){
			return 0;
		}
		return this.listaStock.get(producto);
	}
	
	
	//Buscador
	public Boolean buscaProductoEnStock(Producto producto)throws Exception{
		if(this.listaStock.containsKey(producto)){
			this.listaStock.containsKey(producto);
			return true;
		}
		throw new Exception("EL PRODUCTO NO EXISTE EN EL STOCK"); 
	}
	
	//Agrega producto al stock
	public Boolean agregarProductoAStockNOMEIMPORTA(Producto producto){
		if(!this.listaStock.containsKey(producto)){
			this.listaStock.put(producto, 0);
			return true;
		}
		else{
		    return false;
		}
		    
	}
	
	//Pone el producto en el stock, con cantidad en 0, si est� devuelve false (no agrega nada, porque ya est� en stock)
	public Boolean agregarProductoAStockSiNoEsta(Producto producto){
		if(this.listaStock.containsKey(producto)){
			return false;
		}
		else{
		//si no est� en el stock, lo agrega al mapa con cantidad 0
			this.listaStock.put(producto, 0);
		    return true;
		}
	}
	
	//Agregar existencias al producto en stock; si no contiene el producto, retorna false (no hace nada porque no est�)
	public Boolean agregarStock(Producto producto, Integer cantidad){
		if(!this.listaStock.containsKey(producto)){
			return false;
		}
		
		//Al ingresar una cantidad nueva, al ponerla en producto, la misma se suma a la cantidad que ya tenia
		Integer cantidadNueva = this.listaStock.get(producto) + cantidad;
		this.listaStock.put(producto, cantidadNueva);
		return true;
	}
	/*
	//Retorna cantidades
	public Boolean verCantidad(Producto producto){
		if(this.listaStock.containsKey(producto)){
			this.listaStock.get(producto).
			return false;
		}
		//si no est� en el stock, lo agrega al mapa con cantidad 0
		this.listaStock.put(producto, 0);
		return true;
	}*/

	//Getters y Setters
	public Map<Producto, Integer> getListaStock() {
		return listaStock;
	}

	public void setListaStock(Map<Producto, Integer> listaStock) {
		this.listaStock = listaStock;
	}

	public static void setInstance(Stock instance) {
		Stock.instance = instance;
	}

	//HashCode / Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaStock == null) ? 0 : listaStock.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (listaStock == null) {
			if (other.listaStock != null)
				return false;
		} else if (!listaStock.equals(other.listaStock))
			return false;
		return true;
	}
	
}
