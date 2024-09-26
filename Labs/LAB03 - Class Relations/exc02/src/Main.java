/*Os objetos são independentes?
* Sim, os objetos Musica são independentes do objeto Album. Sendo essa independencia uma característica típica da agregação,
* onde os objetos agregados podem existir de forma independente, mesmo que o objeto que os agrega for destruído e não existir
* mais. */

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Casula", "Carol Biazin", 259);
        Musica musica2 = new Musica("1697", "Carol Biazin", 303);
        Musica musica3 = new Musica("Low Profile", "Carol Biaizn", 203);

        Album album = new Album("No Escuro,", "Carol Biazin");

        album.adicionarMusica(musica1);
        album.adicionarMusica(musica2);
        album.adicionarMusica(musica3);

        album.exibirMusicas();
    }
}
