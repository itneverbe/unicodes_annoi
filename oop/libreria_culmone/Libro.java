public class Libro {
   private String titolo, autore;
   private int pagine;
   private long isbn;
   private double valore;
   Libro(String titolo, String autore, int pagine, long isbn ){
       this.titolo = titolo; this.autore = autore; 
       this.pagine = pagine; this.isbn = isbn;
   }
   public String getTitolo() { return titolo; }
   public void impostaValore(double coefficente) { valore = pagine * coefficente; }
   public double getValore() { return valore; }
}
