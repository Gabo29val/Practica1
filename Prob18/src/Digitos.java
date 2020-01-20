import java.util.Scanner;

public class Digitos {
	
	int num,dig,c=0,par=0;
	
		public void CantDigitos() {
		
			Scanner in = new Scanner(System.in);
		
			System.out.println("Ingrese un numero: ");
			num = in.nextInt();
		
			while(num>0){
				dig=num%10;
				if(dig % 2 == 0)
					par++;
				
				c=c+1;
				num=num/10;	
			}
		
			System.out.println("El numero tiene " + c + " digitos, de los cuales " + par + " son pares");
	}

}
