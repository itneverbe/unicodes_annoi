/*Verificare se un numero è primo o no*/

import java.util.Scanner;
public class Primo{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nEnter number x: ");
        int x = myObj.nextInt();
        int i = 2;

        if((x!=0)||(x!=1)){
            while(i<x-1){
                if(x%i==0){
                    System.out.println("\nIl numero non è primo");
                    System.exit(i);
                }
                i++;
            }
            System.out.println("\nIl numero è primo");
        }
    }
}