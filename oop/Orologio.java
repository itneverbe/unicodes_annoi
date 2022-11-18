/* Definire una classe Orologio che consenta di tenere traccia di ora e minuti.
Dotare la classe di metodi getter get_ora e get_minuti per leggere ora e
minuti correnti. Dotare la classe di un metodo tick che ha come effetto il
passaggio da un minuto al successivo.
 */
public class Orologio{

    // Attributi
    private int ora;
    private int minuti;

    // Costruttore
    public Orologio(){

        this.ora=1;

    }


    // Metodi
    public int get_ora(){

        return this.ora;

    }

    public int get_minuti(){

        return this.minuti;

    }

    public int tick(){

        return this.minuti++;

    }

    public static void main(String [] args) {

        Orologio vecchio = new Orologio();
        System.out.println(vecchio.get_ora());


    }
        
}