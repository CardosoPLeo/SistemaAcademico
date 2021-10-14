package SistemaAcademico;

import Professor;
import Turma;

import java.util.List;

public class Coordenador {

    private String nome;
    private String email;
    private Int codigo;
    private List<Professor> professor;
    private List<Turma> turma;

    public Coordenador() {
        super();
    }

    public Coordenador(String nome, String email, Int codigo, List<Professor> professor, List<Turma> turma) {
        super();
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.professor = professor;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Int getCodigo() {
        return codigo;
    }

    public void setCodigo(Int codigo) {
        this.codigo = codigo;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    public void alocaProfessorATurma(){


    }
}
