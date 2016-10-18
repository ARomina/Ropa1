package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;

public class Stock {
	
	//Creación de la instancia de stock
	private static Stock instance = new Stock();
	//Creación de la
	//Creación de la lista del stock
	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	
	//Llama a la instancia
	public static Stock getInstance(){
		return instance;
	}
	
	//Constructor
	private Stock(){}
	
	//Métodos
	//Ver lista de productos existentes
	public Map<Producto, Integer> verStockExistente(){
		return listaStock;
	}
	
	/*public ColeccionProducto getListaProducto() {
        return (ColeccionProducto)listaStock.values();
    }
	/*
    public Item getItem(String itemCode) {
        return stock.get(itemCode);
    }

    public boolean containsSalesItem(String itemCode) {
        if (stock.containsKey(itemCode)) {
            return stock.containsKey(itemCode);
        } else {
            return false;
        }
    }
	
	
	
	
	/*
	//Muestra listado de existencias
	public Set<Producto> verProductosExistentes(){
		return listaStock.keySet();
	}
	/* 
	public Boolean verStock(Producto producto)throws Exception{
  		if(this.ColeccionProductos.contains(producto)){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE"); 
        }
        else{
        	this.productos.add(producto);  
        	return true;
        } 
    }*/
	/*
	   Producto producto = ColeccionProducto.Producto.getId(id);
	   if (producto == null) {
	       return null; //no hay productos con ese id
	   }else{
	       return coleccionProducto.getId();
	   }
	}*/
	/*
	public Boolean altaProducto(Producto producto)throws Exception{
  		if(this.productos.contains(producto)){
        	throw new Exception("EL CODIGO DE PRODUCTO YA EXISTE"); 
        }
        else{
        	this.productos.add(producto);  
        	return true;
        } 
    }
	
	
	public Set<Producto> verProductos(){
		return this.productos;
	}
	
	//Muestra listado de existencias
	public Set<Producto> verProductosExistentes(){
		return listaStock.keySet();
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
