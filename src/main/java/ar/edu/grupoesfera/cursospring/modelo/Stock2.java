/*package apackage ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;

public class Stock {
	
	//Creación de la instancia de stock
	//Creación de cantidad y stock (Map)
	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	private Integer cantidad;
	private static Stock instance = new Stock();
	//private Set<Producto> productos;

	//Llamado a la instancia
	public static Stock getInstance(){
		return instance;
	}
	
	//Constructor
	private Stock(){
		//Integer cantidad = 0;
		//String fechaStock;
		//this.cantidad = 0;
	}
	
	// 1) Busca el código ingresado en PRODUCTOS(COLECCION), si está lo trae; sino, mensaje
	public void buscarId(ColeccionProducto productos){
        for(Iterator<ColeccionProducto> it = productos.iterator(); it.hasNext();){
	    	  Producto cada = it.next();
    		if(cada.getId().equals(nro)){
    	    cada.getId();
        }
      }
}
	
	
	
	/*public boolean buscarId(Integer idProducto, Producto producto)throws Exception{
			if(!this.productos.contains(producto.getId().equals(idProducto))){ //antes tenía producto.getId()
				throw new Exception("EL CODIGO INGRESADO NO EXISTE");
			}
			else{
				return this.productos.contains(producto.getId());
			}
		}
		/*
		public Boolean altaProducto(Producto producto)throws Exception{
	  		if(this.productos.contains(producto)){
	        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE"); 
	        }
	        else{
	        	this.productos.add(producto);  
	        	return true;
	        } 
	    }*/
	
	// 2) Busca el Producto en STOCK; si está, trae la cantidad; sino, cantidad = 0
	/*public Map<Producto, Integer> buscaEnStock(Producto producto)throws Exception{
		if(this.listaStock.containsKey(producto)){
			this.listaStock.put(producto, cantidad);
		}
		else{
			this.listaStock.put(producto, 0);
		}
		
		return this.listaStock;
	}
		
    //INTENTO 1 NO ANDAAAA
	// 1) Busca el código ingresado en PRODUCTOS(COLECCION), si está lo trae; sino, mensaje
	/*public Boolean buscarId(Producto producto, Integer idprod){
		if(producto.getId().equals(idprod)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	//INTENTO 2
	//2) Busca el Producto en STOCK; si está, trae la cantidad; sino, cantidad = 0
	public Boolean buscaEnStock(Producto producto){
		if(this.listaStock.containsKey(producto)){
			return false;
		}
		else{
			this.listaStock.put(producto, 0);
			return true;
		}
	}
	
	// 3) Agrega PRODUCTO en STOCK, con su CANTIDAD
	public Boolean agregaAlStock(Producto producto, Integer cantidad){
		if(!this.listaStock.containsKey(producto)){
			return false;
		}
		Integer cantidadNueva = this.listaStock.get(producto) + cantidad;
		this.listaStock.put(producto, cantidadNueva);
		return true;
	}
	
	/*public void agregaProductosAlStock(Producto producto, Integer cantidad){
		this.listaStock.put(producto, cantidad);
	}
	*/
	
	//Ver lista de Stock
	/*public Map<Producto, Integer> verStock(){
		return this.listaStock;
	}
	
	//Getters y Setters
	public Map<Producto, Integer> getListaStock() {
		return listaStock;
	}

	public void setListaStock(Map<Producto, Integer> listaStock) {
		this.listaStock = listaStock;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public static void setInstance(Stock instance) {
		Stock.instance = instance;
	}
	
}
r.edu.grupoesfera.cursospring.modelo;

public class Stock2 {

}*/
