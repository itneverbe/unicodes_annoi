/*Calcolare quoziente e resto della divisione tra due numeri
positivi usando differenze successive */

import java.util.Scanner;
public class DifferenzaSuccessiva{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nEnter number a: ");
        int a = myObj.nextInt();
        System.out.println("\nEnter number b: ");
        int b = myObj.nextInt();
        int i=0;

        while((a>0) && (b<a)){
            a=a-b;
            i++;
        }
        System.out.println("Quoziente = "+i+" Resto = "+a);
    }
}