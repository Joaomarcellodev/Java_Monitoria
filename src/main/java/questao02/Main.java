package questao02;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto("Programe.io",2000,11);


        System.out.println(p);
        p.calcularPreco();
        p.calcularDesconto();
    }
}
