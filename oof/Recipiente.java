/*Modificare la classe Recipiente in modo tale da rappresentare un
recipiente che può essere aperto o chiuso. Dotare la classe di metodi apri e
chiudi per cambiare lo stato del recipiente e modificare i metodi aggiungi
e rimuovi in modo che abbiano un effetto solo se il recipiente è aperto. */

public class Recipiente{
    private boolean stato;
    private int contenuto;
    
    public Recipiente(){
        this.stato=false;
    }

    public boolean getStato(){
        return stato;
    }
    public int getContenuto(){
        return contenuto;
    }

    public boolean apri(){
        if(stato==false){
            return stato=true;
        }
    }
    public boolean chiudi(){
        if(stato==true){
            return stato=false;
        }
    }

    public int aggiungi(){
        if(stato==true){
            contenuto++;
            return contenuto;
        }
    }
    public int rimuovi(){
        if(stato==true){
            contenuto--;
            return contenuto;
        }
    }

    public static void main(String[] args){
        Recipiente r = new Recipiente();
        boolean stato=r.apri();
        int contenuto;

        if(stato==true){
            System.out.println("Recipiente aperto");
            contenuto=r.aggiungi();
            System.out.println("Contenuto = "+contenuto);
            contenuto=r.rimuovi();
            System.out.println("Contenuto = "+contenuto);
            stato=r.chiudi();
            System.out.println("Recipiente chiuso");
        }
    }
}