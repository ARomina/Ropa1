package ar.edu.grupoesfera.cursospring.modelo;

import java.util.HashMap;
import java.util.Map;

//CADA UNA DE LAS "HILERAS" DEL STOCK (CADA UNO CON SU CANTIDAD Y FECHA, ETC)
public class Stock3 {

	private Map<Producto, Integer> listaStock = new HashMap<Producto, Integer>();
	private static Stock3 instance = new Stock3();
	Integer cantidad;
	String fecha;
	
	public static Stock3 instance(){
		return instance;
	}

	//Getters y Setters
	public Map<Producto, Integer> getListaStock() {
		return listaStock;
	}

	public void setListaStock(Map<Producto, Integer> listaStock) {
		this.listaStock = listaStock;
	}

	public static Stock3 getInstance() {
		return instance;
	}

	public static void setInstance(Stock3 instance) {
		Stock3.instance = instance;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	//HashCode / Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		Stock3 other = (Stock3) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (listaStock == null) {
			if (other.listaStock != null)
				return false;
		} else if (!listaStock.equals(other.listaStock))
			return false;
		return true;
	}
	
}
