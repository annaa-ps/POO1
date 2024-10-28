import java.util.Date;
public class Pessoa {
    // ================================= Atributos
    protected CPF cpf;
    protected String nome;
    protected Date dNascimento;


    // ================================= Construtores
    public Pessoa(CPF cpf, String nome, Date dNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dNascimento = dNascimento;
    }


    // ================================= Getters e Setters

    public String getNome() { return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdNascimento() { return dNascimento; }
    public void setdNascimento(Date dNascimento) {
        this.dNascimento = dNascimento;
    }


    // ================================= Outros Métodos

    @Override
    public String toString() {
        return "Pessoa : " +
                "cpf = " + cpf +
                " | nome = '" + nome +
                "| dNascimento = " + dNascimento + ' ';
    }

}
