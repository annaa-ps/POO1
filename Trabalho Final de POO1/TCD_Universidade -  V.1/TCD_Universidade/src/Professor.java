import java.util.Date;

public class Professor extends Pessoa{
    // ================================= Atributos
    private Date inicioContrato;
    private String departamento;


    // ================================= Construtores
    public Professor(CPF cpf, String nome, Date dNascimento, Date inicioContrato, String departamento) {
        super(cpf, nome, dNascimento);

        this.inicioContrato = inicioContrato;
        this.departamento = departamento;
    }


    // ================================= Getters e Setters
    public Date getInicioContrato() { return inicioContrato; }
    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }


    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    // ================================= Outros Métodos
    @Override
    public String toString() {
        return super.toString() + "Inicio do Contrato : " + inicioContrato +
                "Departamento : " + departamento +  " ";
    }
}
