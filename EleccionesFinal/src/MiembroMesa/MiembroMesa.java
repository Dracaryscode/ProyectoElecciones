package MiembroMesa;
/*Paso 1*/
/*Parte hecha en conjunto entre Jorge y Victor*/

public class MiembroMesa {
    private String apellidos;
    private String nombres;
    private String tipo; // Puede ser "presidente", "secretario" o "vocal"
    private String claveAcceso;

    // Constructor por defecto
    public MiembroMesa() {
        this.apellidos = "";
        this.nombres = "";
        this.tipo = "";
        this.claveAcceso = "";
    }

    // Constructor con parámetros
    public MiembroMesa(String apellidos, String nombres, String tipo, String claveAcceso) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
        this.claveAcceso = claveAcceso;
    }

    // Métodos getter y setter
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

}
