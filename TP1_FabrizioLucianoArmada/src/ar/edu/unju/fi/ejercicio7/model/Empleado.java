package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	 private String nombre;
	   private String legajo;
	   private double salario;
	   private static final double salarioMinimo=210000.00;
	   private static final double aumento=20000.00;
	public Empleado() {

	}

	public Empleado(String nombre, String legajo, double salario) {
	    this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= salarioMinimo) {
		this.salario = salario;
		
		}else {
			this.salario= salarioMinimo;
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public static double getAumento() {
		return aumento;
	}
	       public void MostrarDatos() {
	    	   System.out.println("Nombre del empleado: " + this.nombre);
	    	   System.out.println("Legajo: " + this.legajo);
	    	   System.out.println("Salario: $" + this.salario);
	       }
	       public void AumentarSalario() {
	    	   this.salario = this.salario + this.aumento;
	       }

}
