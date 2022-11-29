
public class Bibliotecario {
    public static void main(String [] args) {
        System.out.println("Sono il bibliotecario");
        Libreria libreriaSala = new Libreria(4,100);
        Libro divinaCommedia = new Libro("La divina commedia","Dante",123,637373);
        libreriaSala.inserisciLibro(divinaCommedia,0,0);
        
    }
}
