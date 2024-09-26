import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String artista;
    private List<Musica> musicas;

    public Album(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void exibirMusicas() {
        System.out.println("Músicas do álbum \"" + nome + "\":");
        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }
}



