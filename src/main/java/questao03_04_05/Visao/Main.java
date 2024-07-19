package questao03_04_05.Visao;

import questao03_04_05.Modelo.Agenda;
import questao03_04_05.Modelo.Contato;

public class Main {

    public static void main(String[] args) {
        Contato b = new Contato();
        b.setTipoDeContato("Telefone");
        b.setNumero("4002-8922");

        Agenda a = new Agenda("Galeno", b ,"Rua Brasil");

        System.out.println(a);
    }
}
