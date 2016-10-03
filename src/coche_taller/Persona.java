package coche_taller;


public class Persona {

    private String dni;
    private String numSS;
    private String nombre;
    private String apellido;
    private Integer edad;


        public Persona (String dni, String numSS, String nombre, String apellido, Integer edad){
            this.dni = dni;
            this.numSS=numSS;
            this.nombre=nombre;
            this.apellido=apellido;
            this.edad=edad;
        }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
