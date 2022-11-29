/* Definire una classe Orologio che consenta di tenere traccia di ora e minuti.
Dotare la classe di metodi getter get_ora e get_minuti per leggere ora e
minuti correnti. Dotare la classe di un metodo tick che ha come effetto il
passaggio da un minuto al successivo.*/
import java.time.LocalTime;
public class Orologio{
    private int ora;
    private int minuti;

    public Orologio(){
        LocalTime time = LocalTime.now();
        this.ora=time.getHour();
        this.minuti=time.getMinute();
    }

    public int getOra(){
        return ora;
    }
    public int getMinuti(){
        return minuti;
    }

    public int tick(){
        return minuti++;
    } 
        
    public static void main(String[] args){
        Orologio o = new Orologio();
        int ora, minuti;
        ora=o.getOra();
        minuti=o.tick();
        System.out.println("ora corrente + un minuto: "+ora+":"+minuti);
    }
}