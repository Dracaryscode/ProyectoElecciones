package MiembroMesa;

public class ListaEnlazadaMM {
    private NodoMiembroMesa L; // Nodo cabecera para acceder a los elementos de la lista

    public ListaEnlazadaMM() {
        this.L = null;
    }
    
    private boolean vacia() {
        return L == null;
    }
    
    public void añadirFinal(MiembroMesa miembro) {
        if (vacia()) {
            L = new NodoMiembroMesa(miembro); 
            return;
        }
        NodoMiembroMesa ptr = L; 
        while(ptr.next() != null) {
            ptr = ptr.next();
        }
        NodoMiembroMesa newNodo = new NodoMiembroMesa(miembro); 
        ptr.setNext(newNodo);
    }
    
    public void mostrarElementos() {
        System.out.println("Los elementos de la lista son:");
        NodoMiembroMesa ptr = L;
        while(ptr != null) {
            System.out.println(ptr.getMiembro());             
            ptr = ptr.next();
        }
    }
    
    public void añadirInicio(MiembroMesa miembro) {
        NodoMiembroMesa newNodo = new NodoMiembroMesa(miembro);
        newNodo.setNext(L);
        L = newNodo;
    }
    
    public void eliminar(MiembroMesa miembro) {
        if (vacia()) {
            return;
        }

        if (L.getMiembro().equals(miembro)) { // Si el primer nodo contiene el miembro que buscamos
            L = L.next();
            return;
        }

        NodoMiembroMesa ptr = L;
        while (ptr.next() != null && !ptr.next().getMiembro().equals(miembro)) {
            ptr = ptr.next();
        }

        if (ptr.next() == null) { // Si llegamos al final y no se encontró
            return;
        }

        // Si encontramos el nodo, lo saltamos
        ptr.setNext(ptr.next().next());
    }
}
