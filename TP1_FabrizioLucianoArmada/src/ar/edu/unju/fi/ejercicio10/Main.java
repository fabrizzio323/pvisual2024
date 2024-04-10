package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       Pizza p1 = new Pizza();
	       for(int i=1; i<=3; i++) {
	    	   System.out.println("***ENCARGO DE PIZZAS***");
	    	   System.out.println("Ingrese diametro: ");
	    	   int diametro = sc.nextInt();
	    	   p1.setDiametro(diametro);
	    	   sc.nextLine();
	    	   System.out.println("¿Contiene ingredientes especiales?");
	           String rta = sc.nextLine();
	           boolean band = rta.equalsIgnoreCase("si");
	           if(band==true) {
	        	   p1.setIngredienteEspecial(true);
	           }else {
	        	   p1.setIngredienteEspecial(false);
	           }
	           p1.setPrecio(p1.calcularPrecio(diametro, band));
	           p1.setArea(p1.calcularArea(diametro));
	           System.out.println("*** Pizza " + i +" ***");
	           p1.mostrarDatos();
	       }

	}

}
