package SistemaAcademico;

import sun.util.calendar.BaseCalendar;

import java.util.Date;
import java.util.List;

public class Turma {
    private List<Disciplina> disciplinas;
    private Date data;
    private String Horas;
    public enum semestre{
        PRIMEIRO;

        SEMESTRE("Primeiro Semestre",1),
        SEGUNDO SEMESTRE("Segundo Semestre",2)

        private String descricao;
        private Int codigo;

        semestre(String descricao, Int codigo) {
            this.descricao = descricao;
            this.codigo = codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public Int getCodigo() {
            return codigo;
        }
    }

    public enum diasDaSemana{

        DOMINGO("Domingo",1),
        SEGUNDA-FEIRA("Segunda-Feira",2),
        TERCA-FEIRA("Terça-Feira",3),
        QUARTA-FEIRA("Quarta-Feira",4),
        QUINTA-FEIRA("Quinta-Feira",5),
        SEXTA-FEIRA("Sexta-Feira",6),
        SABADO("Sabado",7)

        private String diaDaSemana;
        private Int codigo;

        diasDaSemana(String diaDaSemana, Int codigo) {
            this.diaDaSemana = diaDaSemana;
            this.codigo = codigo;
        }

        public String getDiaDaSemana() {
            return diaDaSemana;
        }

        public Int getCodigo() {
            return codigo;
        }
    }


    public class Turma(){
        super();
    }

    public Turma(List<Disciplina> disciplinas, Date data, String horas) {
        this.disciplinas = disciplinas;
        this.data = data;
        Horas = horas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String horas) {
        Horas = horas;
    }
}