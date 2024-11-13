package TDA;

public class ListaEnlazadaMiembro<T> {
    public NodoMiembro<T> L; // nodo cabecera para acceder a los elementos de la lista

    public ListaEnlazadaMiembro() {
        this.L = null;
    }
    
    private boolean vacia() {
        return L == null;
    }
    
    public void AñadirFinal(T valor) {
        if (vacia()) {
            L = new NodoMiembro<>(valor); 
            return;
        }
        NodoMiembro<T> ptr = L; 
        while(ptr.next() != null) {
            ptr = ptr.next();
        }
        NodoMiembro<T> newNodo = new NodoMiembro<>(valor); 
        ptr.setNext(newNodo);
    }
    
    public void mostrar_elementos() {
        System.out.println("Los elementos de la lista son:");
        NodoMiembro<T> ptr = L;
        while(ptr != null) {
            System.out.println(ptr.value());             
            ptr = ptr.next();
        }
    }
    
    public void AñadirInicio(T valor) {
        if (vacia()) {
            L = new NodoMiembro<>(valor); 
            return;
        }
        NodoMiembro<T> newNodo = new NodoMiembro<>(valor);
        newNodo.setNext(L);
        L = newNodo; 
    }
}
