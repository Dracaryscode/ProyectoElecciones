package TDA;
// Parte hecha entre todos los miembros del equipo

import Candidatos.Candidatos;

public class NodoCola {
    Candidatos candidato;
    NodoCola next;

    public NodoCola(Candidatos candidato) {
        this.candidato = candidato;
        this.next = null;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public NodoCola next(){
        return next;
    }

    public void setNext(NodoCola node){
        this.next = node;
    }
}
