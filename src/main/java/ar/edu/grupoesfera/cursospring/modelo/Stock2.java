package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;

public class Stock2 {
	private HashMap<Producto, Integer> listaStock;
	private Integer cantidad;
	private static Stock2 instance = new Stock2();
	
	public Stock2(){
		this.listaStock = new HashMap<Producto, Integer>();
		this.cantidad = 0;
	}
	
	public void agregaProductosAlStock(Producto producto, Integer cantidad){
		this.listaStock.put(producto, cantidad);
	}

	//Getters y Setters
	public HashMap<Producto, Integer> getListaStock() {
		return listaStock;
	}

	public void setListaStock(HashMap<Producto, Integer> listaStock) {
		this.listaStock = listaStock;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public static Stock2 getInstance() {
		return instance;
	}

	public static void setInstance(Stock2 instance) {
		Stock2.instance = instance;
	}
	
}
