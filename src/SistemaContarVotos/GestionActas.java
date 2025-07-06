
package SistemaContarVotos;

public class GestionActas {

    private ActaElectoral[] actas;
    private int contador;

    public GestionActas(int capacidadMaxima) {
        actas = new ActaElectoral[capacidadMaxima];
        contador = 0;
    }

    public boolean registrarActa(ActaElectoral acta) {
        if (contador < actas.length) {
            actas[contador] = acta;
            contador++;
            return true;
        }
        return false;
    }
    
        public boolean eliminarActa(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                actas[i] = actas[i + 1];
            }
            actas[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }


    public ActaElectoral[] getActas() {
        ActaElectoral[] copia = new ActaElectoral[contador];
        for (int i = 0; i < contador; i++) {
            copia[i] = actas[i];
        }
        return copia;
    }

    public int getCantidad() {
        return contador;
    }
}
