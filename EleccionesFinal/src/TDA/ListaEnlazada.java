package TDA;

/**
 *
 * @author USUARIO
 */
public class ListaEnlazada {
    private Nodo L; //nodo cabecera para acceder a los elementos de la lista

    public ListaEnlazada() {
        this.L = null;
    }
    
    private boolean vacia(){
        return L == null;
    }
    
    public void AñadirFinal(int valor){
        if (vacia()) {
            L = new Nodo(valor); 
            return;
        }
        Nodo ptr = L; 
        while(ptr.next() != null) {
            ptr = ptr.next();
        }
        Nodo newNodo = new Nodo(valor); 
        ptr.setNext(newNodo);
        newNodo.setNext(null);
    }
    
    public void mostrar_elementos(){
        System.out.println("Los elementos de la lista son:");
        Nodo ptr = L;
        while(ptr != null) {
            System.out.println(ptr.value());             
            ptr = ptr.next();
        }
    }
    
    public void AñadirInicio(int valor){
        if (vacia()) {
            L = new Nodo(valor); 
            return;
        }
        Nodo newNodo = new Nodo(valor);
        newNodo.setNext(L);
        L = newNodo; 
    }
    
    public void eliminar(int valor){
        if (vacia()) {
            return;
        }

        if (L.value() == valor) { // Si el primer nodo es el que buscamos
            L = L.next();
            return;
        }

        Nodo ptr = L;
        while (ptr.next() != null && ptr.next().value() != valor) {
            ptr = ptr.next();
        }

        if (ptr.next() == null) { // Si llegamos al final y no se encontró
            return;
        }

        // Si encontramos el nodo, lo saltamos
        ptr.setNext(ptr.next().next());
       
        
    }
}
