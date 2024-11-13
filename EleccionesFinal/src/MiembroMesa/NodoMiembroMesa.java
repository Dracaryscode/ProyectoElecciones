package MiembroMesa;

import MiembroMesa.MiembroMesa;

/**
 *
 * @author USUARIO
 */
    public class NodoMiembroMesa{
        private MiembroMesa miembro; // Almacena un objeto MiembroMesa
        private NodoMiembroMesa next; // Apunta al siguiente nodo

    // Constructor para inicializar un Nodo con un objeto MiembroMesa
    public NodoMiembroMesa(MiembroMesa miembro) {
        this.miembro = miembro;
        this.next = null;
    }

    // Método para obtener el miembro almacenado en el nodo
    public MiembroMesa getMiembro() {
        return miembro;
    }

    // Método para obtener el siguiente nodo
    public NodoMiembroMesa next() {
        return next;
    }

    // Método para establecer el siguiente nodo
    public void setNext(NodoMiembroMesa node) {
        this.next = node;
    }
}
