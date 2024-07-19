package questao07;

public class Televisao {

    // Attributes
    private int canal;
    private int volume;

    // Constructor
    public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    // Getters and setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
