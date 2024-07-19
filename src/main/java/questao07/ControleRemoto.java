package questao07;

public class ControleRemoto {
    // Attributes
    private Televisao televisao;

    // Constructor
    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    // Getters and Setters
    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    // Methods
    public void aumentarVolume() {
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void diminuirVolume() {
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void aumentarCanal() {
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void trocarCanal(int novoCanal) {
        televisao.setCanal(novoCanal);
    }

    public int consultarVolume() {
        return televisao.getVolume();
    }

    public int consultarCanal() {
        return televisao.getCanal();
    }

    @Override
    public String toString() {
        return "ControleRemoto{" +
                "televisao=" + televisao +
                '}';
    }

}
