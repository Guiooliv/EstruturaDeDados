package DuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    private DNode inicio;
    private DNode fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        inicio = fim = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void inserir_pos(int pos, int v) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("POSICAO INVALIDA!!!!");
            return;
        }
        if (pos == 0) {
            inserirPrimeiro(v);
        } else if (pos == tamanho) {
            inserirUltimo(v);
        } else {
            DNode aux = inicio;
            for (int cont = 0; cont < pos - 1; cont++) {
                aux = aux.next;
            }
            DNode novoNo = new DNode(v, aux, aux.next);
            aux.next.prev = novoNo;
            aux.next = novoNo;
            tamanho++;
        }

    }

    public int removerPrimeiro() {
        if (!isEmpty()) {
            int retorno = inicio.element;
            inicio = inicio.next;
            tamanho--;
            if (isEmpty()) {
                fim = null;
            } else {
                inicio.prev = null;
            }
            return retorno;
        } else {
            return -1;
        }
    }


    public void inserirPrimeiro(int v) {
        DNode novoNo = new DNode(v, null, inicio);
        if (inicio != null) {
            inicio.prev = novoNo;
        } else {
            fim = novoNo;
        }
        inicio = novoNo;
        tamanho++;
    }

    // remover ultimo
    public int removerUltimo() {
        if (!isEmpty()) {
            int retorno = fim.element;
            fim = fim.prev;
            tamanho--;
            if (isEmpty()) {
                inicio = null;
            } else {
                fim.next = null;
            }
            return retorno;
        } else {
            return -1;
        }
    }

    // inserir ultimo
    public void inserirUltimo(int v) {
        DNode novoNo = new DNode(v, fim, null);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.next = novoNo;
        }
        fim = novoNo;
        tamanho++;
    }

    public void imprimir() {
        DNode aux = inicio;
        while (aux != null) {
            System.out.print(aux.element + " ");
            aux = aux.next;
        }
    }

}






