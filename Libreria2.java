
import java.util.Scanner;
import java.io.*;

public class Libreria2{


    public static int mcm(int x, int y){
        int max = x>y ? x : y;

        if(x<0 || y<0) return 0;
        while(max%y != 0 || max%x != 0){

            if(x>y)
            max += x;
            else max += y;

        }

        return max;

    }

    public static int MCD(int a, int b){

        while(b>0){
            int r=a%b;
            a = b;
            b = r;
        }

        return b;

    }


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
    // aggiornamento 06/11/2022
    public static boolean esserePari(int n) {
        
        return n<0 ? false : n == 0 ? true : n == 1 ? false : esserePari(n-2);

    }

    public static double potenza(double a, int n) {
        
        if(n==0) return 1;
        else return a * potenza(a, n-1);

    }

    public static void inverti(int[] a){

        int[] app = new int[10];

        for(int i=0; i<a.length; i++){

            app[i] = a[a.length-1-i];

        }

        for(int i=0; i<a.length; i++){

            a[i] = app[i];

        }
    }

    public static void max_array(int[] a){

        int app=a[0];

        for(int i=0; i<a.length; i++){

            if(a[i] > app)  app=a[i];

        }

        System.out.println(app);

    }

    public static void min_array(int[] a){

        int app=a[0];

        for(int i=0; i<2; i++){

            if(a[i] < app)  app=a[i];

        }

        System.out.println(app);

    }

    public static int[] concatenazione(int[] a, int[] b){

        int[] app = new int[a.length+b.length];

        for(int i=0; i<a.length; i++){

            app[i] = a[i];

        }

        for(int i=0; i<b.length; i++){

            app[a.length+i] = b[i];

        }

        return app;
    }

    public static boolean le(int [] a, int[] b){
        if(a.length<=b.length){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b.length; j++){
                    if(a[i]>b[j]){
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static boolean le(int [] a, int[] b){
        if(a.length<=b.length){
            for(int i=0; i<a.length; i++){
                    if(a[i]>b[i]){
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static int[][] permutazioni(int n){

        int mat[][] = new int[n][n];


    }

    public static int[] inserisci(int k, int [] a, int i){

        for(i)

    }

    public static double sommatoriaricorsiva(int n){


        if(n==1) return 1.0/(1L<<n);

        return 1.0/(1L<<n) + sommatoriaricorsiva(n-1);


    }

    public static double sommatoriaiterativa(int n){

        double r=0.0;

        for(int i = 1; i<=n; i++) {

            r = r + 1.0/(1L<<i);

        }

        return r;

    }    

    //verificare se un numero è primo
    public static boolean primoIterativo(int x, int i){

        boolean bool=true;

        if(x==0 || x==1) return true;

        if(x%i == 0) return false;

        if(i>2) bool=primoIterativo(x, i-1);

        if(bool == false) return false;

        return true;

    }    

    public static int fattoriale(int n) {
        
        return n==0 ? 1 : n * fattoriale(n-1);

        /*if (n = 0) return 1;
        else return n * fattoriale(n - 1);*/
    }


    public static int fattoriale2(int n){


        if(n==0) return 1;
        else return n * fattoriale(n-1);

    }


    //Riscrivere i metodi ricorsivi fattoriale e fibonacci usando espressioni (e non comandi) condizionali
    public static int fibonacci(int k) {
        return k==0 ? 0 : k==1 ? 1 : fibonacci(k - 1) + fibonacci(k - 2);
       
        /*if (k == 0) 
            return 0;
        else if (k == 1) 
            return 1;
        else 
            return fibonacci(k - 1) + fibonacci(k - 2);*/
    }

    public static void main(String [] args){
        int[] a = new int[10];
        for(int i=0; i<10; i++) a[i] = i+10;
        int[] b = new int[10];
        for(int i=0; i<10; i++) b[i] = i;
        boolean app = le(a, b);
        System.out.println(app);

        

    }


}