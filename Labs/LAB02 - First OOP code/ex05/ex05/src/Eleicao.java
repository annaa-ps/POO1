public class Eleicao {
    private String nomeMunicipio;
    private int numeroVotantes;
    private String dataEleicao;
    private Candidato[] candidatos;

    //Construtor
    public Eleicao(String municipio, int numeroVotantes, String dataEleicao, Candidato[] candidatos) {
        this.nomeMunicipio = municipio;
        this.numeroVotantes = numeroVotantes;
        this.dataEleicao = dataEleicao;
        this.candidatos = candidatos;
    }

    // Exibir as informações da eleição
    public void exibirInformacoes() {
        System.out.println("_______________________________________");
        System.out.println("Município: " + nomeMunicipio);
        System.out.println("Número de Votantes: " + numeroVotantes);
        System.out.println("Data da Eleição: " + dataEleicao);
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ":");
            candidatos[i].exibirInformacoes();
        }
    }
}