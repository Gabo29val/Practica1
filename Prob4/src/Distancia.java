import java.util.Scanner;

public class Distancia {
	
	float x1,y1,x2,y2,dist;
	
	public void calcularDistancia() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese la abscisa del primer punto: ");
		x1 = in.nextFloat();
		System.out.println("Ingrese la ordenada del primer punto: ");
		y1 = in.nextFloat();
		System.out.println("Ingrese la abscisa del segundo punto: ");
		x2 = in.nextFloat();
		System.out.println("Ingrese la ordenada del segundo punto: ");
		y2 = in.nextFloat();
		
		dist = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		double distancia = Math.sqrt(dist);
		
		System.out.println("La distancia entre los dos puntos dados es: " + distancia);
	}

}
