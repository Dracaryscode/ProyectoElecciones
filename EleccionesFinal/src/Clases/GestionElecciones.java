package Clases;

import TDA.ListaEnlazada;

public class GestionElecciones {
    /*Este requerimiento permite al operador gestionar todo el ciclo de vida de las elecciones. Inicia con la creaci�n de 
    elecciones, donde se introducen datos esenciales como la fecha y el tipo de elecci�n (por ejemplo, municipal, nacional, 
    refer�ndum), as� como los candidatos que participar�n. La modificaci�n permite ajustar cualquier detalle antes de la 
    fecha electoral, mientras que la eliminaci�n se refiere a la posibilidad de cancelar elecciones registradas, garantizando 
    as� la flexibilidad en la gesti�n electoral.*/
    
    public ListaEnlazada listaElecciones;
    
    public GestionElecciones(){
        listaElecciones = new ListaEnlazada();
    }
    
    public void crearEleccion(int idEleccion, String fecha, String tipo, String candidatos){
        Eleccion nuevaEleccion= new Eleccion(idEleccion, fecha, tipo, candidatos);
        listaElecciones.A�adirFinal(nuevaEleccion.hashCode());
    }
    
    public void modificarEleccion(int idEleccion, String nuevaFecha, String nuevoTipo, String nuevosCandidatos){
        System.out.println("Eleccion modificada exitosamente");
    }
    
    public void eliminarEleccion(int idEleccion){
        listaElecciones.eliminar(idEleccion);
        
    }
    
    public void mostrarElecciones(){
        listaElecciones.mostrar_elementos();
    }
    
    
}
