package ar.edu.unju.fi.ejercicio18.model;

public class Destinoturistico {
      String codigo;
      String nombre;
      Double precio;
      Pais pais;
      int CantidadDias;
      public Destinoturistico() {
		
	}
	public Destinoturistico(String codigo, String nombre, Double precio, Pais pais, int cantidadDias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		CantidadDias = cantidadDias;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCantidadDias() {
		return CantidadDias;
	}
	public void setCantidadDias(int cantidadDias) {
		CantidadDias = cantidadDias;
	}
	public String MostrarDatos() {
		return "Codigo: " + codigo + " Nombre: " + nombre + " Precio: " + precio + " Pais: " + pais.Nombre + " Cantidad de dias: " + CantidadDias;
	}
      
}
