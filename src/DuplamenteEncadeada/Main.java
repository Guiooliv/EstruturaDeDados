package DuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        LDE l1 = new LDE();

        l1.inserirUltimo(9);
        l1.inserirUltimo(9);
        l1.inserirUltimo(8);
        l1.inserirUltimo(8);
        l1.imprimir();

        System.out.println("\n--------Inserindo em uma posicao--------");
        l1.inserir_pos(2, 45);
        l1.imprimir();

        System.out.println("\n--------Removendo primeiro e ultimo--------");
        l1.removerUltimo();
        l1.removerPrimeiro();
        l1.imprimir();

        System.out.println("\n--------invertendo a lista--------");
        l1.inverter();
        l1.imprimir();
    }
}
