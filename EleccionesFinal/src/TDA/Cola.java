package TDA;

/**
 *
 * @author USUARIO
 */
public class Cola {
    private Nodo front; // Nodo frontal de la cola
    private Nodo rear; // Nodo final de la cola
    
    public Cola() {
        front = null; //es como si fuera el L, es decir la cabeza
        rear = null;
    }
    
    public void insertar(int elemento){
        Nodo nodo = new Nodo(elemento);     
        if(rear == null) {
            front = nodo; 
            rear = nodo;
        } else {
            rear.setNext(nodo);
            rear = nodo;
        }  
    }
    
    public void mostrar_elementos() {
        System.out.println("Los elementos de la cola son:");
        Nodo ptr = front;
        
        if (front == null) {
            System.out.println("La cola está vacía");
        }        
        while(ptr != null) {
            System.out.print(ptr.value() + "->");
            ptr = ptr.next(); //avanzando
        }  
    }
}
