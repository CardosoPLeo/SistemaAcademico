package SistemaAcademico;

import java.util.Collection;

public class Disciplina {
    
    private Int codigo;
    private String descricao;
    private Int cargaHoraria;
    private String ementa;
    private String bibliografia;
    
    //coleção de disciplinas (0..1..Muitas disciplinas)
    public List<Disciplina> preRequisitos;
    
    
    //construtores
    public Disciplina() {
        super();
    }
    
    public Disciplina(Integer codigo, String descricao, Integer cargaHoraria,
            String ementa, String bibliografia, 
            List<Disciplina> preRequisitos) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.preRequisitos = preRequisitos;
    }
    
    public Int getCodigo(){
    	return codigo;
    }
    public Int setCodigo(Int codigo) {
    	this.codigo = codigo;
    }
    
    public String getDescricao(){
    	return Descricao;
    }
    public String setDescricao(String descricao) {
    	this.descricao = descicao;
    }
    
    public Int getCargHoraria() {
    	return cargaHoraria;
    }
    
    public Int setCargaHoraria(Int cargaHoraria) {
    	this.cargaHoraria = cargaHoraria;
    }
    
    public Int getBibliografia() {
    	return bibliografia;
    }
    
    public String setBibliografia(String bibliografia) {
    	this.bibliografia = bibliografia;
    }
    
    public List<getPreRequisitos>() {
    	return List<preRequisitos>;
    }
    
    public List<preRequisitos> setPreRequisitos(List<preRequisitos>) {
    	this.preRequisitos = preRequisitos;
    }
    
}
    
