
package SistemaContarVotos;


public class Candidato {
    
    private String nombres;
    private String apellidos;
    private int dni;
    private PartidoPolitico partido;

    public Candidato(String nombres, String apellidos, int dni, PartidoPolitico partido) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.partido = partido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
}
