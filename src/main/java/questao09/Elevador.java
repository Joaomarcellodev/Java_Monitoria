package questao09;

public class Elevador {

    // Attributes
    private int qntdAndar;
    private int capacElevador;
    private int qntPessoas;
    private int andarAtual;

    // Constructor
    public Elevador() {
        this.qntPessoas = 0;
        this.andarAtual = 0;
    }

    // Methods
    public void inicializar(int capacElevador, int qntdAndar) {
        this.capacElevador = capacElevador;
        this.qntdAndar = qntdAndar;
        this.andarAtual = 0;
        this.qntPessoas = 0;
        System.out.println("O elevador está vazio e no térreo");
    }

    public void entrar() {
        if (qntPessoas >= capacElevador) {
            System.out.println("O elevador está cheio");
        } else {
            qntPessoas++;
            System.out.println("Uma pessoa entrou no elevador");
        }
    }

    public void sair() {
        if (qntPessoas == 0) {
            System.out.println("Ninguém saiu do elevador");
        } else {
            qntPessoas--;
            System.out.println("Uma pessoa saiu do elevador");
        }
    }

    public void subir() {
        if (andarAtual >= qntdAndar) {
            System.out.println("O prédio está em sua altura máxima");
        } else {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        }
    }

    public void descer() {
        if (andarAtual <= 0) {
            System.out.println("O elevador já está no térreo");
        } else {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        }
    }

    // Getters and Setters
    public int getQntdAndar() {
        return qntdAndar;
    }

    public void setQntdAndar(int qntdAndar) {
        this.qntdAndar = qntdAndar;
    }

    public int getCapacElevador() {
        return capacElevador;
    }

    public void setCapacElevador(int capacElevador) {
        this.capacElevador = capacElevador;
    }

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "qntdAndar=" + qntdAndar +
                ", capacElevador=" + capacElevador +
                ", qntPessoas=" + qntPessoas +
                ", andarAtual=" + andarAtual +
                '}';
    }
}
