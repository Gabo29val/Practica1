import java.util.Scanner;

public class Algoritmo {
	
	int num1,num2,nuevoN1;
	
	public void calcular() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero(dia y mes de nac.): ");
		num1 = in.nextInt();
		
		System.out.println("Ingrese el segundo numero(edad): ");
		num2 = in.nextInt();
		
		nuevoN1 = (((num1*2 + 5)*50 + num2)+365) - 615;
		
		System.out.println("El primer numero es: " + nuevoN1);
	}

}
