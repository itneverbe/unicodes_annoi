/*Calcolare il prodotto di due numeri non negativi usando somme
successive */

import java.util.Scanner;
public class SommaSuccessiva{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nEnter number a: ");
        int a = myObj.nextInt();
        System.out.println("\nEnter number b: ");
        int b = myObj.nextInt();
        int i=1;
        int ris=0;

        while(i<=b){
            ris=ris+a;
            i++;
        }
        System.out.println("Prodotto = "+ris);
    }
}