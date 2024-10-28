import java.time.LocalTime;

public class Disciplina{
    // ================================= Atributos
    private int codigo;
    private String nome;
    private LocalTime cargaHorario;
    private Turma turmaAtual;


    // ================================= Construtores
    public Disciplina(Turma turmaAtual, int codigo, String nome, LocalTime cargaHorario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.turmaAtual = new Turma (turmaAtual.getAnoCorrente(), turmaAtual.getSemestre());
    }


    // ================================= Getters e Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getCargaHorario() { return cargaHorario; }
    public void setCargaHorario(LocalTime cargaHorario) {
        this.cargaHorario = cargaHorario;
    }


    // ================================= Outros Métodos
    @Override
    public String toString() {
        return "Disciplina : " +
                "codigo = " + codigo +
                " | nome='" + nome +
                " | cargaHorario=" + cargaHorario +
                ' ';
    }
}
