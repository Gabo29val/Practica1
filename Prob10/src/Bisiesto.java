import java.util.Scanner;

public class Bisiesto {
	
	int anio,sw=0;
	
	public void determinarBisiesto() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el a�o: ");
		anio = in.nextInt();
		
		if(anio % 4 == 0){
			sw=1;
			if(anio % 100 == 0){
				sw=0;
				if(anio % 400 == 0){
					sw=1;
				}
			}
		}
		
		if(sw!=0){
			System.out.println("El a�o es bisiesto");
		}else{
			System.out.println("El a�o no es bisiesto");
		}
		
		
	}

}
