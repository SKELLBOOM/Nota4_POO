
package SistemaContarVotos;


public class Eleccion {
    private String tipo;
    private String fecha;
    private Candidato[] candidatos;
    private MesaElectoral[] mesas;
    private ActaElectoral[] actas;
    private int contadorCandidatos;
    private int contadorMesas;
    private int contadorActas;

    public Eleccion(String tipo, String fecha, int maxCandidatos, int maxMesas, int maxActas) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.candidatos = new Candidato[maxCandidatos];
        this.mesas = new MesaElectoral[maxMesas];
        this.actas = new ActaElectoral[maxActas];
        this.contadorCandidatos = 0;
        this.contadorMesas = 0;
        this.contadorActas = 0;
    }

    public void agregarCandidato(Candidato c) {
        if (contadorCandidatos < candidatos.length) {
            candidatos[contadorCandidatos++] = c;
        }
    }

    public void agregarMesa(MesaElectoral m) {
        if (contadorMesas < mesas.length) {
            mesas[contadorMesas++] = m;
        }
    }

    public void agregarActa(ActaElectoral a) {
        if (contadorActas < actas.length) {
            actas[contadorActas++] = a;
        }
    }

    public void contarVotos() {
        System.out.println("Conteo de votos realizado.");
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
        return candidatos;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public ActaElectoral[] getActas() {
        return actas;
    }
    
}
