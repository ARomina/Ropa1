package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;

public class Stock {
	
	//Creación de la instancia de stock
	private static Stock instance = new Stock();
	//Integer cantidad;
	//Creación de la lista del stock
	
	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	
	//Llama a la instancia
	public static Stock getInstance(){
		return instance;
	}
	
	//Constructor
	private Stock(){
		Integer cantidad = 0;
		//String fechaStock;
		//this.cantidad = 0;
	}
	
	//Busca producto por codigo ingresado -> si existe muestra sus datos (como objeto Stock)
	/*
	public Map<Producto, Integer> buscarStock(Integer id){
		ColeccionProducto productos = ColeccionProducto.getInstance();
		for(Producto prod : listaStock.keySet()){
			if(id.equals(prod.getId())){
			   prod.getId();
			   prod.setNombreProducto(Producto.get());
			   
			}
		}
		
		return this.listaStock;
	}*/
	
    //Ingreso del codigo -> si ya existe, te dice, sino lo trae de la colección y lo muestra
	/*public Boolean ingresoIdStock(Integer idproducto)throws Exception{
  		if(this.listaStock.containsKey(idproducto)){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE");
        }
        else{
        	this.listaStock.keySet();  
        	return true;
        } 
    }**/
	
	
    public Boolean ingresoIdStock(Integer idproducto){
  		if(this.listaStock.containsKey(idproducto)){
        	this.listaStock.keySet(); 
        	return true;
        }
        else{ 
        	return false;
        } 
    }
	/*
	public Boolean ingresoIdStock(Integer idproducto){
		boolean contains = false;
		for (Producto product: id) {
		    if (Producto.getId() == inputParam) { // I used getId(), replace that by the accessor you actually need
		        contains = true;
		        break;
		    }
		}
		if (contains) {
			this.listaStock.keySet(); 
			return true;
		} else {
			throw new Exception("EL CODIGO INGRESADO NO EXISTE");
		    return false;
		}
	}*/
	
	/*
	public Boolean ingresoIdStock(Integer idproducto)throws Exception{
		Producto producto = ;
  		if(!(idproducto.equals(producto.getId()))){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE");
        }
        else{
        	this.listaStock.keySet();  
        	return true;
        } 
    }*/
	
	//Agregar fecha y cantidad sobre el producto encontrado*/
	public void agregarStock(Producto producto, Integer cantidad/*, String fechaStock*/){
	    listaStock.put(producto, cantidad);
	    //FECHA STOCK?????? 
		}
	
	//Ver lista de Stock
	public Map<Producto, Integer> verStock(){
		return this.listaStock;
	}
	
		/*
		for(Iterator<Producto> it = productos.iterator(); it.hasNext();){
	  	    	  Producto cada = it.next();
		    		if(cada.getId().equals(producto.getId())){
		    	    cada.getId();
	            	cada.setCategoria(producto.getCategoria());
	            	cada.setNombreProducto(producto.getNombreProducto());
	            	cada.setColor(producto.getColor());
	            	cada.setTalle(producto.getTalle());
	            	cada.setPrecio(producto.getPrecio());
	            }
	          }
		return this.listaStock;
	}*/
	/*
	//Agrega producto que ya existe en la coleccion al Stock
	public void agregarProductoAlStock(Producto producto, Integer cantidad){
    listaStock.put(producto, cantidad);
     
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
	
}
