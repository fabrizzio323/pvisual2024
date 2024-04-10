package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	 private int diametro;
     private double precio;
     private double area;
     private boolean ingredienteEspecial;
     private static final int precio20 = 500;
     private static final int precio30 = 750;
     private static final int precio40 = 1000;
	public Pizza() {
		
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		if(diametro == 20 || diametro == 30 || diametro == 40) {
		this.diametro = diametro;
		}else {
			System.out.println("Solo diametros de 20, 30 o 40cm");
		}
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}
	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}
     public double calcularPrecio(int medida, boolean band) {
    	 int total=0;
    	 switch (medida) {
		case 20:
			if(band == true) {
				  total = 4500 + precio20;
				}else {
					total = 4500;
				}
			break;
		case 30:
			if(band == true) {
				  total = 4800 + precio30;
				}else {
					total = 4800;
				}
			break;
		case 40:
			if(band == true) {
		    	total = 5500 + precio40;
		    }else {
		    	total = 5500;
		    }
			break;
		default:
			System.out.println("ERROR...");
			break;
		}
    	 return total;
    	 
     }
     public double calcularArea(int medida) {
    	 double total=0;
    	 int cuadrado = (medida/2) * (medida/2);
    	 return total = 3.14f * cuadrado;
     }
     public void mostrarDatos() {
    	 System.out.println("Diametro: " + this.diametro);
    	 System.out.println("Ingrediente especial: " + this.ingredienteEspecial);
    	 System.out.println("Precio pizza: $" + this.precio);
    	 System.out.println("Area de la pizza: " + this.area);
}
}
