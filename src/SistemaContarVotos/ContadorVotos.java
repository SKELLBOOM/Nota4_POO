
package SistemaContarVotos;


public class ContadorVotos {

    public static class ResultadoConteo {
        private String nombreCompleto;
        private String partido;
        private int votos;

        public ResultadoConteo(String nombreCompleto, String partido, int votos) {
            this.nombreCompleto = nombreCompleto;
            this.partido = partido;
            this.votos = votos;
        }

        public String getNombreCompleto() { return nombreCompleto; }
        public String getPartido() { return partido; }
        public int getVotos() { return votos; }
    }

    public static class ResultadoGlobal {
        private ResultadoConteo[] resultados;
        private int totalVotos;
        private int votosBlanco;
        private int votosNulos;
        private ResultadoConteo ganador;

        public ResultadoGlobal(ResultadoConteo[] resultados, int totalVotos, 
                int votosBlanco, int votosNulos, ResultadoConteo ganador) {
            this.resultados = resultados;
            this.totalVotos = totalVotos;
            this.votosBlanco = votosBlanco;
            this.votosNulos = votosNulos;
            this.ganador = ganador;
        }

        public ResultadoConteo[] getResultados() { return resultados; }
        public int getTotalVotos() { return totalVotos; }
        public int getVotosBlanco() { return votosBlanco; }
        public int getVotosNulos() { return votosNulos; }
        public ResultadoConteo getGanador() { return ganador; }
    }

    public static ResultadoGlobal contarVotos(GestionActas gestionActas) {
        ActaElectoral[] actas = gestionActas.getActas();

        Candidato[] candidatos = new Candidato[100];
        int[] votosPorCandidato = new int[100];
        int numCandidatos = 0;

        int totalVotos = 0;
        int totalBlanco = 0;
        int totalNulo = 0;

        for (int i = 0; i < actas.length; i++) {
            Resultado[] resultados = actas[i].getResultados();

            for (int j = 0; j < resultados.length; j++) {
                Candidato c = resultados[j].getCandidato();
                int votos = resultados[j].getVotos();
                totalVotos += votos;

                int index = buscarCandidato(candidatos, numCandidatos, c);
                if (index == -1) {
                    candidatos[numCandidatos] = c;
                    votosPorCandidato[numCandidatos] = votos;
                    numCandidatos++;
                } else {
                    votosPorCandidato[index] += votos;
                }
            }

            totalBlanco += actas[i].getVotosBlanco();
            totalNulo += actas[i].getVotosNulos();
            totalVotos += actas[i].getVotosBlanco() + actas[i].getVotosNulos();
        }

        ResultadoConteo[] resultadosFinales = new ResultadoConteo[numCandidatos];
        ResultadoConteo ganador = null;
        int maxVotos = -1;

        for (int i = 0; i < numCandidatos; i++) {
            Candidato c = candidatos[i];
            int votos = votosPorCandidato[i];

            ResultadoConteo rc = new ResultadoConteo(
                c.getNombres() + " " + c.getApellidos(),
                c.getPartido().getNombre(),
                votos
            );

            resultadosFinales[i] = rc;

            if (votos > maxVotos) {
                maxVotos = votos;
                ganador = rc;
            }
        }

        return new ResultadoGlobal(resultadosFinales, totalVotos, totalBlanco, totalNulo, ganador);
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