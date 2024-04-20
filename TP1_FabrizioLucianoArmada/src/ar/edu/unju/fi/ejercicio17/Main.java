package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		int salida=0;
		int opcion=0;
		do {
			opcion=menu(opcion);
			switch (opcion) {
			case 1:
				jugadores.add(AltaJugador());
				System.out.println("###JUGADOR CREADO CON EXITO###");
				break;
			case 2: if(jugadores.isEmpty()) {
				System.out.println("La lista esta vacia");
			    }else {
			    	System.out.println("***MOSTRAR JUGADOR***");
			    	System.out.println("Ingrese nombre: ");
			    	String nombre = sc.nextLine();
			    	System.out.println("Ingrese apellido: ");
			    	String apellido = sc.nextLine();
			    	DatosJugador(jugadores, nombre, apellido);
			    }
				break;
			case 3: if(jugadores.isEmpty()) {
				    System.out.println("La lista esta vacia");
			        }else {
			        	MostrarPorApellido(jugadores);
			        }
				break;
			case 4:
				if(jugadores.isEmpty()) {
					System.out.println("La lista esta vacia");
				    }else {
				    	System.out.println("***MODIFICAR JUGADOR***");
				    	System.out.println("Ingrese nombre: ");
				    	String nombre = sc.nextLine();
				    	System.out.println("Ingrese apellido: ");
				    	String apellido = sc.nextLine();
				    	ModificarDatosJugador(jugadores, nombre, apellido);
				    }
				break;
			case 5: if(jugadores.isEmpty()) {
				System.out.println("La lista esta vacia");
			}else {
		    	System.out.println("***ELIMINAR JUGADOR***");
		    	System.out.println("Ingrese nombre: ");
		    	String nombre = sc.nextLine();
		    	System.out.println("Ingrese apellido: ");
		    	String apellido = sc.nextLine();
		    	eliminarJugadore(jugadores, nombre, apellido);
			}
				break;
			case 6: System.out.println("Cantidad de jugadores: " + jugadores.size());
				break;
			case 7: if(jugadores.isEmpty()) {
				System.out.println("La lista esta vacia");
			}else {
				System.out.print("Ingrese nacionalidad: ");
				String nacionalidad = sc.nextLine();
				System.out.println("Cantidad de jugadores de la nacionalidad : " + nacionalidad + " : " + CantidadJugadoresNacionalidad(jugadores, nacionalidad));
			}
				break;
			case 8:
             System.out.println("Hasta la proxima");
				break;
			default: System.out.println("Opcion invalida...");
				break;
			}
			System.out.println("Presione \"enter\" para continuar...");
			String enter = sc.nextLine();
		}while(opcion != 8);
		System.out.println("Programa Finalizado...");

	}
	public static int menu(int op) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Alta jugador");
		System.out.println("2 Mostrar los datos del jugador");
		System.out.println("3 Mostrar los jugadores ordenados por apellido");
		System.out.println("4 modificar datos un jugador");
		System.out.println("5 Eliminar a un jugador");
		System.out.println("6 Mostrar la cantidad de jugadores");
		System.out.println("7 Mostrar la cantidad de jugadores segun nacionalidad");
		System.out.println("8 Salir");
		System.out.print("Ingrese opcion: ");
        return op = sc.nextInt();
	}
	public static Jugador AltaJugador() {
		Scanner sc = new Scanner(System.in);
		LocalDate fechaNacimiento=null;
		String posicion="";
		boolean band = false, fechaInvalida=false;
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = sc.nextLine();
	    fechaNacimiento=ingresarFechaNacimiento();
		System.out.println("Ingrese nacionalida: ");
		String nacionalidad = sc.nextLine();
		System.out.println("Ingrese estatura: ");
		float estatura = sc.nextFloat();
		System.out.println("Ingrese peso: ");
		float peso = sc.nextFloat();
		sc.nextLine();
		posicion = elegirPosicion();
        return new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
	}
	
    public static void DatosJugador(ArrayList<Jugador> vector, String nombre, String apellido) {
    	boolean band = false;
    	for (Jugador jugador : vector) {
			if(jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				jugador.mostrarDatos();
			    band=true;
			}
		}
    	if(band==false) {
    		System.out.println("Jugador no encontrado");
    	}
    	
    }
    
    public static void MostrarPorApellido(ArrayList<Jugador> vector) {
    	vector.sort(Comparator.comparing(Jugador::getApellido));
    	for(Jugador jugador: vector) {
    		jugador.mostrarDatos();
    		System.out.println("**********************");
    	}
    }
    public static void ModificarDatosJugador(ArrayList<Jugador> vector, String nombre, String apellido) {
    	Scanner sc = new Scanner(System.in);
    	boolean fechaInvalida=false,band=false,band2=false,posicion=false;
    	LocalDate fechaNacimiento=null;
    	int op=0;
    	String pos="";
    	Jugador modificado = new Jugador();
    	for(Jugador jugador:vector) {
    		if(jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
    			band = true;
    			modificado=jugador;
    		}
    		
    	}
    	if(band == true) {
			do {
	         System.out.println("***JUGADOR ENCONTRADO***");
	         System.out.println("Elija una opcion a modificar");
	         System.out.println("1 Nombre: " + modificado.getNombre());
	         System.out.println("2 Apellido: " + modificado.getApellido());
	         System.out.println("3 Fecha de nacimiento: " + modificado.getFechaNacimiento());
	         System.out.println("4 Nacionalidad: " + modificado.getNacionalidad());
	         System.out.println("5 Estatura: " + modificado.getEstatura());
	         System.out.println("6 Peso: " + modificado.getPeso());
	         System.out.println("7 Posicion " + modificado.getPosicion());
	         System.out.println("8 Salir");
	         System.out.print("Opcion: ");
	         op = sc.nextInt();
	         sc.nextLine();
	         switch (op) {
			case 1:
				System.out.print("Nuevo nombre: ");
				modificado.setNombre(sc.nextLine());
				break;
			case 2:
				System.out.print("Nuevo apellido: ");
				modificado.setApellido(sc.nextLine());
				break;
			case 3:System.out.println("Nueva fecha");
			      fechaNacimiento=ingresarFechaNacimiento();
				 modificado.setFechaNacimiento(fechaNacimiento);
				 
				break;
			case 4:
				System.out.print("Nueva nacionalidad: ");
				modificado.setNacionalidad(sc.nextLine());
				break;
			case 5:
				System.out.print("Nueva estatura: ");
				modificado.setEstatura(sc.nextFloat());
				break;
			case 6:
				System.out.println("Nuevo peso: ");
				modificado.setPeso(sc.nextFloat());
				break;
			case 7:
			    System.out.println("Nueva posicion");
				pos = elegirPosicion();
                modificado.setPosicion(pos);    	
				break;
			case 8:
				System.out.println("Hasta la proxima");
				break;
			default: System.out.println("Opcion invalida");
				break;
			}
			}while(op!=8);
			}else{
	    		System.out.println("Jugador no encontrado");
	    	}
    	
    }
    public static int CantidadJugadoresNacionalidad(ArrayList<Jugador> vector, String nacionalidad) {
    	int total=0;
    	for(Jugador jugador: vector) {
    		if(jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
    			total+=1;
    		}
    	}
    	return total;
    }
    public static void eliminarJugadore(ArrayList<Jugador> vector, String nombre, String apellido) {
    	Iterator iterador = vector.iterator();
    	boolean band=false;
    	while(iterador.hasNext()) {
    	Jugador j = (Jugador)iterador.next();	
    	if(j.getNombre().equalsIgnoreCase(nombre) && j.getApellido().equalsIgnoreCase(apellido)) {
    		iterador.remove();
    		System.out.println("***JUGADOR ELIMINADO***");
    	    band=true;
    	}
    	}
    	if(band) {
    		for(Jugador j: vector) {
    			System.out.println(j);
    		}
    	}else {
    		System.out.println("***JUGADOR NO ENCONTRADO***");
    	}
    }
    public static LocalDate ingresarFechaNacimiento() {
    	Scanner sc = new Scanner(System.in);
        LocalDate fechaNacimiento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean fechaInvalida = false;
        while (!fechaInvalida) {
            System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
            String fecha = sc.nextLine();
            try {
                fechaNacimiento = LocalDate.parse(fecha, formatter);
                fechaInvalida = true;
            } catch (DateTimeParseException e) {
                System.err.println("Error: Ingrese la fecha en formato dd/MM/yyyy");
            }
        }
        return fechaNacimiento;
    }

  public static String elegirPosicion() {
	  Scanner sc = new Scanner(System.in);
	  String posicion="";
	  boolean band=false;
	  do {
			System.out.println("***Ingrese posicion***");
			System.out.println("Delatero");
			System.out.println("Defensa");
			System.out.println("Medio");
			System.out.println("Arquero");
			System.out.println("Posicion: ");
	        posicion = sc.nextLine();
	        if(posicion.equals("delantero") || posicion.equals("medio") || posicion.equals("defensa") || posicion.equals("arquero")) {
	        	band=true;
	        }else {
	        	System.out.println("Posicion invalida");
	        }
			}while(band!=true);
	  return posicion;
  }

    
}
