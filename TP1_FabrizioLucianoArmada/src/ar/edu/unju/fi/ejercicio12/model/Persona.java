package ar.edu.unju.fi.ejercicio12.model;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;
	public Persona() {
		
	}
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
      public int CalcularEdad() {
    	  int total=0;
          Calendar hoy = Calendar.getInstance();
          total = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
          if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
              total--;
          }
    	  return total;
      }
      public String SignoZodiacal() {
    	  int mes = fechaNacimiento.get(Calendar.MONTH)+1;
    	  String signo="";
    	  switch(mes) {
		case 1:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo = "Capricornio";
			}else {
				signo ="Acuario";
			}
			break;
		case 2:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 19) {
				signo = "Acuario";
			}else {
				signo = "Picis";
			}
			break;
		case 3:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20) {
				signo = "Picis";
			}else {
				signo = "Aries";
			}
			break;
		case 4:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20 ) {
				signo = "Aries";
			}else {
				signo ="Tauro";
			}
			break;
		case 5:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
				signo ="Tauro";
			}else {
				signo = "Geminis";
			}
			break;
		case 6:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
				signo = "Geminis";
			}else {
				signo = "Cancer";
			}
			break;
		case 7: 
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22) {
				signo = "Cancer";
			}else {
				signo = "Leo";
			}
			break;
		case 8:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 23) {
				signo = "Leo";
			}else {
				signo = "Virgo";
			}
			break;
		case 9:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 23) {
				signo = "Virgo";
			}else {
				signo = "Libra";
			}
			break;
		case 10:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 23) {
				signo = "Libra";
			}else {
				signo = "Escorpio";
			}
			break;
		case 11:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22) {
				signo = "Escorpio";
			}else {
				signo = "Sagitario";
			}
			break;
		case 12:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
				signo = "Sagitario";
			}else {
				signo = "Capricornio";
			}
			break;
		default:
			System.out.println("Error...");
			break;
			
		}
    	  return signo;
      }
      public String Estacion() {
    	  int mes=fechaNacimiento.get(Calendar.MONTH)+1;
    	  String estacion = "";
    	  switch (mes) {
		case 1:
			estacion ="Verano";
			break;
		case 2:
			estacion ="Verano";
			break;
		case 3:
			estacion="Otoño";
			break;
		case 4:
			estacion="Otoño";
			break;
		case 5:
			estacion="Otoño";
			break;
		case 6:
			estacion="Invierno";
			break;
		case 7:
			estacion="Invierno";
			break;
		case 8:
			estacion="Invierno";
			break;
		case 9:
			estacion="Primavera";
			break;
		case 10:
			estacion="Primavera";
			break;
		case 11:
			estacion="Primavera";
			break;
		case 12:
			estacion ="Verano";
			break;
		default:
			System.out.println("Error...");
			break;
		}
    	  return estacion;
      }
      public void mostrarDatos() {
    	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    	  System.out.println("Nombre : " + this.nombre);
    	  System.out.println("Fecha de nacimiento: " + sdf.format(fechaNacimiento.getTime()));
    	  System.out.println("Edad: " + CalcularEdad());
    	  System.out.println("Signo del zodiaco: " + SignoZodiacal());
    	  System.out.println("Estacion: " + Estacion());
      }
    
}
