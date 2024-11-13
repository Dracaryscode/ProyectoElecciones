package MiembroMesa;
/*Paso 3*/
import TDA.*;
public class GestionMiembroMesa {
    private ListaEnlazadaMiembro<MesaElectoral> mesas; // Lista de mesas electorales

    public GestionMiembroMesa() {
        this.mesas = new ListaEnlazadaMiembro<>();
    }

    // Método para agregar una mesa a la lista
    public void agregarMesa(MesaElectoral mesa) {
        mesas.AñadirFinal(mesa); // Método para añadir mesas a la lista
    }

    // Método para eliminar una mesa por su número
    public void eliminarMesa(int numeroMesa) {
        NodoMiembro<MesaElectoral> ptr = mesas.L; // Nodo de la lista
        NodoMiembro<MesaElectoral> anterior = null;

        // Recorremos la lista para encontrar la mesa
        while (ptr != null) {
            MesaElectoral mesaActual = ptr.value(); // Obtenemos la mesa
            if (mesaActual.getNumeroMesa() == numeroMesa) {
                if (anterior == null) {
                    mesas.L = ptr.next(); // Eliminar la mesa de la cabeza
                } else {
                    anterior.setNext(ptr.next()); // Eliminar la mesa en medio de la lista
                }
                System.out.println("Mesa eliminada: " + numeroMesa);
                return;
            }
            anterior = ptr;
            ptr = ptr.next(); // Avanzamos al siguiente nodo
        }
        System.out.println("Mesa no encontrada: " + numeroMesa);
    }

    // Método para mostrar todas las mesas
    public void mostrarMesas() {
        NodoMiembro<MesaElectoral> ptr = mesas.L;
        while (ptr != null) {
            MesaElectoral mesa = ptr.value(); // Obtenemos la mesa
            System.out.println("Mesa Número: " + mesa.getNumeroMesa() + ", Ubicación: " + mesa.getUbicacion());
            ptr = ptr.next(); // Avanzamos al siguiente nodo
        }
    }
}
