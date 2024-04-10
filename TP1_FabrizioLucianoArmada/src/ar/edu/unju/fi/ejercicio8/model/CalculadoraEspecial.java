package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	 private int numero;

		public CalculadoraEspecial() {
			super();
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
	     public int calcularSumatoria(int numero) {
	    	 int resultado=0;
	    	 for(int i=1;i<=numero;i++) {
	    		 resultado += Math.pow((i*(i+1)/2),2);
	    	 }
	    	 return resultado;
	     }
	     public int calcularProductoria(int numero) {
	    	 int resultado = 1;
	    	 for(int i=1;i<=numero;i++) {
	    		 resultado = resultado * i*(i+4); 
	    	 }
	    	 return resultado;
	     }
}
