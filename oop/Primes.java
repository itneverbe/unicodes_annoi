/*  Definire una classe ContoCorrente che supporti le seguenti operazioni:
get_saldo per la lettura del saldo; deposita per effettuare un deposito;
preleva per effettuare un prelievo; get_saldo_massimo per la lettura del
saldo più alto mai raggiunto dal conto corrente nel corso della sua esistenza
 */
public class Primes{

    // Attributi
    public int indice;

    // Costruttore
    public Primes(){

        this.indice=0;

    }

    // Metodi
    public int next(){

        return this.saldo;

    }

    public static void main(String [] args) {

        ContoCorrente mio = new ContoCorrente();
        mio.inc_saldo(100);
        System.out.println(mio.get_saldo());
        mio.dec_saldo(50);
        System.out.println(mio.get_saldo());
        System.out.println(mio.get_saldo_massimo());


    }
        
}