import java.util.Scanner;

public class Digitos {
	
	int num,dig,c=0;
	
	public void CantDigitos() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
		
		while(num>0){
			dig=num%10;
			c=c+1;
			num=num/10;	
		}
		
		System.out.println("El numero tiene " + c + " digitos");
	}

}
