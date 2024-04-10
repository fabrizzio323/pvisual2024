package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class main {

	public static void main(String[] args) {
	        Persona p1 = CargarDatos();
	        p1.MostrarDatos();

	}
	public static Persona CargarDatos() {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese nombre: ");
	        String nombre = sc.nextLine();
	        System.out.print("Ingrese dni: ");
	        String dni = sc.nextLine();
	        System.out.println("***Ingrese su fecha de nacimiento***");
	        System.out.print("Dia: ");
	        int dia = sc.nextInt();
	        System.out.print("Mes: ");
	        int mes = sc.nextInt();
	        System.out.print("año: ");
	        int anio = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Ingrese provincia: ");
	        String provincia = sc.nextLine();
	        LocalDate edad = LocalDate.of(anio, mes, dia);
	        Persona p1 = new Persona(dni, nombre, edad , provincia);
	        return p1;
	}
}
