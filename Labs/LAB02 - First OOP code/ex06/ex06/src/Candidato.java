public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private String totalBens; // Mantemos como String para formatar os valores
    private String reeleicao;
    private int partido;
    private String cargoPretendido;

    // Construtor
    public Candidato(String nomeCompleto, String dataNascimento, String sexo, String totalBens, String reeleicao, int partido, String cargoPretendido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.cargoPretendido = cargoPretendido;
    }

    // Métodos Get
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTotalBens() {
        return totalBens;
    }

    public double getTotalBensValor() {
        return Double.parseDouble(totalBens.replace(".", "").replace(",", "."));
    }

    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Total de Bens: R$" + getTotalBens());
        System.out.println("Número do Partido: " + partido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("--------------------------------------");
    }
}
