package MiembroMesa;
/*Paso 2*/
import TDA.*;
public class MesaElectoral {
    private String ubicacion;
    private int numeroMesa;
    private ListaEnlazadaMiembro miembros; // Lista de miembros de mesa

    public MesaElectoral(String ubicacion, int numeroMesa) {
        this.ubicacion = ubicacion;
        this.numeroMesa = numeroMesa;
        this.miembros = new ListaEnlazadaMiembro();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void agregarMiembro(MiembroMesa miembro) {
        miembros.A�adirFinal(miembro); // M�todo para a�adir miembros a la lista
    }

    public void mostrarMiembros() {
        miembros.mostrar_elementos(); // M�todo para mostrar los miembros
    }
}
