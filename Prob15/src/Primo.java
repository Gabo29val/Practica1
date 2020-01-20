import java.util.Scanner;

public class Primo {
	int n;
	
	public int primo(int num) {
		int sw=1,i;
		if(num==1){
			sw=0;
		}else{
			for(i=2;i<n;i++){
				if(num % i == 0)
					sw=0;
			}
		}
		return sw;
	}
	
	public void mensaje() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		n = in.nextInt();
		
		if(primo(n) == 1) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}

}
