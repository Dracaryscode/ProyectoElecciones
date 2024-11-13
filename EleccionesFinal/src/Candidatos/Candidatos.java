package Candidatos;
// Parte por Angela Chavez
public class Candidatos {
    public String nombre;
    public String apellidos;
    public String dni;
    public String partidoPolitico;
    

    public Candidatos() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.partidoPolitico = "";
    }

    public Candidatos(String nombre, String apellidos, String dni, String partidoPolitico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
}
