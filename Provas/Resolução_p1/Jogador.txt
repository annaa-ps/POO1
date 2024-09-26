public class Jogador {
    //Atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    //Construtor
    public Jogador(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Getter para retornar a idade para o calculo da média das idades
    public int getIdade(){
        return idade;
    }

    //Método para mostrar todas as informações do jogador
    public String toString(){
        return "Jogador: " + nome + ", Idade: " + idade + ", Altura: " + altura + ", Peso: " + peso;
    }
}
