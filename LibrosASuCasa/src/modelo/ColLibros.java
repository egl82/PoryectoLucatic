package modelo;

import java.util.ArrayList;

import java.util.List;


public class ColLibros {
	private List<Libro> libros;
	

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
	public ColLibros() {
		List<Object> libros = new ArrayList<>();
	}
	
	public void add(Libro libro){
		libros.add(libro);
	}
	
	
	
	
	
	
	
}
