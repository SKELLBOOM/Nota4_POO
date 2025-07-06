
package SistemaContarVotos;

public class MiembroMesa{
    private String tipoMiembro;
    private String nombres; 
    private String apellidos;

    public MiembroMesa(String tipoMiembro, String nombres, String apellidos) {
        this.tipoMiembro = tipoMiembro;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
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


}
    

