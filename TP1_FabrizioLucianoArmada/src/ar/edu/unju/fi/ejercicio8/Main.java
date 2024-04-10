package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      CalculadoraEspecial calculo = new CalculadoraEspecial();
	      System.out.println("Ingrese numero: ");
	      int numero = sc.nextInt();
	      calculo.setNumero(numero);
	      System.out.println("Sumatoria: " + calculo.calcularSumatoria(numero));
	      System.out.println("Productoria: " + calculo.calcularProductoria(numero));

	}

}
