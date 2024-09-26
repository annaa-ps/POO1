public class Livro {

    private String titulo;
    private Autor autor;
    private  int anoPublicacao;

    public Livro(String titulo, Autor autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String toString() {
        return titulo + ", escrito por " + autor.getNome() + " em " + anoPublicacao;
    }


}
