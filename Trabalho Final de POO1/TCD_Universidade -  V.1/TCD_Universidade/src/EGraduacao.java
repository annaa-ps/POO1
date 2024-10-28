import java.util.Date;

public class EGraduacao extends Estudante{
    // ================================= Atributos
    private String estagioSuperv;


    // ================================= Construtores
    public EGraduacao(CPF cpf, String nome, Date dNascimento, Float cra, String estagioSuperv) {
        super(cpf, nome, dNascimento, cra);

        this.estagioSuperv = estagioSuperv;
    }


    // ================================= Getters e Setters
    public String getTemaPesquisa() { return estagioSuperv; }
    public void getTemaPesquisa(Float cra) {
        this.estagioSuperv = estagioSuperv;
    }




    // ================================= Outros Métodos
    @Override
    public String toString() {
        return super.toString() + "Estagio Supervisionado :" + estagioSuperv + " ";
    }

    @Override
    public double calcCr(boolean incluiReprovacao) throws Exception {
        return 0;
    }
}
