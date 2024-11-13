package MiembroMesa;

import MiembroMesa.MiembroMesa;

/**
 *
 * @author USUARIO
 */
    class Nodo {
        private MiembroMesa miembro; // Almacena un objeto MiembroMesa
        private Nodo next; // Apunta al siguiente nodo

    // Constructor para inicializar un Nodo con un objeto MiembroMesa
    public Nodo(MiembroMesa miembro) {
        this.miembro = miembro;
        this.next = null;
    }

    // M�todo para obtener el miembro almacenado en el nodo
    public MiembroMesa getMiembro() {
        return miembro;
    }

    // M�todo para obtener el siguiente nodo
    public Nodo next() {
        return next;
    }

    // M�todo para establecer el siguiente nodo
    public void setNext(Nodo node) {
        this.next = node;
    }
}
