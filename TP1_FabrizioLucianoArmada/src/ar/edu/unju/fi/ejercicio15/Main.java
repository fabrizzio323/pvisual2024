package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rango;
		
		do {
			System.out.print("Ingrese el rango del vector[5-10] : ");
			rango = sc.nextInt();
			if(rango < 5 || rango > 10) {
				System.out.println("Error solo rango de [5-10]");
			}
		} while (rango < 5 || rango > 10);
		String [] cadenas = new String [rango];
		CargarCadenas(cadenas);
		mostrarPrimeroUltimo(cadenas);
		mostrarUltimoPrimero(cadenas);
		
	}
	public static void CargarCadenas(String [] vector) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Cadena: ");
            vector[i]= sc.nextLine();
		}
	}
	public static void mostrarPrimeroUltimo(String [] vector) {
		System.out.println("***Orden primero al ultimo***");
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Elemento de la posicion " + i + " : " + vector[i]);
		}
	}
	public static void mostrarUltimoPrimero(String [] vector) {
		System.out.println("***Orden ultimo al primero***");
		for(int i = vector.length-1; i >= 0 ;i--) {
			
			System.out.println("Elemento de la posicion " + i + " : " + vector[i]);
		}
	}
}
