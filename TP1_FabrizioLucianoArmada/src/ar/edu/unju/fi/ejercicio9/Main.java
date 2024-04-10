package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      Producto p = new Producto();
	         for(int i=1;i<=3;i++) {
	        System.out.println("Producto nro " + i);
	    	   System.out.println("Ingrese nombre: ");
	    	   p.setNombre(sc.nextLine());
	    	   System.out.println("Ingrese codigo: ");
	    	   p.setCodigo(sc.nextLine());
	    	   System.out.println("Ingrese precio: $");
	    	   p.setPrecio(sc.nextDouble());
	    	   System.out.println("Ingrese descuento: ");
	    	   p.setDescuento(sc.nextInt());
	    	   sc.nextLine();
	           System.out.println("Nombre: " + p.getNombre());
	           System.out.println("Codigo : " + p.getCodigo());
	           System.out.println("Precio $" + p.getPrecio());
	           System.out.println("Descuento: " + p.getDescuento() + "%");
	           System.out.println("Precio con descuento aplicado: $" + p.calcularDescuento());
	           
	         }
	}

}
