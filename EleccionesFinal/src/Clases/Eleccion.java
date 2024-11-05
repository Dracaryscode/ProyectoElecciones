package Clases;



public class Eleccion {
    
    public int idEleccion; //le agrege un id para poder modificarlo
    public String fecha;
    public String tipo;
    public String candidatos;
    
    public Eleccion(){
        this.idEleccion=0;
        this.fecha="";
        this.tipo="";
        this.candidatos="";
    }
    
    public Eleccion(int idEleccion, String fecha, String tipo, String  candidatos){
        this.idEleccion=0;
        this.fecha=fecha;
        this.tipo=tipo;
        this.candidatos=candidatos;
    }

    public int getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(int idEleccion) {
        this.idEleccion = idEleccion;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(String candidatos) {
        this.candidatos = candidatos;
    }
    
}
