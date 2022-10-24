/*conversione di un numero in binario*/

import java.util.Scanner;
public class Binario{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nEnter N: ");
        int n = myObj.nextInt();
        String s = "";

        while(n>0){
            int r = n%2;
            s = r + s;
            n = n / 2;
        }
        System.out.println("Conversione: "+s);
    }
}