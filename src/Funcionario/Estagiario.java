package Funcionario;

public class Estagiario extends Funcionario{

    private String curso;

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Estagiario(String nome, int id, String curso) {
        super(nome, id);
        this.curso = curso;
    }
    
}
