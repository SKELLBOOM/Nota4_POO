package SistemaContarVotos;

public class Eleccion {

    private String tipo;
    private String fecha;
    private Candidato[] candidatos;
    private int cantidadCandidatos;

    public Eleccion(String tipo, String fecha, int capacidadMaximaCandidatos) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.candidatos = new Candidato[capacidadMaximaCandidatos];
        this.cantidadCandidatos = 0;
    }

    public boolean agregarCandidato(Candidato c) {
        if (cantidadCandidatos < candidatos.length) {
            candidatos[cantidadCandidatos] = c;
            cantidadCandidatos++;
            return true;
        }
        return false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Candidato[] getCandidatos() {
        Candidato[] copia = new Candidato[cantidadCandidatos];
        for (int i = 0; i < cantidadCandidatos; i++) {
            copia[i] = candidatos[i];
        }
        return copia;
    }

    public int getCantidadCandidatos() {
        return cantidadCandidatos;
    }
}
