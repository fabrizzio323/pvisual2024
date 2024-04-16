package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        String [] nombres = new String[5];
        cargarNombres(nombres);
        System.out.println(" ");
        mostrarNombre(nombres);
        System.out.println(" ");
        System.out.println("Tamaño del vector: " + nombres.length);
        EliminarDato(nombres);
        mostrarNombre(nombres);
	}
	public static void cargarNombres(String [] vector) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Ingrese nombre: ");
			vector[i]=sc.nextLine();
		}
	}
	public static void mostrarNombre(String [] vector) {
		int i = 0;
		while(i < vector.length) {
			System.out.println("Elemento de la posicion " + i + " : " + vector[i]);
		    i++;
		}
	}
	public static void EliminarDato(String [] vector) {
		Scanner sc = new Scanner(System.in);
		byte indice;
		do {
		System.out.println("Ingrese indice: ");
		indice = sc.nextByte();
		if(indice < 0 || indice > vector.length) {
			System.out.println("Indice incorrecto");
		}
		}while(indice < 0 || indice > vector.length);
		
		
		while(indice < vector.length-1){
		    vector[indice]=vector[indice+1];
		    indice++;
		}
		vector[vector.length-1]="";
	}

}
