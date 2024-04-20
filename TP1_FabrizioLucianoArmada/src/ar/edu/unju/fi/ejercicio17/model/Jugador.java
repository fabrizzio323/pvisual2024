package ar.edu.unju.fi.ejercicio17.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jugador {
   private String nombre;
   private String apellido;
   private LocalDate fechaNacimiento;
   private String nacionalidad;
   private float estatura;
   private float peso;
   private String posicion;
   public Jugador() {
	
}
public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
		float peso, String posicion) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
	this.nacionalidad = nacionalidad;
	this.estatura = estatura;
	this.peso = peso;
	this.posicion = posicion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
public float getEstatura() {
	return estatura;
}
public void setEstatura(float estatura) {
	this.estatura = estatura;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}
public String getPosicion() {
	return posicion;
}
public void setPosicion(String posicion) {
	this.posicion = posicion;
}
public int calcularEdad(LocalDate fecha) {
	int total=0;
	LocalDate hoy = LocalDate.now();
	total = Period.between(fecha, hoy).getYears();
	return total;
}
public void mostrarDatos() {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
	System.out.println("Nombre : " + this.nombre);
	System.out.println("Apellido: " + this.apellido);
	System.out.println("Fecha de nacimiento: " + formatter.format(this.fechaNacimiento));
	System.out.println("Edad: " + calcularEdad(this.fechaNacimiento));
    System.out.println("Nacionalidad: " + this.nacionalidad);
    System.out.println("Estatura: " + this.estatura);
    System.out.println("Peso: " + this.peso);
    System.out.println("Posicion: " + this.posicion);
}
}
