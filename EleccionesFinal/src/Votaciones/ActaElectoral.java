/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votaciones;

/**
 *
 * @author Leonel
 */
import java.util.HashMap;

public class ActaElectoral {
    private String idMesa;
    private String fechaHora;
    private int totalVotantesRegistrados;
    private int totalVotantesParticiparon;
    private HashMap<String, Integer> votosPorCandidato;

    public ActaElectoral(String idMesa, String fechaHora, int totalVotantesRegistrados, int totalVotantesParticiparon) {
        this.idMesa = idMesa;
        this.fechaHora = fechaHora;
        this.totalVotantesRegistrados = totalVotantesRegistrados;
        this.totalVotantesParticiparon = totalVotantesParticiparon;
        this.votosPorCandidato = new HashMap<>();
        // Inicializa con 0 votos para cada candidato
        this.votosPorCandidato.put("Candidato 1", 0);
        this.votosPorCandidato.put("Candidato 2", 0);
        this.votosPorCandidato.put("Candidato 3", 0);
        this.votosPorCandidato.put("Candidato 4", 0);
        this.votosPorCandidato.put("Candidato 5", 0);
    }

    public void registrarVoto(String candidato) {
        if (votosPorCandidato.containsKey(candidato)) {
            votosPorCandidato.put(candidato, votosPorCandidato.get(candidato) + 1);
        }
    }

    public HashMap<String, Integer> getVotosPorCandidato() {
        return votosPorCandidato;
    }

    // Métodos getter y setter
    public String getIdMesa() { return idMesa; }
    public String getFechaHora() { return fechaHora; }
    public int getTotalVotantesRegistrados() { return totalVotantesRegistrados; }
    public int getTotalVotantesParticiparon() { return totalVotantesParticiparon; }
}

