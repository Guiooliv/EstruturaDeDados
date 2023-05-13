package Encadeadas;

public class TestesFilha_Pilha {
    public static void main(String[] args) {
        Fila f1 = new Fila();
        f1.Enfileirar(new No(5));
        f1.Enfileirar(new No(2));
        f1.Enfileirar(new No(3));
        f1.Enfileirar(new No(4));
        f1.print_vector();

        System.out.println("qdd: " + f1.getQuantidade());
        System.out.println("retornar elemento: " + f1.retornar_elemento());

        f1.desenfileirar();
        System.out.println();
        f1.print_vector();
        System.out.println("qdd: " + f1.getQuantidade());
        System.out.println("retornar elemento: " + f1.retornar_elemento());
        System.out.println("\n-----------------");

        Pilha p1 = new Pilha();
        p1.empilhar(new No(1));
        p1.empilhar(new No(2));
        p1.empilhar(new No(3));
        p1.empilhar(new No(4));
        p1.print_vector();
        System.out.println("qdd: " + p1.getQuantidade());
        System.out.println("retornar elemento: "  + p1.retornar_elemento());

        p1.desempilhar();
        System.out.println();
        p1.print_vector();
        System.out.println("qdd: " + p1.getQuantidade());
        System.out.println("retornar elemento: " + p1.retornar_elemento());
    }
}
