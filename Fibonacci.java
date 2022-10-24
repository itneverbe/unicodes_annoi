/*Riscrivere i metodi ricorsivi fattoriale e fibonacci usando espressioni (e
non comandi) condizionali */
public class Fibonacci{
    public static int fibonacci(int k) {
            if (k = 0) return 0;
            else if (k = 1) return 1;
            else return fibonacci(k - 1) + fibonacci(k - 2);
        }
        
}