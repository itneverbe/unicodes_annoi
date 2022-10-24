// equazione secondo grado 

import java.util.Scanner;
public class EquazioneSecondoGrado {
    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);  
        System.out.println("\nEnter number a:");
        int a = myObj.nextInt();   
        System.out.println("\nEnter number b:");
        int b = myObj.nextInt();   
        System.out.println("\nEnter number c:");
        int c = myObj.nextInt();   

        //calcolo del delta
        int delta = (b*b) - (4*a*c);

        if(delta < 0)
            System.out.println("0 Solutions");
        else if (delta == 0)
            System.out.println("1 Solution found: "+(-b/(2*a)));
        else if (delta > 0) {
            System.out.println("2 Solution found: "+((-(b) + Math.sqrt(delta))/(2*a)));
            System.out.println("2 Solution found: "+((-(b) - Math.sqrt(delta))/(2*a)));            
        }
        System.out.println("Equation is: "+a+"x^2 + ("+b+")x + ("+c+") = 0");
    }
}
