/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaContarVotos;

public class GestionMesas {

    private MesaElectoral[] mesas;
    private int contador;

    public GestionMesas(int capacidadMaxima) {
        mesas = new MesaElectoral[capacidadMaxima];
        contador = 0;
    }

    //AGREGAMOS 
    public boolean agregarMesa(MesaElectoral m) {
        if (contador < mesas.length) {
            mesas[contador] = m;
            contador++;
            return true;
        }
        return false;
    }

    //ELIMINAMOS    
    public boolean eliminarMesa(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                mesas[i] = mesas[i + 1];
            }
            mesas[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }

    //Modificamos
    public boolean modificarMesa(int indice, String nuevoLugar, int nuevoNumVotantes) {
        if (indice >= 0 && indice < contador) {
            mesas[indice].setLugar(nuevoLugar);
            mesas[indice].setContadorMiembros(nuevoNumVotantes);
            return true;
        }
        return false;
    }

    
    //ALMACENAMOS
    public MesaElectoral[] getMesas() {
        MesaElectoral[] copia = new MesaElectoral[contador];
        for (int i = 0; i < contador; i++) {
            copia[i] = mesas[i];
        }
        return copia;
    }

    public int getCantidad() {
        return contador;
    }

    public MesaElectoral getMesa(int indice) {
        if (indice >= 0 && indice < contador) {
            return mesas[indice];
        }
        return null;
    }
}
