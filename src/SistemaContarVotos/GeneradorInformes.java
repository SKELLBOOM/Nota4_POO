
package SistemaContarVotos;

public class GeneradorInformes {

    public static class InformePorMesa {
        private String codigoMesa;
        private String lugar;
        private int totalVotantes;
        private int votosEmitidos;
        private int votosNulos;
        private int votosBlancos;

        private Candidato[] candidatos;
        private int[] votosPorCandidato;
        private int numCandidatos;

        public InformePorMesa(String codigoMesa, String lugar, int totalVotantes, int votosEmitidos,
                              int votosNulos, int votosBlancos,
                              Candidato[] candidatos, int[] votosPorCandidato, int numCandidatos) {
            this.codigoMesa = codigoMesa;
            this.lugar = lugar;
            this.totalVotantes = totalVotantes;
            this.votosEmitidos = votosEmitidos;
            this.votosNulos = votosNulos;
            this.votosBlancos = votosBlancos;
            this.candidatos = candidatos;
            this.votosPorCandidato = votosPorCandidato;
            this.numCandidatos = numCandidatos;
        }

        public String getCodigoMesa() { 
            return codigoMesa; 
        }
        public String getLugar() { 
            return lugar; 
        }
        public int getTotalVotantes() { 
            return totalVotantes; 
        }
        public int getVotosEmitidos() { 
            return votosEmitidos; 
        }
        public int getVotosNulos() {
            return votosNulos; 
        }
        public int getVotosBlancos() {
            return votosBlancos; 
        }
        public Candidato[] getCandidatos() {
            return candidatos; 
        }
        public int[] getVotosPorCandidato() {
            return votosPorCandidato; 
        }
        public int getNumCandidatos() {
            return numCandidatos; 
        } 
        
        public int getVotosDeCandidato(Candidato c) {
            for (int i = 0; i < numCandidatos; i++) {
                if (candidatos[i].equals(c)) {
                    return votosPorCandidato[i];
                }
            }
            return 0;
        }
    }

    public static InformePorMesa[] generarInformeMesas(GestionActas gestionActas) {
        ActaElectoral[] actas = gestionActas.getActas();
        InformePorMesa[] informes = new InformePorMesa[actas.length];

        for (int i = 0; i < actas.length; i++) {
            ActaElectoral acta = actas[i];
            Resultado[] resultados = acta.getResultados();

            Candidato[] candidatos = new Candidato[100];
            int[] votosPorCandidato = new int[100];
            int numCandidatos = 0;
            int votosEmitidos = 0;

            for (int j = 0; j < resultados.length; j++) {
                Candidato c = resultados[j].getCandidato();
                int votos = resultados[j].getVotos();
                votosEmitidos += votos;

                int index = buscarCandidato(candidatos, numCandidatos, c);
                if (index == -1) {
                    candidatos[numCandidatos] = c;
                    votosPorCandidato[numCandidatos] = votos;
                    numCandidatos++;
                } else {
                    votosPorCandidato[index] += votos;
                }
            }

            votosEmitidos += acta.getVotosBlanco() + acta.getVotosNulos();

            informes[i] = new InformePorMesa(
                acta.getMesa().getIdMesa(),
                acta.getLugar(),
                acta.getVotantesRegistrados(),
                votosEmitidos,
                acta.getVotosNulos(),
                acta.getVotosBlanco(),
                candidatos,
                votosPorCandidato,
                numCandidatos
            );
        }

        return informes;
    }

    private static int buscarCandidato(Candidato[] candidatos, int numCandidatos, Candidato c) {
        for (int i = 0; i < numCandidatos; i++) {
            if (candidatos[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }
}

