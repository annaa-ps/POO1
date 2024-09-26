public class Main {
    public static void main(String[] args) {

        //Criando Vetor
        Candidato[] candidatos = new Candidato[3];

        //Instanciando cada candidato no vetor
        candidatos[0] = new Candidato();
        candidatos[1] = new Candidato();
        candidatos[2] = new Candidato();


        // Informações do primeiro candidato
        candidatos[0].setNomeCompleto("WESLEY CORDEIRO DE SOUZA");
        candidatos[0].setDataNascimento("05/11/1978");
        candidatos[0].setSexo("Masculino");
        candidatos[0].setTotalBens("249.675,08");
        candidatos[0].setReeleicao("Não");
        candidatos[0].setPartido(55);
        candidatos[0].setCargoPretendido("Prefeito");

        // Informações do segundo candidato
        candidatos[1].setNomeCompleto("ALCIONI DE OLIVEIRA LOBO CANDIDO");
        candidatos[1].setDataNascimento("18/03/1967");
        candidatos[1].setSexo("Feminino");
        candidatos[1].setTotalBens("10.000,00");
        candidatos[1].setReeleicao("Não");
        candidatos[1].setPartido(44234);
        candidatos[1].setCargoPretendido("Vereadora");

        // Informações do terceiro candidato
        candidatos[2].setNomeCompleto("FERNANDA DO JOAQUIM");
        candidatos[2].setDataNascimento("13/01/1984");
        candidatos[2].setSexo("Feminino");
        candidatos[2].setTotalBens("11.000,00");
        candidatos[2].setReeleicao("Sim");
        candidatos[2].setPartido(55555);
        candidatos[2].setCargoPretendido("Vereadora");

        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 1221BCC046");
        System.out.println("Código: [046]");
        System.out.println("Cidade: Astolfo Dutra/MG - Código: 3104601");
        System.out.println("----------------------------------------------");

        // Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");
        for (Candidato candidato : candidatos){
            candidato.exibirInformacoes();
        }
    }
}