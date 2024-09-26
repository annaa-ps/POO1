import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Time> times = new ArrayList<>();

        System.out.println("Informe o número de times: ");
        int numeroTimes = scanner.nextInt();

        //Lendo as informações de n times
        for(int i=0; i<numeroTimes; i++){
            scanner.nextLine(); //Limpar buffer
            System.out.print("Informe o nome do time: ");
            String nomeTime = scanner.nextLine();

            System.out.println("Informações do Titular 1:");
            System.out.print("Nome: ");
            String nome1 = scanner.nextLine();
            System.out.print("Idade: ");
            int idade1 = scanner.nextInt();
            System.out.print("Altura: ");
            double altura1 = scanner.nextDouble();
            System.out.print("Peso: ");
            double peso1 = scanner.nextDouble();
            Jogador titular1 = new Jogador(nome1,idade1, altura1, peso1);

            scanner.nextLine(); //Limpar buffer
            System.out.println("Informações do Titular 2:");
            System.out.print("Nome: ");
            String nome2 = scanner.nextLine();
            System.out.print("Idade: ");
            int idade2 = scanner.nextInt();
            System.out.print("Altura: ");
            double altura2 = scanner.nextDouble();
            System.out.print("Peso: ");
            double peso2 = scanner.nextDouble();
            Jogador titular2 = new Jogador(nome2,idade2, altura2, peso2);

            scanner.nextLine(); //Limpar buffer
            //Verificando se há substituto no time
            System.out.print("Há substituto no time? (S/N)");
            String temSubstituto = scanner.nextLine();
            if(temSubstituto.equalsIgnoreCase("s")){
                System.out.println("Informações do Substituto:");
                System.out.print("Nome: ");
                String nome3 = scanner.nextLine();
                System.out.print("Idade: ");
                int idade3 = scanner.nextInt();
                System.out.print("Altura: ");
                double altura3 = scanner.nextDouble();
                System.out.print("Peso: ");
                double peso3 = scanner.nextDouble();
                Jogador substituto = new Jogador(nome3,idade3, altura3, peso3);
                Time time = new Time(nomeTime, titular1, titular2, substituto);
                times.add(time);
            }else{
                Time time = new Time(nomeTime, titular1, titular2);
                times.add(time);
            }
        }

        //Mostrando todas as informações lidas
        Time timeMaiorMedia = null;
        double maiorMedia = 0;

        for(Time time : times){
            System.out.println(time.toString());
            double mediaIdade = time.calcularIdadeMedia();
            System.out.println("Idade média: " + mediaIdade);

            if(mediaIdade > maiorMedia){
                maiorMedia = mediaIdade;
                timeMaiorMedia = time;
            }
        }
        //Mostrando as informações do time que possui a maior média de idade
        if(timeMaiorMedia != null){
            System.out.println("------------------------------------------------------");
            System.out.println("Time com a maior média entre as idades: ");
            System.out.println("------------------------------------------------------");
            System.out.println(timeMaiorMedia.toString());
            System.out.println("Maior idade média: " + maiorMedia);
            System.out.println("------------------------------------------------------");
        }

        //Removendo os times instanciados
        times = null;
        System.out.println("Times instanciados removidos");
        System.out.println("------------------------------------------------------");
    }
}
