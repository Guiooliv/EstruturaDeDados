package lineares;

public class Lista {
    int[] vetor_elementos;
    int numero_elementos;

    public Lista(int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;
    }

    public boolean lista_vazia() {
        if (numero_elementos == 0) {
            return true;
        } else return false;
    }

    public boolean lista_cheia() {
        if (numero_elementos >= vetor_elementos.length) {
            return true;
        } else return false;
    }

    public void adicionar_final(int e) {
        if (lista_cheia()) {
            System.out.println("full structure!");
        } else {
            int index = numero_elementos;
            vetor_elementos[index] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int remover_final() {
        if (lista_vazia()) {
            System.out.println("empty structure!");
            return -1;
        } else {
            int index = numero_elementos - 1;
            int element_removed = vetor_elementos[index];
            numero_elementos = index;
            return element_removed;
        }
    }

    public void adicionar_inicio(int e) {
        if (lista_cheia()) {
            System.out.println("Full structure!");
        } else {
            for (int index = numero_elementos; index > 0; index--) {
                vetor_elementos[index] = vetor_elementos[index - 1];
            }
            vetor_elementos[0] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int remover_inicio() {
        if (lista_vazia()) {
            System.out.println("Empty structure!");
            return -1;
        } else {
            int element_removed = vetor_elementos[0];
            for (int index = 1; index <= numero_elementos - 1; index++) {
                vetor_elementos[index - 1] = vetor_elementos[index];
            }
            numero_elementos = numero_elementos - 1;
            return element_removed;
        }
    }

    public void adicionar_posicao(int e, int i) {
        if (lista_cheia()) {
            System.out.println("Full structure!");
        } else {
            if (i <= 0) {
                adicionar_inicio(e);
            } else if (i >= numero_elementos) {
                adicionar_final(e);
            } else {
                for (int index = numero_elementos; index > i; index--) {
                    vetor_elementos[index] = vetor_elementos[index - 1];
                }
                vetor_elementos[i] = e;
                numero_elementos = numero_elementos + 1;
            }
        }
    }

    public int remover_posicao(int i) {
        if (lista_vazia()) {
            System.out.println("empty Structure!");
            return -1;
        } else {
            if (i <= 0) {
                return remover_inicio();
            } else if (i >= numero_elementos) {
                return remover_final();
            } else {
                int element_removed = vetor_elementos[i];
                for (int index = i; index <= numero_elementos - 1; index++) {
                    vetor_elementos[index - 1] = vetor_elementos[index];
                }
                numero_elementos = numero_elementos - 1;
                return element_removed;
            }
        }
    }

    public int getQuantidade() {
        return numero_elementos;
    }


    public int retornarElemento(int posicao) {
        return vetor_elementos[posicao];
    }

    public void printVector() {
        for (int j = 0; j < numero_elementos; j++) {
            System.out.print(vetor_elementos[j] + " ");
        }
    }

    public int soma(){
        int soma = retornarElemento(0) + retornarElemento(1);
        return soma;
    }


    public int meio(){
       return retornarElemento(getQuantidade()/2);
    }

    public void ultimo_primeiro(){
        int aux = remover_final();
        adicionar_final(remover_inicio());
        adicionar_inicio(aux);
    }

    public void inverter() {
        Lista aux = new Lista(getQuantidade());

        for (int i = 0; i < getQuantidade(); i++) {
            aux.adicionar_inicio(retornarElemento(i));
        }

        for(int i = 0; i < getQuantidade(); i++){
           remover_inicio();
           adicionar_final(aux.retornarElemento(i));
        }
    }

    public void palindromo() {
        Lista aux = new Lista(getQuantidade());
        int cont = 0;
        for (int i = 0; i < getQuantidade(); i++) {
            aux.adicionar_inicio(retornarElemento(i));
        }

        for (int i = 0; i < getQuantidade(); i++) {
            if (aux.retornarElemento(i) == retornarElemento(i)) {
                cont++;
            }
        }

        if (cont == getQuantidade()) {
            System.out.println("é palindromo");
        } else {
            System.out.println("nao é palindromo");
        }
    }

    public void iguais() {
        for (int i = 0; i < getQuantidade(); i++) {
            for (int j = i + 1; j < getQuantidade(); j++) {
                if (retornarElemento(j) == retornarElemento(i)) {
                    remover_posicao(j);
                }
            }
        }
    }
}
