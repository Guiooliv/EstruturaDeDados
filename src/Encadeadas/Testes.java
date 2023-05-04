package Encadeadas;

public class Testes {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.adicionar_final(new No(1));
        l1.adicionar_final(new No(2));
        l1.adicionar_final(new No(3));
        l1.adicionar_final(new No(4));


        l2.adicionar_final(new No(1));
        l2.adicionar_final(new No(3));
        l2.adicionar_final(new No(99));
        l2.adicionar_final(new No(3));


        System.out.println("retornando a n_posicao: " + l1.n_termo(0));
        System.out.println("retornando a penultima posicao: " + l1.penultimo());
        System.out.print("invertendo a lista: ");
        l1.inverter();
        System.out.println("\nexiste numeros repetidos na 1° lista? " + l1.repetidos());
        System.out.println("existe numeros repetidos na 2° lista? " + l2.repetidos());
        System.out.println("retornando a penultima posicao: " + l2.penultimo());
        System.out.println();
    }
}