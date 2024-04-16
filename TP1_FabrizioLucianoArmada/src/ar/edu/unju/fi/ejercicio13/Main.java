package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] enteros = new int[8];
        for(int i = 0; i < enteros.length; i++) {
          System.out.print("Ingrese numero: ");
          enteros[i]=sc.nextInt();
        }
        for(int j = 0; j < enteros.length; j++) {
        	System.out.println("Elemento de la posicion " + j + " : " + enteros[j]);
        }
	}

}
