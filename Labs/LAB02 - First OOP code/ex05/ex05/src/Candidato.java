public class Candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private String totalBens;
    private String reeleicao;
    private int partido;
    private String cargoPretendido;

    // Construtor com todos os atributos
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTotalBens() {
        return totalBens;
    }

    public String getReeleicao() {
        return reeleicao;
    }

    public int getPartido() {
        return partido;
    }

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    // Método para exibir informações usando os getters
    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Total de Bens: R$" + getTotalBens());
        System.out.println("Candidato à Reeleição: " + getReeleicao());
        System.out.println("Número do Partido: " + getPartido());
        System.out.println("Cargo Pretendido: " + getCargoPretendido());
        System.out.println("--------------------------------------");
    }
}
