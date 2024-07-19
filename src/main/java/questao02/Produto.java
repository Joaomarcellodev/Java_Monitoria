package questao02;

public class Produto {

    // Atributos
    String nome;
    double preco;
    int quantidade;

    // Construtor


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        return preco * quantidade;
    }

    public void calcularDesconto() {
        double precoSemDesconto = calcularPreco();

        if (quantidade == 10) {
            System.out.println(precoSemDesconto);
        } else if (quantidade > 10 && quantidade <= 20) {
            System.out.println(precoSemDesconto - calcularPreco() * 0.10);
        } else if (quantidade > 21 && quantidade <= 50) {
            System.out.println(precoSemDesconto - calcularPreco() * 0.20);
        } else if (quantidade > 50) {
            System.out.println(precoSemDesconto - calcularPreco() * 0.25);
        }
    }
}