package Encadeadas;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.adicionar_final(new No(1));
        l1.adicionar_final(new No(2));
        l1.adicionar_final(new No(3));
        l1.adicionar_final(new No(4));
        l1.print_vector();

        System.out.println();
        l1.adicionar_inicio(new No(999999));
        l1.print_vector();

        System.out.println();
        l1.remover_final();
        l1.print_vector();

        System.out.println();
        l1.remover_inicio();
        l1.print_vector();

        System.out.println();
        l1.remover_posicao(2);
        l1.print_vector();

        System.out.println();
        l1.adicionar_posicao(new No(13), 2);
        l1.print_vector();
    }
}
