package questao03_04_05.Modelo;

public class Contato {

    // Atributes

    String tipoDeContato;
    String numero;



    // Getters and Setters


    public String getTipoDeContato() {
        return tipoDeContato;
    }

    public void setTipoDeContato(String tipoDeContato) {
        this.tipoDeContato = tipoDeContato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Contato{" +
                "tipoDeContato='" + tipoDeContato + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
