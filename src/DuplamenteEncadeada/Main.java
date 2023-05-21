package DuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();

        l1.inserirUltimo(9);
        l1.inserirUltimo(9);
        l1.inserirUltimo(8);
        l1.inserirUltimo(8);
        l1.imprimir();

        l1.removerUltimo();
        l1.removerPrimeiro();

        System.out.println("\n--------Removendo primeiro e ultimo--------");
        l1.imprimir();




    }
}
