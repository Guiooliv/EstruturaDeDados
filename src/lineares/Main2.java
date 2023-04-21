package lineares;

public class Main2 {
    public static void main(String[] args) {
        Fila f1 = new Fila(5);
        f1.enfileirar(1);
        f1.enfileirar(2);
        f1.enfileirar(3);
        f1.enfileirar(4);
        f1.enfileirar(5);


        System.out.print("maior elemento é: " + f1.maior());


        Pilha p1 = new Pilha(3);
        p1.empilhar(1);
        p1.empilhar(2);
        p1.empilhar(3);
        p1.removerTodos();
        p1.printVector();





    }
}