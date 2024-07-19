package questao10;

public class Main {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        c.setNumero1(8);
        c.setNumero2(6);

        c.somar(4,6);
        c.subtrair();
        c.dividir();
        c.mutiplicar();
    }

}
