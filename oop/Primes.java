/*  Definire una classe ContoCorrente che supporti le seguenti operazioni:
get_saldo per la lettura del saldo; deposita per effettuare un deposito;
preleva per effettuare un prelievo; get_saldo_massimo per la lettura del
saldo più alto mai raggiunto dal conto corrente nel corso della sua esistenza
 */
public class Primes{

    // Attributi
    private int indice;

    // Costruttore
    public Primes(){

        this.indice=2;

    }

    public int get_indice(){

        return this.indice;

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

    // Metodi
    public int next(){


        Boolean ris=false;
        while(ris!=true){
            ris = primo(this.indice);
            if (ris==true){
                return this.indice++;
            }
            else this.indice++;
        }
        return -1; // if something goes wrong... 

    }

    public static void main(String [] args) {

        Primes p = new Primes();
        for (int i = 0; i < 10; i++)
        System.out.println(p.next());
        

    }
        
}