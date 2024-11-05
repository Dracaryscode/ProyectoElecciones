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
        listaMiembros.AñadirFinal(nuevoMiembro.hashCode()); // Aquí guardas el hashCode del nuevo miembro
    }

    public void eliminarMiembro(String claveAcceso) {
        // Suponiendo que la clave de acceso es única, puedes encontrar y eliminar el miembro.
        listaMiembros.eliminar(claveAcceso.hashCode()); // O utiliza otro método para buscar.
    }

    public void mostrarMiembros() {
        listaMiembros.mostrar_elementos(); // Utiliza el método de mostrar de ListaEnlazada.
    }
}
