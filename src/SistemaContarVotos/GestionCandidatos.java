package SistemaContarVotos;

public class GestionCandidatos {

    private Candidato[] candidatos;
    private int contador;

    public GestionCandidatos(int capacidadMaxima) {

        candidatos = new Candidato[capacidadMaxima];
        contador = 0;
    }
    
    // AGREGAMOS 
    public boolean agregarCandidato(Candidato c){
        if (contador < candidatos.length) {
            candidatos[contador] = c;
            contador++;
            return true;
        }
        return false;
        }
    
    // para modificar
        public boolean modificarCandidato(int indice, Candidato nuevo) {
        if (indice >= 0 && indice < contador) {
            candidatos[indice] = nuevo;
            return true;
        }
        return false;
        }
    // para eliminar los candidatos registrados
            public boolean eliminarCandidato(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                candidatos[i] = candidatos[i + 1];
            }
            candidatos[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }
    // Obtener todos
    public Candidato[] getCandidatos() {
        Candidato[] copia = new Candidato[contador];
        for (int i = 0; i < contador; i++) {
            copia[i] = candidatos[i];
        }
        return copia;
    }

    public int getCantidad() {
        return contador;
    }
}
