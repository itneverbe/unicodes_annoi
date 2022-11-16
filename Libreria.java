
import java.util.Scanner;
import java.io.*;

public class Libreria{

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

    public static boolean esserePari(int n) {
        
        return n<0 ? false : n == 0 ? true : n == 1 ? false : (n-2)%2 == 0 ? true : false;

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

    /*Definire il metodo void inverti(int[] a) che inverte l’ordine degli elementi in a. Ripetere l’esercizio, 
    questa volta definendo un metodo int[] inverti(int[] a) che non modifica a */
    public static void inverti(int[] a){

        int[] b = new int[a.length];
 
        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 - i] = a[i];
        }
 
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
            System.out.println("a[" + i + "] = " + a[i]);
        }
    } 
    
    /*Crivello di eratostene  
        -parto con il numero 2, che so essere un numero primo
        -setaccio via tutti i numeri divisibili per 2 (restano i numeri dispari)
        -il piu' piccolo dei numeri rimasti e' il prossimo numero primo: 3
        -setaccio via anche tutti i numeri divisibili per 3 (restano i numeri dispari e non divisibili per 3)
        -il piu' piccolo dei numeri rimasti e' il prossimo numero primo: 5
        -setaccio via anche tutti i numeri divisibili per 5 (restano i numeri dispari e non divisibili per 3 ne' per 5)
      e cosi' via.
    */
    /*public static void crivello(int[] c){
        
        int[] app = new int[c.length];
        int num=0;
        
        for(int i=0; i<c.length; i++){
            num=c[i];
            for(int j=0; j<app.length; j++){
                if(c[i]==0){
                    app[j]=c[i];
                }else{
                    if(c[i]%num==1){
                        System.out.println(1);
                        app[j]=c[i];
                        //System.out.println(app[j]);
                    }
                    
                }
                
            }
        }
    }*/

    //crivello di Eratostene
    public static void crivello(int n){

        boolean [] c = new boolean[n];
        int j, i, somma;

        for(i=0; i<n; i++){
            c[i]=true; //riempimento del vettore
        } 

        for(i=2; i<n; i++){
            j=i;
            somma=j;
            while(somma+j<n && c[i]){
                somma+=j;
                c[somma] = false;
            }
        }

        for(i=0; i<n; i++){
            if(c[i]){
                System.out.println(i);
            } 
        }
    }

    //quanti giorni mancano alla fine dell'anno a partire da un giorno di un mese, tenere conto dei mesi da 29, 30, 31
    //SWITCH
    public static void giorniAFineAnno(int giorno, int mese){
        int sommaGiorni=0;
        switch(mese){
            case 1:{
                System.out.println("Gennaio");
                sommaGiorni+=31;
            } 
            case 2:{
                System.out.println("Febbraio");
                sommaGiorni+=29;
            } 
            case 3:{
                System.out.println("Marzo");
                sommaGiorni+=30;
            }
            case 4:{
                System.out.println("Aprile");
                sommaGiorni+=30;
            }
            case 5:{
                System.out.println("Maggio");
                sommaGiorni+=31;
            }
            case 6:{
                System.out.println("Giugno");
                sommaGiorni+=30;
            } 
            case 7: {
                System.out.println("Luglio");
                sommaGiorni+=31;
            }
            case 8: {
                System.out.println("Agosto");
                sommaGiorni+=31;
            }
            case 9: {
                System.out.println("Settembre");
                sommaGiorni+=30;
            }
            case 10: {
                System.out.println("Ottobre");
                sommaGiorni+=31;
            }
            case 11: {
                System.out.println("Novembre");
                sommaGiorni+=30;
            }
            case 12: {
                System.out.println("Dicembre");
                sommaGiorni+=31;
            }
        }
        sommaGiorni-=giorno;
        System.out.println(sommaGiorni);
    }


    public static void main(String [] args){
        giorniAFineAnno(1, 2);
    }


}