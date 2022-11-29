public class Libreria {
    private Libro [][] libreria;
    Libreria(int scaffali, int posizioni) {
        libreria = new Libro[scaffali][posizioni];
    }    
    public boolean inserisciLibro(Libro libro, int scaffale, int posizione) {
       if (scaffale < 0 || scaffale > libreria.length) return false;
       if (posizione < 0 || posizione > libreria[0].length) return false;
       if (libreria[scaffale][posizione] != null) return false;
       if (libro == null) return false;
       libreria[scaffale][posizione] = libro;
       return true;
    }
}
