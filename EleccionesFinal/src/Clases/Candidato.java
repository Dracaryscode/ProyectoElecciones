package clases;

public class Candidato {
    public String nombre;
    public int dni;
    public String partido;
    public int edad;
    public String nacionalidad;

    public Candidato() {
        this.nombre = "";
        this.dni = 0;
        this.partido = "";
        this.edad = 0;
        this.nacionalidad = "";
    }

    public Candidato(String nombre, int dni, String partido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.partido = partido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
