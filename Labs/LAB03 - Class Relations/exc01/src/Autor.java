public class Autor {

    private String nome;
    private String nacionalidade;

    //Construtor
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public String toString(){
        return nome + " (" + nacionalidade + ")";
    }
}
