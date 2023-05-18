package Encadeadas;

public class Lista {
    No inicio_lista;
    int numero_elementos;

    public Lista(){
        inicio_lista = null;
        numero_elementos = 1;
    }

    public boolean lista_vazia(){
        if(inicio_lista == null){
            return true;
        } else {
            return false;
        }
    }

    public void adicionar_inicio(No e){
        No novo = e;
        if(!lista_vazia()){
            novo.proximo_no = inicio_lista;
        }
            inicio_lista = novo;
            numero_elementos += 1;
    }

    public void adicionar_final(No e){
        No novo = e;
        if(lista_vazia()){
            inicio_lista = novo;
        } else {
            No auxiliar = inicio_lista;
            while(auxiliar.proximo_no != null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
            numero_elementos += 1;
        }
    }

    public No remover_inicio(){
        No removido = null;
        if(lista_vazia()){
            System.out.println("ESTURURA VAZIA!");
        } else {
            removido = inicio_lista;
            inicio_lista = inicio_lista.proximo_no;
        }
        numero_elementos -= 1;
        return removido;
    }

    public No remover_final(){
        No removido = null;
        if(lista_vazia()){
            System.out.println("estrutura vazia");
        }else {
            No auxiliar = inicio_lista;
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

    public void adicionar_posicao(No e, int i){
        if(lista_vazia() || i <= 1){
            adicionar_inicio(e);
        } else {
            No novo = e;
            No auxiliar = inicio_lista;
            int indice = 0;

            while(indice < i && auxiliar != null){
                auxiliar = auxiliar.proximo_no;
                indice = indice + 1;
            }
            if(auxiliar == null){
                adicionar_final(e);
            } else {
                novo.proximo_no = auxiliar.proximo_no;
                auxiliar.proximo_no = novo;
                numero_elementos += 1;
            }
        }
    }

    public No remover_posicao(int i){
        No removido = null;
        if(lista_vazia() || i <= 1){
            removido = remover_inicio();
        } else {
            No auxiliar = inicio_lista;
            removido = auxiliar;
            int indice = 0;

            while (indice < i && removido != null){
                auxiliar = removido;
                removido = removido.proximo_no;
                indice = indice + 1;
            }
            if(removido == null){
                removido = remover_final();
            }
            else {
                auxiliar.proximo_no = removido.proximo_no;
            }
        }
        numero_elementos -= 1;
        return removido;
    }

    public void print_vector(){
        No aux = inicio_lista;
        while(aux != null){
            System.out.print(aux.elemento_armazenado + " ");
            aux = aux.proximo_no;
        }
    }

    public int getQuantidade(){
        return numero_elementos;
    }

    public void inverter(){
        for(int i = 0; i < getQuantidade(); i++){
            No aux = remover_final();
            System.out.print(aux.elemento_armazenado + " ");
            adicionar_inicio(aux);
        }
    }

    public int penultimo(){
        No aux = inicio_lista;
        int num = 0;
        for(int i = 0; i < getQuantidade(); i++){
            if(i == getQuantidade() - 2) {
                num = aux.elemento_armazenado;
            }
            aux = aux.proximo_no;
        }
        return num;
    }

    public int retornar_posicao(int n){
        No aux = inicio_lista;
        int p = 0;
        for(int i = 0; i < getQuantidade(); i++){
            if(n == aux.elemento_armazenado){
                p = i;
            }
            aux = aux.proximo_no;
        }
        return p;
    }

    public int retornar_meio(){
        return n_termo(getQuantidade()/2);
    }

    public int n_termo(int n){ // igual ao retornar elemento
        No aux = inicio_lista;
        int num = 0;
        for(int i = 0; i <= n; i++){
            if(i == n) {
                num = aux.elemento_armazenado;
            }
            aux = aux.proximo_no;
        }
        return num;
    }

    public void remover_duplicados(){
        No aux = inicio_lista;
        for(int i = 0; i < getQuantidade(); i++){
            for(int j = i + 1; j < getQuantidade(); j++){
                if(n_termo(i) == n_termo(j)){
                    remover_posicao(j);
                }
            }
        }
    }
    
    public boolean repetidos(){
        for(int i = 0; i < getQuantidade(); i++){
            for(int j = i + 1; j < getQuantidade(); j++){
                if(n_termo(i) == n_termo(j)){
                    return true;
                }
            }
        }
        return false;
    }
}