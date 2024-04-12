package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class main {

	public static void main(String[] args) {
		    Persona p1 = CargarDatos1();
            p1.MostrarDatos();
		    Persona p2 = CargarDatos2();
	        p2.MostrarDatos();
	        Persona p3 = CargarDatos3();
	        p3.MostrarDatos();
	}
	public static Persona CargarDatos1() {
		Scanner sc = new Scanner(System.in);
		Persona p1 = new Persona();
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		p1.setNombre(nombre);
		System.out.print("Ingrese dni: ");
		String dni = sc.nextLine();
		p1.setDni(dni);
		System.out.println("***Ingrese fecha de nacimiento***");
		System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("año: ");
        int anio = sc.nextInt();
        sc.nextLine();
        LocalDate FechaNacimiento= LocalDate.of(anio, mes, dia);
        p1.setFechaNacimiento(FechaNacimiento);
        System.out.print("Ingrese provincia: ");
        String provincia = sc.nextLine();
        p1.setProvincia(provincia);
		return p1;
	}
	public static Persona CargarDatos2() {
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
	        LocalDate FechaNacimiento= LocalDate.of(anio, mes, dia);
	        Persona p2 = new Persona(dni, nombre, FechaNacimiento , provincia);
	        return p2;
	}
	public static Persona CargarDatos3() {
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
        LocalDate FechaNacimiento= LocalDate.of(anio, mes, dia);
        Persona p3 = new Persona(dni, nombre, FechaNacimiento);
        return p3;
	}
}
