/*package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionStock {
	
	//Creación de instancia
	private static ColeccionStock instance = new ColeccionStock();
	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	//Constructor
	private ColeccionStock(){}
	
	public static ColeccionStock getInstance(){
		return instance;
	}
	
	//Agregar objetos de la coleccion Productos al stock - Ingresos por altaProducto
	//Inicializa la cantidad en 0
	//public Map<Producto, Integer> agregarProductoAlStock(Producto producto){
		/*si ColeccionProducto no es null (tiene algo)
		 *se itera la coleccion y se agrega cada Producto en el Stock (stockLista)  
		 *Por cada elemento que se agrega a listaStock, se le asigna una cantidad 
		 *inicial de 0  
		 */
		/*si ColeccionProducto no tiene ningun producto agregado
		 *queda todo el Stock vacio (null?)  
		 */
		//forEachRemaining ?? --> de Iterator
        /*
		public Boolean agregarProductoAlStock(Producto producto){
			if(this.listaStock.containsKey(producto)){
				return false;
			}else{
			this.listaStock.put(producto, 0);
			return true;
			}
		}*/
		
		//Asignar cantidad 0 a cada Producto
		//listaStock.put(producto, 0);
		
		//    return this.listaStock;
		//}

		
		/*ColeccionProducto productos = ColeccionProducto.getInstance();
		Iterator<Producto> iterator = productos.iterator();
		      while(iterator.hasNext()){
		    	  Producto pIngresado = iterator.next();
		    		if(producto.getId().equals(pIngresado.getId())){
		    			producto.setId(pIngresado.getId());
		    			producto.setCategoria(pIngresado.getCategoria());
		    			producto.setNombreProducto(pIngresado.getNombreProducto());
		    			producto.setColor(pIngresado.getColor());
		    			producto.setTalle(pIngresado.getTalle());
		    			producto.setPrecio(pIngresado.getPrecio());
		          }
		      }
		}*/
	/*
	//Ver lista de stock
	public Map<Producto, Integer> verStockExistente(){
		return this.listaStock;
	}
	
    //Getters y Setters
	public Map<Producto, Integer> getListaStock() {
		return listaStock;
	}

	public void setListaStock(Map<Producto, Integer> listaStock) {
		this.listaStock = listaStock;
	}

	public static void setInstance(ColeccionStock instance) {
		ColeccionStock.instance = instance;
	}

}*/
