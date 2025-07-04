
package SistemaContarVotos;

public class ActaElectoral {
    private String numeroActa;
    private String fecha;
    private String lugar;
    private MesaElectoral mesa;
    private int totalVotantes;
    private int votosEmitidos;
    private int votosNulos;
    private int votosBlanco;
    private Candidato[] candidatos;
    private int[] votosPorCandidato;

    public ActaElectoral(String numeroActa, String fecha, String lugar, MesaElectoral mesa, Candidato[] candidatos) {
        this.numeroActa = numeroActa;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mesa = mesa;
        this.candidatos = candidatos;
        this.votosPorCandidato = new int[candidatos.length];
    }

    public void registrarVoto(int indiceCandidato, int cantidad) {
        if (indiceCandidato >= 0 && indiceCandidato < votosPorCandidato.length) {
            votosPorCandidato[indiceCandidato] += cantidad;
        }
    }

    // Getters y Setters
    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public int getTotalVotantes() {
        return totalVotantes;
    }

    public void setTotalVotantes(int totalVotantes) {
        this.totalVotantes = totalVotantes;
    }

    public int getVotosEmitidos() {
        return votosEmitidos;
    }

    public void setVotosEmitidos(int votosEmitidos) {
        this.votosEmitidos = votosEmitidos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public int[] getVotosPorCandidato() {
        return votosPorCandidato;
    }
    
}
