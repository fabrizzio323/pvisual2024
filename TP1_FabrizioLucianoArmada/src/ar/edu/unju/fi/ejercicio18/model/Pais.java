package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
   String codigo;
   String Nombre;
   
   public Pais() {
	
   }

public Pais(String codigo, String nombre) {
	super();
	this.codigo = codigo;
	Nombre = nombre;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}
   
}
