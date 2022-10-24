/*Determinare il numero di bit a 1 nella rappresentazione in base 2 di un
numero intero non negativo */

import java.util.Scanner;
public class ControlloBit{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int count=0;
        int x;

        do{
            System.out.println("\nEnter number x: ");
            x = myObj.nextInt();
        }while(x < 0);
        do{
            if(x%2==1) count++;
            x = x/2;
        }while(x > 0);
        System.out.println(count);
    }
}