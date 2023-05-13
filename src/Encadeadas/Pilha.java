package Encadeadas;

public class Pilha {

    No inicio_pilha;
    int numero_elementos;

    public Pilha(){
        inicio_pilha = null;
        numero_elementos = 1;
    }

    public boolean pilha_vazia(){
        if(inicio_pilha == null){
            return true;
        } else {
            return false;
        }
    }

    public void empilhar(No e){
        No novo = e;
        if(pilha_vazia()){
            inicio_pilha = novo;
        } else {
            No auxiliar = inicio_pilha;
            while(auxiliar.proximo_no != null){
                auxiliar = auxiliar.proximo_no;
            }
            numero_elementos += 1;
            auxiliar.proximo_no = novo;
        }
    }

    public No desempilhar(){
        No removido = null;
        if(pilha_vazia()){
            System.out.println("estrutura vazia");
        }else {
            No auxiliar = inicio_pilha;
            removido = auxiliar;
            while(removido.proximo_no != null){
                auxiliar = removido;
                removido = removido.proximo_no;
            }
            auxiliar.proximo_no = null;
        }
        numero_elementos -= 1;
        return removido;
    }

    public void print_vector(){
        No aux = inicio_pilha;
        while(aux != null){
            System.out.print(aux.elemento_armazenado + " ");
            aux = aux.proximo_no;
        }
    }

    public int getQuantidade(){
        return numero_elementos;
    }

   public int retornar_elemento(){
        int elemento = 0;
        No aux = inicio_pilha;
       for(int i = 0; i < getQuantidade(); i++){
           if(i == getQuantidade() - 1){
               elemento = aux.elemento_armazenado;
           }
           aux = aux.proximo_no;
       }
       return  elemento;
   }

}
