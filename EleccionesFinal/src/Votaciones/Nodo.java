/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votaciones;

/**
 *
 * @author Leonel
 */
public class Nodo {
    public ActaElectoral valor;
    public Nodo next;

    public Nodo(ActaElectoral valor) {
        this.valor = valor;
        this.next = null;        
    }
    
    public ActaElectoral value() {
        return valor;
    }
    
    public Nodo next() {
        return next;
    }
    
    public void setNext(Nodo node) {
        this.next = node;
    }
}
