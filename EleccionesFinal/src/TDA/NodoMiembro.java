package TDA;
// Parte hecha entre todos los miembros del equipo

/**
 *
 * @author USUARIO
 */
public class NodoMiembro<T> {
    private T valor; // Usamos T para permitir cualquier tipo
    private NodoMiembro<T> next;

    public NodoMiembro(T dato) {
        this.valor = dato;
        this.next = null;
    }

    public T value() {
        return valor; // Devuelve el valor del tipo T
    }
    
    public NodoMiembro<T> next() {
        return next; // Devuelve el siguiente nodo
    }
    
    public void setNext(NodoMiembro<T> node) {
        this.next = node; // Establece el siguiente nodo
    }
}
