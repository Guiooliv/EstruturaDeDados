package Encadeadas;

public class Testes {
    public static void main(String[] args) {
        ListaEncade l1 = new ListaEncade();
        ListaEncade l2 = new ListaEncade();
        ListaEncade l3 = new ListaEncade();
        ListaEncade l4 = new ListaEncade();

        l1.adicionar_final(new No(1));
        l1.adicionar_final(new No(2));
        l1.adicionar_final(new No(3));
        l1.adicionar_final(new No(4));

        l2.adicionar_final(new No(1));
        l2.adicionar_final(new No(3));
        l2.adicionar_final(new No(99));
        l2.adicionar_final(new No(3));

        l3.adicionar_final(new No(9));
        l3.adicionar_final(new No(9));
        l3.adicionar_final(new No(8));
        l3.adicionar_final(new No(8));
        l3.adicionar_final(new No(8));
        l3.adicionar_final(new No(7));
        l3.adicionar_final(new No(7));

        l4.adicionar_final(new No(7));
        l4.adicionar_final(new No(8));
        l4.adicionar_final(new No(3));
        l4.adicionar_final(new No(8));
        l4.adicionar_final(new No(7));

        System.out.println("retornando a n_posicao: " + l1.n_termo(0));
        System.out.println("retornando o meio da lista: " + l1.retornar_meio());
        System.out.println("retorne a posicao do elemento: " + l1.retornar_posicao(3));
        System.out.println("retornando o elemento da penultima posicao: " + l1.penultimo());
        System.out.println("existe numeros repetidos na 1° lista? " + l1.verificar_repetidos());
        System.out.print("invertendo a lista: ");
        l1.inverter();

        System.out.println("\n-------------------------");

        System.out.println("existe numeros repetidos na 2° lista? " + l2.verificar_repetidos());
        System.out.println("retornando o meio da lista: " + l2.retornar_meio());
        System.out.println("retornando o elemento da penultima posicao: " + l2.penultimo());
        l2.remover_repetidos();
        System.out.print("Removendo os elementos duplicados da lista: ");
        l2.print_vector();

        System.out.println("\n-------------------------");
        System.out.print("Qual o elementos mais repetido da l3: " + l3.mais_repetidos());

        System.out.println("\n-------------------------");
        System.out.print("A lista l4 é palindromo? " + l4.palindromo());


    }
}