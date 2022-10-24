import java.util.Scanner;

public class media1 {
	
	public static void main (String [] args) {
		
		
		// variables
		Scanner myObj = new Scanner(System.in);		
		int somma = 0;
        int n = 0;
        int x=1;  
        while (x > 0){
            System.out.println("Dammi un numero (<=0 per terminare)");
            x = myObj.nextInt();
            if (x > 0) {
                somma = somma + x;
                n++;
            }
        }
        if (n == 0)
            System.out.println("Nessun numero introdotto");
        else
            System.out.println("Media = " + (double) somma / n);
		
		
	}

}
