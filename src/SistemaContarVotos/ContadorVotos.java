
package SistemaContarVotos;

import java.util.*;

public class ContadorVotos {

    public static class ResultadoConteo {
        private String nombreCompleto;
        private String partido;
        private int votos;
        private double porcentaje;

        public ResultadoConteo(String nombreCompleto, String partido, int votos, double porcentaje) {
            this.nombreCompleto = nombreCompleto;
            this.partido = partido;
            this.votos = votos;
            this.porcentaje = porcentaje;
        }

        public String getNombreCompleto() { return nombreCompleto; }
        public String getPartido() { return partido; }
        public int getVotos() { return votos; }
        public double getPorcentaje() { return porcentaje; }
    }

    public static class ResultadoGlobal {
        private List<ResultadoConteo> resultados;
        private int totalVotos;
        private int votosBlanco;
        private int votosNulos;
        private ResultadoConteo ganador;

        public ResultadoGlobal(List<ResultadoConteo> resultados, int totalVotos, 
                int votosBlanco, int votosNulos, ResultadoConteo ganador) {
            this.resultados = resultados;
            this.totalVotos = totalVotos;
            this.votosBlanco = votosBlanco;
            this.votosNulos = votosNulos;
            this.ganador = ganador;
        }

        public List<ResultadoConteo> getResultados() { return resultados; }
        public int getTotalVotos() { return totalVotos; }
        public int getVotosBlanco() { return votosBlanco; }
        public int getVotosNulos() { return votosNulos; }
        public ResultadoConteo getGanador() { return ganador; }
    }

    public static ResultadoGlobal contarVotos(GestionActas gestionActas) {
        Map<Candidato, Integer> votosPorCandidato = new HashMap<>();
        int totalVotos = 0;
        int totalBlanco = 0;
        int totalNulo = 0;

        for (ActaElectoral acta : gestionActas.getActas()) {
            Resultado[] resultados = acta.getResultados();

            for (Resultado rc : resultados) {
                Candidato c = rc.getCandidato();
                int votos = rc.getVotos();

                votosPorCandidato.put(c, votosPorCandidato.getOrDefault(c, 0) + votos);
                totalVotos += votos;
            }

            totalBlanco += acta.getVotosBlanco();
            totalNulo += acta.getVotosNulos();
            totalVotos += acta.getVotosBlanco() + acta.getVotosNulos();
        }

        // Construir lista de resultados
        List<ResultadoConteo> listaResultados = new ArrayList<>();
        ResultadoConteo ganador = null;
        int maxVotos = -1;

        for (Map.Entry<Candidato, Integer> entry : votosPorCandidato.entrySet()) {
            Candidato c = entry.getKey();
            int votos = entry.getValue();
            double porcentaje = totalVotos > 0 ? (votos * 100.0) / totalVotos : 0;

            ResultadoConteo rc = new ResultadoConteo(
                c.getNombres() + " " + c.getApellidos(),
                c.getPartido().getNombre(),
                votos,
                porcentaje
            );

            listaResultados.add(rc);

            if (votos > maxVotos) {
                maxVotos = votos;
                ganador = rc;
            }
        }

        return new ResultadoGlobal(listaResultados, totalVotos, totalBlanco, totalNulo, ganador);
    }
}
