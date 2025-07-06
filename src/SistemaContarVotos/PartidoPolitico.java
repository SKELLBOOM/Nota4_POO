
package SistemaContarVotos;


public class PartidoPolitico {
    private String nombre;
    private String sigla;
    private String representante;
    private String logo;

    /*Constructor*/
    public PartidoPolitico(String nombre, String sigla, String representante, String logo) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.representante = representante;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
}


