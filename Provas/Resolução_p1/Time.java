public class Time {
    //Atributos
    private String nomeTime;
    private Jogador titular1;
    private Jogador titular2;
    private Jogador substituto;

    //1º Construtor: dois jogadores titulares + substituto
    public Time(String nomeTime, Jogador titular1, Jogador titular2, Jogador substituto){
        this.nomeTime = nomeTime;
        this.titular1 = titular1;
        this.titular2 = titular2;
        this.substituto = substituto;
    }

    //2º Construtor: Não informa quem é o jogador substituto
    public Time(String nomeTime, Jogador titular1, Jogador titular2){
        this.nomeTime = nomeTime;
        this.titular1 = titular1;
        this.titular2 = titular2;
        this.substituto = null;
    }

    //Método para mostrar todas as informações do time
    public String toString(){
        String info = "\nTime: " + nomeTime + "\n" + "Titular 1: " + titular1.toString() + "\n" + "Titular 2: " +
                titular2.toString();
        if(substituto != null){
            info += "\nSubstituto: " + substituto.toString();
        }else{
            info += "\nNão há substituto";
        }
        return  info;
    }

    //Método para cálculo da idade média dos jogadores(titulares e substituto (se houver))
    public double calcularIdadeMedia(){
        int totalJogadores = 2;
        int somaIdades = titular1.getIdade() + titular2.getIdade();

        if(substituto != null){
            somaIdades += substituto.getIdade();
            totalJogadores++;
        }
        return somaIdades/totalJogadores;
    }
}
