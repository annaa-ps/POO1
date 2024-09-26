/*O que acontece com o objeto parte ao remover um objeto inteiro?
* Como foi usado o conceito de composição no código, ao remover o objeto completo, o objeto parte também é removido*/
public class Main {
    public static void main(String[] args) {

        Filme interestelar = new Filme("Interestelar", "Christopher Nolan");
        interestelar.adicionarPersonagem("Cooper", "Matthew McConaughey");
        interestelar.adicionarPersonagem("Brand", "Anne Hathaway");

        Filme harryPotter = new Filme("Harry Potter e a Pedra Filosofal", "Chris Columbus");
        harryPotter.adicionarPersonagem("Harry Potter", "Daniel Radcliffe");
        harryPotter.adicionarPersonagem("Hermione Granger", "Emma Watson");
        harryPotter.adicionarPersonagem("Ron Weasley", "Rupert Grint");

        System.out.println("Informações dos filmes:");
        System.out.println("---------------------------------------------------------------------");
        interestelar.exibirFilme();
        System.out.println("---------------------------------------------------------------------");
        harryPotter.exibirFilme();
        System.out.println("---------------------------------------------------------------------");
    }
}
