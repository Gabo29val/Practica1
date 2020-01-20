import java.util.Scanner;

public class Convertir {
	
	int alfa,g,m,s;
	double temp;
	
	public void convertirRadianes() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un angulo(en radianes): ");
		alfa = in.nextInt();
		
		temp = alfa*180/Math.PI;
		g = (int) Math.floor(temp);
		temp = 60*(temp-g);
		m = (int) Math.floor(temp);
		temp = 60*(temp-m);
		s = (int) Math.floor(temp);
		
		System.out.println("El angulo ingresado equivale a : " + g + "grados, " + m + "min, y " + s + " segundos.");
		
		
		
	}

}
