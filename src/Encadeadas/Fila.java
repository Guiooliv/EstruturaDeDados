package Encadeadas;

public class Fila {
    No inicio_fila;
    int numero_elementos;

    public Fila(){
        inicio_fila = null;
        numero_elementos = 1;
    }

    public boolean fila_vazia(){
        if(inicio_fila == null){
            return true;
        } else {
            return false;
        }
    }

    public void Enfileirar(No e){
        No novo = e;
        if(fila_vazia()){
            inicio_fila = novo;
        } else {
            No auxiliar = inicio_fila;
            while(auxiliar.proximo_no != null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
            numero_elementos += 1;
        }
    }


    public No desenfileirar(){
        No removido = null;
        if(fila_vazia()){
            System.out.println("ESTURURA VAZIA!");
        } else {
            removido = inicio_fila;
            inicio_fila = inicio_fila.proximo_no;
        }
        numero_elementos -= 1;
        return removido;
    }


    public void print_vector(){
        No aux = inicio_fila;
        while(aux != null){
            System.out.print(aux.elemento_armazenado + " ");
            aux = aux.proximo_no;
        }
    }

   public int getQuantidade(){
        return numero_elementos;
   }

   public int retornar_elemento(){
        return  inicio_fila.elemento_armazenado;
   }


}