import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor de produtos
        Produto[] produtos = new Produto[5];

        // Preenchendo o vetor com instâncias de Produto utilizando o construtor com parâmetros
        produtos[0] = new Produto(101, "Arroz", 20.00, 50);
        produtos[1] = new Produto(102, "Feijão", 12.50, 30);
        produtos[2] = new Produto(103, "Macarrão", 5.00, 100);
        produtos[3] = new Produto(104, "Azeite", 25.00, 20);
        produtos[4] = new Produto(105, "Sal", 3.00, 200);

        // Exibindo informações dos produtos antes da ordenação
        System.out.println("Produtos antes da ordenação:");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
        }

        // Ordenando o vetor pelo nome do produto utilizando Selection Sort
        ordenarProdutosPorNome(produtos);

        // Exibindo informações dos produtos após a ordenação
        System.out.println("Produtos após a ordenação por nome:");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
        }

        scanner.close();
    }

    // Método para ordenar os produtos pelo nome usando Selection Sort
    public static void ordenarProdutosPorNome(Produto[] produtos) {
        int n = produtos.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (produtos[j].getNome().compareToIgnoreCase(produtos[minIndex].getNome()) < 0) {
                    minIndex = j;
                }
            }
            // Trocando os produtos
            Produto temp = produtos[i];
            produtos[i] = produtos[minIndex];
            produtos[minIndex] = temp;
        }
    }
}