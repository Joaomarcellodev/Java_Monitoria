package questao03_04_05.Modelo;

public class Agenda {

    // Atributos
    private String nome;
    private Contato contato;
    private String endereco;

    // Constutor


    public Agenda(String nome, Contato contato, String endereco) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", contato=" + contato +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

