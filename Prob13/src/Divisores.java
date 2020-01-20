import java.util.Scanner;

public class Divisores {
	int n1,n2,i=1;
	
	public void hallarDivisoresComunes() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		n1 = in.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		n2 = in.nextInt();
		
		while(i<n1 || i<n2) {
			
			if(n1 % i == 0 && n2 % i == 0) {
				System.out.println(i + " es divisor comun\n");
			}
			
			i++;
		}
	}

}
