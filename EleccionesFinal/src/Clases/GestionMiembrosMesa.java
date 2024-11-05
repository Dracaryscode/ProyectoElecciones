package Clases;

import TDA.ListaEnlazada;

public class GestionMiembrosMesa {
    private ListaEnlazada listaMiembros;

    public GestionMiembrosMesa() {
        listaMiembros = new ListaEnlazada();
    }

    public void registrarMiembro(String apellidos, String nombres, String tipo, String claveAcceso) {
        MiembroMesa nuevoMiembro = new MiembroMesa(apellidos, nombres, tipo, claveAcceso);
        // Convertir el hashCode de la clave de acceso en un valor entero
        listaMiembros.A�adirFinal(nuevoMiembro.hashCode()); // Aqu� guardas el hashCode del nuevo miembro
    }

    public void eliminarMiembro(String claveAcceso) {
        // Suponiendo que la clave de acceso es �nica, puedes encontrar y eliminar el miembro.
        listaMiembros.eliminar(claveAcceso.hashCode()); // O utiliza otro m�todo para buscar.
    }

    public void mostrarMiembros() {
        listaMiembros.mostrar_elementos(); // Utiliza el m�todo de mostrar de ListaEnlazada.
    }
}
