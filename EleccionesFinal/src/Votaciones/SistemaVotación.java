/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votaciones;

/**
 *
 * @author Leonel
 */
public class SistemaVotaci�n {
    public static void main(String[] args) {
        Pila pilaVotos = new Pila();

        // Creaci�n de un acta electoral
        ActaElectoral acta1 = new ActaElectoral("Mesa 1", "2024-11-12 09:00", 100, 80);
        acta1.registrarVoto("Candidato 1");
        acta1.registrarVoto("Candidato 2");
        acta1.registrarVoto("Candidato 3");

        pilaVotos.registrarActa(acta1);

        // Mostrar actas registradas
        pilaVotos.mostrarActas();
    }
}

