package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.Destinoturistico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         String codigo="";
	  int op;
	  ArrayList<Destinoturistico> destinos = new ArrayList();
	  ArrayList<Pais> paises = new ArrayList();
      PrecargaPaises(paises);
      do {
    	  op=menu();
    	  switch (op) {
    	  case 1:
			System.out.println("***ALTA DE DESTINO TURISTICO***");
			AltaDestinoturistico(paises, destinos);
			break;
        case 2:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
			System.out.println("***LISTA DE DESTINOS TURISTICOS***");
			MostrarDestinos(destinos);
        	}
			break;
        case 3:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
        		 System.out.println("***MODIFICAR PAIS***");
                 System.out.println("Ingrese nombre: ");
                 String nombre = sc.nextLine();
                 ModificarPais(destinos, paises, nombre);
        	}
	        break;
        case 4:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
        	LimpiarLista(destinos);
        	System.out.println("***LISTA LIMPIADA***");
        	}
        	break;
        case 5:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
        		 limpiarBuffer();
        		codigo=IngresoCodigo(paises);
        	EliminarDestino(destinos, codigo);
        	}
        	break;
        case 6:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
        	System.out.println("***MUESTRA DE LA LISTA ORDENADA POR NOMBRE***");
        	OrdenarDestinos(destinos);
        	}
        	break;
        case 7:
        	System.out.println("***LISTA DE PAISES***");
        	MostrarPaises(paises);
        	
        	break;
        case 8:
        	if(destinos.isEmpty()) {
        		System.out.println("***LISTA VACIA***");
        	}else {
        	limpiarBuffer();
        	System.out.println("***DESTINOS TURISTICOS POR PAIS***");
        	codigo=IngresoCodigo(paises);
        	DestinosPorPais(destinos, codigo);
        	}
	        break;
        case 9:
	       System.out.println("Saliendo del programa...");
	        break;
        
		default: System.out.println("***ERROR OPCION INVALIDA***");
			break;
		}
    	  System.out.println("Presione \"enter\" Para Continuar...");
    	  sc.nextLine();
      }while(op!=9);
      System.out.println("Programa finalizado...");
	}
    public static void PrecargaPaises(ArrayList<Pais> paises) {
    	paises.add(new Pais("USA239", "Estados Unidos"));
    	paises.add(new Pais("GER948", "Alemania"));
        paises.add(new Pais("ARG754", "Argentina"));
        paises.add(new Pais("ESP457", "España"));
        paises.add(new Pais("JPN854", "Japon"));
    }
    public static int menu() {
        int op;
    	System.out.println("1 Alta de destino turistico");
        System.out.println("2 Mostrar todos los destinos turisticos");
        System.out.println("3 Modificar el pais de un destino turistico");
        System.out.println("4 Limpiar el ArraList de destino turistcio");
        System.out.println("5 Eliminar un destino turistico");
        System.out.println("6 Mostrar los destinos turisticos ordenados por nombre");
        System.out.println("7 Mostrar todos los paises");
        System.out.println("8 Mostrar los destinos turisticos por pais");
        System.out.println("9 Salir");
        System.out.println("Ingrese una opcion: ");
        return op=sc.nextInt();
    }
    public static void AltaDestinoturistico(ArrayList<Pais> paises, ArrayList<Destinoturistico> destinos) {
    	   sc.nextLine();
           boolean band=false; 
           String codigo="";
    	    codigo = IngresoCodigo(paises);
    	    System.out.println("Ingrese Nombre: ");
    	    String nombre = sc.nextLine();
    	    Double precio = IngresoPrecio();
    	    String Nombrepais=SeleccionarPais(paises, codigo);
    	    System.out.println("Ingrese cantidad de dias: ");
    	    int dias = sc.nextInt();
    	    destinos.add(new Destinoturistico(codigo, nombre, precio, new Pais(codigo, Nombrepais), dias));
    	    System.out.println("***INGRESO DE DESTINO EXITOSO***");
    	   }
    public static  void MostrarDestinos(ArrayList<Destinoturistico> destinos) {
    	for(Destinoturistico d:destinos) {
    		System.out.println(d.MostrarDatos());
    		System.out.println("**********************");
    	}
    }
    public static boolean CodigoEncontrado(ArrayList<Pais> paises, String codigo) {
    	boolean band = false;
    	for(Pais p:paises) {
    		if(p.getCodigo().equalsIgnoreCase(codigo)) {
    			band = true;
    		}
    	}
    	return band;
    }
    public static Double IngresoPrecio() {
    	Double precio=0.0;
    	String CadenaPrecio="";
    	boolean band=false;
		do {
			   System.out.println("Ingrese precio: ");
	    	     CadenaPrecio = sc.nextLine();
    		try {
    			 precio = Double.parseDouble(CadenaPrecio);
    			 band = true;
    		} catch (Exception e) {
    			System.err.println("Error ingrese bien el precio");
    		}
    	}while( !(band));
    	return precio;
    }
    public static String SeleccionarPais(ArrayList<Pais> paises, String codigo) {
    	String pais="";
    	for(Pais p:paises) {
    		if(p.getCodigo().equalsIgnoreCase(codigo)) {
    			pais=p.getNombre();
    		}
    	}
    	return pais;
    }
    public static void LimpiarLista(ArrayList<Destinoturistico> destinos) {
    	destinos.clear();
    }
   
    public static String IngresoCodigo(ArrayList<Pais> paises) {
    	boolean band=false;
    	String Cod="";
    	do {
            System.out.println("Ingrese codigo: ");
            Cod = sc.nextLine();
            if(CodigoEncontrado(paises, Cod)==true) {
         	   band=true;
            }else {
         	   System.err.println("Error codigo inexistente presione \"enter\" ");
         	  limpiarBuffer();
            }
     	   }while(!(band));
    	return Cod;
    }
    public static void EliminarDestino(ArrayList<Destinoturistico> destinos, String codigo) {
    	Iterator iterator = destinos.iterator();
    	boolean band=false;
    	while(iterator.hasNext()) {
    		Destinoturistico d = (Destinoturistico)iterator.next();
    		if(d.getCodigo().equalsIgnoreCase(codigo)) {
    			iterator.remove();
    			band=true;
    		}
    	}
    	if(band) {
    		System.out.println("***DESTINO ELIMINADO***");
    	}else {
    		System.out.println("***DESTINO NO ENCONTRADO***");
    	}
    }
    public static void OrdenarDestinos(ArrayList<Destinoturistico> destinos) {
    	ArrayList<Destinoturistico> copia = new ArrayList (destinos);
    	copia.sort(Comparator.comparing(Destinoturistico::getNombre));
    	for(Destinoturistico d: copia) {
    		System.out.println(d.MostrarDatos());
    		System.out.println("**********************");
    	}
    }
    public static void MostrarPaises(ArrayList<Pais> paises) {
    	for(Pais p:paises) {
    		System.out.println(p.getNombre());
    	}
    }
    public static void DestinosPorPais(ArrayList<Destinoturistico> destinos, String codigo) {
    	for(Destinoturistico d: destinos) {
    		if(d.getCodigo().equalsIgnoreCase(codigo)) {
    			System.out.println(d.MostrarDatos());
    			System.out.println("**********************");
    		}
    	}
    }
    public static void ModificarPais(ArrayList<Destinoturistico> destinos, ArrayList<Pais> paises, String nombre) {
    	Destinoturistico encontrado = new Destinoturistico();
    	String codigoNuevo="",NuevoPais="";
    	boolean band = false;
    	for(Destinoturistico d: destinos) {
    		if(d.getNombre().equalsIgnoreCase(nombre)) {
    			encontrado = d;
    			band = true;
    		}
    	}
    	if(band) {
    		limpiarBuffer();
    	    codigoNuevo=IngresoCodigo(paises);
    	    NuevoPais=SeleccionarPais(paises, codigoNuevo);
    	    encontrado.setCodigo(codigoNuevo);
    	    encontrado.setPais(new Pais(codigoNuevo, NuevoPais));
    	    System.out.println("***PAIS MODIFICADO***");
    	}else {
    		System.out.println("***DESTINO NO ENCONTRADO***");
    	}
    }
    public static void limpiarBuffer(){
    	sc.nextLine();
    	}
}
