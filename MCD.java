/*massimo comun divisore */

import java.util.Scanner;
public class MCD{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nEnter number a: ");
        int a = myObj.nextInt();
        System.out.println("\nEnter number b: ");
        int b = myObj.nextInt();

        while(b>0){
            int r=a%b;
            a = b;
            b = r;
        }
        System.out.println("\nMCD = "+a);
    }
}