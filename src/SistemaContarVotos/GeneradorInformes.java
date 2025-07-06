
package SistemaContarVotos;
import java.util.*;

public class GeneradorInformes {

    public static class InformePorMesa {
        private String codigoMesa;
        private String lugar;
        private int totalVotantes;
        private int votosEmitidos;
        private int votosNulos;
        private int votosBlancos;
        private Map<Candidato, Integer> votosPorCandidato;

        public InformePorMesa(String codigoMesa, String lugar, int totalVotantes, int votosEmitidos,
                              int votosNulos, int votosBlancos, Map<Candidato, Integer> votosPorCandidato) {
            this.codigoMesa = codigoMesa;
            this.lugar = lugar;
            this.totalVotantes = totalVotantes;
            this.votosEmitidos = votosEmitidos;
            this.votosNulos = votosNulos;
            this.votosBlancos = votosBlancos;
            this.votosPorCandidato = votosPorCandidato;
        }

        public String getCodigoMesa() { return codigoMesa; }
        public String getLugar() { return lugar; }
        public int getTotalVotantes() { return totalVotantes; }
        public int getVotosEmitidos() { return votosEmitidos; }
        public int getVotosNulos() { return votosNulos; }
        public int getVotosBlancos() { return votosBlancos; }
        public Map<Candidato, Integer> getVotosPorCandidato() { return votosPorCandidato; }
    }

    public static List<InformePorMesa> generarInformeMesas(GestionActas gestionActas) {
        List<InformePorMesa> informes = new ArrayList<>();

        for (ActaElectoral acta : gestionActas.getActas()) {
            Map<Candidato, Integer> votosPorCandidato = new HashMap<>();
            Resultado[] resultados = acta.getResultados();

            int votosEmitidos = 0;
            for (Resultado rc : resultados) {
                Candidato c = rc.getCandidato();
                int votos = rc.getVotos();
                votosPorCandidato.put(c, votosPorCandidato.getOrDefault(c, 0) + votos);
                votosEmitidos += votos;
            }

            votosEmitidos += acta.getVotosBlanco() + acta.getVotosNulos();

            InformePorMesa informe = new InformePorMesa(
                acta.getMesa().getIdMesa(),
                acta.getLugar(),
                acta.getVotantesRegistrados(),
                votosEmitidos,
                acta.getVotosNulos(),
                acta.getVotosBlanco(),
                votosPorCandidato
            );

            informes.add(informe);
        }

        return informes;
    }
}

