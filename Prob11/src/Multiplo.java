import java.util.Scanner;

public class Multiplo {
	
	int m,n,q;
	
	public void calcularMultiplo() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de m: ");
		m = in.nextInt();
		
		System.out.println("Ingrese el valor de n: ");
		n = in.nextInt();
		
		System.out.println("Ingrese el valor de q: ");
		q = in.nextInt();
		
		if(m % n == 0 && m % q == 0) {
			System.out.println("El numero " + m + " es multiplo de " + n + " y " + q);
		}else {
			System.out.println("El numero " + m + " NO es multiplo de " + n + " y " + q);
		}
	}

}
