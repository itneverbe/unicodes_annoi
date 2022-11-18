/* Modificare la classe Recipiente in modo tale da rappresentare un
recipiente che può essere aperto o chiuso. Dotare la classe di metodi apri e
chiudi per cambiare lo stato del recipiente e modificare i metodi aggiungi
e rimuovi in modo che abbiano un effetto solo se il recipiente è aperto
 */
public class Recipiente{

    // Attributi
    private boolean stato;
    public int oggetti;

    // Costruttore
    public Recipiente(){

        this.stato=false;

    }

    // Metodi
    public boolean get_stato(){

        return this.stato;

    }

    public int get_oggetti(){

        return this.oggetti;

    }

    public void apri(){

        this.stato=true;

    }

    public void chiudi(){

        this.stato=false;

    }

    public void inserisci(){

        if(this.get_stato()==true) this.oggetti++;

    }

    public void rimuovi(){

        if(this.get_stato()==true) this.oggetti--;

    }

    public static void main(String [] args) {

        Recipiente bidone = new Recipiente();
        bidone.inserisci();
        System.out.println(bidone.get_oggetti());
        bidone.apri();
        bidone.inserisci();
        System.out.println(bidone.get_oggetti());


    }
        
}