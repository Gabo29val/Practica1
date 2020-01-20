import java.util.Scanner;

public class Numeros {
	
	int num=0;
	
	public void determinarTipoNumero() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
		
		if(num%2==0) {
			
			System.out.println("El numero es par");
		}else {
			
			System.out.println("El numero es impar");
		}
	}

}
