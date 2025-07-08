package SistemaContarVotos;

public class GestionActas {

    private ActaElectoral[] actas;
    private int contador;
    private Eleccion[] elecciones = new Eleccion[100];
    private int contadorElecciones = 0;

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
    
    public String[] getMesasPorEleccion(String tipoEleccion) {
    for (int i = 0; i < contadorElecciones; i++) {
        Eleccion e = elecciones[i];
        if (e != null && e.getTipo().equalsIgnoreCase(tipoEleccion)) {
            MesaElectoral[] mesas = e.getMesas();
            int cantidad = e.getContadorMesas();
            String[] codigosMesas = new String[cantidad];

            for (int j = 0; j < cantidad; j++) {
                if (mesas[j] != null) {
                    codigosMesas[j] = mesas[j].getIdMesa();
                }
            }

            return codigosMesas;
        }
    }

    return new String[0];
}
    
    public String[] getNombresElecciones() {
        String[] nombres = new String[contadorElecciones];
        for (int i = 0; i < contadorElecciones; i++) {
            nombres[i] = elecciones[i].getTipo();
        }
        return nombres;
    }

}
