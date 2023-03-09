public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        Lista lista2 = new Lista(3);
        System.out.println("---preenchendo o vetor---");

        lista.adicionar_final(6);
        lista.adicionar_final(5);
        lista.adicionar_final(6);
        lista.adicionar_final(5);
        lista.adicionar_final(6);
        lista.printVector();

        System.out.println("\n--Verificando se o numero é palindromo--");
        lista.palindromo();


        System.out.println("\n---preenchendo outro vetor---");
        lista2.adicionar_final(1);
        lista2.adicionar_final(2);
        lista2.adicionar_final(3);
        lista2.printVector();
        System.out.println("\n--retornando o meio da lista--");
        System.out.println(lista2.meio());
        System.out.println("--invertendo a lista--");
        lista2.inverter();
        lista2.printVector();
        System.out.println("\n--Trocando o ultimo numero para o primeiro--");
        lista2.ultimo_primeiro();
        lista2.printVector();

    }
}
