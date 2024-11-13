/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votaciones;

/**
 *
 * @author Leonel
 */
public class Pila {
    private Nodo top;

    public Pila() {
        this.top = null;
    }

    public void registrarActa(ActaElectoral acta) {
        Nodo nuevoNodo = new Nodo(acta);
        nuevoNodo.setNext(top);
        top = nuevoNodo;
    }

    public ActaElectoral obtenerUltimaActa() {
        if (top != null) {
            ActaElectoral acta = top.value();
            top = top.next();
            return acta;
        } else {
            System.out.println("No hay actas en la pila.");
            return null;
        }
    }

    public void mostrarActas() {
        if (top == null) {
            System.out.println("La pila de actas está vacía.");
        } else {
            System.out.println("Actas registradas:");
            Nodo ptr = top;
            while (ptr != null) {
                System.out.println("Acta de la mesa: " + ptr.value().getIdMesa());
                System.out.println("Fecha y Hora: " + ptr.value().getFechaHora());
                System.out.println("Votos por Candidato: " + ptr.value().getVotosPorCandidato());
                ptr = ptr.next();
            }
        }
    }
}