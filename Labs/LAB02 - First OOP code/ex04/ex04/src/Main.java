public class Main {
    public static void main(String[] args) {

        //Criando os candidados a partir do construtor
        Candidato candidato1 = new Candidato(
                "WESLEY CORDEIRO DE SOUZA", "05/11/1978", "Masculino", "249.675,08",
                "Não", 55,  "Prefeito");
        Candidato candidato2 = new Candidato("ALCIONI DE OLIVEIRA LOBO CANDIDO","18/03/1967", "Feminino",
                "10.000,00","Não", 44234, "Vereadora");
        Candidato candidato3 = new Candidato("FERNANDA DO JOAQUIM","13/01/1984", "Feminino",
                "11.000,00", "Sim", 55555, "Vereadora");


        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 1221BCC046");
        System.out.println("Código: [046]");
        System.out.println("Cidade: Astolfo Dutra/MG - Código: 3104601");
        System.out.println("----------------------------------------------");

        // Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
    }
}