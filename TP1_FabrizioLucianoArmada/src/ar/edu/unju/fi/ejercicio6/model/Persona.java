package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;
	public Persona() {
	}
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
    public int CalcularEdad(LocalDate fecha) {
    	int resultado=0;
    	LocalDate hoy = LocalDate.now();
        resultado= Period.between(fecha, hoy).getYears();
    	return resultado;
    }
    public boolean MayoriaDeEdad(int anio) {
    	if(anio > 18) {
    		return true;
    	}
    	return false;
    }
    public void MostrarDatos() {
    	String legalidad;
    	if(MayoriaDeEdad(CalcularEdad(this.fechaNacimiento)) == true) {
    		legalidad = " La persona es mayor de edad";
    	}else {
    		legalidad = "La persona no es mayor de edad";
    	}
    	System.out.println("Nombre:" + this.nombre + " Dni:" + this.dni + " Fecha de nacimiento:" + this.fechaNacimiento + " Provincia:" + this.provincia + " Edad:" + CalcularEdad(this.fechaNacimiento) + " años" + legalidad);
    }
}
