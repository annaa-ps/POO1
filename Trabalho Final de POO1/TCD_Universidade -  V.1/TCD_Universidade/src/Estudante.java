import java.util.Date;

public abstract class Estudante extends Pessoa{
    // ================================= Atributos
    private Float cra;


    // ================================= Construtores
    public Estudante(CPF cpf, String nome, Date dNascimento, Float cra) {
        super(cpf, nome, dNascimento);

        this.cra = cra;
    }

    // ================================= Getters e Setters
    public Float getCra() { return cra; }
    public void setCra(Float cra) {
        this.cra = cra;
    }


    // ================================= Outros Métodos
    public abstract double calcCr(boolean incluiReprovacao) throws Exception;

    @Override
    public String toString() {
        return super.toString() + "CRA :" + cra +
                '}';
    }
}
