package questao06;

public class Main {

    public static void main(String[] args) {

        Filme lancamento = new Filme("Ely e os 4 pilares de POO","lancamento");
        Filme promocao = new Filme("Galeno e JS : Um amor sem lógica","promocao");
        Filme infantil = new Filme("A corrida do jhon nas linhas html","infantil");
        Filme normal = new Filme("Programe.io: Caca aos devs","normal");

        System.out.println(lancamento);
        System.out.println(promocao);
        System.out.println(infantil);
        System.out.println(normal);
    }
}
