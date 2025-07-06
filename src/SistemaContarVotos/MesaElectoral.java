
package SistemaContarVotos;


public class MesaElectoral {
    
    private String idMesa;
    private String lugar;
    private MiembroMesa[] miembros;
    private int contadorMiembros;
    private Eleccion eleccion;


    
    //Miembro de mesa max 3 porque especifican solo, presidente, secretario y vocal
    public MesaElectoral(String lugar, String idMesa, int contadorMiembros, Eleccion eleccion) {
        this.idMesa = idMesa;
        this.lugar = lugar;
        this.miembros = new MiembroMesa[3];
        this.contadorMiembros = contadorMiembros;
         this.eleccion = eleccion;
        
    }

        public boolean asignarMiembro(MiembroMesa miembro) {
            
        String tipo = miembro.getTipoMiembro().trim().toLowerCase();
        switch (tipo) {
            case "presidente":
                miembros[0] = miembro;
                break;
            case "secretario":
                miembros[1] = miembro;
                break;
            case "vocal":
                miembros[2] = miembro;
                break;
            default:
                return false;
        }
        return true;
    }
        
    public boolean modificarMiembro(String tipo, MiembroMesa nuevoMiembro) {
        return asignarMiembro(nuevoMiembro);
    }        

    public String getIdMesa() {
        return idMesa;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getContadorMiembros() {
        return contadorMiembros;
    }
    public void setContadorMiembros(int contadorMiembros){
        this.contadorMiembros = contadorMiembros;
    }
    public Eleccion getEleccion() {
        return eleccion;
    }

    
}
