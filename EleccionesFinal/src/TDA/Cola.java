package TDA;

import TDA.NodoCola;
import Candidatos.Candidatos;

/**
 *
 * @author USUARIO
 */
public class Cola {
    private NodoCola front; // Nodo frontal de la cola
    private NodoCola rear; // Nodo final de la cola
    
    public Cola() {
        front = null; //es como si fuera el L, es decir la cabeza
        rear = null;
    }
    
    public void insertar(Candidatos candidato){
        NodoCola nodo = new NodoCola(candidato);     
        if(rear == null) {
            front = nodo; 
            rear = nodo;
        } else {
            rear.setNext(nodo);
            rear = nodo;
        }  
    }
    
    public void mostrar_elementos() {
        System.out.println("Lista de candidatos:");
        NodoCola ptr = front;
        
        if (front == null) {
            System.out.println("La cola esta vaci­a");
        }        
        while(ptr != null) {
            System.out.print(ptr.getCandidato() + "->");
            ptr = ptr.next(); //avanzando
        }  
    }
    
    public void eliminar(String dni){
        NodoCola ptr  = front;
        NodoCola anterior = null;
        while(ptr!=null){
            if(ptr.getCandidato().getDni().equals(dni)){
            if (anterior == null)
                front = ptr.next();            
            else              
                anterior.setNext(ptr.next());
            break;            
            }
            anterior = ptr;
            ptr=ptr.next();
        }
        System.out.println("Candidato eliminado");
        mostrar_elementos();
    }
    
    public NodoCola buscar(String dni){
        NodoCola ptr = front;
        while(ptr!= null){
            if (ptr.getCandidato().getDni().equals(dni)) {
                return ptr;
            }
            ptr = ptr.next();
        }
        return null;
    }
}
