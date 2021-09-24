package SistemaAcademico;

import java.util.Collection;

public class Aluno {
    
	private String matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private Curso curso;
    private List<Avaliacao> avaliacoes;
    
    
    //construtores
    public Aluno() {
        super();
    }
    
    public Aluno(String matricula, String nome, String endereco,
            String telefone, Curso curso, List<Avaliacao> avaliacoes) {
    	
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.curso = curso;
        this.avaliacoes = avaliacoes
    }
    
    public String getMatricula() {
    	return matricula;
    }
    public void setMatricula(String matricula) {
    	 this.matricula = matricula;
    }
    
    public String getNome() {
    	return nome;
    }
    public void setnome(String nome) {

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
    
    public Curso getCurso() {
    	return curso;
    }
    public void setCurso(Curso curso) {
    	 this.curso = curso;
    }
    
    public List<Avaliacao> getAvaliacao(List<Avaliacao> Avaliacoes) {
    	return List<Avaliacao>;    	
    }
}
