public class Produto {
    // Atributos privados para garantir o encapsulamento
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor padrão
    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    // Construtor com parâmetros
    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos Getters e Setters para encapsulamento
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------------------");
    }
}