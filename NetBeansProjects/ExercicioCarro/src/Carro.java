
/**
 *
 * @author 0031432312007
 */

public class Carro {
   private int topo;
    private int tamanho;
    private Object pilhaElem[];
    
    public Carro(int tam){
        topo = -1;
        tamanho = tam;
        pilhaElem = new Object[tam];
    }
    
    public boolean vazia(){
        if (topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cheia(){
        if (topo ==  tamanho -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void empilhar(Object elem){
        if(cheia() == true){
            System.out.println("A pilha está cheia!");
        }
        else{
            topo++;
            pilhaElem[topo]=elem;
        }
    }
    
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia!";
        }
        else{
            valorDesempilhado = pilhaElem[topo];
            topo--;
        }
        return valorDesempilhado;
    }

}