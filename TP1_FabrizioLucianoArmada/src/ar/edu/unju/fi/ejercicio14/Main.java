package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rango;
		do {
		System.out.println("Ingrese rango [3-10] : ");
		 rango = sc.nextInt();
		if(rango < 3 || rango > 10) {
			System.out.println("Error solo rango de [3-10]");
		}
		}while(rango < 3 || rango > 10);
		int [] enteros = new int[rango];
		ingresoEnteros(enteros);
		MostrarEnteros(enteros);
        
	}
	public static void ingresoEnteros(int [] vector) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < vector.length ; i++) {
			System.out.println("Ingrese dato: ");
			vector[i]=sc.nextInt();
		}
	
	}
	public static void MostrarEnteros(int [] vector) {
		for(int i = 0; i < vector.length ; i++) {
			System.out.println("Elemento de la posicion " + i + " : " + vector[i]);
		}
	}

}
