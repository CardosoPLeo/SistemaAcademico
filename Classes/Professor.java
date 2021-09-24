package SistemaAcademico;

import java.util.Collection;

public class Professor {
    
	private String nome;
    private String endereco;
    private String telefone;
    private String titulacao;
    
    //cole��o de cursos
    private Collection<Curso> cursos;
    
    //construtores
    public Professor() {
        super();
    }
    
    public Professor(String nome, String endereco, String telefone,
            String titulacao, Collection<Curso> cursos) {
        super();s
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.cursos = cursos;
    }
    
    
}
