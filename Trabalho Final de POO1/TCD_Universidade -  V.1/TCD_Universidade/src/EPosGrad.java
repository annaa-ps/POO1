import java.util.Date;

public class EPosGrad extends Estudante{
    // ================================= Atributos
    private String temaPesquisa;


    // ================================= Construtores
    public EPosGrad(CPF cpf, String nome, Date dNascimento, Float cra, String temaPesquisa) {
        super(cpf, nome, dNascimento, cra);

        this.temaPesquisa = temaPesquisa;
    }


    // ================================= Getters e Setters
    public String getTemaPesquisa() { return temaPesquisa; }
    public void getTemaPesquisa(Float cra) {
        this.temaPesquisa = temaPesquisa;
    }


    // ================================= Outros Métodos
    @Override
    public String toString() {
        return super.toString() + "Tema de Pesquisa :" + temaPesquisa + " ";
    }

    @Override
    public double calcCr(boolean incluiReprovacao) throws Exception {
        return 0;
    }
}
