package questao08;

public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Alice", 25, 1.65f);
        agenda.armazenaPessoa("Bob", 30, 1.75f);
        agenda.armazenaPessoa("Charlie", 35, 1.80f);

        System.out.println("Agenda completa:");
        agenda.imprimeAgenda();

        System.out.println("\nBusca por 'Bob':");
        int index = agenda.buscaPessoa("Bob");
        if (index != -1) {
            agenda.imprimePessoa(index);
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        System.out.println("\nRemovendo 'Alice' da agenda:");
        agenda.removePessoa("Alice");
        agenda.imprimeAgenda();
    }
}
