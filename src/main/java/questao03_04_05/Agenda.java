package questao03_04_05;

public class Agenda {

    // Atributes

    private String nome;
    private String contato;
    private String endereco;

    // Constuctor

    public Agenda(String nome,String contato,String endereco){
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }

    // Getters and Stters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
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
                ", contato='" + contato + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
