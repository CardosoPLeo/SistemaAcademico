package SistemaAcademico;

import java.util.Collection;

public class Secretaria{

	private Int Codigo;
	private String Nome;
	private List<Disciplinas> disciplina;
	private List<Cursos> curso;
	private List<Coordenador> coordenador;

	public Secretaria() {

		super();
	}

	public List<Coordenador> getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(List<Coordenador> coordenador) {
		this.coordenador = coordenador;
	}

	public List<Cursos> getCurso() {
		return curso;
	}

	public void setCurso(List<Cursos> curso) {
		this.curso = curso;
	}

	public List<Disciplinas> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplinas> disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Int getCodigo() {
		return Codigo;
	}

	public void setCodigo(Int codigo) {
		Codigo = codigo;
	}

}