
import java.util.Scanner;
import java.io.*;

public class Libreria{
    //metodi
    public static int round(double x){
        /*Definire un metodo round con un argomento di tipo double e tipo di ritorno
        int che arrotonda il suo argomento al numero intero più vicino 
        
        Costruzione di un metodo:
        -1. E' possibile inserire una proprietà come "static" per rendere il metodo una "funzione"
        0. Visibilità del metodo (public, protected, private, default)
        1. Tipo dato del valore di ritorno del metodo. Se ritorna un valore il tipo dato dovrà essere lo stesso.
        2. Nome del metodo
        3. Argomenti del metodo (Variabili che passi al metodo)
        4. Corpo del metodo (istruzioni da eseguire; se ha un valore di ritorno: il metodo termina con l'istruzione
        return "valore")

        Per richiamare un metodo "static" sarà sufficiente scrivere il nome e tra parantesi inserire i parametri. Se il metodo 
        ha un valore di ritorno, il risultato dovrà essere inserito in una variabile dello stesso tipo.
        
        */
        double app = (int)x;

        app = (double)app + (double) 0.5;
        if(x>app){
            x = (int) x;
            x++;
        }
        else x = (int) x;
        return (int) x;
    }

    //verificare se un numero è primo
    public static boolean primo(int x){
        int i = 2;
        Boolean bool=true;

        if((x!=0)||(x!=1)){
            while(i<x-1){
                if(x%i==0){
                    return bool=false;
                }
                i++;
            }
        }
        return bool=true;
    }

    //stampa i numeri primi compresi tra 1 e n
    public static void stampa_primi(int n){
        int x;
        for(x=1; x<n; x++){
            Boolean ris = primo(x);
            if (ris==true){
                System.out.println(x);
            }
        }
    }

    //Riscrivere i metodi ricorsivi fattoriale e fibonacci usando espressioni (e non comandi) condizionali
    public static int fibonacci(int k) {
        k = k==0 ? 0 : 1;
        System.out.println(k);
        k = k==1 ? 1 : 0;
        System.out.println(k);

        k = (k!=0 && k!=1) ? fibonacci(k - 1) + fibonacci(k - 2);

        if (k == 0) 
            return 0;
        else if (k == 1) 
            return 1;
        else 
            return fibonacci(k - 1) + fibonacci(k - 2);
    }

    public static void main(String [] args){
        int k = 10;
        int ris = fibonacci(k);
        System.out.println(ris);
    }


}