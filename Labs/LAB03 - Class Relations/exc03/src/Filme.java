import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String titulo;
    private String diretor;
    private List<Personagem> personagens;

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.personagens = new ArrayList<>();
    }

    // Método para adicionar um personagem ao filme
    public void adicionarPersonagem(String nomePersonagem, String ator) {
        Personagem personagem = new Personagem(nomePersonagem, ator);
        personagens.add(personagem);
    }

    // Método para exibir as informações do filme
    public void exibirFilme() {
        System.out.println("Filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Personagens:");
        for (Personagem personagem : personagens) {
            System.out.println("  - " + personagem);
        }
    }
}
