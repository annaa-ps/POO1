public class Personagem {

    private String nome;
    private String ator;

    public Personagem(String nome, String ator) {
        this.nome = nome;
        this.ator = ator;
    }

    public String getNome() {
        return nome;
    }

    public String getAtor() {
        return ator;
    }

    public String toString() {
        return nome + " interpretado por " + ator;
    }
}
