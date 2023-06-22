package lineares;

public class Teste3 {
    public static void main(String[] args) {
        ListaLinear l1 = new ListaLinear(10);
        ListaLinear l2 = new ListaLinear(10);


        l1.adicionar_final(4);
        l1.adicionar_final(2);
        l1.adicionar_final(2);
        l1.adicionar_final(4);
        l1.adicionar_final(4);
        l1.adicionar_final(5);
        l1.adicionar_final(10);

        l1.copia_semRepetido(l2);
        l2.printVector();

    }
}
