/*Os objetos são independentes?
* Os objetos presentes no código, sendo eles Autor e Livro não são independentes. Pois, eles estão sendo
* associados um com o outro, ou seja, o objeto Livro depende de um objeto Autor para suas irformações serem completas.*/

public class Main {
    public static void main(String[] args){
        Autor autor1 = new Autor("Taylor Jakins Reid", "Americana");
        Autor autor2 = new Autor("Carla Madeira", "Brasileira");

        Livro livro1 = new Livro("Os sete maridos de Evelyn Hugo", autor1, 2017);
        Livro livro2 = new Livro("A natureza da mordida", autor2, 2018);

        System.out.println("\nInformações dos Livros:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(livro1);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(livro2);
        System.out.println("--------------------------------------------------------------------------");
    }
}
