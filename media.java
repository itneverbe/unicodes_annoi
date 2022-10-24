import java.util.Scanner;

public class media {
	
	public static void main (String [] args) {
		
		
		// variables
		Scanner myObj = new Scanner(System.in);		
		double numero = 0;
		double sommatoria = 0.0;
		int i=0;
		// Input number > 0
		do {
			
			numero=myObj.nextDouble();
			i++;
			sommatoria += numero;
			System.out.println(sommatoria/i);
		
		} while(numero>0);
		
		
	}

}
