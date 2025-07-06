
package SistemaContarVotos;

public class GestionPartidoPolitico {

    private PartidoPolitico[] partidos;
    private int contador;

    public GestionPartidoPolitico(int capacidadMaxima) {

        partidos = new PartidoPolitico[capacidadMaxima];
        contador = 0;
    }

    //Para agregar cada partido 
    public boolean agregarPartido(PartidoPolitico p) {

        if (contador < partidos.length) {
            partidos[contador] = p;
            contador++;
            return true;

        } else {

            return false;
        }
    }
    //BUSCAR
    public PartidoPolitico buscarPorNombre(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (partidos[i].getNombre().equalsIgnoreCase(nombre)) {
            return partidos[i];
        }
    }
    return null;
}

    // MODIFICAR 
    public boolean modificarPartido(int indice, PartidoPolitico nuevo) {

        if (indice >= 0 && indice < contador) {
            partidos[indice] = nuevo;
            return true;

        }
        return false;
    }

    //ELIMINAR 
    public boolean eliminarPartido(int indice) {

        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                partidos[i] = partidos[i + 1];

            }
            partidos[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }

    // OBTENER TODOS LOS PARTIDOS
    public PartidoPolitico[] getPartidos() {
        PartidoPolitico[] copia = new PartidoPolitico [contador];
        for (int i = 0; i < contador; i++) {
            copia[i] = partidos[i];
        }
        return copia; 
    }
    
    //Contador que llevamos actual
    public int getCantidad(){
        return contador;
    }
}
