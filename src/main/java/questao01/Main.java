package questao01;

public class Main {

    public static void main(String[] args) {

        Cliente c = new Cliente("Galeno","000.000.000-00","(86) 4002-8922","Programador",1990);

        System.out.println(c);
        c.verificarMaioridade();
    }
}
