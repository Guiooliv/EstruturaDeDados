package lineares;

public class Pilha {

    int[] vetor_elementos;
    int numero_elementos;

    public Pilha(int t){
        vetor_elementos = new int [t];
        numero_elementos = 0;
    }

    public boolean listaVazia(){
        if(numero_elementos == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean listaCheia(){
        if(numero_elementos >= vetor_elementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void empilhar(int e){
        if(listaCheia()){
            System.out.println("Lista Cheia");
        }else{
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int desempilhar(){
        if(listaVazia()){
            System.out.println("Lista Vazia");
            return -1;
        }else{
            int indice = numero_elementos - 1;
            int elemento_removido = vetor_elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }
    }

    public int getQuantidade(){
        return numero_elementos;
    }


    public int retornarElemento(){
        return vetor_elementos[numero_elementos-1];
    }


    public void printVector(){
        for (int j = numero_elementos - 1; j >= 0; j--) {
            System.out.println(vetor_elementos[j]);
        }
    }

    public void removerTodos(){
        for(int i = getQuantidade() - 1; i >= 0; i--){
            desempilhar();
        }
    }

    public void duplicar_pares(){
        int par = 0;

        Pilha aux = new Pilha(getQuantidade());

        for(int i = getQuantidade(); i > 0; i--){
            aux.empilhar(desempilhar());
        }

        for(int j = aux.getQuantidade(); j > 0 ; j--){
            empilhar(aux.desempilhar());
            if(retornarElemento() % 2 == 0){
                par = retornarElemento();
                empilhar(par);
            }
        }
    }
}

