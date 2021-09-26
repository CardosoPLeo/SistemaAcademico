package SistemaAcademico;

import java.util.List;

public class Professor {
    
	private String nome;
    private String endereco;
    private String telefone;
    private String titulacao;
    private List<Curso> cursos;

    //construtores
    public Professor() {
        super();
    }

    public Professor(String nome, String endereco, String telefone,
                     String titulacao, List<Curso> cursos) {
        super();s
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
