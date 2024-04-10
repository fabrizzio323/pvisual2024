package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int factorial = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese el numero a factorear: ");
	        int numero = sc.nextInt();
	        for(int i= 1; i <= numero; i++) {
	        	factorial = factorial * i;
	        }
	        System.out.println("Factorial de " + numero + ": " + factorial);

	}

}
