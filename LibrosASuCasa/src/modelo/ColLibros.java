package modelo;

import java.util.ArrayList;

import java.util.List;


public class ColLibros<cosa> {
	private List<cosa> libros;
	

	public List<cosa> getLibros() {
		return libros;
	}

	public void setLibros(List<cosa> libros) {
		this.libros = libros;
	}
	
	
	public ColLibros() {
		this.libros = new ArrayList<>();
	}
	
	public void add(cosa libro){
		this.libros.add(libro);
	}
	
	
	
	
	
	
	
}
