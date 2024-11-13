
package Votaciones;

/**
 *
 * @author Leonel
 */
import java.util.HashMap;
/*Parte realizada por Leonel Campos*/  
public class ActaElectoral {
    private String numeroMesa;
    private int totalVotantes;
    private int votosValidos;
    private int votosEnBlanco;
    private int votosNulos;
    private String observaciones;
    private HashMap<String, Integer> votosPorCandidato;
    
    public String getNumeroMesa() {
        return numeroMesa;
    }

    public int getTotalVotantes() {
        return totalVotantes;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public int getVotosEnBlanco() {
        return votosEnBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public HashMap<String, Integer> getVotosPorCandidato() {
        return votosPorCandidato;
    }

    public ActaElectoral(String numeroMesa, int totalVotantes, int votosValidos, int votosEnBlanco, int votosNulos, String observaciones) {
        this.numeroMesa = numeroMesa;
        this.totalVotantes = totalVotantes;
        this.votosValidos = votosValidos;
        this.votosEnBlanco = votosEnBlanco;
        this.votosNulos = votosNulos;
        this.observaciones = observaciones;
        this.votosPorCandidato = new HashMap<>();
    }
    
    public void agregarVoto(String candidato) {
        if (votosPorCandidato.containsKey(candidato)) {
            int votosActuales = votosPorCandidato.get(candidato);
            votosPorCandidato.put(candidato, votosActuales + 1);
        } else {
            votosPorCandidato.put(candidato, 1);
        }
    }
    
    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Acta Electoral - Mesa: ").append(numeroMesa).append("\n");
        resumen.append("Total de Votantes: ").append(totalVotantes).append("\n");
        resumen.append("Votos Válidos: ").append(votosValidos).append("\n");
        resumen.append("Votos en Blanco: ").append(votosEnBlanco).append("\n");
        resumen.append("Votos Nulos: ").append(votosNulos).append("\n");
        resumen.append("Observaciones: ").append(observaciones).append("\n");
        resumen.append("Conteo de Votos por Candidato:\n");

        for (String candidato : votosPorCandidato.keySet()) {
            resumen.append(" - ").append(candidato).append(": ").append(votosPorCandidato.get(candidato)).append(" votos\n");
        }

        return resumen.toString();
    }
}


