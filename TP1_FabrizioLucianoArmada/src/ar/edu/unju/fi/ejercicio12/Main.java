package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("***Ingrese la fecha de nacimiento***");
        System.out.print("Dia: ");
        int dia= sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        mes = mes -1;
        System.out.print("Año: ");
        int anio = sc.nextInt();
        Calendar FechaNacimiento = Calendar.getInstance();
        FechaNacimiento.set(anio, mes, dia);
        Persona p1 = new Persona();
        p1.setNombre(nombre);
        p1.setFechaNacimiento(FechaNacimiento);
        p1.mostrarDatos();
        
	}

}
