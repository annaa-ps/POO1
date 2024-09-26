public class Main {
    public static void main(String[] args) {
        // Criando os candidatos para a primeira eleição
        Candidato candidato1 = new Candidato("WESLEY CORDEIRO DE SOUZA", "05/11/1978", "Masculino", "249.675,08", "Não", 55, "Prefeito");
        Candidato candidato2 = new Candidato("ALCIONI DE OLIVEIRA LOBO CANDIDO", "18/03/1967", "Feminino", "10.000,00", "Não", 44234, "Vereadora");
        Candidato candidato3 = new Candidato("FERNANDA DO JOAQUIM", "13/01/1984", "Feminino", "11.000,00", "Sim", 55555, "Vereadora");

        // Criando a primeira eleição com um array de candidatos
        Candidato[] candidatosEleicao1 = {candidato1, candidato2, candidato3};
        Eleicao eleicao1 = new Eleicao("Astolfo Dutra/MG", 15000, "02/10/2024", candidatosEleicao1);

        // Criando os candidatos para a segunda eleição
        Candidato candidato4 = new Candidato("CARLOS EDUARDO PEREIRA", "22/02/1970", "Masculino", "500.000,00", "Não", 12345, "Prefeito");
        Candidato candidato5 = new Candidato("MARIA DA SILVA", "12/12/1980", "Feminino", "50.000,00", "Sim", 98765, "Vereadora");
        Candidato candidato6 = new Candidato("JOSÉ ALMEIDA", "20/07/1975", "Masculino", "20.000,00", "Não", 24680, "Vereador");

        // Criando a segunda eleição com um array de candidatos
        Candidato[] candidatosEleicao2 = {candidato4, candidato5, candidato6};
        Eleicao eleicao2 = new Eleicao("Juiz de Fora/MG", 300000, "02/10/2024", candidatosEleicao2);

        // Exibindo as informações das eleições
        eleicao1.exibirInformacoes();
        eleicao2.exibirInformacoes();
    }
}