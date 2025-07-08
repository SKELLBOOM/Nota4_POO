
package SistemaContarVotos;

public class GestionElecciones {

    private Eleccion[] elecciones;
    private int contador;

    public GestionElecciones(int capacidadMaxima) {
        elecciones = new Eleccion[capacidadMaxima];
        contador = 0;
    }

    // AGREGAR 
    public boolean agregarEleccion(Eleccion e) {
        if (contador < elecciones.length) {
            elecciones[contador] = e;
            contador++;
            return true;
        }
        return false;
    }

    //MODIFICAMOS 
    public boolean modificarEleccion(int indice, Eleccion nueva) {
        if (indice >= 0 && indice < contador) {
            elecciones[indice] = nueva;
            return true;
        }
        return false;
    }

    public boolean eliminarEleccion(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                elecciones[i] = elecciones[i + 1];
            }
            elecciones[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }

    public Eleccion[] getElecciones() {
        Eleccion[] copia = new Eleccion[contador];
        for (int i = 0; i < contador; i++) {
            copia[i] = elecciones[i];
        }
        return copia;
    }

    public int getCantidad() {
        return contador;
    }
}
