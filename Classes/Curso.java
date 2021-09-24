package SistemaAcademico;

public class Curso {
    
    private String codigo; 
    private String descricao;
    private String coordenador;
    
    
    //construtores
    public Curso() {
        super();
    }
    
    public Curso(String codigo, String descricao, String coordenador) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.coordenador = coordenador;
    }
    
    
}
