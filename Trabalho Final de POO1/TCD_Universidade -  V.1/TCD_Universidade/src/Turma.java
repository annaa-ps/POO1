import java.time.LocalTime;
import java.util.Date;

public class Turma {
    // ================================= Atributos
    private int semestre; // inicio do ano = 1 / final do ano = 2
    private Date anoCorrente; // ano que está sendo ofertada


    // ================================= Construtores
    public Turma(Date anoCorrente, int semestre) {
        this.semestre = semestre;
        this.anoCorrente = anoCorrente;
    }

    // ================================= Getters e Setters

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Date getAnoCorrente() { return anoCorrente; }
    public void setAnoCorrente(Date anoCorrente) {
        this.anoCorrente = anoCorrente;
    }


    // ================================= Outros Métodos
    @Override
    public String toString() {
        return "Turma : " +
                "| semestre =" + semestre +
                "| anoCorrente =" + anoCorrente +
                " ";
    }

}