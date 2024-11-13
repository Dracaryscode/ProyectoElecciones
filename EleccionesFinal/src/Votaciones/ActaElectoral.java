
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
    }

    public void registrarVoto(String candidato) {
        if (votosPorCandidato.containsKey(candidato)) {
            votosPorCandidato.put(candidato, votosPorCandidato.get(candidato) + 1);
        }
    }

    public HashMap<String, Integer> getVotosPorCandidato() {
        return votosPorCandidato;
    }

    public String getIdMesa() { 
        return idMesa; 
    }
    public String getFechaHora() { 
        return fechaHora; 
    }
        public int getTotalVotantesRegistrados() { 
            return totalVotantesRegistrados; 
        }
    public int getTotalVotantesParticiparon() { 
        return totalVotantesParticiparon; 
    }
}

