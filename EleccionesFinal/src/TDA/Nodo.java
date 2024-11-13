package TDA;
// Parte hecha entre todos los miembros del equipo

/**
 *
 * @author USUARIO
 */
public class Nodo {
    int valor;
    Nodo next;

    public Nodo(int dato) {
        this.valor = dato;
        this.next = null;
    }

    public int value(){
        return valor;
    }
    
    public Nodo next(){
        return next;
    }
    
    public void setNext(Nodo node){
        this.next = node;
    }
}
