package Encadeadas;

public class Testes {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        Lista l3 = new Lista();

        l1.adicionar_final(new No(1));
        l1.adicionar_final(new No(2));
        l1.adicionar_final(new No(3));
        l1.adicionar_final(new No(4));


        l2.adicionar_final(new No(1));
        l2.adicionar_final(new No(3));
        l2.adicionar_final(new No(99));
        l2.adicionar_final(new No(3));

        l3.adicionar_final(new No(4));
        l3.adicionar_final(new No(5));
        l3.adicionar_final(new No(5));
        l3.adicionar_final(new No(4));

        System.out.println("retornando a n_posicao: " + l1.n_termo(0));
        System.out.println("retornando o meio da lista: " + l1.retornar_meio());
        System.out.println("retorne a posicao do elemento: " + l1.retornar_posicao(3));
        System.out.println("retornando o elemento da penultima posicao: " + l1.penultimo());
        System.out.println("existe numeros repetidos na 1° lista? " + l1.repetidos());
        System.out.print("invertendo a lista: ");
        l1.inverter();

        System.out.println("\n-------------------------");

        System.out.println("existe numeros repetidos na 2° lista? " + l2.repetidos());
        System.out.println("retornando o meio da lista: " + l2.retornar_meio());
        System.out.println("retornando o elemento da penultima posicao: " + l2.penultimo());
        l2.remover_duplicados();
        System.out.print("Removendo os elementos duplicados da lista: ");
        l2.print_vector();

        System.out.println("\n-------------------------");
        System.out.println("A lista 3 é um palindromo?");
        l3.palindromo();
    }
}