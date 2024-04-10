package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tabla;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Ingrese una tabla de multiplicar: ");
         tabla = sc.nextInt();
         if(tabla < 1 || tabla > 9) {
        	 System.out.println("Ingrese un numero dentro del intevalo [1-9]");
         }
        }while(tabla < 1 || tabla > 9);
         for(int i=0; i <= 10; i++) {
        	 System.out.println(tabla + "x" + i + "= " + tabla*i);
         }

	}

}
