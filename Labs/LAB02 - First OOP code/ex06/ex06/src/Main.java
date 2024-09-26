public class Main {
    public static void main(String[] args) {
        // Criando candidatos para a eleição
        Candidato candidato1 = new Candidato("WESLEY CORDEIRO DE SOUZA", "05/11/1978", "Masculino", "249.675,08", "Não", 55, "Prefeito");
        Candidato candidato2 = new Candidato("ALCIONI DE OLIVEIRA LOBO CANDIDO", "18/03/1967", "Feminino", "10.000,00", "Não", 44234, "Vereadora");
        Candidato candidato3 = new Candidato("FERNANDA DO JOAQUIM", "13/01/1984", "Feminino", "11.000,00", "Sim", 55555, "Vereadora");
        Candidato candidato4 = new Candidato("CARLOS EDUARDO PEREIRA", "22/02/1970", "Masculino", "500.000,00", "Não", 12345, "Prefeito");
        Candidato candidato5 = new Candidato("MARIA DA SILVA", "12/12/1980", "Feminino", "50.000,00", "Sim", 98765, "Vereadora");

        // Criando a eleição com um array de candidatos
        Candidato[] candidatosEleicao = {candidato1, candidato2, candidato3, candidato4, candidato5};
        Eleicao eleicao = new Eleicao("Astolfo Dutra/MG", 15000, "02/10/2024", candidatosEleicao);

        // Exibindo informações da eleição
        eleicao.exibirInformacoes();

        // Encontrando o candidato com o maior valor de bens
        Candidato candidatoMaisRico = eleicao.encontrarCandidatoComMaisBens();
        double percentual = eleicao.calcularPercentualBens(candidatoMaisRico);

        // Exibindo informações do candidato mais rico e seu percentual
        System.out.println("Candidato com o maior valor de bens:");
        candidatoMaisRico.exibirInformacoes();
        System.out.printf("Percentual de bens em relação ao total: %.2f%%\n", percentual);
    }
}