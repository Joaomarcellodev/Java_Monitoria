package questao01;

public class Cliente {

    // Atributos

    String nome;
    String cpf;
    String telefone;
    String sexo;
    int anoDeNascimento;

    // Construtor

    public Cliente(String nome, String cpf, String telefone, String sexo, int anoDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoDeNascimento = anoDeNascimento;
    }

    // Metodos


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", sexo='" + sexo + '\'' +
                ", anoDeNascimento=" + anoDeNascimento +
                ", Idade=" + calcularIdade() +
                '}';
    }

    public int calcularIdade(){
        return 2024 - anoDeNascimento;
    }

    public void verificarMaioridade(){
        int idade = calcularIdade();

        if (idade >= 18){
            System.out.println("Ele é maior de idade ");
        }else{
            System.out.println("Ele é menor de idade");
        }
    }
}


