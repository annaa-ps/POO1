public class Eleicao {
    private String municipio;
    private int numeroVotantes;
    private String dataEleicao;
    private Candidato[] candidatos;

    // Construtor
    public Eleicao(String municipio, int numeroVotantes, String dataEleicao, Candidato[] candidatos) {
        this.municipio = municipio;
        this.numeroVotantes = numeroVotantes;
        this.dataEleicao = dataEleicao;
        this.candidatos = candidatos;
    }

    // Método para exibir informações da eleição e dos candidatos
    public void exibirInformacoes() {
        System.out.println("_______________________________________");
        System.out.println("Município: " + municipio);
        System.out.println("Número de Votantes: " + numeroVotantes);
        System.out.println("Data da Eleição: " + dataEleicao);
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ":");
            candidatos[i].exibirInformacoes();
        }
    }

    // Método para encontrar o candidato com maior valor de bens
    public Candidato encontrarCandidatoComMaisBens() {
        Candidato candidatoMaisRico = candidatos[0];
        for (Candidato candidato : candidatos) {
            if (candidato.getTotalBensValor() > candidatoMaisRico.getTotalBensValor()) {
                candidatoMaisRico = candidato;
            }
        }
        return candidatoMaisRico;
    }

    // Método para calcular o percentual de bens
    public double calcularPercentualBens(Candidato candidato) {
        double totalBens = 0;
        for (Candidato c : candidatos) {
            totalBens += c.getTotalBensValor();
        }
        return (candidato.getTotalBensValor() / totalBens) * 100;
    }
}
