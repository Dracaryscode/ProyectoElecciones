package Candidatos;
// Parte por Angela Chavez
import java.util.Scanner;
import TDA.Cola;
import TDA.NodoCola;

public class GestionCandidatos {
    /*Este requerimiento abarca el manejo de candidatos en un evento electoral. Permite el registro de nuevos candidatos, 
    asegurando que se capturen datos personales como nombre, apellidos, número de documento de identidad (DNI) y partido 
    político al que pertenecen. La modificación es crucial para realizar cambios en la información de los candidatos, y la 
    eliminación asegura que se pueda retirar a un candidato en caso de que no cumpla con los requisitos o decida retirarse 
    de la contienda electoral.*/
    
    public Cola colaCandidatos;
    Scanner sc= new Scanner(System.in);
    
    public GestionCandidatos(){
        colaCandidatos = new Cola();
    }
    
    public void registroCandidatos(){
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Apellidos: ");
        String apellidos=sc.nextLine();
        System.out.println("DNI: ");
        String dni=sc.nextLine();
        System.out.println("Partido politico: ");
        String partidoPolitico=sc.nextLine();
        
        Candidatos nuevoCandidato= new Candidatos(nombre, apellidos, dni, partidoPolitico);
        colaCandidatos.insertar(nuevoCandidato);
        
        System.out.println("Se registro correctamente el candidato.");
    }
    
    public void modificarCandidato(String dni){
        NodoCola nodo = colaCandidatos.buscar(dni);
        if (nodo!=null) {
            System.out.println("Nuevo nombre: ");
            nodo.getCandidato().setNombre(sc.nextLine());
            System.out.println("Nuevos apellidos: ");
            nodo.getCandidato().setApellidos(sc.nextLine());
            System.out.println("Nuevo DNI: ");
            nodo.getCandidato().setDni(sc.nextLine());
            System.out.println("Nuevo partido politico: ");
            nodo.getCandidato().setPartidoPolitico(sc.nextLine());
            System.out.println("Candidato modificado");
        }
        System.out.println("Candidato no encontrado");
        
    }
    
    public void eliminarCandidato(String dni){
        colaCandidatos.eliminar(dni);
        
    }
    
    public void mostrarCandidatos(){
        colaCandidatos.mostrar_elementos();
    }
    
}
