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

    public Nodo getTop() {
        return top;
    }

    public void push(ActaElectoral acta) {
        Nodo newNodo = new Nodo(acta);
        newNodo.setNext(top);
        top = newNodo;
    }

    public ActaElectoral pop() {
        if (top != null) {
            ActaElectoral acta = top.value();
            top = top.next();
            return acta;
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    public void mostrarElementos() {
        if (top == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Los elementos de la pila son:");
            Nodo ptr = top;
            while (ptr != null) {
                System.out.println(ptr.value());
                ptr = ptr.next();
            }
        }
    }
}
