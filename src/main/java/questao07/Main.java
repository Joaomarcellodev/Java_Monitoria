package questao07;

public class Main {

    public static void main(String[] args) {

        Televisao t = new Televisao(3, 2);
        ControleRemoto cr = new ControleRemoto(t);

        System.out.println("Before changes: " + t);
        cr.aumentarCanal();
        cr.aumentarVolume();
        System.out.println("After changes: " + t);

        // Demonstrating consultation methods
        System.out.println("Current Volume: " + cr.consultarVolume());
        System.out.println("Current Channel: " + cr.consultarCanal());

        // Demonstrating channel change
        cr.trocarCanal(5);
        System.out.println("After changing channel: " + t);
    }
}
