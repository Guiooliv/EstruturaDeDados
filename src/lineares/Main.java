package lineares;

public class Main {
    public static void main(String[] args) {

     Pilha p1 = new Pilha(10);
     p1.empilhar(1);
     p1.empilhar(2);
     p1.empilhar(3);
     p1.empilhar(4);
     p1.empilhar(5);

     p1.duplicar_pares();
     p1.printVector();

    }
}