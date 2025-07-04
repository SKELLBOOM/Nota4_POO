
package SistemaContarVotos;

public class MiembroMesa extends Persona{
    private String tipoMiembro;

    public MiembroMesa(String nombres, String apellidos, String tipoMiembro) {
        super(nombres, apellidos);
        this.tipoMiembro = tipoMiembro;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }
}
    

