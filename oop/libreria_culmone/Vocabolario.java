// Import
import java.util.Vector;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Vocabolario {

    private Vector<String> vocabolario = new Vector<String>();

    public Vocabolario(String file){
        try {
            File in = new File (file);
            Scanner testo = new Scanner(in);
            while(testo.hasNextLine()) {
                try {
                    vocabolario.add(testo.nextLine());
                }
                catch (NoSuchElementException E1){ // Catch exception if no next line was found
                
                    System.err.println("Riga vuota");
                }

            }
        }
        catch (IOException E2) {
            System.err.println("File inesistente");
        }

    }


    public boolean cerca (String parola){
        
        Iterator righe = vocabolario.iterator();
        while(righe.hasNext()) {

            if(parola.equals((String) righe.next())) return true;

        } 
        return false;

    }

    public int getSize () {

        return vocabolario.size();

    }

    public static void main (String [] args){

        Vocabolario prova = new Vocabolario("testo");
        System.out.println("Numero parole nel vocabolario: "+prova.getSize());
        System.out.println(prova.cerca("iop"));

    }


}