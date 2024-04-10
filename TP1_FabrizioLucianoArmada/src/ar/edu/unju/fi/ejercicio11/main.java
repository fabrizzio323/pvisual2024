package ar.edu.unju.fi.ejercicio11;

public class main {

	public static void main(String[] args) {
		int i=2,x=1,total=0;
		boolean b = true;
		for(int j=40; j >= 0; j--) {
			if(b==true) {
				total=i*j;
				b=false;
				x=x+i;
			}else {
				System.out.println(total + " ");
				total=total+(40-x);
				x=x+i;
			}
		}
	}

}
