/*  Definire una classe ContoCorrente che supporti le seguenti operazioni:
get_saldo per la lettura del saldo; deposita per effettuare un deposito;
preleva per effettuare un prelievo; get_saldo_massimo per la lettura del
saldo più alto mai raggiunto dal conto corrente nel corso della sua esistenza
 */
public class ContoCorrente{

    // Attributi
    public int saldo;
    public int saldo_massimo;

    // Costruttore
    public ContoCorrente(){

        this.saldo=0;

    }

    // Metodi
    public int get_saldo(){

        return this.saldo;

    }

    public void inc_saldo(int soldi){

        this.saldo += soldi;
        this.set_saldo_massimo(this.saldo);

    }

    public void dec_saldo(int soldi){

        this.saldo -= soldi;

    }

    public int get_saldo_massimo(){

        return this.saldo_massimo;

    }

    public void set_saldo_massimo(int saldo){

        if(saldo>this.saldo_massimo) this.saldo_massimo = saldo;

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