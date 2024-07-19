package questao06;

public class Filme {

    // Atributes
    private String titulo;
    private String categoria;
    private double valorBaseLocacao = 4.00;

    // Constructor

    public Filme(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }


    // Methods

    public double calcularValorLocacao(){
        switch (categoria.toLowerCase()) {
            case "infantil":
                return valorBaseLocacao + 2.00;
            case "lancamento":
                return valorBaseLocacao + 3.00;
            case "promocao":
                return valorBaseLocacao - 2.00;
            default:
                return valorBaseLocacao;
        }
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valorBaseLocacao=" + calcularValorLocacao() +
                '}';
    }
}
