public class Main2 {
    public static void main(String[] args) {
        Fila f1 = new Fila(5);
        f1.enfileirar(1);
        f1.enfileirar(2);
        f1.enfileirar(3);
        f1.enfileirar(4);
        f1.enfileirar(5);


        System.out.print("maior elemento é: " + f1.maior());
    }
}