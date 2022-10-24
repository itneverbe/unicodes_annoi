/*  1) Scrivere un programma che legge un intero e determina se è pari o dispari. 
    2) Risolvere l’esercizio precedente senza fare uso del comando if.
*/
import java.util.Scanner;
public class PariDispari{

    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nYou can do it with(0) or without(1) the if istruction");
        int choose = myObj.nextInt();

        System.out.println("\nEnter a integer number: ");
        int num = myObj.nextInt();

        if(choose == 0){ 
            //con if  
            if(num%2 == 0){
                System.out.println(num+ " è pari");
            }else{
                System.out.println(num+ " è dispari");
            }
        }else{
            //senza if
            String r = num%2==0 ? "Pari":"Dispari"; //espressione condizionale
            System.out.println(num+" è "+r);
        }
	}
}