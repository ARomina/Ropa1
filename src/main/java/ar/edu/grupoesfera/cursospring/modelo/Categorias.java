package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categorias{
	
	//Declaraci�n y creaci�n de instancia
	private List<String> categoriasRopa = new ArrayList<>();
	
	//Constructor
	public Categorias(){
		
		//Agregado de elementos
		categoriasRopa.add("MUJERES");
		categoriasRopa.add("HOMBRES");
		categoriasRopa.add("NI�OS");
	}
	
}