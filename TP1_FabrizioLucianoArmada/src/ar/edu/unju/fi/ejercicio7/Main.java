package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado = CargarDatos();
		empleado.MostrarDatos();
		empleado.AumentarSalario();
		empleado.MostrarDatos();
	}
	public static Empleado CargarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese legajo: ");
        String legajo= sc.nextLine();
        System.out.print("Ingrese salario: ");
        double salario = sc.nextDouble();
        Empleado e1 = new Empleado(nombre, legajo, salario);
        return e1;
	}
}
