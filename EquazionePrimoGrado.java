// equazione di primo grado

import java.util.Scanner;
public class EquazionePrimoGrado{
    public static void main (String[] args) {

        Scanner myObj = new Scanner(System.in);  
        System.out.println("\nEnter number a: ");
        int a = myObj.nextInt();   
        System.out.println("\nEnter number b: ");
        int b = myObj.nextInt();   

        if(a == 0){
            if(b==0){
                System.out.println("Undefined");
            }else{
                System.out.println("Impossible");
            }
        }
        else{
            if(b == 0){
                System.out.println("Result:0");
            }
            else{   
                System.out.println("Result: "+(- (double) b/a));
            }
        }
        System.out.println("Equation is: "+a+"x + "+b+" = 0");
    }
}