package questao09;

public class Main {

    public static void main(String[] args) {

            Elevador a = new Elevador();

            a.inicializar(2, 3);
            a.subir();
            a.subir();
            a.subir();
            a.subir();
            System.out.println(a);

            a.entrar();
            a.entrar();
            a.entrar();
            System.out.println(a);

            a.sair();
            a.sair();
            a.sair();
            System.out.println(a);

            a.descer();
            a.descer();
            a.descer();
            a.descer();
            System.out.println(a);
        }

    }

