package SistemaContarVotos;

public class ActaElectoral {

    private String numeroActa;
    private String titulo;
    private String hora;
    private String fecha;
    private String lugar;
    private MesaElectoral mesa;
    private int votantesRegistrados;
    private int votosEmitidos;
    private int votosNulos;
    private int votosBlanco;
    private String firmas;
    private String sello;
    private String observaciones;
    private Resultado[] resultado;
    private int contadorResultados;

    public ActaElectoral(String numeroActa, String titulo,
            String hora, String fecha, String lugar, MesaElectoral mesa,
            int votantesRegistrados, int votosEmitidos, int votosNulos, int votosBlanco,
            String firmas, String sello, String observaciones, int capacidadResultados) {

        this.numeroActa = numeroActa;
        this.titulo = titulo;
        this.hora = hora;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mesa = mesa;
        this.votantesRegistrados = votantesRegistrados;
        this.votosEmitidos = votosEmitidos;
        this.votosNulos = votosNulos;
        this.votosBlanco = votosBlanco;
        this.firmas = firmas;
        this.sello = sello;
        this.observaciones = observaciones;
        this.resultado = new Resultado[capacidadResultados];
        this.contadorResultados = 0;
    }

    public boolean agregarResultado(Resultado rc) {
        if (contadorResultados < resultado.length) {
            resultado[contadorResultados] = rc;
            contadorResultados++;
            return true;
        }
        return false;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public int getVotantesRegistrados() {
        return votantesRegistrados;
    }

    public String getLugar() {
        return lugar;
    }
    
    public MesaElectoral getMesa() {
        return mesa;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public Resultado[] getResultados() {
        Resultado[] copia = new Resultado[contadorResultados];
        for (int i = 0; i < contadorResultados; i++) {
            copia[i] = resultado[i];
        }
        return copia;
    }

}
