package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

public class Caracteristicas {

	//Declaracion y creacion
	private List<String> categoria = new ArrayList<String>();
	private List<String> nombreProducto = new ArrayList<String>();
	private List<String> talleProducto = new ArrayList<String>();
	private List<String> colorProducto = new ArrayList<String>();

			
	//Constructor
	public Caracteristicas(){
		
		//Cargado de cada una de las listas
		
		//Categorias
		categoria.add("MUJERES");
		categoria.add("HOMBRES");
		categoria.add("NIÑOS");
		
		//Nombres -> Tipos
		nombreProducto.add("Vestido");
		nombreProducto.add("Pantalón");
		nombreProducto.add("Zapatos");
		nombreProducto.add("Zapatillas");
		nombreProducto.add("Remera mangas cortas");
		nombreProducto.add("Remera mangas largas");
		nombreProducto.add("Sweater");
		nombreProducto.add("Medias");
		nombreProducto.add("Camisa");
		nombreProducto.add("Pantalón de vestir");
		nombreProducto.add("Campera");
		nombreProducto.add("Botas");
		
		//Talles
		talleProducto.add("XS");
		talleProducto.add("S");
		talleProducto.add("M");
		talleProducto.add("L");
		talleProducto.add("XL");
		
		//Colores
		colorProducto.add("Verde");
		colorProducto.add("Rojo");
		colorProducto.add("Azul");
		colorProducto.add("Amarillo");
		colorProducto.add("Celeste");
		colorProducto.add("Rosa");
		colorProducto.add("Negro");
		colorProducto.add("Gris");
		colorProducto.add("Blanco");
		colorProducto.add("Violeta");
		colorProducto.add("Magenta");
		colorProducto.add("Marrón");

	}
	
	//Getters y Setters
	public List<String> getCategoria() {
		return categoria;
	}
	public List<String> setCategoria(List<String> categoria) {
		return this.categoria = categoria;
	}
	public List<String> getNombreProducto() {
		return nombreProducto;
	}
	public List<String> setNombreProducto(List<String> nombreProducto) {
		return this.nombreProducto = nombreProducto;
	}
	public List<String> getTalleProducto() {
		return talleProducto;
	}
	public List<String> setTalleProducto(List<String> talleProducto) {
		return this.talleProducto = talleProducto;
	}
	public List<String> getColorProducto() {
		return colorProducto;
	}
	public List<String> setColorProducto(List<String> colorProducto) {
		return this.colorProducto = colorProducto;
	}
	
}
