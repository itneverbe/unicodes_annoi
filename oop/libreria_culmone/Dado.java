// Programma che gioca a dadi;
// Prevedere dadi che abbiano un numero di facce custom (min 4)
// Prevedere un metodo lancia dado che restituisce un numero

import java.lang.IllegalArgumentException;
import java.util.Random;

public class Dado {

    // Attributes
    private int numeroFacce; // >= 4 && < 
    private int faccia;

    public Dado(int facce){

        this.faccia = 1;
        if(facce >= 4) this.numeroFacce = facce;
        else throw new IllegalArgumentException("input failed");

    }

    public void tiraDado(){

        Random bo = new Random();  // random object
        this.faccia=bo.nextInt(this.numeroFacce)+1; // nextInt returns a number between 0 and numeroFacce then sum 1

    }

    public int getFaccia(){

        return this.faccia; 

    }

}