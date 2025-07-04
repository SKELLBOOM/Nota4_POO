
package SistemaContarVotos;


public class MesaElectoral {
    
    private String idMesa;
    private MiembroMesa[] miembros;
    private int contadorMiembros;

    public MesaElectoral(String idMesa, int maxMiembros) {
        this.idMesa = idMesa;
        this.miembros = new MiembroMesa[maxMiembros];
        this.contadorMiembros = 0;
    }

    public void agregarMiembro(MiembroMesa m) {
        if (contadorMiembros < miembros.length) {
            miembros[contadorMiembros++] = m;
        }
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public MiembroMesa[] getMiembros() {
        return miembros;
    }
    
}
