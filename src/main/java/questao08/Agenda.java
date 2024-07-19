package questao08;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<>(10);
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (pessoas.size() < 10) {
            pessoas.add(new Pessoa(nome, idade, altura));
        } else {
            System.out.println("Agenda cheia. Não é possível armazenar mais pessoas.");
        }
    }

    public void removePessoa(String nome) {
        Pessoa pessoaRemover = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoaRemover = pessoa;
                break;
            }
        }
        if (pessoaRemover != null) {
            pessoas.remove(pessoaRemover);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < pessoas.size()) {
            System.out.println(pessoas.get(index));
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
