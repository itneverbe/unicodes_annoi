public class Giocatore {

    public static void main (String [] args){

        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(4);
        for(int i=1; i<6; i++){

            dado1.tiraDado();
            System.out.println("Lancio "+i+" del dado 1: "+dado1.getFaccia());
            dado2.tiraDado();
            System.out.println("Lancio "+i+" del dado 2: "+dado2.getFaccia());

        }

    }



}