public class Rational {


    // Att
    private int num; // numeratore intero
    private int denom; // denominatore intero

    public Rational() {

        this.num = 0;
        this.denom = 1;

    }
    public Rational(int numeratore) {

        this.num = numeratore;
        this.denom = 1;

    }
    public Rational(int numeratore, int denominatore) {

        // se inserisce un denom negativo copre tutte le casistiche
        if(denominatore<0) {

            numeratore = -numeratore;
            denominatore = -denominatore;

        }
        this.num = numeratore;
        this.denom = denominatore;

    }

    public int get_num() { return num; }
    public int get_denominator() { return denom; }

    public double to_double() {
        return (double) num / denom;
    }

    public String toString() {
        if (denom == 1)
        return Integer.toString(num);
        else
        return num + "/" + denom;
    }
    public Rational negate() {
        return new Rational(-num, denom);
    }
    public Rational reciprocal() {
        return new Rational(denom, num);
    }
    public Rational add(Rational x) {
        return new Rational(num * x.denom +
        denom * x.num,
        denom * x.denom);
    }
    public Rational mul(Rational x) {
        return new Rational(num * x.num,
        denom * x.denom);
    }
    public Rational sub(Rational x) {
        return this.add(x.negate());
    }
    public Rational div(Rational x) {
        return this.mul(x.reciprocal());
    }

    public int compare(Rational y) {

        if(this.to_double() > y.to_double()) return 1;
        else if(this.to_double() == y.to_double()) return 0;
        else return -1;

    }

    public static void main(String [] args) {




    }    
}
