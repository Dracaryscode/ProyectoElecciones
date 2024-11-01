package TDA;

/**
 *
 * @author USUARIO
 */
public class Pila {
    private Nodo top;

    public Pila() {
        this.top = null;
    }
    
    public void push(int elemento){
        Nodo newNodo = new Nodo(elemento);
        newNodo.setNext(top);
        top = newNodo;
    }
    
    public void pop(){
        if(top != null) {
            System.out.println("Elemento eliminado de la pila: " + top.value());
            top = top.next();
        } else {
            System.out.println("La pila está vacía.");        
        }
    }
    
    public void mostrar_elementos(){
        if(top == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Los elementos de la pila son:");
            Nodo ptr = top;
            while(ptr != null) {
                System.out.print(ptr.value() + "\n");
                ptr = ptr.next();
            }
        }
    }
}
