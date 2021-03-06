package modelo;

public class Libro {
	
	
	private int idLibro; 
	private String isbn;
	private String titulo; 
	private String descripcion; 
	private String sinopsis; 
	private double precio;
	private int cantidad;
	
	
	
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Libro(int idLibro, String isbn, String titulo, String descripcion, String sinopsis, double precio,int cantidad) {
		super();
		this.idLibro = idLibro;
		this.isbn = isbn;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.sinopsis = sinopsis;
		this.precio = precio;
		this.cantidad=cantidad;
	} 
	
	
	public Libro(){
		
	}
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", isbn=" + isbn + ", titulo=" + titulo + ", descripcion=" + descripcion
				+ ", sinopsis=" + sinopsis + ", precio=" + precio + "]";
	}
	
	

}
